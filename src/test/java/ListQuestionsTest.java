import io.qameta.allure.*;
import io.qameta.allure.junit4.DisplayName;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.*;
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

    @Attachment
    public String makeAttach(){
        return "Página possui controle de paginação";
    }

    @Test
    @DisplayName("Teste Controle de páginação")
    @Description("Verifica se a página possui controle de paginação")
    public void testPesquisaQuestion() {
        list.listQuestions(driver);
        assertEquals(true, list.verificaControlePaginacao(driver));
        makeAttach();
    }

    @Test
    @DisplayName("Teste Listagem de questões por página")
    @Description("Verifica se a página mostra no máximo 25 questões por página")
    public void testVerificaLinhas() {
        assertEquals(25, list.verificaNumLinhas(driver));
    }
}
