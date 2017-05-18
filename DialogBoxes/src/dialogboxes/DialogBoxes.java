package dialogboxes;

import javax.swing.JOptionPane;


public class DialogBoxes {

    public static void main(String[] args) {
        JOptionPane dialogBox = new JOptionPane();
        String name, message;
        int age;
        final int CHECK_AGE = 40;
        
        name = JOptionPane.showInputDialog(null, "What is your name?", "Please Input", JOptionPane.ERROR_MESSAGE);
        
        message = "Hello " + name;
        displayMessage(message);
        
        age = Integer.parseInt(JOptionPane.showInputDialog(null, "What is your age?"));
        if (age > CHECK_AGE)
            message = String.format("You are %d, oh that's old!!", age);
        else
            message = String.format("You are %d, oh that's yeong!!", age);
        
        displayMessage(message);
    }
    
    public static void displayMessage(String message) {
        JOptionPane.showMessageDialog(null, message);
    }
    
}
