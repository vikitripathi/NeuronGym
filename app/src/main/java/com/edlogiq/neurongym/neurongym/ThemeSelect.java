package com.edlogiq.neurongym.neurongym;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.gc.materialdesign.views.Button;


public class ThemeSelect extends Activity {


    Button Next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_theme_select);

        //login page(login by facebook) calling by button1
        Next = (Button) findViewById(R.id.buttonFloat_next);
        // login_page = (Button) findViewById(R.id.btn_login_page);

        Next.setOnClickListener(new View.OnClickListener(){
            public void onClick(View arg0){

                Intent intent1 = new Intent(getApplicationContext(), HomePage.class);

                startActivity(intent1);
            }

        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_theme_select, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
