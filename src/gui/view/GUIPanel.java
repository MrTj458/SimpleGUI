package gui.view;

import gui.controller.GUIController;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

/**
 * Creates the panel for the GUI project.
 * @author thod0127
 * @version 0.1 11/9/15 Bac constructor setup.
 */
public class GUIPanel extends JPanel
{
	private GUIController baseController;
	private JButton firstButton;
	private JTextField firstTextField;
	private SpringLayout baseLayout;
	
	public GUIPanel(GUIController baseController)
	{
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		firstButton = new JButton("Click me!");
		firstTextField = new JTextField("You can type in here!");
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	/**
	 * Loads content into the panel.
	 */
	private void setupPanel()
	{
		this.setLayout(baseLayout);		//Needs to be the first line of the setupPanel helper method.
		this.add(firstButton);
		this.add(firstTextField);
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		
	}
}
