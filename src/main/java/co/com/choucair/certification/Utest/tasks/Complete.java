package co.com.choucair.certification.Utest.tasks;


import co.com.choucair.certification.Utest.model.TestChoucairData;
import co.com.choucair.certification.Utest.userinterface.UtestFormRegister;
import co.com.choucair.certification.Utest.userinterface.UtestRegister;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

public class Complete implements Task {
    private List<TestChoucairData> testChoucairData;
    public Complete(List<TestChoucairData>testChoucairData){
        this.testChoucairData = testChoucairData;
    }
    public static Complete theForm(List<TestChoucairData> testChoucairData) {
        return Tasks.instrumented(Complete.class,testChoucairData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(testChoucairData.get(0).getStrFirstName()).into(UtestFormRegister.FIRST_NAME),
                Enter.theValue(testChoucairData.get(0).getStrLastName()).into(UtestFormRegister.LAST_NAME),
                Enter.theValue(testChoucairData.get(0).getStrEmailAddres()).into(UtestFormRegister.EMAIL),
                Click.on(UtestFormRegister.MONTH),
                Click.on(UtestFormRegister.SELECT_MONTH),
                Click.on(UtestFormRegister.DAY),
                Click.on(UtestFormRegister.SELECT_DAY),
                Click.on(UtestFormRegister.YEAR),
                Click.on(UtestFormRegister.SELECT_YEAR),
                Click.on(UtestFormRegister.BUTTON_NEXT),
                Click.on(UtestFormRegister.BUTTON_NEXT),
                Click.on(UtestFormRegister.REMOVE),
                Click.on(UtestFormRegister.SYSTEMM),
                Click.on(UtestFormRegister.SELECT_SYSTEM_COMPUTE),
                Click.on(UtestFormRegister.VERSION),
                Click.on(UtestFormRegister.SELECT_VERSION),
                Click.on(UtestFormRegister.LANGUAGE),
                Click.on(UtestFormRegister.SELECT_LANGUAGE),
                Click.on(UtestFormRegister.MOBILE),
                Click.on(UtestFormRegister.SELECT_MOBILE),
                Click.on(UtestFormRegister.MODEL),
                Click.on(UtestFormRegister.SELECT_MODEL),
                Click.on(UtestFormRegister.BUTTON_NEXT),
                Enter.theValue(testChoucairData.get(0).getStrPassword()).into(UtestFormRegister.PASSWORD),
                Enter.theValue(testChoucairData.get(0).getStrRePassword()).into(UtestFormRegister.CONFIRMPASSWORD),
                Click.on(UtestFormRegister.CHECK_TERMS),
                Click.on(UtestFormRegister.CHECK_PRIVACY)
                );
    }
}
