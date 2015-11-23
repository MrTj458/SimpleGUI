package gui.view;

import gui.controller.GUIController;

import javax.swing.*;

import java.awt.event.*;
import java.awt.*;


/**
 * Creates the panel for the GUI project.
 * @author thod0127
 * @version 0.2 11/9/15 Added all of the objects and helper methods.
 * Basic constructor setup.
 */
public class GUIPanel extends JPanel
{
	private GUIController baseController;
	private JButton firstButton;
	private JTextField firstTextField;
	private SpringLayout baseLayout;
	private JLabel mousePosLabel;
	private JLabel whatButtonLabel;
	
	public GUIPanel(GUIController baseController)
	{
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		firstButton = new JButton("Click me!");
		firstTextField = new JTextField("You can type in here!");
		mousePosLabel = new JLabel("Mouse Position");
		whatButtonLabel = new JLabel("Click!");
		
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
		this.add(mousePosLabel);
		this.add(whatButtonLabel);
	}
	
	/**
	 * Helper method to hold ugly GUI layout Code.
	 */
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.WEST, firstButton, 155, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, firstTextField, 133, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, firstButton, -18, SpringLayout.NORTH, firstTextField);
		baseLayout.putConstraint(SpringLayout.WEST, firstTextField, 141, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, whatButtonLabel, 6, SpringLayout.SOUTH, mousePosLabel);
		baseLayout.putConstraint(SpringLayout.WEST, whatButtonLabel, 0, SpringLayout.WEST, mousePosLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, mousePosLabel, 10, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, mousePosLabel, 10, SpringLayout.WEST, this);
	}
	
	private void setupListeners()
	{
		firstButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				JOptionPane.showMessageDialog(firstButton, "Yay!");
			}
		});
		
		this.addMouseListener(new MouseListener()
		{
			public void mouseClicked(MouseEvent clicked)
			{
				if(SwingUtilities.isLeftMouseButton(clicked))
				{
					whatButtonLabel.setText("You left clicked!");
				}
				else if(SwingUtilities.isRightMouseButton(clicked))
				{
					whatButtonLabel.setText("You right  clicked!");
				}
				changeRandomColor();
			}
			
			public void mouseReleased(MouseEvent released)
			{
//				changeRandomColor();
			}
			
			public void mousePressed(MouseEvent pressed)
			{
//				changeRandomColor();
			}
			
			public void mouseEntered(MouseEvent entered)
			{
				changeRandomColor();
			}
			
			public void mouseExited(MouseEvent exited)
			{
				changeRandomColor();
			}
		});
		
		this.addMouseMotionListener(new MouseMotionListener()
		{
			
			public void mouseMoved(MouseEvent moved)
			{
				mousePosLabel.setText("Mouse X: " + moved.getX() + " Mouse Y: " + moved.getY());
				
				if((moved.getX() > 25 && moved.getX() < 40) && (moved.getY() > 50 && moved.getY() < 70))
				{
					changeRandomColor();
				}
			}
			
			public void mouseDragged(MouseEvent dragged)
			{
				
			}
		});
	}
	
	private void changeRandomColor()
	{
		int red, blue, green;
		
		red = (int) (Math.random() * 256);
		blue = (int) (Math.random() * 256);
		green = (int) (Math.random() * 256);
		
		this.setBackground(new Color(red, blue, green));
		
	}
}
