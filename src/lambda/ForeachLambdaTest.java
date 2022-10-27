package lambda;

import java.io.OutputStream;
import java.util.Arrays;
import java.util.List;

import java.util.Scanner;
public class ForeachLambdaTest {
  public static void main(String[] args) {
    List<String> aprovados = Arrays.asList("Ana", "Gui", "Bia", "Juh");

    aprovados.forEach(System.out::println);
    aprovados.forEach(outroNome -> System.out.println(outroNome));


    aprovados.forEach(ForeachLambdaTest::meuImprimir);
    aprovados.forEach(nome -> meuImprimir(nome));

  }

  static void meuImprimir(String nome) {
    System.out.println("Meu nome é : " + nome);
  }
}