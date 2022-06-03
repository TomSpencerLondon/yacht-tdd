package com.jitterted;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class YachtTest {

  @Test
  void rollFiveDiceResultsIn12345() {
    // Given
    Yacht yacht = new Yacht();

    // When
    String result = yacht.rollDice();

    assertThat(result)
        .isEqualTo("12345");
  }
}
