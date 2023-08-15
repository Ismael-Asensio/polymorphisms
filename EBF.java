public class EBF{
   double d,v,tm;

   public EBF(){}

   public EBF(double d, double v, double tm){
     this.d=d;
     this.v=v;
     this.tm=tm;
   }

   public void setd(double d){this.d=d;}

   public double getd(){return d;}

   public void setv(double v){this.v=v;}

   public double getv(){return v;}

   public void settm(double tm){this.tm=tm;}

   public double gettm(){return tm;}

   public void menu(){
     System.out.println("\t 1.-Distancia 2.- Velocidad 3.- Tiempo ");
   }

}