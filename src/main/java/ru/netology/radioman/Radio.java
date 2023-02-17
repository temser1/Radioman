package ru.netology.radioman;


public class Radio {


    private int radioWave;
    private int maxWave = 9;
    private final int minWave = 0;
    private int amountRadioWave = 10;

    private final int maxVolume = 100;
    private final int minVolume = 0;
    private int currentVolume;

    public Radio() {
    }

    public Radio(int amountRadioWave) {
        this.amountRadioWave = amountRadioWave;
        this.maxWave = amountRadioWave - 1;
    }

    public int getStationsTotal() {
        return amountRadioWave;
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
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
        if (currentVolume >= maxVolume) {
            currentVolume = maxVolume;
        }
        return currentVolume;
    }

    public int decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
        if (currentVolume <= minVolume) {
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
        } else {
            radioWave = radioWave + 1;
            return radioWave;
        }
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