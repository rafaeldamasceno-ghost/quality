import io.qameta.allure.Description;
import io.qameta.allure.junit4.DisplayName;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

import static org.junit.Assert.assertEquals;

public class SearchQuestionUserTest {

    static WebDriver driver;
    static SearchQuestionUser search;

    public SearchQuestionUserTest() {
    }

    @BeforeClass
    public static void setUpClass() {
        String url = "https://opentdb.com/browse.php";
        String caminho = "chromedriver.exe";
        File file = new File(caminho);
        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
        driver = new ChromeDriver();
        driver.get(url);
        search = new SearchQuestionUser();
    }

    @AfterClass
    public static void tearDownClass() {
        driver.close();
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of SearchQuestionUser method, of class returnQuestions.
     */
    @Test
    @DisplayName("Teste Busca de questões por usuário")
    @Description("Busca por um usuário e verifica se existe alguma questão publicada pelo mesmo")
    public void returnQuestions() {
        search.searchForUser(driver);
        assertEquals(true, search.returnQuestions(driver));
    }
}
