package com.example.admin.app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private EditText email, pass;
    private ImageView image;
    private Button but;
    private static final String EMAIL1="cossin90@gmail.com";
    private static final String PASSWORD="EstEnergy";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        play();
    }
    private void play() {
        email= (EditText) findViewById(R.id.editText3);
        pass= (EditText) findViewById(R.id.editText4);
        image= (ImageView)findViewById(R.id.imageView2);
        but= (Button)findViewById(R.id.button);
        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(EMAIL1.equals(email.getText().toString()) && (PASSWORD.equals(pass.getText().toString()))){
                        Intent intent= new Intent(MainActivity.this, Main3Activity.class);
                        startActivity(intent);
                } else {
                    image.setImageResource(R.drawable.wrong);
                }



            }
        });
    }
}
