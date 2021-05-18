package com.example.splashanimation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class Splash extends AppCompatActivity {

    private static final long SPLASH_SCREEN_DELAY =3000;

    Animation topAnim,bottomAnim;
    ImageView ivArticuno;
    TextView tvUni,tvLug;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        topAnim= AnimationUtils.loadAnimation(this,R.anim.top_animacion);
        bottomAnim=AnimationUtils.loadAnimation(this,R.anim.boton_animacion);

        ivArticuno=findViewById(R.id.avArticuno);
        tvUni=findViewById(R.id.tvUni);
        tvLug=findViewById(R.id.tvLug);

        ivArticuno.setAnimation(topAnim);
        tvUni.setAnimation(bottomAnim);
        tvLug.setAnimation(bottomAnim);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(Splash.this,login.class);
                startActivity(intent);
                finish();
            }
        },SPLASH_SCREEN_DELAY);

    }
}