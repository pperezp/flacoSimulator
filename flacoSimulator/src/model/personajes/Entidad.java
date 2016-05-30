package model.personajes;

import java.awt.Dimension;
import java.awt.Point;
import javax.swing.ImageIcon;

public interface Entidad{
    int getId();
    Point getPosition();
    ImageIcon getImageIcon();
    Dimension getDimension();
}
