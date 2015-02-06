package com.edlogiq.neurongym.neurongym;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;


public class SignInActivity extends Activity {

    LinearLayout facebook_login, twitter_login,google_login,linkedin_login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        //login page(login by email id) calling by button
        facebook_login = (LinearLayout) findViewById(R.id.linearLayout2);
        // login_page = (Button) findViewById(R.id.btn_login_page);

        facebook_login.setOnClickListener(new View.OnClickListener(){
            public void onClick(View arg0){

                Intent intent1 = new Intent(getApplicationContext(), ThemeSelect.class);

                startActivity(intent1);
            }

        });


        //login page(login by email id) calling by button
        twitter_login = (LinearLayout) findViewById(R.id.linearLayout3);
        // login_page = (Button) findViewById(R.id.btn_login_page);

        twitter_login.setOnClickListener(new View.OnClickListener(){
            public void onClick(View arg0){

                Intent intent2 = new Intent(getApplicationContext(), ThemeSelect.class);

                startActivity(intent2);
            }

        });


        //login page(login by email id) calling by button
        google_login = (LinearLayout) findViewById(R.id.linearLayout4);
        // login_page = (Button) findViewById(R.id.btn_login_page);

        google_login.setOnClickListener(new View.OnClickListener(){
            public void onClick(View arg0){

                Intent intent3 = new Intent(getApplicationContext(), ThemeSelect.class);

                startActivity(intent3);
            }

        });


        //login page(login by email id) calling by button
        linkedin_login = (LinearLayout) findViewById(R.id.linearLayout5);
        // login_page = (Button) findViewById(R.id.btn_login_page);

        linkedin_login.setOnClickListener(new View.OnClickListener(){
            public void onClick(View arg0){

                Intent intent4 = new Intent(getApplicationContext(), ThemeSelect.class);

                startActivity(intent4);
            }

        });


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_sign_in, menu);
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
