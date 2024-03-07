
package kalkulator;

public class ProcessKalkulator {//class ModelKalkulator

    int operator=0;//Deklarasi variabel dimana operator = 0 dan bertipe data integer
    double number1, number2, number3, result;//Deklarasi variabel dimana number1, number2, number3 dan result bertipe data double
    String Iprocess;//Deklarasi variabeldimana Iproses bertipe karakter
    
    public void setNumber (String opr){
        if(!opr.equals("")){
            if(operator==0){
                number1=Double.valueOf(opr);
            }else{
                 number2=Double.valueOf(opr);                       
            }
        }
    }
    
    public void setOperator(int operator){
        this.operator=operator;
    }
    
    public double getResult(){
        return result;
    }
    
    public void setResult(double hasil){
        this.result=hasil;
    }
    
    public void Process(){
    switch(operator) {
    case 1:
    result = number1 + number2;
    Iprocess="+";
    break;
    case 2:
    result = number1 - number2;
    Iprocess="-";
    break;
    case 3:
    result = number1 * number2;
    Iprocess="*";
    break;
    case 4:
    result = number1 / number2;
    Iprocess="/";
    break;
    }
    number3=number1;
    number1=result;
}
}
    

/**
 *
 * @author Admin
 */


    /**
     * @param args the command line arguments
     */
/*/* public static void main(String[] args) {*/ 
        // TODO code application logic here
