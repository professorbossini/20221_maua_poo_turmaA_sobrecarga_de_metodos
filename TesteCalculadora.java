public class TesteCalculadora {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        int operando1 = 5, operando2 = 13;
        float f1 = 2.5f, f2 = 5.7F;
        String s1 = "2", s2 = "45";
        //isso é uma chamada (call) de método
        int res = calc.somar(operando1, operando2);
        System.out.println(res); 
        
        float resFloat = calc.somar(f1, f2);

        int resString = calc.somar(s1, s2);

        int resTresInts = calc.somar(operando1, operando2, 5);

        int resultado = calc.somar(2, 3);

        floatresultadoF = calc.somar(2, 3);

        System.out.println(calc.somar(2, 3));

    }    
}
