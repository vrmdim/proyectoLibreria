package es.mde.acing.utils;

import java.time.LocalDate;

public interface OrdenRecepcion {
	
	static enum Tipo {
		total,
		parcial
	}
	
	Tipo getTipo();
	
	LocalDate getfRecepcion();
}
