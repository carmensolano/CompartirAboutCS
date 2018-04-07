package com.example.carme.compartiraboutcs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    Button but;
    TextView text;
    TextView text1;
    TextView text2;
    TextView text3;
    TextView text4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        but = findViewById(R.id.buttonHome);
        text = findViewById(R.id.yourname);
        text1 = findViewById(R.id.yourgithub);
        text2 = findViewById(R.id.yourphone);
        text3 = findViewById(R.id.yourinsta);
        text4 = findViewById(R.id.yourtwitter);

        Intent callingIntent = getIntent();
        String intentAction = callingIntent.getAction();
        String intentType = callingIntent.getType();

        if (Intent.ACTION_SEND.equals(intentAction) && intentType != null){
            if (intentType.equals("text/plain")){
                handleReceivedText(callingIntent);
            }
        }

        but.setOnClickListener(new View.OnClickListener(){
            @Override

            public void onClick(View v){
                Intent fstScreenIntent = new Intent(getApplicationContext(), MainActivity.class );
                startActivity(fstScreenIntent);

            }

        });

    }

    public void handleReceivedText(Intent i ){
        String intentText = i.getStringExtra(Intent.EXTRA_TEXT);

        if(text != null){
            text.setText(intentText);
        }

        String intentText1 = i.getStringExtra(Intent.EXTRA_TEXT);
        if (text1 != null){
            text1.setText(intentText1);
        }

        String intentText2 = i.getStringExtra(Intent.EXTRA_TEXT);
        if (text2 != null){
            text2.setText(intentText2);
        }

        String intentText3 = i.getStringExtra(Intent.EXTRA_TEXT);
        if (text3 != null){
            text3.setText(intentText3);
        }

        String intentText4 = i.getStringExtra(Intent.EXTRA_TEXT);
        if (text4 != null){
            text4.setText(intentText4);
        }


    }
}
