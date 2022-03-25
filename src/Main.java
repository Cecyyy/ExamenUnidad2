public class Main {
    public static void main(String[] args) {
        Calculadora basica = new Calculadora("patito",false);
        Calculadora cientifica = new Calculadora("casio",true);

        basica.sumar();
        basica.setPrimerValor(248.9);
        basica.setSegundoValor(0.0);
        basica.restar();
        basica.setPrimerValor(248.9);
        basica.setSegundoValor(0.0);
        basica.multipricar();
        basica.setPrimerValor(248.9);
        basica.setSegundoValor(0.0);
        basica.dividir();
        basica.setPrimerValor(248.9);
        basica.setSegundoValor(0.0);

        cientifica.sumar();
        cientifica.setPrimerValor(45.83);
        cientifica.setSegundoValor(13.6);
        cientifica.restar();
        cientifica.setPrimerValor(45.83);
        cientifica.setSegundoValor(13.6);
        cientifica.multipricar();
        cientifica.setPrimerValor(45.83);
        cientifica.setSegundoValor(13.6);
        cientifica.dividir();
        cientifica.setPrimerValor(45.83);
        cientifica.setSegundoValor(13.6);



    }
}
