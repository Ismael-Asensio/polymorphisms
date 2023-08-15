public class FormBF  implements CalEF{
    @Override
    public double CD(double x, double y) {
        return x*y;
    }
    @Override
    public double AT(double x, double z) {
       return x/z;
    }
    @Override
    public double AV(double x, double y) {
      return x/y;
    }
    
}