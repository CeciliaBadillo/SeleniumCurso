package Validation;

import Elements.ElementsSelect;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
//*******************************************************************
public class ValidationSelects
{
    ElementsSelect elementsSelect = new ElementsSelect();

    public WebElement valTapWoman (WebDriver driver)
    {
        Wait<WebDriver> fwait = new FluentWait<WebDriver>(driver)
         .withTimeout (Duration.ofSeconds(10))
         .pollingEvery(Duration.ofSeconds(3))
         .ignoring(NoSuchFieldException.class);

        try
        {
            elementsSelect.TapWoman(driver).isDisplayed();
            {
                return fwait.until(ExpectedConditions.presenceOfElementLocated(elementsSelect.byTapWoman));
            }
        }
        catch (NoSuchElementException nsee)
            {
                throw new java.util.NoSuchElementException("NoSuchElementException: Location Not found" + elementsSelect.TapWoman(driver));
            }
        catch (TimeoutException toe)
        {
            throw new TimeoutException("TimeoutException: Locator not visible" + elementsSelect.TapWoman(driver));
        }
    }

    //*******************************************************************
    public WebElement valBotonMasTop (WebDriver driver)
    {
        Wait<WebDriver> fwait = new FluentWait<WebDriver>(driver)
                .withTimeout (Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(3))
                .ignoring(NoSuchFieldException.class);

        try
        {
            elementsSelect.TapWoman(driver).isDisplayed();
            {
                return fwait.until(ExpectedConditions.presenceOfElementLocated(elementsSelect.bybottonMasTops));
            }
        }
        catch (NoSuchElementException nsee)
        {
            throw new java.util.NoSuchElementException("NoSuchElementException: Location Not found" + elementsSelect.BottonMasTops(driver));
        }
        catch (TimeoutException toe)
        {
            throw new TimeoutException("TimeoutException: Locator not visible" + elementsSelect.BottonMasTops(driver));
        }
    }


    //*******************************************************************
    public WebElement ValBottonTshirt (WebDriver driver)
    {
        Wait<WebDriver> fwait = new FluentWait<WebDriver>(driver)
                .withTimeout (Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(3))
                .ignoring(NoSuchFieldException.class);

        try
        {
            elementsSelect.TapWoman(driver).isDisplayed();
            {
                return fwait.until(ExpectedConditions.presenceOfElementLocated(elementsSelect.bybottonTSshirts));
            }
        }
        catch (NoSuchElementException nsee)
        {
            throw new java.util.NoSuchElementException("NoSuchElementException: Location Not found" + elementsSelect.BottonTSshirts(driver));
        }
        catch (TimeoutException toe)
        {
            throw new TimeoutException("TimeoutException: Locator not visible" + elementsSelect.BottonTSshirts(driver));
        }
    }


    //*******************************************************************
    public WebElement ValDesplegable (WebDriver driver)
    {
        Wait<WebDriver> fwait = new FluentWait<WebDriver>(driver)
                .withTimeout (Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(3))
                .ignoring(NoSuchFieldException.class);

        try
        {
            elementsSelect.TapWoman(driver).isDisplayed();
            {
                return fwait.until(ExpectedConditions.presenceOfElementLocated(elementsSelect.bySelectSort));
            }
        }
        catch (NoSuchElementException nsee)
        {
            throw new java.util.NoSuchElementException("NoSuchElementException: Location Not found" + elementsSelect.SelectSort(driver));
        }
        catch (TimeoutException toe)
        {
            throw new TimeoutException("TimeoutException: Locator not visible" + elementsSelect.SelectSort(driver));
        }
    }
}
