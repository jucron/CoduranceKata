package Joao_Renault;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeapYearTest {

  LeapYear leapYear;

  @BeforeEach
  void setUp() {
    leapYear = new LeapYear();
  }
  @Test
  void notDivBy_4_IsNotLeapYear() {
    assertFalse(leapYear.isLeapYear(1997));
  }
  @Test
  void divBy_4_IsLeapYear() {
    assertTrue(leapYear.isLeapYear(1996));
  }
  @Test
  void divBy_400_IsLeapYear() {
    assertTrue(leapYear.isLeapYear(1600));
  }
  @Test
  void divBy_4_And_100_but_notDivBy_400_IsNotLeapYear() {
    assertFalse(leapYear.isLeapYear(1800));
  }
}