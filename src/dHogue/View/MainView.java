package dHogue.View;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

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
	
	//gridBagLayout variables
	final static boolean shouldFill = true;
    final static boolean shouldWeightX = true;
    private GridBagConstraints c;
	
	/*
	 * MainView constructor
	 */
	public MainView()
	{
		//Setup App size, title, exit mode, layout
		this.setMinimumSize(new Dimension(690,450));
		this.setMaximumSize(new Dimension(690,450));
		this.setResizable(false);
		this.setTitle("DatabaseMaker");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());//Change Layout later
		GridBagLayout gbl = new GridBagLayout();
		gbl.columnWidths = new int[] {20,216,216,218,20};
		gbl.rowHeights = new int[] {20,57,56,48,57,56,48,40,40,20};
		this.setLayout(gbl);
		
		c = new GridBagConstraints();//Initialize GridBagConstraints
		
		//Default Layout Stuff
		if (shouldFill) 
		{
			c.fill = GridBagConstraints.HORIZONTAL;
		}
		if (shouldWeightX) 
		{
			c.weightx = 0.5;
		}
		c.anchor = GridBagConstraints.LINE_START;
		c.ipady = 0;
		c.weightx = 0.5;
		//Default Layout Stuff		
		
		//create ViewListener
		listener = new ViewListener();
		
		//txtQuestion setup
		txtQuestion = new JTextArea("Question Text");
		txtQuestion.setMinimumSize(new Dimension(this.getWidth(),100));
		//layout stuff
		c.gridwidth = 3;
		c.gridheight = 2;
		c.gridx = 1;
		c.gridy = 1;
		//layout stuff
		//setup shiz

		this.add(txtQuestion, c); //add to view
		
		//txtStatement setup
		txtStatement = new JTextArea("Statement Text");
		txtStatement.setMinimumSize(new Dimension(this.getWidth(),100));
		//layout stuff
		c.gridwidth = 3;
		c.gridheight = 2;
		c.gridx = 1;
		c.gridy = 4;
		//layout stuff
		//setup shiz
		
		this.add(txtStatement, c); //add to view
		
		//btnQuestionSubmit setup
		btnQuestionSubmit = new JButton("Submit Question");
		btnQuestionSubmit.setActionCommand("Submit_Q");
		btnQuestionSubmit.addActionListener(listener);
		//layout stuff
		c.gridwidth = 1;
		c.gridheight = 1;
		c.gridx = 3;
		c.gridy = 3;
		//layout stuff
		//setup shiz
		
		this.add(btnQuestionSubmit, c); //add to view

		//btnStatementSubmit setup
		btnStatementSubmit = new JButton("Submit Statement");
		btnStatementSubmit.setActionCommand("Submit_S");
		btnStatementSubmit.addActionListener(listener);
		//layout stuff
		c.gridwidth = 1;
		c.gridheight = 1;
		c.gridx = 3;
		c.gridy = 6;
		//layout stuff
		//setup shiz
		
		this.add(btnStatementSubmit, c); //add to view
		
		//btnQuestionView setup
		btnQuestionView = new JButton("View Questions");
		btnQuestionView.setActionCommand("View_Q");
		btnQuestionView.addActionListener(listener);
		//layout stuff
		c.gridwidth = 3;
		c.gridheight = 1;
		c.gridx = 1;
		c.gridy = 7;
		//layout stuff
		//setup shiz
		
		this.add(btnQuestionView, c); //add to view
				
		//btnStatementView setup
		btnStatementView = new JButton("View Statements");
		btnStatementView.setActionCommand("View_S");
		btnStatementView.addActionListener(listener);
		//layout stuff
		c.gridwidth = 3;
		c.gridheight = 1;
		c.gridx = 1;
		c.gridy = 8;
		//layout stuff
		//setup shiz
		
		this.add(btnStatementView, c); //add to view
		
		this.setVisible(true);
	}
	
}
