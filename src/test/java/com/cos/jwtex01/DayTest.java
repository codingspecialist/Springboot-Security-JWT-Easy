package com.cos.jwtex01;

import org.junit.jupiter.api.Test;

public class DayTest {

  @Test
  void daytest() {
    // given
    int years = 2022;

    int year = years - 1;
    int day = ((year * 365) + (year / 4) - (year / 100) + (year / 400)) % 7;
    if (day == 0) {
      System.out.println("월요일 입니다.");
    } else if (day == 1) {
      System.out.println("화요일 입니다.");
    } else if (day == 2) {
      System.out.println("수요일 입니다.");
    } else if (day == 3) {
      System.out.println("목요일 입니다.");
    } else if (day == 4) {
      System.out.println("금요일 입니다.");
    } else if (day == 5) {
      System.out.println("토요일 입니다.");
    } else if (day == 6) {
      System.out.println("일요일 입니다.");
    }
  }

}