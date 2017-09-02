package com.example.ngohaihue.englishvocabulary.controllers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.ngohaihue.englishvocabulary.R;
import com.example.ngohaihue.englishvocabulary.controllers.TopicManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TopicManager topicManager = new TopicManager();


    }


}
