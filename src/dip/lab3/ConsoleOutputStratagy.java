/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3;

/**
 *
 * @author Wesley
 */
public class ConsoleOutputStratagy implements MessageOutputStratagy {
    
      public void sendMessage(final MessageInputStratagy msgInput) {
        Message msg = msgInput.getMessage();
        System.out.println(msg.getMessageAsString());
    }
    
}
