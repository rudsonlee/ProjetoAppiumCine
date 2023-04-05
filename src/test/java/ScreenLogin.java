import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class ScreenLogin {


    public ScreenLogin(AppiumDriver<MobileElement> driver){ //metodo que faz a classe ScreenLogin interaja com os elementos da tela usando o driver appium
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }



    @AndroidFindBy(id = "com.cnpx.previa:id/btn_sign")  //clicando no botão cadastro
    private static MobileElement btnCadastro;
    @AndroidFindBy(xpath = "//android.widget.EditText[contains(@text, 'E-mail')]")//preenchendo o Email
    private MobileElement campoEmail;
    @AndroidFindBy(xpath = "//android.widget.EditText[contains(@text, 'Nome e sobrenome')]") //preenchendo o Nome e sobrenome
    private MobileElement campoNome;
    @AndroidFindBy(xpath = "//android.widget.EditText[contains(@text, 'Senha')]") //preenchendo a senha
    private MobileElement campoSenha;

    @AndroidFindBy(id = "com.cnpx.previa:id/btn_register") // clicando no botão registrar
    private MobileElement btnLogin;

    @AndroidFindBy(id = "com.cnpx.previa:id/btn_login") // clicando no botão login
    private static MobileElement btnLogar;





    public void cadastro () throws InterruptedException {
        Thread.sleep(3000);  //aguardando 5segundos
        btnCadastro.click(); //clicando no botao entrar
        campoEmail.sendKeys("rudsonlee@gmail.com"); //digitar o email
        campoNome.sendKeys("Rudson Lee"); //digitar o nome
        campoSenha.sendKeys("lee553322");// digitar a senha
        btnLogin.click(); //clicando no botao entrar
        Thread.sleep(3000);  //aguardando 5segundos
    }

    public void logar () throws InterruptedException {
        //Thread.sleep(1000);  //aguardando 2segundos
        btnLogar.click(); //clicando no botao entrar
        campoEmail.sendKeys("rudsonlee@gmail.com"); //digitar o email
        campoSenha.sendKeys("lee553322");// digitar a senha
        btnLogar.click(); //clicando no botao entrar
    }





}