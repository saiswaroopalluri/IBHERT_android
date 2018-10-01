package com.example.ajaygupta.ibhert;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.CardView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class Staff extends Fragment{

    View view;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.staff,container,false);
//        Log.i("Hello","whatsup");
//        ScrollView scrollView = new ScrollView(getActivity());
//        RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(R.id.about_us);
//
//        scrollView.addView(relativeLayout);
        final CardView cardView = (CardView) view.findViewById(R.id.staff);
        final TextView textView = (TextView) view.findViewById(R.id.supporting_text);
        final ImageButton imageButton = (ImageButton) view.findViewById(R.id.imageButton);
        final ImageView imageView = (ImageView) view.findViewById(R.id.media_image);
        textView.setVisibility(View.GONE);
        imageView.setVisibility(View.GONE);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(textView.getVisibility()==View.VISIBLE) {
                    imageButton.setImageResource(R.drawable.ic_expand_less_black_36dp);
                    textView.setVisibility(View.GONE);
                    imageView.setVisibility(View.GONE);
                }else{
                    imageButton.setImageResource(R.drawable.ic_expand_more_black_36dp);
                    textView.setVisibility(View.VISIBLE);
                    imageView.setVisibility(View.VISIBLE);
                }
            }
        });

        final CardView cardView2 = (CardView) view.findViewById(R.id.staff2);
        final TextView textView2 = (TextView) view.findViewById(R.id.supporting_text2);
        final ImageButton imageButton2 = (ImageButton) view.findViewById(R.id.imageButton2);
        final ImageView imageView2 = (ImageView) view.findViewById(R.id.media_image2);
        textView2.setVisibility(View.GONE);
        imageView2.setVisibility(View.GONE);
        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(textView2.getVisibility()==View.VISIBLE) {
                    imageButton2.setImageResource(R.drawable.ic_expand_less_black_36dp);
                    textView2.setVisibility(View.GONE);
                    imageView2.setVisibility(View.GONE);
                }else{
                    imageButton2.setImageResource(R.drawable.ic_expand_more_black_36dp);
                    textView2.setVisibility(View.VISIBLE);
                    imageView2.setVisibility(View.VISIBLE);
                }
            }
        });


        final CardView cardView3 = (CardView) view.findViewById(R.id.staff3);
        final TextView textView3 = (TextView) view.findViewById(R.id.supporting_text3);
        final ImageButton imageButton3 = (ImageButton) view.findViewById(R.id.imageButton3);
        final ImageView imageView3 = (ImageView) view.findViewById(R.id.media_image3);
        textView3.setVisibility(View.GONE);
        imageView3.setVisibility(View.GONE);
        cardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(textView3.getVisibility()==View.VISIBLE) {
                    imageButton3.setImageResource(R.drawable.ic_expand_less_black_36dp);
                    textView3.setVisibility(View.GONE);
                    imageView3.setVisibility(View.GONE);
                }else{
                    imageButton3.setImageResource(R.drawable.ic_expand_more_black_36dp);
                    textView3.setVisibility(View.VISIBLE);
                    imageView3.setVisibility(View.VISIBLE);
                }
            }
        });



        final CardView cardView4 = (CardView) view.findViewById(R.id.staff4);
        final TextView textView4 = (TextView) view.findViewById(R.id.supporting_text4);
        final ImageButton imageButton4 = (ImageButton) view.findViewById(R.id.imageButton4);
        final ImageView imageView4 = (ImageView) view.findViewById(R.id.media_image4);
        textView4.setVisibility(View.GONE);
        imageView4.setVisibility(View.GONE);
        cardView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(textView4.getVisibility()==View.VISIBLE) {
                    imageButton4.setImageResource(R.drawable.ic_expand_less_black_36dp);
                    textView4.setVisibility(View.GONE);
                    imageView4.setVisibility(View.GONE);
                }else{
                    imageButton4.setImageResource(R.drawable.ic_expand_more_black_36dp);
                    textView4.setVisibility(View.VISIBLE);
                    imageView4.setVisibility(View.VISIBLE);
                }
            }
        });



        final CardView cardView5 = (CardView) view.findViewById(R.id.staff5);
        final TextView textView5 = (TextView) view.findViewById(R.id.supporting_text5);
        final ImageButton imageButton5 = (ImageButton) view.findViewById(R.id.imageButton5);
        final ImageView imageView5 = (ImageView) view.findViewById(R.id.media_image5);
        textView5.setVisibility(View.GONE);
        imageView5.setVisibility(View.GONE);
        cardView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(textView5.getVisibility()==View.VISIBLE) {
                    imageButton5.setImageResource(R.drawable.ic_expand_less_black_36dp);
                    textView5.setVisibility(View.GONE);
                    imageView5.setVisibility(View.GONE);
                }else{
                    imageButton5.setImageResource(R.drawable.ic_expand_more_black_36dp);
                    textView5.setVisibility(View.VISIBLE);
                    imageView5.setVisibility(View.VISIBLE);
                }
            }
        });




        final CardView cardView6 = (CardView) view.findViewById(R.id.staff6);
        final TextView textView6 = (TextView) view.findViewById(R.id.supporting_text6);
        final ImageButton imageButton6 = (ImageButton) view.findViewById(R.id.imageButton6);
        final ImageView imageView6 = (ImageView) view.findViewById(R.id.media_image6);
        textView6.setVisibility(View.GONE);
        imageView6.setVisibility(View.GONE);
        cardView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(textView6.getVisibility()==View.VISIBLE) {
                    imageButton6.setImageResource(R.drawable.ic_expand_less_black_36dp);
                    textView6.setVisibility(View.GONE);
                    imageView6.setVisibility(View.GONE);
                }else{
                    imageButton6.setImageResource(R.drawable.ic_expand_more_black_36dp);
                    textView6.setVisibility(View.VISIBLE);
                    imageView6.setVisibility(View.VISIBLE);
                }
            }
        });



        final CardView cardView7 = (CardView) view.findViewById(R.id.staff7);
        final TextView textView7 = (TextView) view.findViewById(R.id.supporting_text7);
        final ImageButton imageButton7 = (ImageButton) view.findViewById(R.id.imageButton7);
        final ImageView imageView7 = (ImageView) view.findViewById(R.id.media_image7);
        textView7.setVisibility(View.GONE);
        imageView7.setVisibility(View.GONE);
        cardView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(textView7.getVisibility()==View.VISIBLE) {
                    imageButton7.setImageResource(R.drawable.ic_expand_less_black_36dp);
                    textView7.setVisibility(View.GONE);
                    imageView7.setVisibility(View.GONE);
                }else{
                    imageButton7.setImageResource(R.drawable.ic_expand_more_black_36dp);
                    textView7.setVisibility(View.VISIBLE);
                    imageView7.setVisibility(View.VISIBLE);
                }
            }
        });



        final CardView cardView8 = (CardView) view.findViewById(R.id.staff8);
        final TextView textView8 = (TextView) view.findViewById(R.id.supporting_text8);
        final ImageButton imageButton8 = (ImageButton) view.findViewById(R.id.imageButton8);
        final ImageView imageView8 = (ImageView) view.findViewById(R.id.media_image8);
        textView8.setVisibility(View.GONE);
        imageView8.setVisibility(View.GONE);
        cardView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(textView8.getVisibility()==View.VISIBLE) {
                    imageButton8.setImageResource(R.drawable.ic_expand_less_black_36dp);
                    textView8.setVisibility(View.GONE);
                    imageView8.setVisibility(View.GONE);
                }else{
                    imageButton8.setImageResource(R.drawable.ic_expand_more_black_36dp);
                    textView8.setVisibility(View.VISIBLE);
                    imageView8.setVisibility(View.VISIBLE);
                }
            }
        });



        final CardView cardView9 = (CardView) view.findViewById(R.id.staff9);
        final TextView textView9 = (TextView) view.findViewById(R.id.supporting_text9);
        final ImageButton imageButton9 = (ImageButton) view.findViewById(R.id.imageButton9);
        final ImageView imageView9 = (ImageView) view.findViewById(R.id.media_image9);
        textView9.setVisibility(View.GONE);
        imageView9.setVisibility(View.GONE);
        cardView9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(textView9.getVisibility()==View.VISIBLE) {
                    imageButton9.setImageResource(R.drawable.ic_expand_less_black_36dp);
                    textView9.setVisibility(View.GONE);
                    imageView9.setVisibility(View.GONE);
                }else{
                    imageButton9.setImageResource(R.drawable.ic_expand_more_black_36dp);
                    textView9.setVisibility(View.VISIBLE);
                    imageView9.setVisibility(View.VISIBLE);
                }
            }
        });

        ScrollView scrollView = new ScrollView(getActivity());
        LinearLayout relativeLayout = (LinearLayout) view.findViewById(R.id.linearstaff);

        scrollView.addView(relativeLayout);

        return scrollView;
    }
}
