package com.inovati.views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JPanel;

import com.inovati.components.ImagePanel;
import com.inovati.components.RightPanel;
import com.inovati.listeners.JFrameStateListener;


public class ApplicationPOS extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new ApplicationPOS();
		
	}

	private ApplicationPOS() {
		createMainWindow();
	}
	
	
	private void createMainWindow(){
		this.setTitle("InovaTI POS");
		//this.setSize(500, 400);
		this.setLocationByPlatform(false);
		this.setMinimumSize(new Dimension(800, 600));
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		this.setIconImage(Toolkit.getDefaultToolkit().getImage("images/iconImages/wallet.png"));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		createPanel();
		this.addWindowStateListener(new JFrameStateListener(this));
	}
	
	private void createPanel(){
		this.setLayout(new BorderLayout());
		ImagePanel ip = new ImagePanel();
		ip.setLayout(new BorderLayout());
		p1 = new JPanel();
		p1.setOpaque(false);
		p1.setBackground(Color.BLUE);
		Dimension dim = getSize();
		p1.setPreferredSize(new Dimension(dim.width,(int)(dim.height*0.2f)));
		ip.add(p1,BorderLayout.NORTH);
		p2 = new RightPanel(p1);
		p2.setOpaque(true);
		p2.setBackground(Color.GREEN);
		p2.setPreferredSize(new Dimension((int)(dim.width*0.3f), dim.height));
		ip.add(p2,BorderLayout.EAST);
		JPanel p3 = new JPanel();
		p3.setOpaque(false);
		p3.setBackground(Color.RED);
		ip.add(p3,BorderLayout.CENTER);
		this.add(ip,BorderLayout.CENTER);
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		Dimension dim = getSize();
		p1.setPreferredSize(new Dimension(dim.width,(int)(dim.height*0.2f)));
		p1.updateUI();
		p2.setPreferredSize(new Dimension((int)(dim.width*0.3f), dim.height));
		p2.updateUI();
	}
	
	private JPanel p1;
	private JPanel p2;

}
