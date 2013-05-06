package my.company.web.steps;

import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import net.thucydides.core.steps.StepFactory;

/**
 * @author Artem Eroshenko eroshenkoam
 *         5/6/13, 5:18 PM
 */
public class EndUserSteps extends ScenarioSteps {

    public EndUserSteps(Pages pages) {
        super(pages);
    }

    public EndUserAtMainPageSteps atMainPage() {
        return new StepFactory(getPages()).getStepLibraryFor(EndUserAtMainPageSteps.class);
    }

    public EndUserAtSearchPageSteps atSearchPage() {
        return new StepFactory(getPages()).getStepLibraryFor(EndUserAtSearchPageSteps.class);
    }

}
