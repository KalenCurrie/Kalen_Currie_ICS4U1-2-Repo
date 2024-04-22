import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) throws Exception {
        String name = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null, "Hello..." +name);
        int age = Integer.parseInt(JOptionPane.showInputDialog("What is your age?"));
        JOptionPane.showMessageDialog(null, "you are " +age);
        int loopTorF = 0;
        while (loopTorF < 1) {
            int TorF = JOptionPane.showConfirmDialog(null, "Is Ms. Richards a cool teacher?", "True or False", JOptionPane.YES_NO_OPTION);
            
            if (TorF == JOptionPane.YES_OPTION)
            {
            JOptionPane.showMessageDialog(null, "Correct!");
            loopTorF++;
            }
            else if (TorF != JOptionPane.YES_OPTION)
            {
            JOptionPane.showMessageDialog(null, "Incorect answer, try again");
            }
        }
        GuessNumber.GuessingGame();
    }
}