import io.qameta.allure.Description;
import io.qameta.allure.junit4.DisplayName;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

import static org.junit.Assert.assertEquals;

public class SearchQuestionTest {

    static WebDriver driver;
    static SearchQuestion search;

    public SearchQuestionTest() {
    }

    @BeforeClass
    public static void setUpClass() {
        String url = "https://opentdb.com/browse.php";
        String caminho = "chromedriver.exe";
        File file = new File(caminho);
        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
        driver = new ChromeDriver();
        driver.get(url);
        search = new SearchQuestion();
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
     * Test of searchQuestion method, of class SearchQuestion.
     */
    @Test
    @DisplayName("Teste Busca por questão inexistente")
    @Description("Faz a busca por uma questão inexistente")
    public void testPesquisaQuestion() {
        search.searchQuestion(driver);
        assertEquals("No questions found.", search.retornaMensagem(driver));
    }
}
