package Joao_Renault;

import java.util.ArrayList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*
Write a function that takes positive integers and outputs their string representation.
Your function should comply with the following additional rules:
    If the number is a multiple of three, return the string "Fizz".
    If the number is a multiple of five, return the string "Buzz".
    If the number is a multiple of both three and five, return the string "FizzBuzz".
    Extra: adds an extra Fizz or Buzz whenever one of the digits ('3' or '5') appears in the number itself
 */

class FizzBuzzTest {
  private FizzBuzz fizzBuzz;

  @BeforeEach
  void startUp () {
    fizzBuzz = new FizzBuzz();
  }

  @Test
  void convert_1_to_1() {
    String answer = fizzBuzz.fizzBuzzOriginal(1);

    assertEquals("1",answer);
  }
  @Test
  void convert_2_to_2() {
    String answer = fizzBuzz.fizzBuzzOriginal(2);

    assertEquals("2",answer);
  }
  @Test
  void convert_4_to_4() {
    assertEquals("4", fizzBuzz.fizzBuzzOriginal(4));
  }
  @Test
  void convert_3_to_Fizz() {
    assertEquals("Fizz", fizzBuzz.fizzBuzzOriginal(3));
  }
  @Test
  void convert_6_to_Fizz() {
    assertEquals("Fizz", fizzBuzz.fizzBuzzOriginal(6));
  }
  @Test
  void convert_9_to_Fizz() {
    assertEquals("Fizz", fizzBuzz.fizzBuzzOriginal(9));
  }
  @Test
  void convert_5_to_Buzz() {
    assertEquals("Buzz", fizzBuzz.fizzBuzzOriginal(5));
  }
  @Test
  void convert_10_to_Buzz() {
    assertEquals("Buzz", fizzBuzz.fizzBuzzOriginal(10));
  }
  @Test
  void convert_20_to_Buzz() {
    assertEquals("Buzz", fizzBuzz.fizzBuzzOriginal(20));
  }
  @Test
  void convert_15_to_FizzBuzz() {
    assertEquals("FizzBuzz", fizzBuzz.fizzBuzzOriginal(15));
  }
  @Test
  void convert_30_to_FizzBuzz() {
    assertEquals("FizzBuzz", fizzBuzz.fizzBuzzOriginal(30));
  }
  @Test
  void convert_45_to_FizzBuzz() {
    assertEquals("FizzBuzz", fizzBuzz.fizzBuzzOriginal(45));
  }
  @Test
  void convert_1_to_15_willReturnListGivenByExercise() {
    String[] testResultExpectedList = {"1","2","Fizz","4","Buzz","Fizz","7",
        "8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"};
    ArrayList<String> resultList = new ArrayList<>();
    for (int i=1; i<=15; i++) {
      resultList.add(fizzBuzz.fizzBuzzOriginal(i));
    }
    assertArrayEquals(testResultExpectedList, resultList.toArray());
  }

  // Tests for the Enhanced method!
  @Test
  void convert_1_to_1_enhanced() {
    String answer = fizzBuzz.fizzBuzzEnhanced(1);

    assertEquals("1",answer);
  }
  @Test
  void convert_2_to_2_enhanced() {
    String answer = fizzBuzz.fizzBuzzEnhanced(2);

    assertEquals("2",answer);
  }
  @Test
  void convert_4_to_4_enhanced() {
    assertEquals("4", fizzBuzz.fizzBuzzEnhanced(4));
  }
  @Test
  void convert_3_to_Fizz_enhanced() {
    assertEquals("FizzFizz", fizzBuzz.fizzBuzzEnhanced(3));
  }
  @Test
  void convert_6_to_Fizz_enhanced() {
    assertEquals("Fizz", fizzBuzz.fizzBuzzEnhanced(6));
  }
  @Test
  void convert_9_to_Fizz_enhanced() {
    assertEquals("Fizz", fizzBuzz.fizzBuzzEnhanced(9));
  }
  @Test
  void convert_5_to_Buzz_enhanced() {
    assertEquals("BuzzBuzz", fizzBuzz.fizzBuzzEnhanced(5));
  }
  @Test
  void convert_10_to_Buzz_enhanced() {
    assertEquals("Buzz", fizzBuzz.fizzBuzzEnhanced(10));
  }
  @Test
  void convert_20_to_Buzz_enhanced() {
    assertEquals("Buzz", fizzBuzz.fizzBuzzEnhanced(20));
  }
  @Test
  void convert_15_to_FizzBuzz_enhanced() {
    assertEquals("FizzBuzzBuzz", fizzBuzz.fizzBuzzEnhanced(15));
  }
  @Test
  void convert_30_to_FizzBuzz_enhanced() {
    assertEquals("FizzBuzzFizz", fizzBuzz.fizzBuzzEnhanced(30));
  }
  @Test
  void convert_45_to_FizzBuzz_enhanced() {
    assertEquals("FizzBuzzBuzz", fizzBuzz.fizzBuzzEnhanced(45));
  }
}