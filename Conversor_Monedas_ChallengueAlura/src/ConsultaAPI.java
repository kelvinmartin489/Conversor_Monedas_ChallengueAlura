import com.google.gson.Gson;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class ConsultaAPI {
    public Cotizacion conversorMoneda(){
        try {
            URL url = new URL("https://v6.exchangerate-api.com/v6/565582ddf0e09a7843a0d2f2/latest/USD");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.connect();
            int responseCode = connection.getResponseCode();
            if (responseCode != 200) {
                throw new RuntimeException("Ha ocurrido un error: " + responseCode);
            } else {
                StringBuilder informationString = new StringBuilder();
                Scanner scanner = new Scanner(url.openStream());
                while (scanner.hasNext()) {
                    informationString.append(scanner.nextLine());
                }
                scanner.close();
                System.out.println("Respuesta de la API: " + informationString.toString());
                Gson gson = new Gson();
                return gson.fromJson(informationString.toString(), Cotizacion.class);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
