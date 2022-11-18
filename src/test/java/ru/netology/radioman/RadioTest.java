package ru.netology.radioman;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class RadioTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/NextRadioStation.csv")

    public void NextRadioStation(int expected, int newCurrentRadioStation) {
        Radio station = new Radio();
        station.currentRadioStation = newCurrentRadioStation;
        station.Next();
        int actual = station.currentRadioStation;

        Assertions.assertEquals(expected, actual);

    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/PrevRadioStation.csv")
    public void PervRadioStation(int expected, int newCurrentRadioStation) {
        Radio station = new Radio();
        station.currentRadioStation = newCurrentRadioStation;
        station.prev();
        int actual = station.currentRadioStation;

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/SetRadioStation.csv")
    public void SetRadioStation(int expected, int newCurrentRadioStation) {
        Radio station = new Radio();
        station.setCurrentRadioStation(newCurrentRadioStation);
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);

    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/ToCreaseVolume.csv")
    public void ToCreaseVolume(int expected, int newCurrentVolume) {
        Radio station = new Radio();
        station.currentVolume = newCurrentVolume;
        station.increaseVolume();
        int actual = station.currentVolume;

        Assertions.assertEquals(expected, actual);

    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/ReduceVolume.csv")

    public void ReduceVolume(int expected, int newCurrentVolume) {
        Radio station = new Radio();
        station.currentVolume = newCurrentVolume;
        station.reduceVolume();
        int actual = station.currentVolume;

        Assertions.assertEquals(expected, actual);
    }
}