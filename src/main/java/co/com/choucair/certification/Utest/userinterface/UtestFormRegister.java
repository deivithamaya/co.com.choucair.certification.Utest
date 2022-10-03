package co.com.choucair.certification.Utest.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestFormRegister extends PageObject {
    public static final Target FIRST_NAME = Target.the("enter name")
            .located(By.id("firstName"));
    public static final Target LAST_NAME = Target.the("enter last name")
            .located(By.id("lastName"));
    public static final Target EMAIL = Target.the("enter email")
            .located(By.id("email"));
    public static final Target MONTH = Target.the("enter month")
            .located(By.xpath("//select[@id='birthMonth']"));
    public static final Target SELECT_MONTH = Target.the("select month")
            .located(By.xpath("//option[contains(text(),'July')]"));

    public static final Target DAY = Target.the("enter day")
            .located(By.xpath("//select[@id='birthDay']"));

    public static final Target SELECT_DAY = Target.the("select day")
            .located(By.xpath("//option[contains(text(),'14')]"));

    public static final Target YEAR = Target.the("enter year")
            .located(By.xpath("//select[@id='birthYear']"));

    public static final Target SELECT_YEAR = Target.the("select year")
            .located(By.xpath("//option[contains(text(),'1998')]"));

    public static final Target BUTTON_NEXT = Target.the("next page")
            .located(By.xpath("//span[contains(text(),'Next')]"));

    public static final Target VERSION = Target.the("insert version")
            .located(By.xpath("//span[contains(text(),'Select a Version')]"));
    public static final Target SELECT_VERSION = Target.the("selesct version")
            .located(By.xpath("//div[contains(text(),'Ubuntu')]"));

    public static final Target LANGUAGE = Target.the("insert language")
            .located(By.xpath("//span[contains(text(),'Select OS language')]"));

    public static final Target SELECT_LANGUAGE = Target.the("selesct version")
            .located(By.xpath("//div[contains(text(),'English')]"));

    public static final Target MOBILE = Target.the("insert mobile")
            .located(By.xpath("//span[contains(text(),'Select Brand')]"));

    public static final Target SELECT_MOBILE = Target.the("selesct mobile")
            .located(By.xpath("//div[contains(text(),'Asus')]"));

    public static final Target MODEL = Target.the("insert model")
            .located(By.xpath("//span[contains(text(),'Select a Model')]"));

    public static final Target SELECT_MODEL = Target.the("select model")
            .located(By.xpath("//div[contains(text(),'MeMO')]"));

    public static final Target SYSTEMM = Target.the("insert system")
            .located(By.xpath("//span[contains(text(),'Select OS')][1]"));

    public static final Target SELECT_SYSTEM = Target.the("select system")
            .located(By.xpath("//div[contains(text(),'Android 4.0.2')]"));

    public static final Target REMOVE = Target.the("remove item selected")
            .located(By.className("glyphicon-remove"));

    public static final Target SELECT_SYSTEM_COMPUTE = Target.the("select system compute")
            .located(By.xpath("//div[contains(text(),'Linux')]"));

    public static final Target PASSWORD = Target.the("enter password")
            .located(By.id("password"));

    public static final Target CONFIRMPASSWORD = Target.the("enter password again")
            .located(By.id("confirmPassword"));

    public static final Target CHECK_TERMS = Target.the("accept terms")
            .located(By.xpath("//span[@class='checkmark signup-consent__checkbox error'][1]"));

    public static final Target CHECK_PRIVACY = Target.the("accept privacy")
            .located(By.xpath("//span[@class='checkmark signup-consent__checkbox error'][1]"));

    public static final Target CHECKDOIN = Target.the("confirm the password is correct")
            .located(By.xpath("//i[@class='validation-icon material-icons']"));
}
