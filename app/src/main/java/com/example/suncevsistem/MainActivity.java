package com.example.suncevsistem;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setTitle("OPIS");
        builder.setMessage("Prikaz najblize 4 planete suncu.\n" +
                "Venera koja je 2. po redu planeta ima retrogradno kretanje " +
                "tj.krece se suprotno od smera kretanja kazaljke na satu");
        builder.show();

        RotateAnimation rotation = new RotateAnimation(0,360, Animation.RELATIVE_TO_SELF,0.5f,Animation.RELATIVE_TO_SELF,0.5f);
        rotation.setDuration(25000);
        rotation.setRepeatCount(Animation.INFINITE);
        rotation.setInterpolator(new LinearInterpolator());

        ImageView imageView = (ImageView) findViewById(R.id.imageViewM);
        imageView.startAnimation(rotation);

        RotateAnimation rotation2 = new RotateAnimation(0,360, Animation.RELATIVE_TO_SELF,0.5f,Animation.RELATIVE_TO_SELF,0.5f);
        rotation2.setDuration(17000);
        rotation2.setRepeatCount(Animation.INFINITE);
        rotation2.setInterpolator(new LinearInterpolator());

        ImageView imageView2 = (ImageView) findViewById(R.id.imageViewZ);
        imageView2.startAnimation(rotation2);

        RotateAnimation rotation3 = new RotateAnimation(360,0, Animation.RELATIVE_TO_SELF,0.5f,Animation.RELATIVE_TO_SELF,0.5f);
        rotation3.setDuration(10000);
        rotation3.setRepeatCount(Animation.INFINITE);
        rotation3.setInterpolator(new LinearInterpolator());

        ImageView imageView3 = (ImageView) findViewById(R.id.imageViewV);
        imageView3.startAnimation(rotation3);

        RotateAnimation rotation4 = new RotateAnimation(0,360, Animation.RELATIVE_TO_SELF,0.5f,Animation.RELATIVE_TO_SELF,0.5f);
        rotation4.setDuration(5000);
        rotation4.setRepeatCount(Animation.INFINITE);
        rotation4.setInterpolator(new LinearInterpolator());

        ImageView imageView4 = (ImageView) findViewById(R.id.imageViewMe);
        imageView4.startAnimation(rotation4);

    }
}