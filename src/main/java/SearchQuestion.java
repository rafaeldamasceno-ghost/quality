import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SearchQuestion {

    public void searchQuestion(WebDriver driver) {
        WebElement campoBusca = driver.findElement(By.id("query"));
        campoBusca.sendKeys("Science: Computers");
        WebElement pesquisar = driver.findElement(By.className("fa-search"));
        pesquisar.submit();
    }

    public String retornaMensagem(WebDriver driver){
        return driver.findElement(By.className("alert-danger")).getText();
    }

}
