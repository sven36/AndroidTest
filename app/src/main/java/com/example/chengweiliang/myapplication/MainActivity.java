package com.example.chengweiliang.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRE_MESSAGE="com.example.first.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view){
        Intent intent=new Intent(this,DisplayMessageActivity.class);
        EditText editText=(EditText) findViewById(R.id.editText);
        String mess=editText.getText().toString();
        intent.putExtra(EXTRE_MESSAGE,mess);
        startActivity(intent);
    }
}
