package com.example.apiapplication;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/*import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;



import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {
    public static String BASE_URL ="https://dummy.restapiexample.com/api/v1/";
    private static Retrofit retrofit;
    public static Retrofit getClient(){
        if(retrofit == null){
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
public class ApiClient {

    private static Retrofit retrofit = null;

    public static Retrofit getClient() {




        retrofit = new Retrofit.Builder()
                .baseUrl("https://dummy.restapiexample.com/api/v1/")
                .addConverterFactory(GsonConverterFactory.create())

                .build();



        return retrofit;
    }

}*/

class ApiClient {

    private static Retrofit retrofit = null;

    static Retrofit getClient() {




        retrofit = new Retrofit.Builder()
                .baseUrl("https://dummy.restapiexample.com/api/v1/")
                .addConverterFactory(GsonConverterFactory.create())

                .build();



        return retrofit;
    }

}
