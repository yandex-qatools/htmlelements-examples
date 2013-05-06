package my.company.web.pages;

import my.company.web.elements.SearchArrow;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.thucydides.BlockPageObject;

/**
 * @author Artem Eroshenko eroshenkoam
 *         5/6/13, 5:14 PM
 */
@DefaultUrl("http://www.yandex.ru")
public class MainPage extends BlockPageObject {

    @FindBy(className = "b-morda-search-form")
    private SearchArrow searchArrow;

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public void searchFor(String request) {
        this.searchArrow.searchFor(request);
    }

}
