package uiutsc;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Shahadat Modified by Rasedul
 */
public class password_check {

    String name;
    String pass;
    String filename;
    password_check(String name, String pass, String filename) {
        this.name = name;
        this.pass = pass;
        this.filename = filename;
    }

    public boolean userread() {

        String line = "";
        FileReader fr = null;
        BufferedReader br = null;
        File fa = new File(filename);
        boolean h = false;
        if (fa.canRead() == true) {
            try {
                fr = new FileReader(fa);
                br = new BufferedReader(fr);
                while ((line = br.readLine()) != null) {
                    String sn[] = line.split(",");
                    if (sn[0].equals(name) == true) {
                        if (sn[1].equals(pass) == true) {
                            h = true;
                        }
                    }
                }
                br.close();
            } catch (FileNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Service unreachable ");
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Problem happend here" + ex.getMessage());
            }
        }
        return h;
    }
}
