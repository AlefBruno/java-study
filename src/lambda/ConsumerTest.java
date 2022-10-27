package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;

public class ConsumerTest {
  public static void main(String[] args) {

    Consumer<Produto> imprimir = produto -> System.out.println(produto.nome);

    Produto notebook = new Produto("Notebook", 4990.98, 0.15);
    imprimir.accept(notebook);


    Produto p1 = new Produto("Caneta", 4.08, 0.05);
    Produto p2 = new Produto("Lápis", 2.08, 0.05);
    Produto p3 = new Produto("Borracha", 5.08, 0.05);
    Produto p4 = new Produto("Apontador", 6.08, 0.05);

    List<Produto> itens = Arrays.asList(p1, p2, p3, p4);

    itens.forEach(imprimir);

    itens.forEach(produto -> System.out.println(produto.preco));

    itens.forEach(System.out::println);

  }
}
