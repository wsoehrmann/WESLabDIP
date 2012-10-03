/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3;

/**
 *
 * @author Wesley
 */
public class MessageService {

    private MessageInputStratagy input;
    private MessageOutputStratagy output;

    public MessageService(MessageInputStratagy input, MessageOutputStratagy output) {

        this.input = input;
        this.output = output;
    }

    public void produceMessage() {
        output.sendMessage(input);
    }
}
