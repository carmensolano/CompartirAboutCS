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


                if (sendIntent.resolveActivity(getPackageManager()) != null){
                    startActivity(sendIntent);
                }

                Intent sendIntent1=new Intent();
                sendIntent1.setAction(Intent.ACTION_SEND);
                sendIntent1.setType("text/plain");
                sendIntent1.putExtra(Intent.EXTRA_TEXT, text1.getText() .toString());

                if (sendIntent1.resolveActivity(getPackageManager()) != null){
                    startActivity(sendIntent1);
                }


                Intent sendIntent2=new Intent();
                sendIntent2.setAction(Intent.ACTION_SEND);
                sendIntent2.setType("text/plain");
                sendIntent2.putExtra(Intent.EXTRA_TEXT, text2.getText() .toString());

                if (sendIntent2.resolveActivity(getPackageManager()) != null){
                    startActivity(sendIntent2);
                }


                Intent sendIntent3=new Intent();
                sendIntent3.setAction(Intent.ACTION_SEND);
                sendIntent3.setType("text/plain");
                sendIntent3.putExtra(Intent.EXTRA_TEXT, text3.getText() .toString());

                if (sendIntent3.resolveActivity(getPackageManager()) != null){
                    startActivity(sendIntent3);
                }


                Intent sendIntent4=new Intent();
                sendIntent4.setAction(Intent.ACTION_SEND);
                sendIntent4.setType("text/plain");
                sendIntent4.putExtra(Intent.EXTRA_TEXT, text4.getText() .toString());

                if (sendIntent4.resolveActivity(getPackageManager()) != null){
                    startActivity(sendIntent4);
                }

                // Intent createChooser(sendIntent, Share);
                //Intent sendIntent = new Intent(Intent.ACTION_SEND);
                //String title = getResources().getString(R.string.Share);
               // Intent chooser = Intent.createChooser(sendIntent,title);

               // if (sendIntent.resolveActivity(getPackageManager()) != null) {
                  //  startActivity(chooser);
               // }

            }
        });



    }
}


