import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.runtime.model.ExceptionDetails;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class ListQuestions {

    public void listQuestions(WebDriver driver) {
        WebElement campoPesquisa = driver.findElement(By.id("query"));
        campoPesquisa.sendKeys("Science: Computers");
        Select combobox = new Select(driver.findElement(By.id("type")));
        combobox.selectByValue("Category");
        WebElement pesquisar = driver.findElement(By.className("fa-search"));
        pesquisar.submit();
    }

    public int verificaNumLinhas(WebDriver driver) {
        List<WebElement> elements = driver.findElements(By.tagName("tr"));
        int contador = -1;
        for (WebElement element : elements) {
            contador++;
        }
        return contador;
    }

    public boolean verificaControlePaginacao(WebDriver driver) {
        try {
            driver.findElement(By.className("pagination-lg"));
            return true;
        }catch (Exception e){
            return false;
        }
    }

}
