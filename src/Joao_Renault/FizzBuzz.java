package Joao_Renault;

public class FizzBuzz {
    /*
    Start by writing a failing test for the simplest behaviour.
    Implement the simplest amount of code needed to make the test pass.
    As you add more tests, refactor to make the code more generic and more suitable.
    "fake it until you make it" - Even Kent Beck
     */
    public static void main(String[] args) {
	// write your code here
    }


    public String fizzBuzzOriginal(int i) {
        if (i%3==0 && i%5==0) {
            return "FizzBuzz";
        }else if (i%3==0) {
            return "Fizz";
        } else if (i%5==0) {
            return "Buzz";
        }
        return String.valueOf(i);
    }
    public String fizzBuzzEnhanced(int i) {
        StringBuilder answer = new StringBuilder();

        if (i%3==0 && i%5==0) {
            answer.append("FizzBuzz");
        }else if (i%3==0) {
            answer.append("Fizz");
        } else if (i%5==0) {
            answer.append("Buzz");
        } else {
            return String.valueOf(i);
        }
        while (i>0) {
            int remainder = i%10;
            if (remainder==3) {
                answer.append("Fizz");
            }
            if (remainder==5) {
                answer.append("Buzz");
            }
            i=i/10;
        }
        return answer.toString();
    }
}
