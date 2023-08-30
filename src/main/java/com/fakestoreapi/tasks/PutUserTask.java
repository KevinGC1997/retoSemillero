package com.fakestoreapi.tasks;

import com.fakestoreapi.models.bodyRequestPost.UserModel;
import com.fakestoreapi.questions.BuildDataUser;
import com.fakestoreapi.utils.Data;
import io.restassured.http.ContentType;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Put;

import java.util.Map;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static com.fakestoreapi.utils.Global.*;

public class PutUserTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        Map<String, String> data = Data.extractTo().get(0);
        UserModel user = actor.asksFor(BuildDataUser.was());

        actor.attemptsTo(
                Put.to(data.get("endPoint")+id).with(
                        requestSpecification -> requestSpecification
                                .contentType(ContentType.JSON)
                                .body(user).log().all()
                )
        );


    }

    public static PutUserTask on(){
        return instrumented(PutUserTask.class);
    }
}
