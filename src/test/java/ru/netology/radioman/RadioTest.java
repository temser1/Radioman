package ru.netology.radioman;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;



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
        public void shouldRadioStation() {
            Radio Station = new Radio(10, 0, 10, 0);
            Station.setCurrentStation(7);
            Assertions.assertEquals(7, Station.getRadioStation());

        }

        @Test
        public void increaseStationUp() {
            Radio Station = new Radio(10, 0, 10, 0);
            Station.setCurrentStation(8);
            Assertions.assertEquals(9, Station.increaseStation());

        }

        @Test
        public void increaseStationUpBelow10() {
            Radio Station = new Radio(10, 0, 10, 0);
            Station.setCurrentStation(10);

            Assertions.assertEquals(0, Station.increaseStation());
        }

        @Test
        public void decreaseStationDown() {
            Radio Station = new Radio(10, 0, 10, 0);
            Station.setCurrentStation(8);
            Assertions.assertEquals(7, Station.decreaseStation());
        }

        @Test
        public void decreaseStationBelowDown() {
            Radio Station = new Radio(10, 0, 10, 0);
            Station.setMinStation();
            Assertions.assertEquals(10, Station.decreaseStation());
        }

        @Test
        public void setMinStation() {
            Radio Station = new Radio(10, 0, 10, 0);
            Station.setMinStation();
            Assertions.assertEquals(0, Station.setMinStation());
        }

        @Test
        public void setMaxStation() {
            Radio Station = new Radio(10, 0, 10, 0);
            Station.setMaxStation();
            Assertions.assertEquals(10, Station.setMaxStation());
        }

        @Test
        public void notSetBelowMax() {
            Radio Station = new Radio(10, 0, 10, 0);
            Station.setCurrentStation(11);
            Assertions.assertEquals(0, Station.getRadioStation());
        }

        @Test
        public void notSetLessMin() {
            Radio Station = new Radio(10, 0, 10, 0);
            Station.setCurrentStation(-1);
            Assertions.assertEquals(0, Station.getRadioStation());
        }

        @Test
        public void notIncreaseBelowTen() {
            Radio Station = new Radio(10, 0, 10, 0);
            Station.setMaxStation();

            Assertions.assertEquals(0, Station.increaseStation());
        }

    }