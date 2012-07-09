package com.inovati.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import com.inovati.threads.Slider;

public class DisplayListener implements ActionListener {
	
	private JPanel panel;
	
	public DisplayListener(JPanel panel){
		this.panel = panel;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Thread r = new Thread(new Slider(panel));
		r.start();
	
	}

}
