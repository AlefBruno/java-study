package lambda;

import java.util.function.BinaryOperator;

public class BinaryOperatorTest {
  public static void main(String[] args) {
    BinaryOperator<Double> soma = (num_1, num_2) -> num_1 + num_2;
    BinaryOperator<Double> multiplication = (num_1, num_2) -> num_1 * num_2;

    System.out.println(soma.apply(5.0,4.0));
    System.out.println(multiplication.apply(5.0,4.0));
  }
}

