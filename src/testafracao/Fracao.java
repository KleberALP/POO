package testafracao;

public class Fracao {
    private int numerador;
    private int denominador;
    
    
    public Fracao(int x, int y){
        this.numerador = x;
        this.denominador = y;
       
    }
    
    public Fracao somar(Fracao x){
        int SumNumerador,SumDenominador;
        Fracao sum;
        
        if(this.denominador == x.denominador){
            SumNumerador = this.numerador+x.numerador;
            SumDenominador = this.denominador;
        }else if((this.denominador%x.denominador == 0) && (this.denominador>x.denominador)){
            SumNumerador = this.numerador+((x.numerador*this.denominador)/x.denominador);
            SumDenominador=this.denominador;
        }else if((((this.denominador%x.denominador == 0) || x.denominador%this.denominador == 0))  && (x.denominador>this.denominador)){
            SumNumerador = x.numerador+((this.numerador*x.denominador)/this.denominador);
            SumDenominador=x.denominador;
            
        }else{
            SumDenominador=this.denominador*x.denominador;
            SumNumerador = ((this.numerador*SumDenominador)/this.denominador)+((x.numerador*SumDenominador)/x.denominador);
        }  
        sum = new Fracao(SumNumerador,SumDenominador);
        sum.simplificar();
        return sum;      
    }
    
    public Fracao subtrair(Fracao x){
        int SubNumerador,SubDenominador;
        Fracao sub;
        
        if(this.denominador == x.denominador){
            SubNumerador = this.numerador-x.numerador;
            SubDenominador = this.denominador;
        }else if((this.denominador%x.denominador == 0) && (this.denominador>x.denominador)){
            SubNumerador = this.numerador-((x.numerador*this.denominador)/x.denominador);
            SubDenominador=this.denominador;
        }else if((((this.denominador%x.denominador == 0)|| x.denominador%this.denominador == 0)) && (x.denominador>this.denominador)){
            SubNumerador = ((this.numerador*x.denominador)/this.denominador)-x.numerador;
            SubDenominador=x.denominador;
        }else{
            SubDenominador=this.denominador*x.denominador;
            SubNumerador = ((this.numerador*SubDenominador)/this.denominador)-((x.numerador*SubDenominador)/x.denominador);
        }  
        sub = new Fracao(SubNumerador,SubDenominador);
        sub.simplificar();
        return sub;      
    }
    public Fracao multiplicar (Fracao x){
        Fracao mult;
           
        mult = new Fracao (this.numerador*x.numerador,this.denominador*x.denominador);
        mult.simplificar();
        return mult;
    }
    
    public Fracao dividir (Fracao x){
        Fracao div;
        div = new Fracao (this.numerador*x.denominador,this.denominador*x.numerador);
        div.simplificar();
        return div;
    }
    
    public void simplificar(){
        if (this.numerador%this.denominador==0){
            this.numerador=this.numerador/this.denominador;
            this.denominador=this.denominador/this.denominador;
        }else if (this.denominador%this.numerador==0){
            this.denominador=this.denominador/this.numerador;
            this.numerador=this.numerador/this.numerador;
            
        }
    }
    
    public String ToString(){
       String a,b;
       a=""+this.numerador;
       b="/"+this.denominador;
       return a+b;
    }
}
