package com.app101;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


Button
public class staffside extends MainActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.staffside);

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
