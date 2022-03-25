public class Calculadora {
    private String marca;
    private boolean esCientifica;
    private double primerValor;
    private double segundoValor;

    public Calculadora(String marca, boolean esCientifica) {
        this.marca = marca;
        this.esCientifica = esCientifica;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean isEsCientifica() {
        return esCientifica;
    }

    public void setEsCientifica(boolean esCientifica) {
        this.esCientifica = esCientifica;
    }

    public double getPrimerValor() {
        return primerValor;
    }

    public void setPrimerValor(double primerValor) {
        this.primerValor = primerValor;
    }

    public double getSegundoValor() {
        return segundoValor;
    }

    public void setSegundoValor(double segundoValor) {
        this.segundoValor = segundoValor;
    }
    public double sumar (){
         double resultadoSuma;
        getPrimerValor();
        getSegundoValor();
       resultadoSuma=primerValor+segundoValor;
        return resultadoSuma ;
    }

    public double restar (){
        double resultadoResta;
        getPrimerValor();
        getSegundoValor();
        resultadoResta=primerValor-segundoValor;

        return resultadoResta ;



    }
    public double multipricar(){
        double resultadoMultiplicacion;
        getPrimerValor();
        getSegundoValor();
        resultadoMultiplicacion=primerValor*segundoValor;
        return resultadoMultiplicacion;
}

public double dividir(){
        double resultadoDivision;

        getPrimerValor();
        getSegundoValor();

        resultadoDivision= primerValor/segundoValor;
        return resultadoDivision;
}
public void elevarAPotencia(){
        String resultadoPotencia;
        getPrimerValor();
        getSegundoValor();
}

    @Override
    public String toString() {
        return "Calculadora{" +
                "marca='" + marca + '\'' +
                ", esCientifica=" + esCientifica +
                ", primerValor=" + primerValor +
                ", segundoValor=" + segundoValor +
                '}';
    }
}
