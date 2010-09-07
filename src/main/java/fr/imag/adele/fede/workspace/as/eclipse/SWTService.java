/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 *
 * Copyright (C) 2006-2010 Adele Team/LIG/Grenoble University, France
 */
package fr.imag.adele.fede.workspace.as.eclipse;

import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.views.properties.IPropertySheetPage;

import fr.imag.adele.cadse.core.CadseException;
import fr.imag.adele.cadse.core.CadseRuntime;
import fr.imag.adele.cadse.core.IItemNode;
import fr.imag.adele.cadse.core.Item;
import fr.imag.adele.cadse.core.ItemType;
import fr.imag.adele.cadse.core.LinkType;
import fr.imag.adele.cadse.core.ui.view.NewContext;

import org.eclipse.ui.part.IPageBookViewPage;

public interface SWTService {

	interface MyPropertySheetPage extends IPropertySheetPage, IPageBookViewPage {
	}
	public CadseRuntime[] openDialog(boolean askToErase);
	
	public boolean showCreateWizard(Shell parentShell, Item parent, LinkType lt, ItemType destItemType) throws CadseException;
	public boolean showCreateWizard(Shell parentShell, NewContext c) throws CadseException;
	
	public void showCreateWizardWithError(Shell parentShell, Item parent, LinkType lt, ItemType destItemType) throws CadseException;
	public void showCreateWizardWithError(Shell parentShell, NewContext c) throws CadseException;

	public MyPropertySheetPage createPropertySheetPage(Object view, IItemNode node);
}
