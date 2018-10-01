package com.example.ajaygupta.ibhert;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.ScrollView;

public class About_IBH extends Fragment {

    View view;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.about_ibh,container,false);
        Log.i("Hello","whatsup");
        ScrollView scrollView = new ScrollView(getActivity());
        RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(R.id.about_us);

        scrollView.addView(relativeLayout);

        return scrollView;
    }
}
