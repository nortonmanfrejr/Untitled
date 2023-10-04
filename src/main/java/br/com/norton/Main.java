package br.com.norton;

import br.com.norton.Tools.SessT;
import br.com.norton.Tools.SysT;
import br.com.norton.View.Main.Home;

import javax.swing.*;

public class Main {

   public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Home c = new Home();
            c.setVisible(SysT.Visible);
        });
    }
}