package problema_prototype;

/*
    Autores: 
    Diane Ortega Soto (1125618065),
    Juan Esteban Soto perez (1090272522)
 */
public class Main {
    public static void main(String[] args) {
        // Creamos un prototipo de círculo y lo clonamos para crear una nueva instancia
        Shape circlePrototype = new Circle();
        Shape clonedCircle = circlePrototype.clone();

        // Creamos un prototipo de rectángulo y lo clonamos para crear una nueva
        // instancia
        Shape rectanglePrototype = new Rectangle();
        Shape clonedRectangle = rectanglePrototype.clone();

        // Dibujamos las formas clonadas
        clonedCircle.draw();
        clonedRectangle.draw();
    }
}