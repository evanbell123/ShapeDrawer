/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DrawingApplication;

import java.awt.Graphics;

/**
 *
 * @author ebbmf
 */
abstract public class Shape implements Drawable {
    protected final double x;
    protected final double y;
    
    public Shape(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    @Override
    public void draw(Graphics g) {
        
    }
}
