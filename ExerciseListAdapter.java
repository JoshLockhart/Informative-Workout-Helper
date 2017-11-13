package com.lockhart.joshua.informativeworkouthelper;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

class ExerciseListAdapter extends ArrayAdapter<String> {
    private Context context;
    private int[] images;
    private String[] titles, difficulties;
    private String equipment;


    ExerciseListAdapter(Context context,int[] images, String[] titles,  String[] difficulties, String equipment){
        super(context, R.layout.single_exercise_listview_row, R.id.myTitleTextView, titles);
        this.context = context;
        this.images = images;
        this.titles = titles;
        this.difficulties = difficulties;
        this.equipment = equipment;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View row = inflater.inflate(R.layout.single_exercise_listview_row, parent, false);

        ImageView myImage = row.findViewById(R.id.myImageView);
        TextView myTitle = row.findViewById(R.id.myTitleTextView);
        TextView myDifficulty = row.findViewById(R.id.myDiffTextView);
        TextView myEquipment = row.findViewById(R.id.myEquipmentTextView);

        myImage.setImageResource(images[position]);
        myTitle.setText(titles[position]);
        myDifficulty.setText(difficulties[position]);
        myEquipment.setText(equipment);

        return row;
    }
}
