package Joao_Renault;
/*
Implement a method that checks if a year is a leap year.

All the following rules must be satisfied:

A year is not a leap year if not divisible by 4
A year is a leap year if divisible by 4
A year is a leap year if divisible by 400
A year is not a leap year if divisible by 100 but not by 400
 */
public class LeapYear {

  public boolean isLeapYear(int year) {
    //1st validation: NOT LeapYear
    if (!isDivisible(year,4) ||
        (isDivisible(year,100) && !isDivisible(year,400))) {
      return false;
    }
    //Last validation: IS LeapYear (if it's not, it is)
    return true;
  }
  private boolean isDivisible(int year, int number) {
    return (year%number==0);
  }
}
