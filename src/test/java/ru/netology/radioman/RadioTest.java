package ru.netology.radioman;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio service = new Radio();

    @Test
    public void shouldRadioVolume() {
        service.setCurrentVolume(8);

        int expected = 8;
        int actual = service.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldNotSetVolumeAboveMax() {

        service.setMaxVolume();


        int expected = 100;
        int actual = service.increaseVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void decreaseVolumeBelowMin() {

        service.setMinVolume();

        int expected = 0;
        int actual = service.decreaseVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldNotSetVolumeLessMin() {

        service.setCurrentVolume(-1);

        int expected = 0;
        int actual = service.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldNotSetVolumeBelowMax() {

        service.setCurrentVolume(111);

        int expected = 0;
        int actual = service.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void increaseVolumeUp() {

        service.setCurrentVolume(8);

        int expected = 9;
        int actual = service.increaseVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void decreaseVolumeDown() {

        service.setCurrentVolume(8);

        int expected = 7;
        int actual = service.decreaseVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void setMinVolume() {

        service.setCurrentVolume(0);

        int expected = 0;
        int actual = service.setMinVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void setMaxVolume() {

        int expected = 100;
        int actual = service.setMaxVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldRadioWave() {

        service.setCurrentWave(7);
        Assertions.assertEquals(7, service.getRadioWave());

    }

    @Test
    public void increaseWaveUp() {

        service.setCurrentWave(8);
        Assertions.assertEquals(9, service.increaseWave());

    }

    @Test
    public void increaseWaveUpBelow9() {

        service.setCurrentWave(9);

        Assertions.assertEquals(0, service.increaseWave());
    }

    @Test
    public void decreaseWaveDown() {

        service.setCurrentWave(8);
        Assertions.assertEquals(7, service.decreaseWave());
    }

    @Test
    public void decreaseWaveBelowDown() {

        service.setMinWave();
        Assertions.assertEquals(9, service.decreaseWave());
    }

    @Test
    public void setMinWave() {

        service.setMinWave();
        Assertions.assertEquals(0, service.setMinWave());
    }

    @Test
    public void setMaxWave() {

        service.setMaxWave();
        Assertions.assertEquals(9, service.setMaxWave());
    }

    @Test
    public void notSetBelowMax() {

        service.setCurrentWave(101);
        Assertions.assertEquals(0, service.getRadioWave());
    }

    @Test
    public void notSetLessMin() {

        service.setCurrentWave(-1);
        Assertions.assertEquals(0, service.getRadioWave());
    }

    @Test
    public void howManiStations() {
        Radio service = new Radio(10);

        Assertions.assertEquals(10, service.getStationsTotal());
    }
}