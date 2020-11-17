package com.company;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

  @Test
  void addition() {
    var calc = new Calculator();
    assertEquals(10, calc.addition(5, 5), "Answer should be 10.");
  }

  @Test
  void subtraction() {
    var calc = new Calculator();

    assertEquals(10, calc.subtraction(15,5), "Answer should be 10.");
  }
}