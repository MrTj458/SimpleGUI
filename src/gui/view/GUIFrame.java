package gui.view;

import javax.swing.JFrame;
import gui.controller.GUIController;

/**
 * Creates the frame for the GUI project
 * @author thod0127
 * @version 0.4 11/9/15 Added a title!
 * Added a reference to the GUIPanel and installed it as the content pane.
 * Added the setupFrame helper method.
 */
public class GUIFrame extends JFrame
{
	private GUIController baseController;
	private GUIPanel basePanel;
	
	public GUIFrame(GUIController baseController)
	{
		this.baseController = baseController; //Assign parameter to data member.
		basePanel = new GUIPanel(baseController); //Creates and instance of the GUIPanel with a reference to the controller.
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(basePanel); //Sets the panel in the GUIFrame, this is required!
		this.setResizable(false);		//Usually a good idea but not required
		this.setSize(400,400);			//sets the size. Class default is 400,400.
		this.setTitle("Look a window!");
		this.setVisible(true);			//Must be last line of code in setupFrame method.
	}
}
