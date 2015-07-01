package dHogue.Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ViewListener implements ActionListener
{
	/*
	 * ViewListener Constructor
	 */
	public ViewListener()
	{
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println(e.getActionCommand());
		
		switch (e.getActionCommand())
		{
			case "Submit_Q":  //Submit Question
			{
				System.out.println("Submit Question");
			} break;
			case "Submit_S":  //Submit Statement
			{
				System.out.println("Submit Statement");
			} break;	
			case "View_Q":	  //View Questions
			{
				System.out.println("Redirect to Question View");
			} break;
			case "View_S":	  //View Statements
			{
				System.out.println("Redirect to Statement View");
			} break;
		}
	}

}
