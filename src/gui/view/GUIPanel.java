package gui.view;

import javax.swing.JPanel;
import gui.controller.GUIController;

/**
 * Creates the panel for the GUI project.
 * @author thod0127
 * @version 0.1 11/9/15 Bac constructor setup.
 */
public class GUIPanel extends JPanel
{
	private GUIController baseController;
	
	public GUIPanel(GUIController baseController)
	{
		this.baseController = baseController;
	}
}
