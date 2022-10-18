package lambda;


// @FuncionalInterface é uma regra na qual so podemos ter uma unica função/método na classe.
@FunctionalInterface
public interface calculo {
    public abstract double executar(double a, double b);
}
