package com.example.joycegatan.myapplication;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.content.Intent;
import android.view.View;
import android.widget.Button;


public class MyActivity2 extends ActionBarActivity {
Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_activity2);
        button= (Button) findViewById(R.id.btn3); //<< initialize here
        // set OnClickListener for Button here
        button.setOnClickListener(new View.OnClickListener()

        {
            public void onClick(View v) {
                startActivity(new Intent(MyActivity2.this, MyActivity3.class));
            }
        });

        button= (Button) findViewById(R.id.btn2); //<< initialize here
        // set OnClickListener for Button here
        button.setOnClickListener(new View.OnClickListener()

        {
            public void onClick(View v) {
                startActivity(new Intent(MyActivity2.this, slacks.class));
            }
        });
        button= (Button) findViewById(R.id.btn5); //<< initialize here
        // set OnClickListener for Button here
        button.setOnClickListener(new View.OnClickListener()

        {
            public void onClick(View v) {
                startActivity(new Intent(MyActivity2.this, belts.class));
            }
        });
        button= (Button) findViewById(R.id.btn77); //<< initialize here
        // set OnClickListener for Button here
        button.setOnClickListener(new View.OnClickListener()

        {
            public void onClick(View v) {
                startActivity(new Intent(MyActivity2.this, tshirts.class));
            }
        });

        button= (Button) findViewById(R.id.btn8); //<< initialize here
        // set OnClickListener for Button here
        button.setOnClickListener(new View.OnClickListener()

        {
            public void onClick(View v) {
                startActivity(new Intent(MyActivity2.this, jackets.class));
            }
        });
        button= (Button) findViewById(R.id.btn123); //<< initialize here
        // set OnClickListener for Button here
        button.setOnClickListener(new View.OnClickListener()

        {
            public void onClick(View v) {
                startActivity(new Intent(MyActivity2.this, lanyard.class));
            }
        });
        button= (Button) findViewById(R.id.btnfu); //<< initialize here
        // set OnClickListener for Button here
        button.setOnClickListener(new View.OnClickListener()

        {
            public void onClick(View v) {
                startActivity(new Intent(MyActivity2.this, lanyard.class));
            }
        });
        button= (Button) findViewById(R.id.btnh); //<< initialize here
        // set OnClickListener for Button here
        button.setOnClickListener(new View.OnClickListener()

        {
            public void onClick(View v) {
                startActivity(new Intent(MyActivity2.this, baler.class));
            }
        });

        button= (Button) findViewById(R.id.btne); //<< initialize here
        // set OnClickListener for Button here
        button.setOnClickListener(new View.OnClickListener()

        {
            public void onClick(View v) {
                startActivity(new Intent(MyActivity2.this, watch.class));
            }
        });
        button= (Button) findViewById(R.id.btnff); //<< initialize here
        // set OnClickListener for Button here
        button.setOnClickListener(new View.OnClickListener()

        {
            public void onClick(View v) {
                startActivity(new Intent(MyActivity2.this, rulers.class));
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my_activity2, menu);
        return true;
    }

    public void MyActivity3(View view)
    {
        Intent OpenMyActivity = new Intent(MyActivity2.this, MyActivity3.class);
        startActivity(OpenMyActivity);
    }

    public void MyActivity(View view){
        Intent intent = new Intent(this, slacks.class);
        startActivity(intent);
    }
    public void belts(View view){
        Intent intent = new Intent(this, belts.class);
        startActivity(intent);
    }
    public void tshirts(View view){
        Intent intent = new Intent(this, tshirts.class);
        startActivity(intent);
    }
    public void jackets(View view){
        Intent intent = new Intent(this, jackets.class);
        startActivity(intent);
    }
    public void lanyard(View view){
        Intent intent = new Intent(this, lanyard.class);
        startActivity(intent);
    }
    public void ID(View view){
        Intent intent = new Intent(this, ID.class);
        startActivity(intent);
    }
    public void baler(View view){
        Intent intent = new Intent(this, ID.class);
        startActivity(intent);
    }
    public void watch(View view){
        Intent intent = new Intent(this, watch.class);
        startActivity(intent);
    }
    public void rulers(View view){
        Intent intent = new Intent(this, rulers.class);
        startActivity(intent);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.android) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
