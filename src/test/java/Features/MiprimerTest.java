package MiprimerTest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MiprimerTest
{
    private WebDriver driver;

    @Before
            public void setUp()
    {
        //Se coloca la dirección del driver, sea chrome, mozilla, o edge
        System.setProperty("webdriver.chrome.driver", "src/main/resources/Drivers/ChromeDrivers/chromedriver.exe");

        //Crea la instancia del navegador
        driver = new ChromeDriver();

        //Maximiza el navegador
        driver.manage().window().maximize();

        //Envía la dirección del sistema al navegador
        driver.get("https://www.amazon.com");
    }

   /* @Test
    public void TestAmazon () throws InterruptedException
    {
    Thread.sleep(5000);

        WebElement inputBusqueda = driver.findElement(By.id("twotabsearchtextbox"));

        inputBusqueda.click();
        inputBusqueda.sendKeys ("Alexa");
        inputBusqueda.submit(); //es como dar un enter
        Thread.sleep(4000);

        WebElement buttonLupa = driver.findElement(By.id("nav-search-submit-button"));
        buttonLupa.click();
       Thread.sleep(4000);

       WebElement inputSeleccion = driver.findElement(By.className("nav-a"));
       inputSeleccion.click();
        Thread.sleep(4000);
    } */

    @Test
    //Este comando es para que el sistema nos pueda arrojar errores.
        public void usoXpath () throws InterruptedException {
        //Este Xpath es absoluto, por buenas prácticas no se debe utilizar.
   /* WebElement bottonCompras = driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[3]/div/a[3]/div[2]/span[2]"));
    bottonCompras.click();
    Thread.sleep(5000);
    } */

        //Este es Xpath relativo, y fue creado por nosotros...Utilizando xpath tag (spam, img, button, input, select) y un atributo
       /* WebElement buttonCompras = driver.findElement(By.xpath("//span[@id=\"nav-cart-count\"]"));
        buttonCompras.click();
        Thread.sleep(5000);   */

        //Utilizando xpath por contains usando "*" el asterisco se puede reemplazar por el tag o tipo de elemento
       /* WebElement cuentasyListas = driver.findElement(By.xpath("//*[contains(text(), 'Cuenta y Listas')]"));
        cuentasyListas.click();
        Thread.sleep(5000);  */

        // Uso de xpath con multiple atributo
       /* WebElement inputBusqueda = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox' and @dir='auto']"));
        inputBusqueda.click();
        inputBusqueda.clear();
        inputBusqueda.sendKeys("Celulares");
        Thread.sleep(5000);
        inputBusqueda.submit(); */

        //Uso de Xpath por relation ship
        WebElement inputBusqueda = driver.findElement(By.xpath("//div/input[@id='twotabsearchtextbox' and @dir='auto']"));
        inputBusqueda.click();
        inputBusqueda.clear();
        inputBusqueda.sendKeys("Celulares");
        Thread.sleep(5000);
        inputBusqueda.submit();



    }
@After
        public void tearDown ()
    {
        //Cierra el navegador
        driver.quit();
    }

}
