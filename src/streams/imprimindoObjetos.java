package streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class imprimindoObjetos {
    public static void main(String[] args) {
        List<String> aprovados = Arrays.asList("Lu","Gui", "Luca", "Ana");
        System.out.println(" Usando Foreach ....");
        for (String nome : aprovados) {
            System.out.println(nome);
        }

        System.out.println(" Usando Iterator ....");
        Iterator<String> it =  aprovados.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println(" Usando Stream ....");

        Stream<String> st = aprovados.stream();
        st.forEach(System.out::println);


    }
}