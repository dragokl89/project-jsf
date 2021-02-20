/**
 * 
 */
package com.devpredator.projectjsf.services;

import java.util.ArrayList;
import java.util.List;

import com.devpredator.projectjsf.entity.Empleado;

/**
 * @author c-ado
 *Clase que permite realizar la logica de negocio del empleado
 */


public class EmpleadoService {
	/**
	 * 
	 * @return 
	 */
	public List<Empleado> consultarEmpleado(){
		List<Empleado> empleados = new ArrayList<Empleado>();
		Empleado empleadoIBM = new Empleado();
		Empleado empleadoMicrosoft = new Empleado();
		Empleado empleadoApple = new Empleado();
		
		empleadoIBM.setNombre("Carlos");
		empleadoIBM.setPrimerApellido("Orbe");
		empleadoIBM.setSegundoApellido("Intriago");
		empleadoIBM.setPuesto("Informador");
		empleadoIBM.setEstatus(true);
		
		empleadoMicrosoft.setNombre("Carlos");
		empleadoMicrosoft.setPrimerApellido("Orbe");
		empleadoMicrosoft.setSegundoApellido("Intriago");
		empleadoMicrosoft.setPuesto("Informador");
		empleadoMicrosoft.setEstatus(true);
		
		empleadoApple.setNombre("Carlos");
		empleadoApple.setPrimerApellido("Orbe");
		empleadoApple.setSegundoApellido("Intriago");
		empleadoApple.setPuesto("Informador");
		empleadoApple.setEstatus(true);
		
		empleados.add(empleadoApple);
		empleados.add(empleadoMicrosoft);
		empleados.add(empleadoIBM);
		
		return empleados;
		
	}
}
