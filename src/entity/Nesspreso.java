/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entity;


public class Nesspreso {

    private int maxcap;
    private int actualcap;

    public Nesspreso() {
    }

    public Nesspreso(int maxcap, int actualcap) {
        this.maxcap = maxcap;
        this.actualcap = actualcap;
    }

    public void setMaxcap(int maxcap) {
        this.maxcap = maxcap;
    }

    public void setActualcap(int actualcap) {
        this.actualcap = actualcap;
    }

    public int getMaxcap() {
        return maxcap;
    }

    public int getActualcap() {
        return actualcap;
    }

    @Override
    public String toString() {
        return "Data (" + "Maximum capacity: " + maxcap + ", Actual capacity: " + actualcap + ')';
    }

}
