package dHogue.View;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

import dHogue.Controller.ViewListener;

public class MainView extends JFrame
{
	ViewListener listener;
	JButton btnQuestionSubmit;
	JButton btnStatementSubmit;
	JButton btnQuestionView;
	JButton btnStatementView;
	JTextArea txtQuestion;
	JTextArea txtStatement;
	
	/*
	 * MainView constructor
	 */
	public MainView()
	{
		//Setup App size, title, exit mode, layout
		this.setMinimumSize(new Dimension(650,450));
		this.setTitle("DatabaseMaker");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());//Change Layout later
		
		//create ViewListener
		listener = new ViewListener();
		
		//txtQuestion setup
		txtQuestion = new JTextArea("Question Text");
		txtQuestion.setMinimumSize(new Dimension(this.getWidth(),100));
		//setup shiz
		
		//txtStatement setup
		txtStatement = new JTextArea("Statement Text");
		txtStatement.setMinimumSize(new Dimension(this.getWidth(),100));
		//setup shiz
		
		//btnQuestionSubmit setup
		btnQuestionSubmit = new JButton("Submit Question");
		btnQuestionSubmit.addActionListener(listener);
		//setup shiz
		
		//btnStatementSubmit setup
		btnStatementSubmit = new JButton("Submit Statement");
		btnStatementSubmit.addActionListener(listener);
		//setup shiz
		
		//btnQuestionView setup
		btnQuestionView = new JButton("View Questions");
		btnQuestionView.addActionListener(listener);
		//setup shiz
		
		//btnStatementView setup
		btnStatementView = new JButton("View Statements");
		btnStatementView.addActionListener(listener);
		//setup shiz
		
		
		this.add(txtQuestion);
		this.add(btnQuestionSubmit);
		this.add(txtStatement);
		this.add(btnStatementSubmit);
		this.add(btnQuestionView);
		this.add(btnStatementView);
		
		this.setVisible(true);
	}
	
}
