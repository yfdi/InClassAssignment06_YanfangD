package com.example.diyanfang.inclassassignment06_yanfangd;

import android.content.Intent;

import java.io.Serializable;

/**
 * Created by diyanfang on 3/25/18.
 */

public class Animal implements Serializable {

    private String animalType;
    private String moreInformation;
    private int numberOfLegs;
    private boolean hasFur;

    public Animal(){

    }

    public Animal(String animalType, int numberOfLegs, boolean hasFur, String moreInformation) {
        this.animalType = animalType;
        this.numberOfLegs = numberOfLegs;
        this.hasFur = hasFur;
        this.moreInformation = moreInformation;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public boolean isHasFur() {
        return hasFur;
    }

    public void setHasFur(boolean hasFur) {
        this.hasFur = hasFur;
    }

    public String getMoreInformation() {
        return moreInformation;
    }

    public void setMoreInformation(String moreInformation) {
        this.moreInformation = moreInformation;
    }

    public String toString(){
        return "Animal Type: "+ animalType + "\nNumber of Legs" + numberOfLegs + "\nHas Fur: "
                + hasFur + "\nMore Information: " + moreInformation;
    }

}
