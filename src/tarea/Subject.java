package tarea;

public interface Subject {
    void Notificar();
    void Asignar(Observer o);
    void Desasignar(Observer o);
}
