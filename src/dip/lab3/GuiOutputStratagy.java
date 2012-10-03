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
public class GuiOutputStratagy implements MessageOutputStratagy {
    
    
    public void sendMessage(final MessageInputStratagy msgInput) {
        Message msg = msgInput.getMessage();
        JOptionPane.showMessageDialog(null, msg.getMessageAsString());
    }
    
    
//    JOptionPane.showMessageDialog(null,"My Message");
    
    
}
