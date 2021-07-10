package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SeleniumUtils
{
    WebDriver driver;
//Las acciones van hacia los metodos web element

    public void ClickButton (WebElement element)
    {
        element.click();
    }

    public void LimpiarInput (WebElement element)
        {
            element.clear();
        }

        public void limpiarYLlenarInput (WebElement input, String data)
        {
            LimpiarInput(input);
            input.sendKeys(data);
        }

        public void loading (WebDriver driver, int timeMiliseconds) throws Exception
        {
            Thread.sleep(timeMiliseconds);
        }

}
