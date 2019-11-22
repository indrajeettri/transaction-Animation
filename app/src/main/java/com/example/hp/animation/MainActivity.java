package com.example.hp.animation;


import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    ImageView upArrow,rightArrow,downArrow,leftArrow;
    Animation slideUp,slideRight,slideDown,slideLeft;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView=findViewById(R.id.image_view);
        upArrow=findViewById(R.id.up_arrow);
        rightArrow=findViewById(R.id.right_arrow);
        downArrow=findViewById(R.id.down_arrow);
        leftArrow=findViewById(R.id.left_arrow);

        slideUp= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slide_up);
        slideRight=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slide_right);
        slideDown=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slide_down);
        slideLeft=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slide_left);

        upArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.startAnimation(slideUp);
            }
        });

        rightArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.startAnimation(slideRight);
            }
        });

        downArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.startAnimation(slideDown);
            }
        });

        leftArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.startAnimation(slideLeft);
            }
        });
    }
}
