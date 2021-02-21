/**
 * 
 */
package com.devpredator.projectjsf.controllers;

import java.io.IOException;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

/**
 * @author c-ado
 *
 */
@ManagedBean(name = "sesionclosed")
public class SessionClosedController {
	@PostConstruct
	public void init() {
		System.out.println("Cerrar sesión");
	}
/**
 * Metodo que permite cerrar la sesión
 */
	public void cerrarCesion() {
		ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
		externalContext.invalidateSession();
		try {
			this.redireccionar("login.xhtml");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**
	 * Permite redireccion a una pagina
	 * @param pagina {@ String } pagina a redireccionar 
	 * @throws IOException Excepcion al encontrar la sesion
	 */
	private void redireccionar(String pagina) throws IOException {
		ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();

		ec.redirect(pagina);

	}

}
