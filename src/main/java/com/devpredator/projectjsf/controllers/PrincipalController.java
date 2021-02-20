package com.devpredator.projectjsf.controllers;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.devpredator.projectjsf.entity.Empleado;
import com.devpredator.projectjsf.services.EmpleadoService;

/**
 * 
 * @author c-ado
 *Clase controller que se encarga de procesar la infomacion de la pantalla prinicapl.xhtml
 */

@ManagedBean (name = "principal")
@ViewScoped
public class PrincipalController {
/**
 * Lista de empleados
 */
	
private List<Empleado> empleados ;
 /**
  * Servicio con la logica del negocio
  */
 private EmpleadoService empleadoService = new EmpleadoService();
 /**
  * Metodo que inicializa la info de la pantalla principal
  */
 @PostConstruct
 public void init () {
	 this.consultarEmpleador();
 }
 
 /**
  * Metodo que consulta la lista de empleados
  */
 private void consultarEmpleador() {
	 this.empleados = this.empleadoService.consultarEmpleado();
 }


/**
 * @return the empleados
 */
public List<Empleado> getEmpleados() {
	return empleados;
}


/**
 * @param empleados the empleados to set
 */
public void setEmpleados(List<Empleado> empleados) {
	this.empleados = empleados;
}
}
