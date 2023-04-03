import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Alumno {

    String nombre;
    String legajo;
    List<Materia> materiasAprobadas = new ArrayList<>();

    public Alumno(String nombre, String legajo) {
        this.nombre = nombre;
        this.legajo = legajo;
    }

}
