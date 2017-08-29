import javax.swing.*;

public class Driver extends JFrame {
    private Driver() {

        DrawHouse drawHouse = new DrawHouse();  // Construct Class with Graphics Component
        add(drawHouse);                         // Add to JFrame

        // Set the Default Size and title
        setSize(400, 400);
        setTitle("Java2D House");

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);    // Frame Default to be able to closed
        setLocationRelativeTo(null);                                // Center the Frame
        setResizable(false);                                        // Disable Resize

    }

    public static void main(String[] args) {
        Driver myDriver = new Driver();
        myDriver.setVisible(true);
    }
}
