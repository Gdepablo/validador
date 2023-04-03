import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Materia {
    String nombre;
    List<Materia> correlativas = new ArrayList<>();
    int notaFinal;

    public Materia(String nombre, int notaFinal) {
        this.nombre = nombre;
        this.notaFinal = notaFinal;
    }

    public boolean estaAprobada() {
        return notaFinal >=6;
    }

    public boolean puedeCursar(Alumno alumno) {
       return alumno.materiasAprobadas.containsAll(correlativas);

        //TODO: Puede que falte optimizar esto.
    }
}
