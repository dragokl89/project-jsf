/**
 * 
 */
package com.devpredator.projectjsf.controllers;

import java.io.IOException;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

import com.devpredator.projectjsf.dto.UsuarioDTO;

/**
 * @author c-ado Clase que permite controlar con la pantalla de login.xhtml
 */
@ManagedBean(name = "login")
public class LoginController {
	/**
	 * 
	 * Usuario que ingresa en el login
	 */
	private String usuario;
	/**
	 * Contraseña ingresada al login
	 */
	private String password;
	/**
	 * Bean que mantiene la informacion en sesion
	 */
	@ManagedProperty("#{sesion}")
	private SessionController sessionController;

	/**
	 * Metodo que permite ingresar a la pantalla principal
	 */
	public void ingresar() {
		System.out.println("Usuario :" + usuario);

		if (usuario.equals("carlos") && password.equals("123")) {
			try {
				UsuarioDTO usuarioDTO = new UsuarioDTO();
				usuarioDTO.setPassword(this.password);
				usuarioDTO.setUsuario(this.usuario);
				this.sessionController.setUsuarioDTO(usuarioDTO);
				this.redireccionar("principal.xhtml");
			} catch (IOException e) {
				FacesContext.getCurrentInstance().addMessage("formLogin:txtUser",
						new FacesMessage(FacesMessage.SEVERITY_FATAL, "la pagina no existe", ""));
				e.printStackTrace();
			}
		} else {
			FacesContext.getCurrentInstance().addMessage("formLogin:txtUser",
					new FacesMessage(FacesMessage.SEVERITY_ERROR, "usuario incorrecto y/o contraseña incorrecta", ""));
		}
	}

	private void redireccionar(String pagina) throws IOException {
		ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();

		ec.redirect(pagina);

	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the usuario
	 */
	public String getUsuario() {
		return usuario;
	}

	/**
	 * @param usuario the usuario to set
	 */
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	/**
	 * @return the sessionController
	 */
	public SessionController getSessionController() {
		return sessionController;
	}

	/**
	 * @param sessionController the sessionController to set
	 */
	public void setSessionController(SessionController sessionController) {
		this.sessionController = sessionController;
	}

}
