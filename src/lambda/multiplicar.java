package lambda;

public class multiplicar implements calculo{
    @Override
    public double executar(double a, double b) {
        return a * b;
    }
}

