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

        service.setCurrentStation(7);
        Assertions.assertEquals(7, service.getRadioStation());

    }

    @Test
    public void increaseWaveUp() {

        service.setCurrentStation(8);
        Assertions.assertEquals(9, service.increaseStation());

    }

    @Test
    public void increaseWaveUpBelow9() {

        service.setCurrentStation(9);

        Assertions.assertEquals(0, service.increaseStation());
    }

    @Test
    public void decreaseWaveDown() {

        service.setCurrentStation(8);
        Assertions.assertEquals(7, service.decreaseStation());
    }

    @Test
    public void decreaseWaveBelowDown() {

        service.setMinStation();
        Assertions.assertEquals(9, service.decreaseStation());
    }

    @Test
    public void setMinWave() {

        service.setMinStation();
        Assertions.assertEquals(0, service.setMinStation());
    }

    @Test
    public void setMaxWave() {

        service.setMaxStation();
        Assertions.assertEquals(9, service.setMaxStation());
    }

    @Test
    public void notSetBelowMax() {

        service.setCurrentStation(101);
        Assertions.assertEquals(0, service.getRadioStation());
    }

    @Test
    public void notSetLessMin() {

        service.setCurrentStation(-1);
        Assertions.assertEquals(0, service.getRadioStation());
    }

    @Test
    public void howManiStations() {
        Radio service = new Radio(10);

        Assertions.assertEquals(10, service.getStationsTotal());
    }
}