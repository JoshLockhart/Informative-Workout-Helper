package com.lockhart.joshua.informativeworkouthelper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;


public class MainActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*
     ** When a certain muscle is tapped, the the chosen muscle is passed and
     ** used in the activity "EquipmentListActivity"
    */
    public void onMuscleButtonClick(View view) {
        Button button = (Button) view;
        String buttonText = button.getText().toString();
        Intent intent = new Intent(this, EquipmentListActivity.class);
        intent.putExtra("CHOSEN_MUSCLE", buttonText);
        startActivity(intent);
    }
}
