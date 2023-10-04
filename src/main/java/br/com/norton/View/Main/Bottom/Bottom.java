package br.com.norton.View.Main.Bottom;

import br.com.norton.Tools.DevT;
import br.com.norton.View.Main.Home;

import javax.swing.*;
import java.awt.*;

public class Bottom extends JPanel {

    private final int Height = 20;
    private int Width = Home.WIDTH;

    public Bottom(){

        setSize(Width, Height);

        // ---------------------------------------------------
        add(new Label(DevT.DevelopedBy));
    }
}
