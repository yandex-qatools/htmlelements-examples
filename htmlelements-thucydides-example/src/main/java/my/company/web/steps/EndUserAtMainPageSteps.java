package my.company.web.steps;

import my.company.web.pages.MainPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

/**
 * @author Artem Eroshenko eroshenkoam
 *         5/6/13, 5:17 PM
 */
public class EndUserAtMainPageSteps extends ScenarioSteps {

    public EndUserAtMainPageSteps(Pages pages) {
        super(pages);
    }

    public MainPage onMainPage() {
        return pages().get(MainPage.class);
    }

    public void openMainPage() {
        onMainPage().open();
    }

    @Step
    public void searchFor(String request) {
        onMainPage().searchFor(request);
    }

}
