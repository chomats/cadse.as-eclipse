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
