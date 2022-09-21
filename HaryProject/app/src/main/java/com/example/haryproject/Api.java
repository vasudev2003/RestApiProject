package com.example.haryproject;

import com.example.haryproject.ModelResponse.RegisterResponse;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface Api {
    @PUT("Register.php")
    Call<RegisterResponse>register(
            @Field("username") String username,
            @Field("email") String email,
            @Field("password") String password
    );


}
