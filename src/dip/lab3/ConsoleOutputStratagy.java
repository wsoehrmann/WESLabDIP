
package dip.lab3;


public class ConsoleOutputStratagy implements MessageOutputStratagy {
    
      public void sendMessage(final MessageInputStratagy msgInput) {
        Message msg = msgInput.getMessage();
        System.out.println(msg.getMessageAsString());
    }
    
}
