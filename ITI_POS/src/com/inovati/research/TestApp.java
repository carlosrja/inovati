package com.inovati.research;

import javax.swing.*;

public class TestApp {
    public static void main(String[] args) {
        JFrame f=new JFrame("Test slider component app");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        f.getContentPane().add(initSlider());
        f.pack();
  //      f.setState(JFrame.MAXIMIZED_BOTH);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }
 
    public static JComponent initSlider() {
        JSLSlider slider=new JSLSlider();
        JPanel panel = new JPanel();
        panel.add(new JButton("click mee!!"));
        slider.addSliderComponent(new JButton("JButton instance - component 1"));
        slider.addSliderComponent(new JLabel("Long text JLabel instance - component 2"));
        slider.addSliderComponent(new JTextField("JTextField instance - component 3"));
        slider.addSliderComponent(new JButton("JButton instance - component 2 Xinto"));
        slider.addSliderComponent(panel);
        slider.refresh();
        
        return slider;
    }

}
