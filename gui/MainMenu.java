import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainMenu extends Container{
	
	public JButton add;
	public JButton list;

	public MainMenu(){
		setSize(500,500);
		setLayout(null);

		add = new JButton("ADD");
		add.setLocation(100,150);
		add.setSize(300,30);
		add.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent e){
                Main.frame.menu.setVisible(false);
                Main.frame.addStudent.setVisible(true);
                Main.frame.repaint();
            } 
        }); 
		add(add);

		list = new JButton("List");
		list.setLocation(100,190);
		list.setSize(300,30);
		list.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent e){
                Main.frame.menu.setVisible(false);
                Main.frame.listStudent.setVisible(true);
                Main.frame.repaint();
            } 
        }); 
		add(list);
	}
}