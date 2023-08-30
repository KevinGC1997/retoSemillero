package com.fakestoreapi.models.bodyResponseDelete;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserModelDelete {

    @JsonProperty("address")
    public AddressDelete address;

    @JsonProperty("id")
    public Integer id;

    @JsonProperty("email")
    public String email;

    @JsonProperty("username")
    public String username;

    @JsonProperty("password")
    public String password;

    @JsonProperty("name")
    public NameDel name;

    @JsonProperty("phone")
    public String phone;

    @JsonProperty("__v")
    public Integer __v;
}
