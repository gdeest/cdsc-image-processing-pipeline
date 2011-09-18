/*******************************************************************************
 * Copyright (c) 2011 UCLA Medical Imaging Informatics Group
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser Public License v3.0
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/lgpl.html
 ******************************************************************************/
package imageviewer.ui;

import java.awt.Graphics;
import java.util.ArrayList;

public interface GroupedComponent {

	public GroupedComponent getGroupParent();
	public ArrayList<GroupedComponent> getChildren();

	public void setGroupParent(GroupedComponent x);
	public void addChild(GroupedComponent x);
	public void removeChild(GroupedComponent x);

	public void paintComponent(Graphics g);

	public void groupPropertyChange(Object source, String[] propertyNames, Object[] values);
}
