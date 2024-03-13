package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JComponent;

public class TelaPrincipalControlador 
        implements ActionListener{

    private static final String JComponent = null;

    @Override
    public void actionPerformed(ActionEvent e) {
        //NÃO COMPARE STRINGS COM ==
        if(((JComponent)e.getSource()).getName() == "meuBotao"){
            JOptionPane.showMessageDialog(null, "EU não acredito");
        }
        
    }
        
}
