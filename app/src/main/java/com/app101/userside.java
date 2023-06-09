package com.app101;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class userside extends MainActivity{

    Button checkoutbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.userside);

        checkoutbtn=(Button) findViewById(R.id.checkoutbtn);
        checkoutbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(MainActivity.this, checkout.class);
                startActivity(intent);
            }
        });

    }
}
