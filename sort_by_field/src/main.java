import java.util.*;

public class main {

    public static void main(String [] args){


        List<Corredor> corredores = new ArrayList<>();

        for(int i = 1; i <= 10 ; i++) {
            Corredor corredor = new Corredor("corredor " + (10 - i), i);
            corredores.add(corredor);
        }

        Collections.shuffle(corredores);
        corredores.forEach(corredor -> {
            System.out.println(corredor.getPosicao() + "° lugar, " + corredor.getNome() );
        });

        corredores.sort(Comparator.comparing(Corredor::getPosicao));

        System.out.println("-------------------------------------------------------------------------------");

        corredores.forEach(corredor -> {
            System.out.println(corredor.getPosicao() + "° lugar, " + corredor.getNome() );
        });

    }

}
