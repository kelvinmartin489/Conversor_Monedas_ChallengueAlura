import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ConsultaAPI consultaAPI = new ConsultaAPI();
        Cotizacion response = consultaAPI.conversorMoneda();
        int opcion = 0;
        double cambio = 0;
        double cantidad = 0;
        String menu = """
                ***********************************
                Creado por Kelvin Yangua Martinez
                *********************************** 
                \nBienvenido al Conversor de Monedas 
                1 - Dolar => Soles Peruanos 
                2 - Soles Peruanos => Dolar 
                3 - Dolar => Peso Argentino 
                4 - Peso Argentino => Dolar 
                5 - Dolar => Euro 
                6 - Euro => Dolar 
                7 - Salir 
                """;
        while (opcion != 7) {
            System.out.println(menu);
            while (!teclado.hasNextInt()) {
                System.out.println("Por favor, ingrese un número válido para la opción.");
                teclado.next();
            }
            opcion = teclado.nextInt();
            if (opcion >= 1 && opcion <= 6) {
                System.out.println("Ingrese la cantidad:");
                while (!teclado.hasNextDouble()) {
                    System.out.println("Por favor, ingrese un número válido para la cantidad.");
                    teclado.next();
                }
                cantidad = teclado.nextDouble();
            }
            if (response != null && response.conversion_rates() != null) {
                switch (opcion) {
                    case 1 -> {
                        cambio = cantidad * response.conversion_rates().get("PEN");
                        System.out.println("La cantidad de Soles Peruanos es: S/" + cambio);
                    }
                    case 2 -> {
                        cambio = cantidad / response.conversion_rates().get("PEN");
                        System.out.println("La cantidad de Dólares es: $" + cambio);
                    }
                    case 3 -> {
                        cambio = cantidad * response.conversion_rates().get("ARS");
                        System.out.println("La cantidad de Pesos Argentinos es: $" + cambio);
                    }
                    case 4 -> {
                        cambio = cantidad / response.conversion_rates().get("ARS");
                        System.out.println("La cantidad de Dólares es: $" + cambio);
                    }
                    case 5 -> {
                        cambio = cantidad * response.conversion_rates().get("EUR");
                        System.out.println("La cantidad de Euros es: €" + cambio);
                    }
                    case 6 -> {
                        cambio = cantidad / response.conversion_rates().get("EUR");
                        System.out.println("La cantidad de Dólares es: $" + cambio);
                    }
                    case 7 -> System.out.println("Saliendo del programa, gracias por utilizar nuestros servicios.");
                    default -> System.out.println("Opción no válida. Por favor, intente de nuevo.");
                }
            } else {
                System.out.println("No se pudo obtener las tasas de cambio de la API.");
            }
        }
    }
}
