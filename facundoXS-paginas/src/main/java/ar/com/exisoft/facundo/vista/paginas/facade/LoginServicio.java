package ar.com.exisoft.facundo.vista.paginas.facade;

import ar.com.exisoft.facundo.model.LoginEntity;

public class LoginServicio {
	
	private static LoginServicio instance;

	
	private LoginServicio(){
	}
	/**
	 * @return a reference to an example facade for Customer objects.
	 */
	public static LoginServicio getInstance() {
		if (instance == null) {
			instance = new LoginServicio();
			instance.ensureTestData();
		}
		return instance;
	}

	private void ensureTestData() {
		System.err.println("Llegue al servicio");
	}
	
	public void log(){
		System.err.println("----------------------------> LOG Servicio <-------------------------------------");
		
	}
	public void authenticate(LoginEntity loginEntity) {
		//TODO logica de autenticacion agus
	}

}
