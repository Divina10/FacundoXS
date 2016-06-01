package ar.com.exisoft.facundo.vista.paginas;

import org.vaadin.appfoundation.view.AbstractView;
import org.vaadin.appfoundation.view.View;
import org.vaadin.appfoundation.view.ViewContainer;
import org.vaadin.appfoundation.view.ViewHandler;

@SuppressWarnings("serial")
public class InboxProveedorForm extends InboxProveedorPage implements ViewContainer {

	private MyUI myUI;
	private AbstractView<?> mainView = null;
	
	public InboxProveedorForm(MyUI myUI) {
		this.myUI = myUI;
		setMargin(true);
        setSpacing(true);
//		loginButton.setClickShortcut(KeyCode.ENTER);
//		loginButton.addClickListener(e -> this.authenticate());
       
        ViewHandler.addView(RecepcionFacturaPage.class, this);
        ViewHandler.activateView( RecepcionFacturaPage.class );
	}

	@Override
	public void activate(View view) {
//		 if(this.mainView == null){
//	            addComponent(view);
//	        }
//	        else{
//	            replaceComponent(mainView, view);
//	        }
//	        mainView = view;
	}

	@Override
	public void deactivate(View view) {
	}	
	
}
