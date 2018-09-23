package com.tour_mate_v2.project.tourmatev3;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class Home_fragment extends Fragment {

    Button button_Add_Event, button_View_All_Event, button_Nearby_Places, button_Weather;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.home_fragment, container,false);

        //button_Add_Event = view.findViewById(R.id.button_Add_Event);


        return view;
    }
}
