package ar.com.exisoft.facundo.vista.paginas;

import com.vaadin.data.fieldgroup.BeanFieldGroup;

import ar.com.exisoft.facundo.model.LoginEntity;
import ar.com.exisoft.facundo.vista.paginas.facade.LoginAction;
import elemental.events.KeyboardEvent.KeyCode;

public class LoginForm extends LoginPage{

	private static final long serialVersionUID = 1L;
	LoginAction loginService = LoginAction.getInstance();
	private LoginEntity loginEntity;
	@SuppressWarnings("unused")
	private MyUI myUI;
	
	public LoginForm(MyUI myUI) {
		this.myUI = myUI;
		loginButton.setClickShortcut(KeyCode.ENTER);
		loginButton.addClickListener(e -> this.authenticate());
	}	
	
	private void authenticate() {
		//TODO tutorial capitulo 7
		loginService.authenticate(loginEntity); 
		//TODO aca iria el redirect?
		//myUI.updateList();
		setVisible(false);
	}
	
	public void setLoginEntity(LoginEntity loginEntity) {
		this.loginEntity = loginEntity;
		BeanFieldGroup.bindFieldsUnbuffered(loginEntity, this);
	}
	
}
