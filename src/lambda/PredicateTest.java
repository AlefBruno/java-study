package lambda;

import java.util.function.Predicate;

public class PredicateTest {
  public static void main(String[] args) {
    Predicate<Produto> isCaro = produto -> (produto.preco * (1 - produto.desconto) >= 1200.0);

    Produto produto = new Produto("Fogão", 1599.00, 0.15);
    System.out.println(isCaro.test(produto));
  }
}
