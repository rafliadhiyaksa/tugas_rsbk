/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Counter;

import java.awt.*;

public class Counter extends Panel {
    private long count=0;
    private Label label;
    private long maxValue=500;
    public void setMaxValue(long max) {
        maxValue = max;
    }
    public long getMaxValue() {
        return maxValue;
    }
    public long getCount() {
        return count;
    }
    
    public Counter() {
        setBackground(Color.white);
        setForeground(Color.BLACK);
        
        label = new Label(""+count+"");
        add(label);
    }
    public void increment () {
        if (count < maxValue) {
            count++;
            label.setText(" "+count+" ");
        }
        else label.setText("!!");
    }
    
    public void setValue(long value){
        count = value;
    }
    
    public long getValue(){
        return count;
    }
}
