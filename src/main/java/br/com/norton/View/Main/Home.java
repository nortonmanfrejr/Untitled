package br.com.norton.View.Main;

import br.com.norton.Tools.SysT;
import br.com.norton.View.Main.Bottom.Bottom;
import br.com.norton.View.Main.Rigth.Rigth;

import javax.swing.*;
import java.awt.*;

public class Home extends JFrame {

    public int Width = 400;
    public int Height = 400;

    public Home()
    {
        setTitle(SysT.SysTitle);

        setSize(Width,Height);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // ---------------------------------------------------

        add(new Bottom(), BorderLayout.SOUTH);
        add(new Rigth(), BorderLayout.WEST);
    }
}
