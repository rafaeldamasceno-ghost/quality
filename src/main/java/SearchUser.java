import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SearchUser {

    public void searchUser(WebDriver driver){
        WebElement campoPesquisa = driver.findElement(By.id("query"));
        campoPesquisa.sendKeys("Karen");
        Select combobox = new Select(driver.findElement(By.id("type")));
        combobox.selectByValue("User");
        WebElement pesquisar = driver.findElement(By.className("fa-search"));
        pesquisar.submit();
    }

    public int quantUser(WebDriver driver){
        List<WebElement> elements = driver.findElements(By.tagName("tr"));
        int contador = -1;
        for (WebElement element : elements) {
            contador++;
        }
        return contador;
    }


}
