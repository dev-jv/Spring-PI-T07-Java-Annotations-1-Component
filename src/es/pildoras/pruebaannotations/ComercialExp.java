package es.pildoras.pruebaannotations;

import org.springframework.stereotype.Component;

@Component("CoExp") // Annotation -> bean > nombre
public class ComercialExp implements Empleados {

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Vender, vender y vender m�s!!";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Informe generado por el comercial";
	}
}

/*
	@Component("CoExp")
Esta anotaci�n registra la clase con un nombre, y �se ser� el nombre por el cual los bean ser�n creados. Si no se indica un nombre, toma el de la clase pero iniciando en min�scula

*/