package ar.com.exisoft.facundo.vista.paginas;

import com.vaadin.data.fieldgroup.BeanFieldGroup;
import com.vaadin.data.util.BeanItemContainer;
import com.vaadin.event.ShortcutAction.KeyCode;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.Notification;

public class LoginAction extends LoginPage implements View {
	
	private static final long serialVersionUID = 1L;
	private BeanItemContainer<Entry> dataSource;
	private Entry entry;

	protected void init(VaadinRequest request) {
		loginButton.addClickListener(
			      e -> Notification.show("Hi " + usuario.getValue())
			    );
		
		//FIXED Entry.java ver que debe contener agustina
				dataSource = new BeanItemContainer<>(Entry.class);
				// ???
				resetForm();
			
				loginButton.addClickListener(click -> {
					dataSource.addBean(entry);
					resetForm();
					
				});
				
				loginButton.setClickShortcut(KeyCode.ENTER);
				
	}
	
	
//	public LoginAction() {
//		//FIXED Entry.java ver que debe contener agustina
//		dataSource = new BeanItemContainer<>(Entry.class);
//		// ???
//		resetForm();
//	
//		loginButton.addClickListener(click -> {
//			dataSource.addBean(entry);
//			resetForm();
//			
//		});
//		
//		loginButton.setClickShortcut(KeyCode.ENTER);
//		
//	}

	private void resetForm() {
		entry = new Entry();
		BeanFieldGroup.bindFieldsUnbuffered(entry, this);
		
	}

	@Override
	public void enter(ViewChangeEvent event) {
		loginButton.addClickListener(
			      e -> Notification.show("Hi " + usuario.getValue())
			    );
		
	}

}
