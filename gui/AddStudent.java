import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AddStudent extends Container{
	private JButton btn;
	private JLabel label;

	public AddStudent(){
        AddStudent st = new AddStudent();
		setLayout(null);
        setSize(500,500);

        label = new JLabel("ADD STUDENT");
        label.setLocation(100,100);
        label.setSize(100,30);
        btn = new JButton("Back");
        btn.setLocation(100,150);
        btn.setSize(300,30);
        btn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String subject;
                st.addSubject(subject);
                Main.frame.addStudent.setVisible(false);
                Main.frame.menu.setVisible(true);   
                Main.frame.repaint();

            } 
        }); 
        add(btn);
        add(label);

        btn = new JButton("Back");
		btn.setLocation(100,150);
		btn.setSize(300,30);
		btn.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent e){
                String name;
                int id;
                String surname;
                String faculty;
                st.setName(name);
                st.setFaculty(faculty);
                Main.addStudent(st);
                Main.frame.addStudent.setVisible(false);
                Main.frame.menu.setVisible(true);   
                Main.frame.repaint();

            } 
        }); 
		add(btn);
	}
}