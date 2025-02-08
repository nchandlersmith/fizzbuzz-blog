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
}