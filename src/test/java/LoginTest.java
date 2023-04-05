import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class LoginTest {

    private static ScreenLogin ScreenLogin;


    @BeforeClass
    public static void caps() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();   // valores envviados para o Appium servidor
        capabilities.setCapability("deviceName", "Android Emulator"); // nome do emulador
        capabilities.setCapability("platformName", "Android"); // mostrando qual plataforma usando
        //capabilities.setCapability("noReset", true);
        capabilities.setCapability("platformVersion", "9.0");
        capabilities.setCapability("app", "J:\\Automação\\Projetos\\AppiumCucumber\\apps\\Cinepix.apk");

        AppiumDriver<MobileElement> driver = new AndroidDriver<>(new URL("http://localhost:4723/wd/hub"), capabilities);
        ScreenLogin = new ScreenLogin(driver);


    }

    @Test
    public void testeCadastro() throws InterruptedException { //
        ScreenLogin.cadastro(); // metodo do cadastro

        ScreenLogin.logar(); // logar com conta feita


    }

    }







