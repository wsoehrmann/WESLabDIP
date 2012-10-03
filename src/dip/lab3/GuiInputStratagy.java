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

    public Message getMessage() {

        String rawmsg = JOptionPane.showInputDialog(null, "Enter message here:");

        Message msg = new Message(rawmsg);
        return msg;

    }
}
