public class Inscripcion {

    Alumno alumno;
    Materia materia;

    public Inscripcion(Alumno alumno, Materia materia) {
        this.alumno = alumno;
        this.materia = materia;

    }

    public boolean aprobada() {
        return materia.puedeCursar(alumno);
    }

}
