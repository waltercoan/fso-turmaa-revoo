import entidades.Cliente;
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

    }
}
