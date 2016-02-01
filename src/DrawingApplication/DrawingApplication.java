/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DrawingApplication;

import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.LinkedList;
import java.util.ListIterator;
import javax.swing.JFrame;

/**
 *
 * @author ebbmf
 */
public class DrawingApplication extends JFrame {
    
    private final LinkedList<Shape> shapes;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DrawingApplication shapeDrawer = new DrawingApplication();
        shapeDrawer.setVisible(true);
    }

    public DrawingApplication() {
        
        prepareGUI();
        
        this.shapes = new LinkedList<>();
        
        /*
        Circle Design
        */
        shapes.add(new Ellipse(100, 100, 50, 50));
        shapes.add(new Ellipse(100, 75, 50, 50));
        shapes.add(new Ellipse(100, 125, 50, 50));
        shapes.add(new Ellipse(75, 100, 50, 50));
        shapes.add(new Ellipse(125, 100, 50, 50));
        
        shapes.add(new Ellipse(82, 82, 50, 50));
        shapes.add(new Ellipse(118, 82, 50, 50));
        shapes.add(new Ellipse(82, 118, 50, 50));
        shapes.add(new Ellipse(118, 118, 50, 50));
        
        shapes.add(new Ellipse(100, 100, 50, 50));
        shapes.add(new Ellipse(75, 75, 100, 100));
        shapes.add(new Rectangle(75, 75, 100, 100));
        
        /*
        Test shapes with unequal height and width
        */
        shapes.add(new Ellipse(300, 300, 25, 75));
        shapes.add(new Rectangle(300, 300, 25, 75));
        shapes.add(new Ellipse(300, 300, 75, 25));
        shapes.add(new Rectangle(300, 300, 75, 25));
    }
    
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        
        ListIterator<Shape> shapeIter = shapes.listIterator();
        
        while (shapeIter.hasNext()) {
            shapeIter.next().draw(g);
        }
    }
    
    private void prepareGUI(){
      setSize(400,400);
      addWindowListener(new WindowAdapter() {
         @Override
         public void windowClosing(WindowEvent windowEvent){
            System.exit(0);
         }        
      }); 
   }  
    
}
