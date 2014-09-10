package com.example.joycegatan.myapplication;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class slacks extends ActionBarActivity {
Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slacks);
        button= (Button) findViewById(R.id.btn5); //<< initialize here
        // set OnClickListener for Button here
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(slacks.this, MyActivity2.class));
            }
        });
    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.slacks, menu);
        return true;
    }

    public void MyActivity(View view){
        Intent intent = new Intent(this, MyActivity2.class);
        startActivity(intent);
    }

    public void slacks(View view){
        Intent intent = new Intent(this, MyActivity2.class);
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
