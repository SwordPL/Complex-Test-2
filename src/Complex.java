/**
 * Created by Hubert on 2015-03-05.
 */
public class Complex{

    public double modulus() {
        double a=getRe();
        double b=getIm();
        return Math.sqrt(a*a+b*b);
    }
}
