import javax.print.attribute.standard.OrientationRequested;

public class Ed9025 {
    public static void main(String[] args) {
    /*
     * Operadores
    */
        // operadores aritméticos
        System.out.println("Suma 10 + 3= "+(10+3));
        int num=3;
        int num2=4;
        int resta = num -num2;
        System.out.println("Resta de 3 - 4 = "+ resta);
        System.out.println("Modulo 5 % 8 = "+ 5%8);
        System.out.println("Numero exponencial 5**5 = " + Math.pow(5, 5));
        System.out.println("Division redondeada 10/3 = " + Math.round(10/3));

        //Operadores de comparación
        System.out.println("Igualdad: 10==3: "+ (10==3));
        System.out.println( "Desigualdad 4!=54" +(4!=54));
        System.out.println("Mayor que : 10 > 4: "+ (10>4));
        System.out.println("Mayor que : 10 < 4: "+ (10<4));
        System.out.println("Mayor o igual que: 5 <= 9" +(5<=9));
        System.out.println("Mayor o igual que: 5 >= 9" +(5>=9));

        //Operadores lógicos
        System.err.println("AND && 10-4==6 and 3-4==4 es " + (10-4==6 && 3-4==4));
        System.err.println("OR or 10-4==6 OR 3-4==4 es " + (10-4==6 || 3-4==4));
         System.err.println("Not ! 10-4==6 OR 3-4==4 es " + ! (10-4==6) );

         //Operadores de asignacion
         int num3 =1;
         num3+=3;
        System.out.println(num3);
         num3-=3;
        System.out.println(num3);
         num3*=3;
        System.out.println(num3);
         num3/=3;
        System.out.println(num3);
         num3%=3;
        System.out.println(num3);
       
        //Operadores de identidad
          int newNum3= 1;  
          System.out.println("num3 es igual a newNum3: " );
    }

}
