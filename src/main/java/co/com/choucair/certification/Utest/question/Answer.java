package co.com.choucair.certification.Utest.question;

import co.com.choucair.certification.Utest.userinterface.UtestFormRegister;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answer implements Question<Boolean> {
    public String question;
    public Answer(String question){this.question = question;}

    public static Answer toThe(String questions) {
        return new Answer(questions);
    }


    @Override
    public Boolean answeredBy(Actor actor) {
        Boolean result;
        String checkPassword = Text.of(UtestFormRegister.CHECKDOIN).viewedBy(actor).asString();
        if(question.equals(checkPassword)) {
            result = true;
        }else{
            result = false;
        }
        System.out.println("check "+checkPassword);
        System.out.println("the response is " +result);
        return result;
    }
}
