import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<FormaGeometrica> formas = new ArrayList<>();
        formas.add(new Retangulo(5, 2));
        formas.add(new Circulo(2));

        for (FormaGeometrica forma : formas) {
            System.out.println("Área: " + forma.calcularArea());

            if(forma instanceof Circulo) {
                System.out.println("Área: " + ((Circulo) forma).calculaArea(3));
            }
        }
    }
}