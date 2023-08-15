import java.io.*;
import java.util.Scanner;

public class DOBF {
    public static double Tiempo,Distancia,Velocidad;
    public static EBF e=new EBF();
    public static int opc;

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        CalEF c= new FormBF();
        
        try{

          e.menu();

          do{
            System.out.println("Seleccione su opcion ");
            opc=s.nextInt();
          }while(opc<=0 || opc>3);

          switch(opc){
             case 1:{
                do{
                  System.out.println("Digite la Velocidad");
                  Velocidad=s.nextDouble();
                  e.setv(Velocidad);
                }while(Velocidad<=0);

               do{
                System.out.println("Digite el Tiempo");
                Tiempo=s.nextDouble();
                e.settm(Tiempo);
               }while(Tiempo<=0);
                System.out.println("La distancia es: "+c.CD(Velocidad,Tiempo));
                break;
             }
            case 2:{
                do{
                  System.out.println("Digite la Distancia");
                  Distancia=s.nextDouble();
                  e.setd(Distancia);
                }while(Distancia<=0);

               do{
                System.out.println("Digite el Tiempo");
                Tiempo=s.nextDouble();
                e.settm(Tiempo);
               }while(Tiempo<=0);

                System.out.println("Su velocidad es: "+c.AV(Distancia,Tiempo));
                break;
             }
           case 3:{
                do{
                  System.out.println("Digite la Distancia");
                  Distancia=s.nextDouble();
                  e.setd(Distancia);
                }while(Distancia<=0);

                do{
                  System.out.println("Digite la Velocidad");
                  Velocidad=s.nextDouble();
                  e.setv(Velocidad);
                }while(Velocidad<=0);

                System.out.println("El Tiempo es: "+c.AT(Distancia, Velocidad));
                break;
             }
           
          }

        }catch(Exception ex){
          System.out.println(ex.getMessage());
        }
        
    }
}