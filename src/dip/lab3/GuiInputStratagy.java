/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3;
import javax.swing.JOptionPane;


/**
 *
 * @author Wesley
 */
public class GuiInputStratagy implements MessageInputStratagy {

   String response = JOptionPane.showInputDialog(null, "A Prompt, like enter message here:");

    public Message getMessage() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    }
  
    
    

