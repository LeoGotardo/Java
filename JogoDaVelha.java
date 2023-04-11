package br.edu.ifpr;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class JogoDaVelha extends JPanel {
	public JogoDaVelha() {
		addMouseListener(new ManipuladorMouse());
	}
	
	public void paintComponent(Graphics g) {
		g.drawLine(10, 90, 270, 90);
		g.drawLine(10, 170, 270, 170);
		g.drawLine(95, 10, 95, 250);
		g.drawLine(185, 10, 185, 250);
		
		g.drawOval(110, 100, 60, 60);
		
		g.drawLine(30, 30, 80, 80);
		g.drawLine(80, 30, 30, 80);
	}
	
	private class ManipuladorMouse implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			System.out.println(e.getX() + "," + e.getY());			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}

	public static void main(String[] args) {
		JFrame janela = new JFrame();
		janela.add(new JogoDaVelha());
		janela.setSize(300, 300);
		janela.setVisible(true);
	}

}
