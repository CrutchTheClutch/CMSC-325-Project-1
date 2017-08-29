import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Line2D;
import javax.swing.JPanel;

public class CMSC325EX1 extends JPanel {
	

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Call methods to draw
        drawEllipse(g);
        drawLine(g);
        drawCircle(g);
        drawRect(g);
    }
    
 // Method to draw an Ellipse
    private void drawEllipse(Graphics g) {

        Graphics2D g2d = (Graphics2D) g;       
        Ellipse2D e = new Ellipse2D.Double(5, 10, 80, 130);    
        g2d.setColor(Color.red);
        g2d.draw(e);      
    }
    
     // Method to draw a Line
    private void drawLine(Graphics g) {

        Graphics2D g2d = (Graphics2D) g;   
        Line2D myLine = new Line2D.Double(150,150,150,250);    
        g2d.setColor(Color.blue);
        g2d.draw(myLine);     
    }
    
     // Method to draw a Circle
    private void drawCircle(Graphics g) {

        Graphics2D g2d = (Graphics2D) g;   
        Ellipse2D myCircle = new Ellipse2D.Double(200,100,75,75);    
        g2d.setColor(Color.black);
        g2d.draw(myCircle);     
    }
    
    // Method to draw a Rectangle
     private void drawRect(Graphics g) {

        Graphics2D g2d = (Graphics2D) g;   
        Rectangle2D myRect = new Rectangle2D.Double(300,30,50,50);  
         
        g2d.setColor(Color.blue);
        g2d.draw(myRect);     
    }
    
     
    
}