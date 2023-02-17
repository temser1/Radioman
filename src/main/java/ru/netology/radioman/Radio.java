package ru.netology.radioman;

public class Radio {

    private int maxWave = 10;
    private int minWave = 0;
    private int radioWave;

    private int maxVolume = 10;
    private int minVolume = 0;
    private int currentVolume;

    public Radio(int maxWave, int minWave, int maxVolume, int minVolume) {

        this.maxWave = maxWave;
        this.minWave = minWave;

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
        return radioWave;
    }

    public void setCurrentWave(int newCurrentWave) {
        if (newCurrentWave < minWave) {
            return;
        }
        if (newCurrentWave > maxWave) {
            return;
        }
        radioWave = newCurrentWave;
    }

    public int setMaxWave() {
        return maxWave;
    }

    public int setMinWave() {
        return minWave;
    }

    public int increaseWave() {
        if (radioWave >= maxWave) {
            return minWave;
        }
        if (radioWave > minWave) {
            radioWave = radioWave + 1;
        }
        return radioWave;
    }

    public int decreaseWave() {
        if (radioWave <= minWave) {
            radioWave = maxWave;
        } else {
            radioWave = radioWave - 1;
        }
        return radioWave;
    }
}