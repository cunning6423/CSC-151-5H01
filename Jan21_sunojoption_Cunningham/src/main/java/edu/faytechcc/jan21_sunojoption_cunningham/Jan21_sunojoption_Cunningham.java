/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package edu.faytechcc.jan21_sunojoption_cunningham;

/**
 *
 * @author cunningg4263
 */
import javax.swing.JOptionPane;
public class Jan21_sunojoption_Cunningham {

    public static void main(String[] args) {
        // say hello in JOptionPane
            JOptionPane.showMessageDialog(null, "Lets make a song!","Suno Helper",JOptionPane.INFORMATION_MESSAGE);
            String firstGenre = JOptionPane.showInputDialog(null, "Enter a song genre: ");   
            String secondGenre = JOptionPane.showInputDialog(null, "What's anohther song genre?");  
            String mix = firstGenre +", "+ secondGenre;
            // String mix secondGrenre + firstGenre
            JOptionPane.showMessageDialog(null,mix, "Here is your custom mix", JOptionPane.INFORMATION_MESSAGE);
    }
    // You could make other methods or function and it will be easier to copy.
}
