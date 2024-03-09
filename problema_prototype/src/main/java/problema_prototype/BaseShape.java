package problema_prototype;

// Clase base abstracta que implementa la interfaz Shape
abstract class BaseShape implements Shape {
    private String type;

    public BaseShape(String type) {

        this.type = type;
    }

    @Override
    public Shape clone() {
        try {
            return (Shape) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    @Override
    public void draw() {

        System.out.println("Drawing a " + type);
    }
}
