/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3;

/**
 *
 * @author Wesley
 */
public abstract class MessageService {
    public abstract void ReceiveMessageStratagy();
    public abstract void SendMessageStratagy();
    
    public MessageService(MessageInputStratagy input,MessageOutputStratagy output){
        
     //   this.input = input;
     //   this.output= output;
    }
    
}
