import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JPanel;

/**
 * Filename:    DrawHouse
 * Author:      William Crutchfield
 * Date:        8/28/2017
 * Description: Draws a simple house and background using primitive shapes.
 */
class DrawHouse extends JPanel {

  /**
   * Paints each draw Method to the JPanel
   *
   * @param g Graphics object, allows rendering
   */
  @Override
  public void paintComponent(Graphics g) {

    super.paintComponent(g);

    // Call methods to draw
    drawGround(g);
    drawSky(g);
    drawCloud(g, 10, 20);
    drawCloud(g, 140, 60);
    drawCloud(g, 265, 20);
    drawHouse(g);
  }

  /**
   * Draws the ground in the JPanel
   *
   * @param g Graphics object, allows rendering
   */
  private void drawGround(Graphics g) {

    Graphics2D g2d = (Graphics2D) g;
    Rectangle2D ground = new Rectangle2D.Double(0, 300, 400, 100);
    g2d.setColor(Color.GREEN);
    g2d.fill(ground);
    g2d.draw(ground);

  }

  /**
   * Draws the sky in the JPanel
   *
   * @param g Graphics object, allows rendering
   */
  private void drawSky(Graphics g) {

    Graphics2D g2d = (Graphics2D) g;
    Rectangle2D sky = new Rectangle2D.Double(0, 0, 400, 300);
    g2d.setColor(Color.CYAN);
    g2d.fill(sky);
    g2d.draw(sky);

  }

  /**
   * Draws a cloud in the JPanel
   *
   * @param g Graphics object, allows rendering
   * @param x x coordinate of cloud, allows cloud to be drawn in multiple locations
   * @param y y coordinate of cloud, allows cloud to be drawn in multiple locations
   */
  private void drawCloud(Graphics g, int x, int y) {

    Graphics2D g2d = (Graphics2D) g;

    // Modifies x and y to always place circles relative to each other
    int x1 = x + 30;
    int y1 = y - 10;
    int x2 = x1 + 30;

    // Defines Circles that create the Cloud
    Ellipse2D cloud1 = new Ellipse2D.Double(x, y, 50, 50);
    Ellipse2D cloud2 = new Ellipse2D.Double(x1, y1, 50, 60);
    Ellipse2D cloud3 = new Ellipse2D.Double(x2, y, 50, 50);

    // Colors clouds WHITE
    g2d.setColor(Color.WHITE);

    // Fills all circles
    g2d.fill(cloud1);
    g2d.fill(cloud2);
    g2d.fill(cloud3);

    // Draws all circles
    g2d.draw(cloud1);
    g2d.draw(cloud2);
    g2d.draw(cloud3);

  }

  /**
   * Draws the house in the JPanel
   *
   * @param g Graphics object, allows rendering
   */
  private void drawHouse(Graphics g) {

    Graphics2D g2d = (Graphics2D) g;

    // Define Custom Colors
    Color houseColor = new Color(172, 143, 87);

    // Define House
    Rectangle2D house = new Rectangle2D.Double(75, 150, 250, 150);
    g2d.setColor(houseColor);
    g2d.fill(house);
    g2d.draw(house);

    // Draw Windows
    drawWindow(g, 100);
    drawWindow(g, 250);

    // Draw Door
    drawDoor(g);
  }

  /**
   * Draws a Window in the JPanel, Helper method for drawHouse
   *
   * @param g Graphics object, allows rendering
   * @param x x coordinate of window, allows window to be drawn in multiple locations
   */
  private void drawWindow(Graphics g, int x) {

    Graphics2D g2d = (Graphics2D) g;

    // Define Custom Colors
    Color windowColor = new Color(166, 235, 255);
    Color windowFrame = new Color(107, 68, 35);

    // x and y to place vFrame and hFrame
    int centerX = x + 25;
    int centerY = 200 + 25;

    // Define Window
    Rectangle2D pane = new Rectangle2D.Double(x, 200, 50, 50);
    Line2D vFrame = new Line2D.Double(centerX, 200, centerX, 250);
    Line2D hFrame = new Line2D.Double(x, centerY, x + 50, centerY);

    // Draw window pane
    g2d.setColor(windowColor);
    g2d.fill(pane);
    g2d.draw(pane);

    // window frame
    g2d.setColor(windowFrame);
    g2d.fill(vFrame);
    g2d.draw(vFrame);
    g2d.fill(hFrame);
    g2d.draw(hFrame);

  }

  /**
   * Draws the Door on the House, Helper method for drawHouse
   *
   * @param g Graphics object, allows rendering
   */
  private void drawDoor(Graphics g) {

    Graphics2D g2d = (Graphics2D) g;

    // Define Custom Colors
    Color doorColor = new Color(107, 68, 35);

    // Define Door
    Rectangle2D door = new Rectangle2D.Double(170, 185, 60, 115);
    Ellipse2D doorknob = new Ellipse2D.Double(215, 235, 10, 10);

    // Draw door
    g2d.setColor(doorColor);
    g2d.fill(door);
    g2d.draw(door);

    // Draw doorknob
    g2d.setColor(Color.yellow);
    g2d.fill(doorknob);
    g2d.draw(doorknob);

  }
}
