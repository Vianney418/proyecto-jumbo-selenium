# Pruebas de la Página de Compra del Jumbo

Bienvenido/a al proyecto de pruebas automatizadas para la página de compra del Jumbo. En este proyecto, utilizamos Selenium como herramienta principal para la automatización de pruebas, combinado con Cucumber como metodología para escribir y organizar nuestras pruebas.

## Descripción

Este proyecto tiene como objetivo principal garantizar la calidad y funcionalidad de la página de compra del Jumbo a través de pruebas automatizadas. Utilizamos Selenium WebDriver para interactuar con los elementos de la página web y Cucumber para escribir nuestras pruebas de manera clara y legible.

## Configuración

Asegúrate de tener instaladas las siguientes herramientas antes de ejecutar las pruebas:

- Java Development Kit (JDK)
- Maven
- Selenium WebDriver
- Cucumber


## Ejecución de las Pruebas

Para ejecutar las pruebas, simplemente ejecuta el siguiente comando desde la raíz del proyecto:

 ```
mvn clean compile
```


Para ejecutar las pruebas, por tags especificos ejecuta un comando parecido al siguiente:

 ```
mvn clean verify -Dcucumber.filter.tags="@MIETIQUETA"
```
