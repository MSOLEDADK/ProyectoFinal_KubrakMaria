
package com.portfolio.msoledadk.Interface;

import com.portfolio.msoledadk.Entity.Persona;
import java.util.List;


public interface IPersonaService {
    //Traer una lista de personas
    public List<Persona> getPersona();
    
    //Guardar un objeto de tipo Persona
    public void savePersona(Persona persona);
    
    //Eliminar un objeto o usuario y lo buscamos por ID
    public void deletePersona(Long id);
    
    //Buscar a una persona por ID
    public Persona findPersona(Long id);
}
