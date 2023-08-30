package com.fakestoreapi.questions;

import com.fakestoreapi.models.bodyResponsePost.ResponsePostUser;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class PostDataResponse implements Question<ResponsePostUser> {

    @Override
    public ResponsePostUser answeredBy(Actor actor) {
        return SerenityRest.lastResponse().as(ResponsePostUser.class);
    }

    public static PostDataResponse was(){
        return new PostDataResponse();
    }
}
