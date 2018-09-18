package com.tour_mate_v2.project.tourmatev3;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.google.firebase.database.DatabaseReference;

import java.util.List;

public class Profile_Frgament extends Fragment {

    private ListView list;
    DatabaseReference databaseReference;
    List<User> users;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState ) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_profile, container, false);


        return v;


    }


    public static Fragment newInstance() {
        Profile_Frgament profile_Fragment = new Profile_Frgament();
        return profile_Fragment;
    }
}
