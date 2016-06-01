package ar.com.exisoft.facundo.vista.paginas;

import javax.servlet.annotation.WebServlet;

import org.vaadin.appfoundation.view.ViewHandler;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.annotations.Widgetset;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

/**
 * This UI is the application entry point. A UI may either represent a browser window 
 * (or tab) or some part of a html page where a Vaadin application is embedded.
 * <p>
 * The UI is initialized using {@link #init(VaadinRequest)}. This method is intended to be 
 * overridden to add component to the user interface and initialize non-component functionality.
 */
@Theme("mytheme")
@Widgetset("ar.com.exisoft.facundo.vista.paginas.MyAppWidgetset")
public class MyUI extends UI {
	
	//private LoginAction service = LoginAction.getInstance();
	LoginForm loginForm = new LoginForm(this);
	
	@Override
    protected void init(VaadinRequest vaadinRequest) {
	 //  Component loginPage	= new LoginPage();
	   final VerticalLayout layout = new VerticalLayout();

		layout.addComponents( loginForm );
		layout.setMargin(true);
		layout.setSpacing(true);
	    setContent( layout );
	    
	 // This will trigger the MainView's activate()-method
	    // with an instance of the YourView class
	    //TODO colocar la que corresponde siguiente al login
	    ViewHandler.activateView(InboxProveedorPage.class);
       
    }

    @WebServlet(urlPatterns = "/*", name = "MyUIServlet", asyncSupported = true)
    @VaadinServletConfiguration(ui = MyUI.class, productionMode = false)
    public static class MyUIServlet extends VaadinServlet {
    }
}	 