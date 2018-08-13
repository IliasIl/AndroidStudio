package com.example.admin.app;

import android.media.MediaPlayer;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class Main3Activity extends AppCompatActivity {
private ImageView image1, image2;
private MediaPlayer catSound, dogSound;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

    }
    public void play(){
        image1= (ImageView)findViewById(R.id.imageView3);
        image2= (ImageView)findViewById(R.id.imageView4);
        catSound=MediaPlayer.create(this, R.raw.cat);
        dogSound=MediaPlayer.create(this, R.raw.dog);
        image1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundPlay(catSound);
            }
        });
        image2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundPlay(dogSound);
            }
        });
    }

    public void soundPlay(MediaPlayer sound){
        sound.start();
    }
//public void onClick(View view){
//        Fragment fragment=null;
//        switch (view.getId()){
//            case R.id.imageView3:
//                fragment= new FragmentOne();
//                break;
//            case R.id.imageView4:
//                fragment= new FragmentTwo();
//                break;
//        }
//
//    FragmentManager fr= getSupportFragmentManager();
//    FragmentTransaction tr=fr.beginTransaction();
//    tr.replace(R.id.frag, fragment);
//    tr.commit();
//
//}

}
