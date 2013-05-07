package my.company.web.pages;

import my.company.web.elements.SearchArrow;
import my.company.web.elements.SearchResults;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.yandex.qatools.htmlelements.loader.decorator.HtmlElementDecorator;

/**
 * @author Artem Eroshenko eroshenkoam
 *         5/6/13, 5:15 PM
 */
public class SearchPage {

    @SuppressWarnings("unused")
    private WebDriver driver;

    @FindBy(className = "b-serp-list")
    @SuppressWarnings("unused")
    private SearchResults searchResults;

    @FindBy(className = "b-morda-search-form")
    @SuppressWarnings("unused")
    private SearchArrow searchArrow;

    public SearchPage(WebDriver driver) {
        PageFactory.initElements(new HtmlElementDecorator(driver), this);
        this.driver = driver;
    }

    public void searchFor(String request) {
        this.searchArrow.searchFor(request);
    }

    public SearchResults getSearchResults() {
        return this.searchResults;
    }
}
