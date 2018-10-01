package com.example.ajaygupta.ibhert;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.ScrollView;

public class Projects extends Fragment{

    View view;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.projects,container,false);
//        Log.i("Hello","whatsup");
        ScrollView scrollView = new ScrollView(getActivity());
        RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(R.id.projects_layout);
scrollView.removeAllViews();
        scrollView.addView(relativeLayout);
        return scrollView;
    }

}
