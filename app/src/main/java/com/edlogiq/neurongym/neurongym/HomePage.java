package com.edlogiq.neurongym.neurongym;

import android.app.ActionBar;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.gc.materialdesign.views.ButtonFloatSmall;


public class HomePage extends ActionBarActivity {

    ButtonFloatSmall brain_profile, comparision, leaders_board;
    Context mContext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        //mContext=(Context) getActivity();
        //For setting action bar title in center
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.actionbar_title);



        //Brain Profile Page calling by button_brain_profile
        brain_profile = (ButtonFloatSmall) findViewById(R.id.buttonFloat_brain_profile);
        //Comparision Page calling by buttonFloat_comparision
        comparision = (ButtonFloatSmall) findViewById(R.id.buttonFloat_comparision);
        //LeadersBoard Page calling by buttonFloat_leaders_board
        leaders_board = (ButtonFloatSmall) findViewById(R.id.buttonFloat_leaders_board);
        // login_page = (Button) findViewById(R.id.btn_login_page);

        brain_profile.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                Intent intent1 = new Intent(getApplicationContext(), BrainProfile.class);

                startActivity(intent1);
                /*Activity activity = getActivity();
                Fragment mFragment1 = new OverViewFragment();
                getFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, mFragment1)
                        .addToBackStack("")
                        .commit();*/

            }

        });


        comparision.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                Intent intent1 = new Intent(getApplicationContext(), Comparision.class);

                startActivity(intent1);
                /*Activity activity = getActivity();
                Fragment mFragment1 = new OverViewFragment();
                getFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, mFragment1)
                        .addToBackStack("")
                        .commit();*/

            }

        });


        leaders_board.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                Intent intent1 = new Intent(getApplicationContext(), LeadersBoard.class);

                startActivity(intent1);
                /*Activity activity = getActivity();
                Fragment mFragment1 = new OverViewFragment();
                getFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, mFragment1)
                        .addToBackStack("")
                        .commit();*/

            }

        });


    }


   /* @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_home_page, menu);
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
