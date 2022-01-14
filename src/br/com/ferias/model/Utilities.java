package br.com.ferias.model;

import java.awt.Component;
import java.awt.Panel;

import javax.swing.JTextField;

public class Utilities {
    
    public void limparTela(Panel panel){
        Component cp[] = panel.getComponents();
        for (Component component : cp) {
            if(component instanceof JTextField){
                ((JTextField) component).setText(null);
            }
        }
    }
    
}
