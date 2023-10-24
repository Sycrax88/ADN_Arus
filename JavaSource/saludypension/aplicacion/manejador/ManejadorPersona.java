package saludypension.aplicacion.manejador;

import saludypension.dominio.modelo.Persona;
import saludypension.dominio.servicio.PersonaServicio;
import java.text.ParseException;


public class ManejadorPersona {
	
	private PersonaServicio personaServicio;

	public ManejadorPersona(PersonaServicio personaServicio) {
		this.personaServicio = personaServicio;
	}
	
	public void registrarPersona(Persona persona) {
        try {
        	personaServicio.registrarPersona(persona);
        } catch (ParseException e) {
            throw new RuntimeException("Error en el registro: " + e.getMessage());
       
        }
	}
}
