import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SearchQuestionUser {

    public void searchForUser(WebDriver driver){
        WebElement query = driver.findElement(By.id("query"));
        query.sendKeys("Karen");
        Select option = new Select(driver.findElement(By.id("type")));
        option.selectByValue("User");
        WebElement pesquisar = driver.findElement(By.className("fa-search"));
        pesquisar.submit();
    }

    public boolean returnQuestions(WebDriver driver){
         try{
             String msg = driver.findElement(By.className("alert-danger")).getText();
             return false;
         }
         catch(Exception e){
             return true;
         }
         }

    }
