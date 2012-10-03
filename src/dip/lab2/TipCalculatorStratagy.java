/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab2;

/**
 *
 * @author wsoehrmann
 */
public interface TipCalculatorStratagy {
    
     public static enum ServiceQuality {

        GOOD, FAIR, POOR
    }
    
    
    
    /**
     *
     * @return
     */
    //properties must be static and final
    public abstract double getTip();
}
