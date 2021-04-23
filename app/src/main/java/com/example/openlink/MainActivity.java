package com.example.openlink;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    //creating the button variable
    Button go_btt;
    EditText search_txtt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //linking variables to xml code
        go_btt = findViewById(R.id.go_bt);
        search_txtt = findViewById(R.id.search_txt);

        //triggering go button
        go_btt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //creating a string variable to to store the input text
                String input = search_txtt.getText().toString();

                //intent to fetch current activity, parse the url input
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(input));
                startActivity(i);





            }
});
    }
}