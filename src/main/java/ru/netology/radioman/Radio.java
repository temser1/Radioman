package ru.netology.radioman;


public class Radio {

    private int maxStation = 10;
    private int minStation = 0;

    private int radioStation;

    private int maxVolume = 10;
    private int minVolume = 0;
    private int currentVolume;

    public Radio(int maxStation, int minStation, int maxVolume, int minVolume) {

        this.maxStation = maxStation;
        this.minStation = minStation;

        this.maxVolume = maxVolume;
        this.minVolume = minVolume;


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

    public int getRadioWave() {
        return radioStation;
    }

    public void setCurrentWave(int newCurrentWave) {
        if (newCurrentWave < minStation) {
            return;
        }
        if (newCurrentWave > maxStation) {
            return;
        }
        radioStation = newCurrentWave;
    }

    public int setMaxWave() {
        return maxStation;
    }

    public int setMinWave() {
        return minStation;
    }

    public int increaseWave() {
        if (radioStation >= maxStation) {
            return minStation;
        }
        if (radioStation > minStation) {
            radioStation = radioStation + 1;
        }
        return radioStation;
    }

    public int decreaseWave() {
        if (radioStation <= minStation) {
            radioStation = maxStation;
        } else {
            radioStation = radioStation - 1;
        }
        return radioStation;
    }
}