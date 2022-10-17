package lambda;

public class TesteCalculo {
    public static void main(String[] args) {

        calculo calculo = new somar();
        System.out.println(calculo.executar(2,3));

        calculo = new multiplicar();
        System.out.println(calculo.executar(2,3));
    }

}
