package com.example.chris.interface2sd2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


public Button btnCreateProfile;
public Button btnLogIntoProfile;

public void init(){
    btnCreateProfile = findViewById(R.id.buttonCreateProfile);
    btnCreateProfile.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            Intent CreatePro = new Intent(MainActivity.this, SecondaryActivity.class);
            startActivity(CreatePro);
        }
    });
   
}

public void init_second(){
    btnLogIntoProfile = findViewById(R.id.buttonLogIntoProfile);
    btnLogIntoProfile.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            Intent LogIntoPro = new Intent(MainActivity.this, TertiaryActivity.class);
            startActivity(LogIntoPro);
        }
    });
}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      init();
      init_second();
        }


}
