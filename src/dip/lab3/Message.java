/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3;

/**
 *
 * @author wsoehrmann
 */
public class Message {

    private String messageAsString;

    public Message(String strMsg) {
        messageAsString = strMsg;
    }

    public String getMessageAsString() {
        return messageAsString;
    }

    public void setMessageAsString(String message) {
        this.messageAsString = message;
    }
}
