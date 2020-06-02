package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {

   @Test

   public void increaseCurrentTemperature() {
      Conditioner conditioner = new Conditioner();
      conditioner.setName("Conditioner");
      conditioner.setMaxTemperature(25);
      conditioner.setMinTemperature(15);
      conditioner.setOn(true);
      conditioner.setCurrentTemperature(20);
      conditioner.increaseCurrentTemperature();
      int expected = 21;
      int actual = conditioner.getCurrentTemperature();
      assertEquals(expected, actual);

   }
   @Test

   public void decreaseCurrentTemperature() {
      Conditioner conditioner = new Conditioner();
      conditioner.setName("Conditioner");
      conditioner.setMaxTemperature(25);
      conditioner.setMinTemperature(15);
      conditioner.setOn(true);
      conditioner.setCurrentTemperature(20);
      conditioner.decreaseCurrentTemperature();
      int expected = 19;
      int actual = conditioner.getCurrentTemperature();
      assertEquals(expected, actual);
   }
}