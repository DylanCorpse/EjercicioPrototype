package problema_prototype;

// Interfaz Shape que define el método para clonar la forma
interface Shape extends Cloneable {
    Shape clone();

    void draw();
}
