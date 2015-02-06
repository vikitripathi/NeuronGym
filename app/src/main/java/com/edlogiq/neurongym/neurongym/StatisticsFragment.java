package com.edlogiq.neurongym.neurongym;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * Created by Rajiv Kumar on 1/20/2015.
 */
public class StatisticsFragment  extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_statistics, container, false);
//For setting action bar title in center
        //ActionBar actionBar = getActivity().getSupportActionBar();
        // getActivity().getActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        // getActivity().getActionBar().setCustomView(R.layout.actionbar_title);
        return rootView;
    }

    public void onActivityCreated(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onActivityCreated(savedInstanceState);

    }
}


