package my.company.web.pages;

import my.company.web.elements.SearchArrow;
import my.company.web.elements.SearchResults;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

/**
 * @author Artem Eroshenko eroshenkoam
 *         5/6/13, 5:15 PM
 */
@DefaultUrl("http://http://yandex.ru/yandsearch*")
public class SearchPage extends BlockPageObject {

    @FindBy(className = "b-serp-list")
    @SuppressWarnings("unused")
    private SearchResults searchResults;

    @FindBy(className = "b-morda-search-form")
    @SuppressWarnings("unused")
    private SearchArrow searchArrow;

    public SearchPage(WebDriver driver) {
        super(driver);
    }

    public void searchFor(String request) {
        this.searchArrow.searchFor(request);
    }

    public SearchResults getSearchResults() {
        return searchResults;
    }
}
