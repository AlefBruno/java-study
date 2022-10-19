package lambda;

import java.util.Arrays;
import java.util.List;

public class ForeachDefaultTest {
  public static void main(String[] args) {

    List<String> aprovados = Arrays.asList("Ana", "Gui", "Bia", "Juh");

    for (String nome : aprovados) {
      System.out.println(nome);
    }
  }
}
