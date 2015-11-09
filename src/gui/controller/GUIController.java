package gui.controller;

import gui.view.GUIFrame;

/**
 * Controller for the SimpleGUI program.
 * @author thod0127
 * @version 0.1 11/9/15
 */
public class GUIController
{
	/**
	 *Reference to the GUIFrame object of thiew
	 */
	private GUIFrame baseFrame;
	
	/**
	 * Basic constructor for the class.
	 */
	public GUIController()
	{
		baseFrame = new GUIFrame(this);
	}
	
	public void start()
	{
	}
}
