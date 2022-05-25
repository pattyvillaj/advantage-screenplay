package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userinterface.AdvantageHomePage;

public class Answer implements Question<Boolean> {

    private String question;

    public Answer(String question){
        this.question=question;
    }

    public static Answer toThe(String question) {
        return new Answer(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;

        String textConfirmed = Text.of(AdvantageHomePage.MENU_USER).viewedBy(actor).asString();
        if (textConfirmed.contains(question)) {
            result = true;
        }else {
            result = false;
        }
        return result;
    }
}
