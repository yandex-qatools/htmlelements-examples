package my.company.web.elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.element.HtmlElement;

import java.util.List;

/**
 * @author Artem Eroshenko eroshenkoam
 *         5/6/13, 5:13 PM
 */
public class SearchResults extends HtmlElement {

    @SuppressWarnings("unused")
    @FindBy(xpath = ".//li[contains(@class, 'b-serp-item_js_inited')]")
    private List<WebElement> searchItems;

    public List<WebElement> getSearchItems() {
        return searchItems;
    }
}
