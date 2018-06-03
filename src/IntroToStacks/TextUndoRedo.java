package IntroToStacks;

import java.awt.Dimension;
import java.awt.Label;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class TextUndoRedo implements KeyListener{
	/* 
	 * Create a JFrame with a JPanel and a JLabel.
	 * 
	 * Every time a key is pressed, add that character to the JLabel. It should look like a basic text editor.
	 * 
	 * Make it so that every time the BACKSPACE key is pressed, the last character is erased from the JLabel.
	 * Save that deleted character onto a Stack of Characters.
	 * 
	 * Choose a key to be the Undo key. Make it so that when that key is pressed, the top Character is popped 
	 * off the Stack and added back to the JLabel.
	 * 
	 * */
	JLabel label;
	Stack<String> chars = new Stack <>();
	TextUndoRedo(){
		JFrame frame = new JFrame();
		frame.addKeyListener(this);
		
		label = new JLabel();
		
		label.setPreferredSize(new Dimension(500, 500));
		JPanel panel = new JPanel();
		frame.add(panel);
		panel.add(label);
		frame.pack();
		frame.setVisible(true);
		
	}
	public static void main(String[] args) {
		TextUndoRedo tur = new TextUndoRedo(); 
		JOptionPane.showMessageDialog(null, "anything types, backspace deletes, enter is redo");
		
		}

	
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	
	
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
	
		if (e.getKeyCode() ==  8) {
			chars.push(getLastChar(label.getText()));
			label.setText(removeLastChar(label.getText()));
		}
		else if (e.getKeyCode() == 10) {
			if (chars.size() == 0) {
				JOptionPane.showMessageDialog(null, "Nothing to redo");
			}
			else {
				label.setText(label.getText() + chars.pop());	
				
			}
		}
		else {
			label.setText(label.getText() + (e.getKeyChar()));			
		}
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		

	}
	String removeLastChar(String s) {
		  
	if (s.length() == 0) {
		return "";
	}
		return s.substring(0, s.length() - 1);
				
	}
	String getLastChar(String s) {
		  
		if (s.length() == 0) {
			return "";
		}
			return s.substring( s.length() - 1);
					
		}
}

