package br.com.norton.Comps;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;

public class CircleImageStruct extends JPanel {

    private JLabel CircleLabel;
    private ImageIcon Img;

    public CircleImageStruct(String ImgPath) {
        Img = new ImageIcon(ImgPath);
        setPreferredSize(new Dimension(100, 100));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g.create();

        // Create a circular mask
        Ellipse2D.Double circle = new Ellipse2D.Double(0, 0, getWidth(), getHeight());

        // Set the clipping region to the circle
        g2d.setClip(circle);
        g2d.drawImage(Img.getImage(), 0, 0, getWidth(), getHeight(), this);

        g2d.dispose();
    }
}
