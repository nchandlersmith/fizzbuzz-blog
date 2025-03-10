package org.example.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class FizzbuzzTest {
    @Test
    void run_when1_then1() {
        Fizzbuzz fizzbuzz = new Fizzbuzz();
        String result = fizzbuzz.run(1);
        assertThat(result).isEqualTo("1");
    }
    @Test
    void run_when2_then2() {
        Fizzbuzz fizzbuzz = new Fizzbuzz();
        String result = fizzbuzz.run(2);
        assertThat(result).isEqualTo("2");
    }
    @Test
    void run_when3_Fizz() {
        Fizzbuzz fizzbuzz = new Fizzbuzz();
        String result = fizzbuzz.run(3);
        assertThat(result).isEqualTo("Fizz");
    }
    @Test
    void run_when6_Fizz() {
        Fizzbuzz fizzbuzz = new Fizzbuzz();
        String result = fizzbuzz.run(6);
        assertThat(result).isEqualTo("Fizz");
    }
    @Test
    void run_when5_Buzz() {
        Fizzbuzz fizzbuzz = new Fizzbuzz();
        String result = fizzbuzz.run(5);
        assertThat(result).isEqualTo("Buzz");
    }
    @Test
    void run_when10_Buzz() {
        Fizzbuzz fizzbuzz = new Fizzbuzz();
        String result = fizzbuzz.run(10);
        assertThat(result).isEqualTo("Buzz");
    }
    @Test
    void run_when15_FizzBuzz() {
        Fizzbuzz fizzbuzz = new Fizzbuzz();
        String result = fizzbuzz.run(15);
        assertThat(result).isEqualTo("FizzBuzz");
    }
    @Test
    void run_when30_FizzBuzz() {
        Fizzbuzz fizzbuzz = new Fizzbuzz();
        String result = fizzbuzz.run(30);
        assertThat(result).isEqualTo("FizzBuzz");
    }
}