# Conversor de Monedas

**Conversor de Monedas** es una aplicación Java que permite convertir valores entre diferentes monedas utilizando datos en tiempo real obtenidos de una API. Esta herramienta es útil para cualquier persona que necesite realizar conversiones rápidas y precisas de monedas.

## Características

- Conversión de Dólares (USD) a Soles Peruanos (PEN), Pesos Argentinos (ARS) y Euros (EUR).
- Conversión de Soles Peruanos (PEN), Pesos Argentinos (ARS) y Euros (EUR) a Dólares (USD).
- Interfaz de consola intuitiva y fácil de usar.
- Obtención de tasas de cambio en tiempo real desde [Exchange Rate API](https://exchangerate-api.com/).

## Uso

1. Clonar el repositorio:
    ```bash
    git clone https://github.com/tu_usuario/conversor-monedas.git
    ```

2. Navegar al directorio del proyecto:
    ```bash
    cd conversor-monedas
    ```

3. Compilar el proyecto:
    ```bash
    javac -d bin src/*.java
    ```

4. Ejecutar la aplicación:
    ```bash
    java -cp bin Main
    ```
    
## Arquitectura
- `Main.java` : Controla la interacción con el usuario y gestiona las opciones de conversión.
- `ConsultaAPI.java` : Gestiona las consultas a la API de tasas de cambio.
- `Cotizacion.java`: Define la estructura de los datos recibidos de la API.

## Dependencias
- [Gson](https://github.com/google/gson?form=MG0AV3) - Biblioteca para trabajar con JSON.
  
## Ejemplo

```shell
Bienvenido al Conversor de Monedas
1 - Dolar => Soles Peruanos
2 - Soles Peruanos => Dolar
3 - Dolar => Peso Argentino
4 - Peso Argentino => Dolar
5 - Dolar => Euro
6 - Euro => Dolar
7 - Salir

Ingrese la opción deseada: 1
Ingrese la cantidad: 100
La cantidad de Soles Peruanos es: S/ 386.45
```

## Autor
- KELVIN YANGUA MARTINEZ

