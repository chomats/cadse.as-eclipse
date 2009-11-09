package fr.imag.adele.fede.workspace.as.eclipse;

import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.views.properties.IPropertySheetPage;

import fr.imag.adele.cadse.core.CadseException;
import fr.imag.adele.cadse.core.CadseRuntime;
import fr.imag.adele.cadse.core.Item;
import fr.imag.adele.cadse.core.ItemType;
import fr.imag.adele.cadse.core.LinkType;

public interface SWTService {

	public CadseRuntime[] openDialog(boolean askToErase);
	
	public boolean showCreateWizard(Shell parentShell, Item parent, LinkType lt, ItemType destItemType) throws CadseException;
	
	public void showCreateWizardWithError(Shell parentShell, Item parent, LinkType lt, ItemType destItemType) throws CadseException;

	public IPropertySheetPage createPropertySheetPage();
}
