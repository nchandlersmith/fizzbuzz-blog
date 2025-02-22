package org.example.fizzbuzz;

public class Fizzbuzz {
    public String run(Integer input) {
        if (0 == input % 15) {
            return "FizzBuzz";
        }
        if (0 == input % 5) {
            return "Buzz";
        }
        if (0 == input % 3) {
            return "Fizz";
        }
        return String.valueOf(input);
    }
}
