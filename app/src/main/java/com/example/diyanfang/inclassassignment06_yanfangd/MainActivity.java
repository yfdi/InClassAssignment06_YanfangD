package com.example.diyanfang.inclassassignment06_yanfangd;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView displayText;
    String text = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        displayText = (TextView)findViewById(R.id.display_text);
    }

    public void addAnother(View view){
        Intent intent = new Intent(this, SecondActivity.class);
        startActivityForResult(intent,RequestCodes.ADD_ANIMAL);
    }

    //handling the returned data in MainActivity
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        if (requestCode == RequestCodes.ADD_ANIMAL && resultCode == RESULT_OK) {
            Animal animal = (Animal) data.getSerializableExtra(Keys.ANIMAL);

            text = text + "\n\n"+ animal.toString();
            displayText.setText(text);
        }
    }
}












//        Intent animalIntent = getIntent();
//        Animal a = (Animal)animalIntent.getSerializableExtra(Keys.ANIMAL);

//    public void openAnimal(View view){

//        Intent intent = new Intent(this, SecondActivity.class);
//
//        Animal animal = new Animal("tiger","more info",4,true);
//        intent.putExtra(Keys.ANIMAL, animal);
//
//        startActivity(intent);
//    }

