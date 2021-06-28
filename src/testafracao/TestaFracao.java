package testafracao;

public class TestaFracao {

    public static void main(String[] args) {
       Fracao f1,f2,resultante;
     
       f1 = new Fracao(1,2);
       f2 = new Fracao(3,2);
       resultante = f1.somar(f2);
       System.out.println("Soma= "+resultante.ToString());
       resultante = f1.subtrair(f2);
       System.out.println("Subtracao= "+resultante.ToString());
       resultante = f1.multiplicar(f2);
       System.out.println("Multiplicacao= "+resultante.ToString());
       resultante = f1.dividir(f2);
       System.out.println("Divisao= "+resultante.ToString());
    }
    
}
