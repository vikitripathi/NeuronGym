package com.edlogiq.neurongym.neurongym;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.Locale;


public class SelectLanguage extends Activity {



    Locale myLocale;
    LinearLayout l_english, l_spanish;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_language);

        //login page(login by email id) calling by button
        l_english = (LinearLayout) findViewById(R.id.linearLayout2);
        // login_page = (Button) findViewById(R.id.btn_login_page);

        //setting language for whole application
        // Toast.makeText(parent.getContext(),
        //       "You have selected Tamil", Toast.LENGTH_SHORT)
        //     .show();
        setLocale("es");


       /* l_english.setOnClickListener(new View.OnClickListener(){
            public void onClick(View arg0){

                Intent intent1 = new Intent(getApplicationContext(), SignInActivity.class);

                startActivity(intent1);
            }

        });*/


    }

    public void setLocale(String lang) {

        myLocale = new Locale(lang);
        Resources res = getResources();
        DisplayMetrics dm = res.getDisplayMetrics();
        Configuration conf = res.getConfiguration();
        conf.locale = myLocale;
        res.updateConfiguration(conf, dm);
        Intent refresh = new Intent(this, SignInActivity.class);
        startActivity(refresh);
    }


   /* @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_select_language, menu);
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
    }*/
}
