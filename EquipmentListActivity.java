package com.lockhart.joshua.informativeworkouthelper;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.Objects;

public class EquipmentListActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    String chosenMuscle;
    String[] equipmentList;
    ListView equipmentListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.generic_listview);

        chosenMuscle = getIntent().getStringExtra("CHOSEN_MUSCLE");
        equipmentListView = (ListView) findViewById(R.id.myEquipmentListView);

        switch (chosenMuscle) {
            case "Chest":
                equipmentList = new String[] {"Dumbbells", "Barbell", "Cable", "Suspension Trainer", "Machine", "Body Weight"};
                break;
            case "Back":
                equipmentList = new String[] {"Dumbbells", "Barbell", "Cable", "Suspension Trainer", "Machine", "Body Weight"};
                break;
            case "Legs":
                equipmentList = new String[] {"Dumbbells", "Barbell", "Cable", "Machine", "Body Weight"};
                break;
            case "Abdominals":
                equipmentList = new String[] {"Dumbbells", "Barbell", "Cable", "Suspension Trainer", "Machine", "Body Weight"};
                break;
            case "Triceps":
                equipmentList = new String[] {"Dumbbells", "Cable", "Machine", "Body Weight"};
                break;
            case "Biceps":
                equipmentList = new String[] {"Dumbbells", "Cable", "Machine"};
                break;
            case "Shoulders":
                equipmentList = new String[] {"Dumbbells", "Barbell", "Cable", "Suspension Trainer", "Machine"};
                break;
        }
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.equipment_row, equipmentList);
        equipmentListView.setAdapter(adapter);
        equipmentListView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        TextView textView = (TextView) view;
        String textViewText = textView.getText().toString();

        Intent intent = new Intent(this, ExerciseListActivity.class);
        intent.putExtra("CHOSEN_MUSCLE", chosenMuscle);
        intent.putExtra("CHOSEN_EQUIPMENT", textViewText);
        startActivity(intent);
    }
}