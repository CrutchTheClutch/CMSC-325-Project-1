public class CMSC325Driver extends JFrame {

  public CMSC325Driver() {

    // Construct Class with Graphics Component
    CMSC325EX1 myExample = new CMSC325EX1();
    // Add to JFrame
    add(myExample);
    // Set the Default Size and title
    setSize(400, 400);
    setTitle("CMSC 325 Java2D Template");

    // Frame Default to be able to closd
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // Center the Frame
    setLocationRelativeTo(null);
  }

  public static void main(String[] args) {

    CMSC325Driver myDriver = new CMSC325Driver();
    myDriver.setVisible(true);
  }
}
