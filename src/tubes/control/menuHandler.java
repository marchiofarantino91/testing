/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import tubes.Aplikasi;
import tubes.GUI.LoginGui;
import tubes.GUI.daftarGUI;
import tubes.GUI.menuGUI;

/**
 *
 * @author MARCHIO
 */
public class menuHandler implements  ActionListener {
 
 private menuGUI view;
 private Aplikasi model;
 
 public menuHandler(Aplikasi model){
       view = new menuGUI();
        view.setVisible(true);
        view.addActionListener(this);
        this.model = model;
        
 }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object click = e.getSource();
        if (click.equals(view.getDaftar())) {
            new daftarHandler(model);
            view.dispose();
        }
        else if (click.equals(view.getLogin())) {
            new loginHandler(model);
            view.dispose();
        }
        else if (click.equals(view.getExit())) {
            view.dispose();
        }
    }

}
