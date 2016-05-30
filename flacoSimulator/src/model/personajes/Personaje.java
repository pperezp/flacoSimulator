/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.personajes;

import java.awt.Dimension;
import java.awt.Point;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author pperezp
 */
public class Personaje extends JLabel implements Entidad{
    private int id;
    private Point position;
    private ImageIcon imageIcon;
    private Dimension dimension;

    public Personaje(int id, Point position, ImageIcon imageIcon, Dimension dimension) {
        super(imageIcon);
        super.setName(Integer.toString(id));
        this.id = id;
        this.position = position;
        this.imageIcon = imageIcon;
        this.dimension = dimension;
        System.out.println("Posición: "+position);
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public Point getPosition() {
        return position;
    }

    @Override
    public ImageIcon getImageIcon() {
        return imageIcon;
    }

    @Override
    public Dimension getDimension() {
        return dimension;
    }
}
