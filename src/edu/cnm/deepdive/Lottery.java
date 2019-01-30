package edu.cnm.deepdive;

public class Lottery {

  private int[] numbers;

  public Lottery(int maximum) {
    numbers = new int[maximum];
    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = i + 1;
    }
  }

}
