package com.lockhart.joshua.informativeworkouthelper;


import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class ExerciseListActivity extends AppCompatActivity implements AdapterView.OnItemClickListener  {
        String[] exerciseListTitles, exerciseTitles, difficulties, youtubeCodes, textInstructions;
        int[] images, imagesTwo;
        String chosenMuscle, chosenEquipment, equipment;
        ListView myListView;

        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.generic_listview);

            chosenMuscle = getIntent().getStringExtra("CHOSEN_MUSCLE");
            chosenEquipment = getIntent().getStringExtra("CHOSEN_EQUIPMENT");
            Context context = this;


            Resources res = getResources();

            switch (chosenMuscle) {
                case "Chest":
                    Muscle.Chest chest = new Muscle.Chest();
                    images = chest.getImages(chosenEquipment);
                    imagesTwo = chest.getImagesTwo(chosenEquipment);
                    exerciseListTitles = chest.getExerciseListTitles(context, chosenEquipment);
                    exerciseTitles = chest.getExerciseTitles(context, chosenEquipment);
                    difficulties = chest.getDifficulties(context, chosenEquipment);
                    youtubeCodes = chest.getYoutubeCodes(context, chosenEquipment);
                    textInstructions = chest.getTextInstructions(context, chosenEquipment);
                    equipment = chest.getEquipmentString(context, chosenEquipment);
                    break;
                case "Back":
                    Muscle.Back back = new Muscle.Back();
                    images = back.getImages(chosenEquipment);
                    imagesTwo = back.getImagesTwo(chosenEquipment);
                    exerciseListTitles = back.getExerciseListTitles(context, chosenEquipment);
                    exerciseTitles = back.getExerciseTitles(context, chosenEquipment);
                    difficulties = back.getDifficulties(context, chosenEquipment);
                    youtubeCodes = back.getYoutubeCodes(context, chosenEquipment);
                    textInstructions = back.getTextInstructions(context, chosenEquipment);
                    equipment = back.getEquipmentString(context, chosenEquipment);
                    break;
                case "Legs":
                    Muscle.Legs legs = new Muscle.Legs();
                    images = legs.getImages(chosenEquipment);
                    imagesTwo = legs.getImagesTwo(chosenEquipment);
                    exerciseListTitles = legs.getExerciseListTitles(context, chosenEquipment);
                    exerciseTitles = legs.getExerciseTitles(context, chosenEquipment);
                    difficulties = legs.getDifficulties(context, chosenEquipment);
                    youtubeCodes = legs.getYoutubeCodes(context, chosenEquipment);
                    textInstructions = legs.getTextInstructions(context, chosenEquipment);
                    equipment = legs.getEquipmentString(context, chosenEquipment);
                    break;
                case "Abdominals":
                    Muscle.Abdominals abdominals = new Muscle.Abdominals();
                    images = abdominals.getImages(chosenEquipment);
                    imagesTwo = abdominals.getImagesTwo(chosenEquipment);
                    exerciseListTitles = abdominals.getExerciseListTitles(context, chosenEquipment);
                    exerciseTitles = abdominals.getExerciseTitles(context, chosenEquipment);
                    difficulties = abdominals.getDifficulties(context, chosenEquipment);
                    youtubeCodes = abdominals.getYoutubeCodes(context, chosenEquipment);
                    textInstructions = abdominals.getTextInstructions(context, chosenEquipment);
                    equipment = abdominals.getEquipmentString(context, chosenEquipment);
                    break;
                case "Triceps":
                    Muscle.Triceps triceps = new Muscle.Triceps();
                    images = triceps.getImages(chosenEquipment);
                    imagesTwo = triceps.getImagesTwo(chosenEquipment);
                    exerciseListTitles = triceps.getExerciseListTitles(context, chosenEquipment);
                    exerciseTitles = triceps.getExerciseTitles(context, chosenEquipment);
                    difficulties = triceps.getDifficulties(context, chosenEquipment);
                    youtubeCodes = triceps.getYoutubeCodes(context, chosenEquipment);
                    textInstructions = triceps.getTextInstructions(context, chosenEquipment);
                    equipment = triceps.getEquipmentString(context, chosenEquipment);
                    break;
                case "Biceps":
                    Muscle.Biceps biceps = new Muscle.Biceps();
                    images = biceps.getImages(chosenEquipment);
                    imagesTwo = biceps.getImagesTwo(chosenEquipment);
                    exerciseListTitles = biceps.getExerciseListTitles(context, chosenEquipment);
                    exerciseTitles = biceps.getExerciseTitles(context, chosenEquipment);
                    difficulties = biceps.getDifficulties(context, chosenEquipment);
                    youtubeCodes = biceps.getYoutubeCodes(context, chosenEquipment);
                    textInstructions = biceps.getTextInstructions(context, chosenEquipment);
                    equipment = biceps.getEquipmentString(context, chosenEquipment);
                    break;
                case "Shoulders":
                    Muscle.Shoulders shoulders = new Muscle.Shoulders();
                    images = shoulders.getImages(chosenEquipment);
                    imagesTwo = shoulders.getImagesTwo(chosenEquipment);
                    exerciseListTitles = shoulders.getExerciseListTitles(context, chosenEquipment);
                    exerciseTitles = shoulders.getExerciseTitles(context, chosenEquipment);
                    difficulties = shoulders.getDifficulties(context, chosenEquipment);
                    youtubeCodes = shoulders.getYoutubeCodes(context, chosenEquipment);
                    textInstructions = shoulders.getTextInstructions(context, chosenEquipment);
                    equipment = shoulders.getEquipmentString(context, chosenEquipment);
                    break;
            }
            
            
            myListView = (ListView) findViewById(R.id.myEquipmentListView);
            ExerciseListAdapter adapter = new ExerciseListAdapter(this, exerciseListTitles, difficulties, equipment, images);
            myListView.setAdapter(adapter);
            myListView.setOnItemClickListener(this);
        }

        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            Intent intent = new Intent(this, SingleExerciseInfoActivity.class);
            intent.putExtra("EXERCISE_IMAGE_TITLE", exerciseTitles[position]);
            intent.putExtra("IMAGE_ONE", images[position]);
            intent.putExtra("IMAGE_TWO", imagesTwo[position]);
            intent.putExtra("YOUTUBE_CODE", youtubeCodes[position]);
            intent.putExtra("TEXT_INSTRUCTIONS", textInstructions[position]);
            startActivity(intent);
        }
    }


