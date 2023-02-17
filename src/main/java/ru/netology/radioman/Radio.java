package ru.netology.radioman;
public class Radio {


    private int radioStation;
    private int maxStation = 9;
    private final int minStation = 0;
    private int amountRadioStation = 10;

    private final int maxVolume = 100;
    private final int minVolume = 0;
    private int currentVolume;

    public Radio() {
    }

    public Radio(int amountRadioWave) {
        this.amountRadioStation = amountRadioWave;
        this.maxStation = amountRadioWave - 1;
    }

    public int getStationsTotal() {
        return amountRadioStation;
    }
    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < minVolume) {
            return;
        }
        if (newCurrentVolume > maxVolume) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public int setMaxVolume() {
        currentVolume = maxVolume;
        return maxVolume;
    }

    public int setMinVolume() {
        currentVolume = minVolume;
        return minVolume;
    }

    public int increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
        if (currentVolume >= 10) {
            currentVolume = maxVolume;
        }
        return currentVolume;
    }

    public int decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
        if (currentVolume <= 0) {
            currentVolume = minVolume;
        }
        return currentVolume;
    }

    public int getRadioStation(){
        return radioStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < minStation) {
            return;
        }
        if (newCurrentStation > maxStation) {
            return;
        }
        radioStation = newCurrentStation;
    }

    public int setMaxStation() {
        return maxStation;
    }

    public int setMinStation() {
        return minStation;
    }

    public int increaseStation() {
        if (radioStation >= maxStation) {
            return minStation;
        }
        if (radioStation > minStation) {
            radioStation = radioStation + 1;
        }
        return radioStation;
    }

    public int decreaseStation() {
        if (radioStation <= minStation) {
            radioStation = maxStation;
        } else {
            radioStation = radioStation - 1;
        }
        return radioStation;
    }
}