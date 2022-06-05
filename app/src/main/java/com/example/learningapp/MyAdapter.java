package com.example.learningapp;

import android.app.Activity;
import android.widget.ArrayAdapter;

public class MyAdapter extends ArrayAdapter {

    private final Activity context;
    private  final  String []heading;
    private  final  int [] images;

    public MyAdapter(Activity context,String[] heading,int []images){
        super(context,R.layout.activity_learning,heading);

        this.context=context;
        this.heading=heading;
        this.images=images;
    }
}
