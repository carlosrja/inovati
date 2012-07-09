package com.inovati.components;

import javax.swing.JButton;
import javax.swing.JPanel;

import com.inovati.listeners.DisplayListener;

public class RightPanel extends JPanel {
	
	private JPanel upPanel;

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public RightPanel(JPanel upPanel){
		this.upPanel = upPanel;
		createComponents();
	}
	
	private void createComponents(){
		JButton button = new JButton("click me!");
		upPanel.setLayout(null);
		button.addActionListener(new DisplayListener(upPanel));
		add(button);
	}

}
