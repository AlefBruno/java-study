package lambda;

public class TesteCalculoLambda {
  public static void main(String[] args) {
    calculo calc = (number_1, number_2) -> { return number_1 + number_2; };
    System.out.println(calc.executar(4,6));

    calc = (x, y) -> x * y;

    System.out.println(calc.executar(4,6));

  }
}
