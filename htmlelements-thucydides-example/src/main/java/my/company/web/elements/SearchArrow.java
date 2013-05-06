package my.company.web.elements;

import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.element.Button;
import ru.yandex.qatools.htmlelements.element.HtmlElement;
import ru.yandex.qatools.htmlelements.element.TextInput;

/**
 * @author Artem Eroshenko eroshenkoam
 *         5/6/13, 5:13 PM
 */
public class SearchArrow extends HtmlElement {

    @FindBy(xpath = ".//input[@class='b-form-input__input']")
    public TextInput requestInput;

    @FindBy(xpath = ".//input[@class='b-form-button__input']")
    public Button searchButton;

    public void searchFor(String request) {
        requestInput.clear();
        requestInput.sendKeys(request);
        searchButton.click();
    }
}
