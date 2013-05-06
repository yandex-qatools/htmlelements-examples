package my.company.web.steps;

import my.company.web.pages.SearchPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import org.hamcrest.Matcher;

import static org.junit.Assert.assertThat;

/**
 * @author Artem Eroshenko eroshenkoam
 *         5/6/13, 5:17 PM
 */
public class EndUserAtSearchPageSteps extends ScenarioSteps {

    public SearchPage onSearchPage() {
        return pages().get(SearchPage.class);
    }

    public EndUserAtSearchPageSteps(Pages pages) {
        super(pages);
    }

    @Step
    public void searchFor(String request) {
        onSearchPage().searchFor(request);
    }

    @Step
    @SuppressWarnings("unchecked")
    public void searchResultsShould(Matcher matcher) {
        assertThat(onSearchPage().getSearchResults(), matcher);
    }

    @Step
    @SuppressWarnings("unchecked")
    public void searchItemsListShould(Matcher matcher) {
        assertThat(onSearchPage().getSearchResults().getSearchItems(), matcher);
    }
}
