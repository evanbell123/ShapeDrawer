/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DrawingApplication;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

/**
 *
 * @author ebbmf
 */
public class Ellipse extends Shape {
    private final double height;
    private final double width;
    
    public Ellipse(double x, double y, double height, double width) {
        super(x, y);
        
        this.height = height;
        this.width = width;
    }
    
    @Override
    public void draw(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.draw(new Ellipse2D.Double(this.x, this.y, this.height, this.width));
    }
    
}
