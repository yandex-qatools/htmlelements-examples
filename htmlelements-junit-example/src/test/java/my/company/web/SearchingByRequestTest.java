package my.company.web;

import my.company.web.pages.MainPage;
import my.company.web.pages.SearchPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.junit.Assert.assertThat;
import static ru.yandex.qatools.htmlelements.matchers.WebElementMatchers.exists;

/**
 * @author Artem Eroshenko eroshenkoam
 *         5/6/13, 2:51 PM
 */
public class SearchingByRequestTest {

    private final int DEFAULT_RESULTS_COUNT;

    private WebDriverProperties webDriverProperties = new WebDriverProperties();

    public WebDriver driver = new RemoteWebDriver(webDriverProperties.getServer(), DesiredCapabilities.firefox());

    public SearchingByRequestTest() {
        DEFAULT_RESULTS_COUNT = 10;
    }

    @Before
    public void loadStartPage() {
        driver.get("http://www.yandex.ru");
    }

    @Test
    public void afterSearchingUserShouldSeSearchResults() {
        MainPage mainPage = new MainPage(driver);
        SearchPage page = mainPage.searchFor("Yandex");
        assertThat(page.getSearchResults(), exists());
        assertThat(page.getSearchResults().getSearchItems(), hasSize(DEFAULT_RESULTS_COUNT));
    }

    @After
    public void killWebDriver() {
        driver.quit();
    }
}
