package com.example.apiapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {



    ArrayList<EmployeeData> employeelist= new ArrayList<EmployeeData>();

    RecyclerView recyclerView;

    ProgressBar progressBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView= findViewById(R.id.recyclerview);
        progressBar= findViewById(R.id.progress_circular);

        progressBar.setVisibility(View.VISIBLE);
        ApiInterface apiService = ApiClient.getClient().create(ApiInterface.class);

        Call<Employees> call = apiService.getEmployees();

        call.enqueue(new Callback<Employees>() {
            @Override
            public void onResponse(Call<Employees> call, Response<Employees> response) {

           //     Log.d("emplyee reslut",""+response.body().getData());
                Log.d("status code",response.code()+"");

                progressBar.setVisibility(View.GONE);

                if(response.body().getData() != null) {

                    employeelist = (ArrayList<EmployeeData>) response.body().getData();



                    setAdapter(employeelist);
                }
            }

            @Override
            public void onFailure(Call<Employees> call, Throwable t) {

                progressBar.setVisibility(View.GONE);

                Log.d("error",t.toString());

            }
        });

    }

    private void setAdapter(ArrayList<EmployeeData> employeelist) {

        MyListAdapter adapter = new MyListAdapter(employeelist);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }
}