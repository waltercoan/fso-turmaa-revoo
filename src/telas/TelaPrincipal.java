package telas;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class TelaPrincipal extends JFrame{
    
    public TelaPrincipal() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel texto = new JLabel("EU NAO ACREDITO");
        texto.setFont(new Font("Arial",Font.BOLD,20));
        getContentPane().add(texto);

        setSize(400,400);
        setVisible(true);
    }
    public static void main(String[] args) {
        new TelaPrincipal();
    }
}
