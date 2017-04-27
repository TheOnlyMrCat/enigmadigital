package com.dockdev.enigmadigital.tools;
import java.awt.Canvas;
import java.awt.Dimension;

import javax.swing.JFrame;

import com.dockdev.enigmadigital.App;

public class Window extends Canvas{
	
	private static final long serialVersionUID = 824113450921221923L;

	 public Window(int width, int height, String title, App main){
	  JFrame frame = new JFrame(title);
	  
	  frame.setPreferredSize(new Dimension(width, height));
	  frame.setMaximumSize(new Dimension(width, height));
	  frame.setMinimumSize(new Dimension(width, height));
	  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  frame.setResizable(false);
	  frame.setLocationRelativeTo(null);
	  frame.add(main);   
	  frame.setVisible(true);
	 
	 
	 
	 }
	
	
}
