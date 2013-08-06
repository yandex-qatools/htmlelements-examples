package my.company.web;

import my.company.web.requirements.Application;
import my.company.web.steps.EndUserSteps;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Story;
import net.thucydides.core.pages.Pages;
import net.thucydides.junit.runners.ThucydidesRunner;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static ru.yandex.qatools.htmlelements.matchers.WebElementMatchers.exists;

/**
 * @author Artem Eroshenko eroshenkoam
 *         5/6/13, 2:51 PM
 */
@RunWith(ThucydidesRunner.class)
@Story(Application.Search.SearchByRequest.class)
public class SearchingByRequestTest {

    private final int DEFAULT_RESULTS_COUNT;

    @Managed(driver = "remote")
    @SuppressWarnings("unused")
    public WebDriver driver;

    @ManagedPages
    @SuppressWarnings("unused")
    public Pages pages;

    @Steps
    public EndUserSteps endUser;

    public SearchingByRequestTest() {
        DEFAULT_RESULTS_COUNT = 10;
    }

    @Test
    public void afterSearchingUserShouldSeSearchResults() {
        endUser.atMainPage().openMainPage();
        endUser.atMainPage().searchFor("Yandex");
        endUser.atSearchPage().searchResultsShould(exists());
        endUser.atSearchPage().searchItemsListShould(hasSize(DEFAULT_RESULTS_COUNT));
    }
}
