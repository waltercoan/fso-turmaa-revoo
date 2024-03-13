package telas;

import java.awt.Font;
import java.awt.event.ActionEvent;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import controladores.TelaPrincipalControlador;

public class TelaPrincipal extends JFrame{
    
    private TelaPrincipalControlador controlador = 
        new TelaPrincipalControlador();

    public TelaPrincipal() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel texto = new JLabel("EU NAO ACREDITO");
        texto.setFont(new Font("Arial",Font.BOLD,20));
        getContentPane().add(texto,"North");


        JButton meuBotao = new JButton("Me clica!!!");
        getContentPane().add(meuBotao,"Center");
        meuBotao.setName("meuBotao");
        meuBotao.addActionListener(controlador);

        JButton meuBotao2 = new JButton("Me clica também!!!");
        getContentPane().add(meuBotao2,"South");
        meuBotao2.setName("meuBotao2");
        meuBotao2.addActionListener(controlador);
        
        // meuBotao.addActionListener(new ActionListener(){
        //     @Override
        //     public void actionPerformed(ActionEvent e) {
        //         JOptionPane.showMessageDialog(null, "EU NAO ACREDITO");
        //     }
        // });

        setSize(400,400);
        setVisible(true);
    }
    public static void main(String[] args) {
        new TelaPrincipal();
    }
}
