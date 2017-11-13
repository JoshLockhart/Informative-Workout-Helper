package com.lockhart.joshua.informativeworkouthelper;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.youtube.player.YouTubeStandalonePlayer;

public class SingleExerciseInfoActivity extends AppCompatActivity {
    String exerciseTitle, youtubeCode, textInstructions;
    int imageOne, imageTwo;
    TextView titleTextView, instructionsTextView;
    ImageView imageViewOne, imageViewTwo;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_exercise_info);

        Bundle extras = getIntent().getExtras();

        exerciseTitle = getIntent().getStringExtra("EXERCISE_IMAGE_TITLE");
        youtubeCode = getIntent().getStringExtra("YOUTUBE_CODE");
        textInstructions = getIntent().getStringExtra("TEXT_INSTRUCTIONS");
        imageOne = extras.getInt("IMAGE_ONE");
        imageTwo = extras.getInt("IMAGE_TWO");

        titleTextView = (TextView) findViewById(R.id.exerciseImageTitle);
        instructionsTextView = (TextView) findViewById(R.id.instructionsText);
        imageViewOne = (ImageView) findViewById(R.id.imageView1);
        imageViewTwo = (ImageView) findViewById(R.id.imageView2);

        titleTextView.setText(exerciseTitle);
        instructionsTextView.setText(textInstructions);
        imageViewOne.setImageResource(imageOne);
        imageViewTwo.setImageResource(imageTwo);

    }


    public void viewVideo(View v) {
        Intent exerciseVideo = YouTubeStandalonePlayer.createVideoIntent(this, "AIzaSyASetDKkwLsFMKaSfjiwiNlUoT8s3niF50", youtubeCode);
        startActivity(exerciseVideo);
    }

    public void viewText(View v) {
        Button viewTextButton = (Button) findViewById(R.id.viewTextInstructionsButton);
        viewTextButton.setVisibility(View.GONE);
        instructionsTextView.setVisibility(View.VISIBLE);

    }
}
