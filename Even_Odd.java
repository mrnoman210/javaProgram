// package com.addeven;
public class Even_Odd {
  public static void main(String[] args) {

    int finder;
    for (finder = 1; finder < 20; finder++) {
      if (finder % 2 == 0)
        System.out.println(finder + ": Is Even Number");
      else
        System.out.println(finder + ": Is Odd Number");
    }

  }
}