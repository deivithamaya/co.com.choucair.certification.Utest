package co.com.choucair.certification.Utest.tasks;

import co.com.choucair.certification.Utest.userinterface.UtestRegister;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Clic implements Task {

    public static Clic theButton() {
        return Tasks.instrumented(Clic.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UtestRegister.REGISTER_BUTTON));
    }
}
