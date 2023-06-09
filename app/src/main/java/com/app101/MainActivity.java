package com.app101;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button usersidebtn, staffsidebtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usersidebtn=(Button) findViewById(R.id.usersidebtn);
        usersidebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(MainActivity.this, userside.class);
                startActivity(intent);
            }
        });
        staffsidebtn=(Button) findViewById(R.id.staffsidebtn);
        staffsidebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(MainActivity.this, staffside.class);
                startActivity(intent1);
            }
        });


                

    }
}