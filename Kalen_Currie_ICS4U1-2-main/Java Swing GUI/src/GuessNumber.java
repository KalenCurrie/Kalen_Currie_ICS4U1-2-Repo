import java.util.Random;
import javax.swing.JOptionPane;

public class GuessNumber {
    public static void GuessingGame(){
        Random rand = new Random();
        int number = rand.nextInt(100);
        boolean win = false;
        while(win == false){ 
            int guess = Integer.parseInt(JOptionPane.showInputDialog(null,null,"Guess a number between 1 and 100", JOptionPane.QUESTION_MESSAGE));
            if(number > guess)
            {
                JOptionPane.showMessageDialog(null,"The number was too low. Guess again", null ,JOptionPane.INFORMATION_MESSAGE);
            }
            else if(number < guess)
            {
                JOptionPane.showMessageDialog(null,"The number was too high. Guess again", null ,JOptionPane.INFORMATION_MESSAGE);
            }
            else{
                JOptionPane.showMessageDialog(null,"Congrats you win!", null ,JOptionPane.INFORMATION_MESSAGE);
                win = true;
            }
        }
    }
}