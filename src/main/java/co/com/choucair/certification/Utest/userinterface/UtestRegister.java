package co.com.choucair.certification.Utest.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestRegister extends PageObject {

    public static final Target REGISTER_BUTTON = Target.the("button that sends us to the form")
            .located(By.xpath("//a[contains(text(),'Join Today')]"));

}
