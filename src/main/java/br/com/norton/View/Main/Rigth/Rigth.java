package br.com.norton.View.Main.Rigth;

import br.com.norton.Comps.CircleImageStruct;
import br.com.norton.Tools.SessT;
import br.com.norton.Tools.SysT;
import br.com.norton.View.Main.Home;

import javax.swing.*;
import java.awt.*;

public class Rigth extends JPanel {

    private int Width = 200;
    private int Heigth = 200;
    public Rigth() {

        setLayout(new FlowLayout(FlowLayout.LEFT));
        setSize(Width, Heigth);

        // ---------------------------------------------------
        CircleImageStruct r = new CircleImageStruct(SessT.UserImgPath);
        add(r);
        if (r != null) System.out.println("dasdsadsa");
        add(new JLabel(SessT.NomUsuario));
        add(new JLabel(SessT.Job));
    }
}
