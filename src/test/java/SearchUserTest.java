import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

import static org.junit.Assert.assertEquals;

public class SearchUserTest {

    static WebDriver driver;
    static SearchUser search;

    public SearchUserTest() {
    }

    @BeforeClass
    public static void setUpClass() {
        String url = "https://opentdb.com/browse.php";
        String caminho = "chromedriver.exe";
        File file = new File(caminho);
        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
        driver = new ChromeDriver();
        driver.get(url);
        search = new SearchUser();
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
        search.searchUser(driver);
        assertEquals(1, search.quantUser(driver));
    }
}
