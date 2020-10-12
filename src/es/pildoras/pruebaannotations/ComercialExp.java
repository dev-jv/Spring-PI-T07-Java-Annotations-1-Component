package es.pildoras.pruebaannotations;

import org.springframework.stereotype.Component;

@Component("CoExp") // Annotation -> bean > nombre
public class ComercialExp implements Empleados {

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Vender, vender y vender más!!";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Informe generado por el comercial";
	}
}

/*
	@Component("CoExp")
Esta anotación registra la clase con un nombre, y ése será el nombre por el cual los bean serán creados. Si no se indica un nombre, toma el de la clase pero iniciando en minúscula

*/