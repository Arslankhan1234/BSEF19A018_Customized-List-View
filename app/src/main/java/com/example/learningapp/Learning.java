package com.example.learningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class Learning extends AppCompatActivity {
ListView li;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learning);
        li=findViewById(R.id.listview);

        String[] heading={"Apple","Butterfly","Cat","Dog","Elephant","Fish","Gittar","Hen","Ice Cream","Jug","Key"
        ,"Lion","Mouse","Nest","Orange","Pencil","Quit","Rabbit","Snake","Tiger","Umberella","Van","Watch"
        ,"X-ray","Yogurt","Zebra"};

        int []images={R.drawable.apple,R.drawable.butterfly,R.drawable.cat,R.drawable.dog,R.drawable.elephant,
        R.drawable.fish,R.drawable.gitter,R.drawable.hen,R.drawable.ic_launcher_background,R.drawable.jug,
        R.drawable.key,R.drawable.lion,R.drawable.mouse,R.drawable.nest,R.drawable.orange,
        R.drawable.pencil,R.drawable.quilt,R.drawable.rabit,R.drawable.snake,R.drawable.tiger,
        R.drawable.umbrella,R.drawable.van,R.drawable.watch,R.drawable.x_ray,R.drawable.yogurt,R.drawable.zebra};

    }
}