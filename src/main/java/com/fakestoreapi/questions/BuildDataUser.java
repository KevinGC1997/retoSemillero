package com.fakestoreapi.questions;

import com.fakestoreapi.models.bodyRequestPost.Address;
import com.fakestoreapi.models.bodyRequestPost.Geolocation;
import com.fakestoreapi.models.bodyRequestPost.Name;
import com.fakestoreapi.models.bodyRequestPost.UserModel;
import com.fakestoreapi.utils.Data;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.util.Map;

public class BuildDataUser implements Question<UserModel> {


    @Override
    public UserModel answeredBy(Actor actor) {

        Map<String, String> data = Data.extractTo().get(0);

        Name name = Name.builder()
                .firstname(data.get("firstname"))
                .lastname(data.get("lastname"))
                .build();

        Geolocation geolocation = Geolocation.builder()
                .lat("-37.2023")
                ._long("82.1996")
                .build();

        Address address = Address.builder()
                .city("kilcoole")
                .street("7835 new road")
                .number(1)
                .zipcode("12926")
                .geolocation(geolocation)
                .build();


        return UserModel.builder()
                .email(data.get("email"))
                .username(data.get("username"))
                .password(data.get("password"))
                .name(name)
                .address(address)
                .phone(data.get("phone"))
                .build();
    }

    public static BuildDataUser was(){
        return new BuildDataUser();
    }
}
