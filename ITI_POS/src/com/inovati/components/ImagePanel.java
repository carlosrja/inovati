package com.inovati.components;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class ImagePanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Dimension size = getSize();
		ImageIcon image = new ImageIcon("images/XintoWins.JPG");
		g.drawImage(image.getImage(), 0, 0, size.width, size.height, null);
		setOpaque(false);
	}

}
