/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab2;

import dip.lab1.instructor.solution1.Employee;

/**
 *
 * @author wsoehrmann
 */
public class CalculateTipService {

    private TipCalculatorStratagy tipCalculatorStratagy;

    /**
     *
     * @return
     */
    public double getTheTip() {
        //return.tipCalculatorStratagy.getTip();
        return 0;
    }

    public CalculateTipService(TipCalculatorStratagy TipCalculatorStratagy) {
        this.tipCalculatorStratagy = TipCalculatorStratagy;
    }
}
