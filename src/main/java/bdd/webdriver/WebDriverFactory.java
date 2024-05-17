package bdd.webdriver;

import com.google.gson.JsonObject;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v120.network.Network;

import java.time.Duration;
import java.util.Optional;

public class WebDriverFactory {

    private static WebDriver driver;

    private WebDriverFactory() {
        // Constructor privado para evitar instanciación directa
    }


    public static WebDriver getWebDriver() {
        if (driver == null || !isSessionActive()) {
            initializeWebDriver();
        }
        return driver;
    }

    private static boolean isSessionActive() {
        try {
            // Intenta obtener la URL actual, si hay una sesión activa, este método no arrojará una excepción
            driver.getCurrentUrl();
            return true; // Si no arroja una excepción, hay una sesión activa
        } catch (Exception e) {
            return false; // Si arroja una excepción, no hay una sesión activa
        }
    }

    private static void initializeWebDriver() {
        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(chromeOptions.addArguments("--disable-notifications"));

        // INSTRUCCIONES PARA SIMULAR UN INTERNET LENTO

    /*    DevTools devTools = ((ChromeDriver) driver).getDevTools();
        devTools.createSession();

        //configurar las conexiones de red

        JsonObject connection = new JsonObject();
        connection.addProperty("offline", false);
        connection.addProperty("latency", 5000);
        connection.addProperty("download_throughput", 500000);  // Velocidad de descarga de 1 Mbps
        connection.addProperty("upload_throughput", 500000);  // Velocidad de carga de 1 Mbps

        devTools.send(Network.emulateNetworkConditions(false, 10000, 500000, 500000, Optional.empty()));*/
    }
}
