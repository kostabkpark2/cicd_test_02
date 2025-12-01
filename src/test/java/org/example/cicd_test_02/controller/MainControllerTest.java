package org.example.cicd_test_02.controller;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MainControllerTest {

  @Test
  void main(){
    int a = 1;
    Assertions.assertThat(a).isEqualTo(0);
  }
}