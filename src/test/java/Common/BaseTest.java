 package Common;

import Elements.ElementsLogin;
import Features.Login;
import com.google.common.base.Function;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

 public class BaseTest
{
 //***********INSTANCIAS************
  public static WebDriver driver = null;
  Login login = new Login();

  @Before
  public void Login () throws Exception

  {
  //CREAR DRIVER
   driver = Config.navegadorChrome();

   //MAXIMIZAR VENTANA
   driver.manage().window().maximize();

   //LA FUNCIÓN *driver.get", NOS SIRVE PARA MANDAR LA URL AL NAVEGADOR
   driver.get(Config.URL_DEV);

   //POR MEDIO DEL OBJETO "Login", MANDAMOS TRAER (INSTANCIAMOS) EL PROCESO DE INICIAR SESIÓN
   login.miLogin(driver);

//**************IMPLICIT WAIT**********************
// driver.manage().timeouts().implicitlyWait (10, TimeUnit.SECONDS);
//**************EXPLICIT WAIT**********************
   //Explicits: WebDriverWait y Thread.Sleep()
   // WebDriverWait wait = new WebDriverWait(driver, 10);
    //wait.until(ExpectedConditions.presenceOfElementLocated(elementsLogin.byButtonSignin));

   //*****************+FLUENT WAIT****************
  // Wait<WebDriver> fwait = new FluentWait<WebDriver>(driver)
    //       .withTimeout (Duration.ofSeconds(10))
      //     .pollingEvery(Duration.ofSeconds(3))
        //   .ignoring(NoSuchFieldException.class);

 //  WebElement btnSigin = fwait.until(new Function<WebDriver, WebElement>() {
   // @NullableDecl
    //@Override
    //public WebElement apply(WebDriver webDriver) {
     //return driver.findElement(elementsLogin.byButtonSignin);
    //}
   //}
   //{
    //Assert.assertTrue(driver.findElement(elementsLogin.byButtonSignin).isDisplayed());

  }


    @After
  public void tearDown()
  {
   //LA FUNCIÓN *driver.get", NOS SIRVE PARA CERRAR EL NAVEGADOR
  driver.quit();
  }


  }
