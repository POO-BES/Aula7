public class Retangulo extends FormaGeometrica {
    private float largura;
    private float altura;

    public Retangulo(float largura, float altura) {
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public float calcularArea() {
        return largura * altura;
    }
}