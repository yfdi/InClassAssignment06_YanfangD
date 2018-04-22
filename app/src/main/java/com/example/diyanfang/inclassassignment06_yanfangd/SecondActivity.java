package com.example.diyanfang.inclassassignment06_yanfangd;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView animalType;
    TextView numberOfLegs;
    TextView moreInformation;
    CheckBox hasFur;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        animalType = (EditText)findViewById(R.id.animalName_editText);
        numberOfLegs = (EditText)findViewById(R.id.legs_editText);
        moreInformation = (EditText)findViewById(R.id.moreInfo_editText);
        hasFur = (CheckBox)findViewById(R.id.hasFur_checkbox);
    }


    public void addAnimal(View view){
        String animalName = animalType.getText().toString();
        int numLegs = Integer.parseInt(numberOfLegs.getText().toString());
        boolean animalHasFur = hasFur.isChecked();
        String moreInfo = moreInformation.getText().toString();

        Animal a = new Animal(animalName, numLegs, animalHasFur, moreInfo);

        Intent animalIntent = new Intent(this, MainActivity.class);
        animalIntent.putExtra(Keys.ANIMAL,a);
        setResult(RESULT_OK,animalIntent);
        finish();
    }



}
