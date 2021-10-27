package com.vincent.restaurangsida;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TestActivity extends AppCompatActivity {

    private Button button;
    private Button rest2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);



        button = (Button) findViewById(R.id.rest1);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){


            openActivity1();

            }





        });

        rest2 = (Button)findViewById(R.id.rest2);
        rest2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity2();
            }
        });


    }

    public void openActivity1(){
        Intent intent = new Intent(this, MenySida.class);
        intent.putExtra("Rest1", "10");
        startActivity(intent);


    }
    public void openActivity2(){
        Intent intent = new Intent(this, MenySida.class);
        intent.putExtra("Rest1","11");
        startActivity(intent);



    }





}