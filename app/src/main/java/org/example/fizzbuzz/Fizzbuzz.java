package org.example.fizzbuzz;

public class Fizzbuzz {
    public String run(Integer input) {
        if (3 == input) {
            return "Fizz";
        }
        return String.valueOf(input);
    }
}
