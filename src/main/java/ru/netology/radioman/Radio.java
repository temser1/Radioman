package ru.netology.radioman;


public class Radio {
    public int currentRadioStation;
    public int currentVolume;


    public void Next() {
        if (currentRadioStation < 0) {
            currentRadioStation = 0;
            return;
        }
        if (currentRadioStation >= 9) {
            currentRadioStation = 0;
        } else {
            currentRadioStation = currentRadioStation + 1;
        }
    }

    public void prev() {

        if (currentRadioStation == 0) {
            currentRadioStation = 9;
            return;
        }
        if (currentRadioStation < 0) {
            currentRadioStation = 0;
            return;
        }
        if (currentRadioStation > 9) {
            currentRadioStation = 0;
        } else {
            currentRadioStation = currentRadioStation - 1;
        }
    }

    protected int getCurrentRadioStation() {
        return currentRadioStation;
    }

    protected void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < 0) {
            return;
        }
        if (newCurrentRadioStation > 9) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
        if (currentVolume >= 10) {
            currentVolume = 10;
        }
        if (currentVolume <= 0) {
            currentVolume = 0;
        }
    }

    public void reduceVolume() {
        if (currentVolume <= 10) {
            currentVolume = currentVolume - 1;
        }
        if (currentVolume > 10) {
            currentVolume = 10;
        }
        if (currentVolume <= 0) {
            currentVolume = 0;
        }
    }


}