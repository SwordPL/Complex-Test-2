/**
 * Created by Hubert on 2015-03-05.
 */
public class Complex{
    double a;
    double b;
    Complex(double c, double d){
        this.a=c;
        this.b=d;
    }
    public Complex mul (double c, double d) {
        this.a=(a*c)-(b*d);
        this.b=(a*d)+(b*c);
        return this;
    }
}
