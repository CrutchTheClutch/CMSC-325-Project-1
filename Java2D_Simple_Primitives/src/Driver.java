import javax.swing.JFrame;
import javax.swing.WindowConstants;

/**
 * Filename:    Driver
 * Author:      William Crutchfield
 * Date:        8/28/2017
 * Description: Driver for DrawHouse.
 */
public class Driver extends JFrame {

  /**
   * Constructs the GUI
   */
  private Driver() {
    DrawHouse drawHouse = new DrawHouse();  // Construct Class with Graphics Component
    add(drawHouse);                         // Add to JFrame

    // Set the Default Size and title
    setSize(400, 400);
    setTitle("Java2D House");

    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);    // Default Close
    setLocationRelativeTo(null);                                // Center the Frame
    setResizable(false);                                        // Disable Resize

  }

  public static void main(String[] args) {
    Driver myDriver = new Driver();
    myDriver.setVisible(true);
  }
}
