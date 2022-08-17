package com.example.apiapplication;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {

    @GET("employees")
    Call<Employees> getEmployees();
}
