package com.example.android.buyandsell;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b=(Button) findViewById(R.id.button1);
        b.setOnClickListener(this);
    }

    public void onClick(View v)
    {
        // TODO Auto-generated method stub
        Intent i = new Intent(getApplicationContext(),Timer.class);
        startActivity(i);
        setContentView(R.layout.activity_timer);
    }

    void loginandregister()
    {

    }
    void instructions()
    {

    }

    void displayitems()
    {

    }
    void products_bought()
    {

    }
    void products_sold()
    {

    }
    void set_price()
    {

    }
    void refresh_list()
    {

    }
    void total_points()
    {

    }

}

