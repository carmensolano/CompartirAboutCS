package com.example.carme.compartiraboutcs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView text =findViewById(R.id.nombre);
        final TextView text1 =findViewById(R.id.textView1);
        final TextView text2 =findViewById(R.id.textView2);
        final TextView text3 =findViewById(R.id.textView3);
        final TextView text4 =findViewById(R.id.textView5);

        Button but =findViewById(R.id.button1);

        but.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent sendIntent =new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.setType("text/plain");
                sendIntent.putExtra(Intent.EXTRA_TEXT, text.getText() .toString());
                sendIntent.putExtra(Intent.EXTRA_TEXT, text1.getText() .toString());
                sendIntent.putExtra(Intent.EXTRA_TEXT, text2.getText() .toString());
                sendIntent.putExtra(Intent.EXTRA_TEXT, text3.getText() .toString());
                sendIntent.putExtra(Intent.EXTRA_TEXT, text4.getText() .toString());

                if (sendIntent.resolveActivity(getPackageManager()) != null){
                    startActivity(sendIntent);
                }
            }
        });


    }
}
