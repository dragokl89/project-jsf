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
		Empleado empleadoNetflix = new Empleado();
		Empleado empleadoOracle = new Empleado();
		Empleado empleadoHP = new Empleado();
		Empleado empleadoDeloitte = new Empleado();
		Empleado empleadoAmazon = new Empleado();
		Empleado empleadoDisney = new Empleado();
		
		
		
		empleadoIBM.setNombre("Carlos");
		empleadoIBM.setPrimerApellido("Orbe");
		empleadoIBM.setSegundoApellido("Intriago");
		empleadoIBM.setPuesto("Informador");
		empleadoIBM.setEstatus(true);
		
		empleadoMicrosoft.setNombre("Luis");
		empleadoMicrosoft.setPrimerApellido("Orbe");
		empleadoMicrosoft.setSegundoApellido("Intriago");
		empleadoMicrosoft.setPuesto("Informador");
		empleadoMicrosoft.setEstatus(true);
		
		empleadoApple.setNombre("May");
		empleadoApple.setPrimerApellido("Orbe");
		empleadoApple.setSegundoApellido("Intriago");
		empleadoApple.setPuesto("Informador");
		empleadoApple.setEstatus(true);
		//:::::::::::::::::::::::::::::::::::::::::::::::::			
		empleadoNetflix.setNombre("Edison");
		empleadoNetflix.setPrimerApellido("Orbe");
		empleadoNetflix.setSegundoApellido("Intriago");
		empleadoNetflix.setPuesto("Informador");
		empleadoNetflix.setEstatus(true);
	
		empleadoOracle.setNombre("Elisa");
		empleadoOracle.setPrimerApellido("Orbe");
		empleadoOracle.setSegundoApellido("Intriago");
		empleadoOracle.setPuesto("Informador");
		empleadoOracle.setEstatus(true);
		
		empleadoHP.setNombre("Diego");
		empleadoHP.setPrimerApellido("Orbe");
		empleadoHP.setSegundoApellido("Intriago");
		empleadoHP.setPuesto("Informador");
		empleadoHP.setEstatus(true);
		
		empleadoDeloitte.setNombre("Sebas");
		empleadoDeloitte.setPrimerApellido("Orbe");
		empleadoDeloitte.setSegundoApellido("Intriago");
		empleadoDeloitte.setPuesto("Informador");
		empleadoDeloitte.setEstatus(true);
		
		empleadoAmazon.setNombre("Stefania");
		empleadoAmazon.setPrimerApellido("Orbe");
		empleadoAmazon.setSegundoApellido("Intriago");
		empleadoAmazon.setPuesto("Informador");
		empleadoAmazon.setEstatus(true);
		
		empleadoDisney.setNombre("Oscar");
		empleadoDisney.setPrimerApellido("Orbe");
		empleadoDisney.setSegundoApellido("Intriago");
		empleadoDisney.setPuesto("Informador");
		empleadoDisney.setEstatus(true);
		
		empleados.add(empleadoApple);
		empleados.add(empleadoMicrosoft);
		empleados.add(empleadoIBM);
		empleados.add(empleadoNetflix);
		empleados.add(empleadoOracle);
		empleados.add(empleadoAmazon);
		empleados.add(empleadoDeloitte);
		empleados.add(empleadoHP);
		empleados.add(empleadoDisney);
		
		return empleados;
		
	}
}
