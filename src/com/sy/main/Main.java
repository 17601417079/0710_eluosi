package com.sy.main;

import com.sy.view.Window;

import java.awt.Dimension;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		Window win=new Window();
		win.initView();
		win.setPreferredSize(new Dimension(300 , 360));
		win.setTitle("俄罗斯方块[©版本张栋所有]");
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		win.setResizable(false); //去掉最大化按钮
		win.pack();	//获得最佳大小
		win.setVisible(true);
	}
}
