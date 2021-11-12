import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

import static org.junit.Assert.assertEquals;

public class ListQuestionsTest {

    static WebDriver driver;
    static ListQuestions list;

    public ListQuestionsTest() {
    }

    @BeforeClass
    public static void setUpClass() {
        String url = "https://opentdb.com/browse.php";
        String caminho = "chromedriver.exe";
        File file = new File(caminho);
        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
        driver = new ChromeDriver();
        driver.get(url);
        list = new ListQuestions();
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
    public void testPesquisaQuestion() {
        list.listQuestions(driver);
        assertEquals(true, list.verificaControlePaginacao(driver));
        assertEquals(25, list.verificaNumLinhas(driver));
    }

}
