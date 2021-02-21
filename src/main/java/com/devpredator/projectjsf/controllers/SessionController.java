package com.devpredator.projectjsf.controllers;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.devpredator.projectjsf.dto.UsuarioDTO;

/**
 * 
 * @author c-ado Clase controladora de la sesion
 */
@ManagedBean(name = "sesion")
@SessionScoped
public class SessionController {
	/**
	 * usuario en sesion
	 */
	private UsuarioDTO usuarioDTO;
/**
 * inicializa la sesion
 */
	@PostConstruct
	public void init () {
		System.out.println("Cargando informacion en sesión");
	}
	/**
	 * @return the usuarioDTO
	 */
	public UsuarioDTO getUsuarioDTO() {
		return usuarioDTO;
	}

	/**
	 * @param usuarioDTO the usuarioDTO to set
	 */
	public void setUsuarioDTO(UsuarioDTO usuarioDTO) {
		this.usuarioDTO = usuarioDTO;
	}
}
