import java.util.Arrays;

import entidades.Cidade;
import entidades.Cliente;
import entidades.Pokemon;
public class App {
     public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");

        float salario = 100;
        int idade = 20;
        Cliente umCliente;
        System.out.println("ANTES");
        umCliente = new Cliente("Zezinho");
        System.out.println(umCliente);
        System.out.println("DEPOIS");

        Cidade cidadeJlle = new Cidade("Joinville");
        umCliente.setCidade(cidadeJlle);
        System.out.println(umCliente.getCidade().getNome());

        Pokemon jigglypuff = new Pokemon("Jigglypuff");
        umCliente.getListaPokemon().add(jigglypuff);
        // umCliente.getListaPokemon().add("PEDRA");
        // umCliente.getListaPokemon().add(1231231);
        // umCliente.getListaPokemon().add(true);

        System.out.println(umCliente.getListaPokemon());

    }
}
