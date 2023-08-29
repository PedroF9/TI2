public class Prog
{
    public static void main(String[] args) 
    {

    Cadeira cadeira01 = new Cadeira();  //construct


    cadeira01.cor = branca;
    cadeira01.pernas = 1;
    cadeira.balanco();

    }

}//end prog//



class Cadeira()
{

    String cor;
    String material;
    Double altura;
    private int peranas;
    
    public int getPernas() 
    {
        return pernas
    }
    public void setPerna(int x) 
    {
        if(x > 0){pernas = x;}

        else{system.out.println("valor inválido")}
        
    } 


    void balanco()
    {
        system.out.println("balanssando");
    }

    

}//end cadeira