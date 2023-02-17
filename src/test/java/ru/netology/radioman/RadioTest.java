package ru.netology.radioman;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void shouldRadioVolume() {
        Radio volume = new Radio(10, 0, 10, 0);
        volume.setCurrentVolume(8);

        int expected = 8;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldNotSetVolumeAboveMax() {
        Radio volume = new Radio(10, 0, 10, 0);
        volume.setMaxVolume();


        int expected = 10;
        int actual = volume.increaseVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void decreaseVolumeBelowMin() {
        Radio volume = new Radio(10, 0, 10, 0);
        volume.setMinVolume();

        int expected = 0;
        int actual = volume.decreaseVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldNotSetVolumeLessMin() {
        Radio volume = new Radio(10, 0, 10, 0);
        volume.setCurrentVolume(-1);

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldNotSetVolumeBelowMax() {
        Radio volume = new Radio(10, 0, 10, 0);
        volume.setCurrentVolume(11);

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void increaseVolumeUp() {
        Radio volume = new Radio(10, 0, 10, 0);
        volume.setCurrentVolume(8);

        int expected = 9;
        int actual = volume.increaseVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void decreaseVolumeDown() {
        Radio volume = new Radio(10, 0, 10, 0);
        volume.setCurrentVolume(8);

        int expected = 7;
        int actual = volume.decreaseVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void setMinVolume() {
        Radio volume = new Radio(10, 0, 10, 0);
        volume.setCurrentVolume(0);

        int expected = 0;
        int actual = volume.setMinVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void setMaxVolume() {
        Radio volume = new Radio(10, 0, 10, 0);
        volume.setCurrentVolume(10);

        int expected = 10;
        int actual = volume.setMaxVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldRadioWave() {
        Radio wave = new Radio(10, 0, 10, 0);
        wave.setCurrentWave(7);
        Assertions.assertEquals(7, wave.getRadioWave());

    }

    @Test
    public void increaseWaveUp() {
        Radio wave = new Radio(10, 0, 10, 0);
        wave.setCurrentWave(8);
        Assertions.assertEquals(9, wave.increaseWave());

    }

    @Test
    public void increaseWaveUpBelow10() {
        Radio wave = new Radio(10, 0, 10, 0);
        wave.setCurrentWave(10);

        Assertions.assertEquals(0, wave.increaseWave());
    }

    @Test
    public void decreaseWaveDown() {
        Radio wave = new Radio(10, 0, 10, 0);
        wave.setCurrentWave(8);
        Assertions.assertEquals(7, wave.decreaseWave());
    }

    @Test
    public void decreaseWaveBelowDown() {
        Radio wave = new Radio(10, 0, 10, 0);
        wave.setMinWave();
        Assertions.assertEquals(10, wave.decreaseWave());
    }

    @Test
    public void setMinWave() {
        Radio wave = new Radio(10, 0, 10, 0);
        wave.setMinWave();
        Assertions.assertEquals(0, wave.setMinWave());
    }

    @Test
    public void setMaxWave() {
        Radio wave = new Radio(10, 0, 10, 0);
        wave.setMaxWave();
        Assertions.assertEquals(10, wave.setMaxWave());
    }

    @Test
    public void notSetBelowMax() {
        Radio wave = new Radio(10, 0, 10, 0);
        wave.setCurrentWave(11);
        Assertions.assertEquals(0, wave.getRadioWave());
    }

    @Test
    public void notSetLessMin() {
        Radio wave = new Radio(10, 0, 10, 0);
        wave.setCurrentWave(-1);
        Assertions.assertEquals(0, wave.getRadioWave());
    }

    @Test
    public void notIncreaseBelowTen() {
        Radio wave = new Radio(10, 0, 10, 0);
        wave.setMaxWave();

        Assertions.assertEquals(0, wave.increaseWave());
    }

}
