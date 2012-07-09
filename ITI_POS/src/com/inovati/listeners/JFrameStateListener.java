package com.inovati.listeners;

import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;

import javax.swing.JFrame;

public class JFrameStateListener implements WindowStateListener {
	
	private JFrame frame;
	
	public JFrameStateListener( JFrame frame){
		this.frame = frame;		
	}

	@Override
	public void windowStateChanged(WindowEvent e) {
		frame.repaint();

	}

}
