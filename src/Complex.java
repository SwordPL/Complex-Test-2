
public class Complex{
    public double argument() throws Exception {
        double arg;
        if(getRe()==0 && getIm()==0) throw new Exception();
        if(getRe()==0) {
            if (getIm() > 0) {
                arg = Math.PI / 2;
                return arg;
            }
            else {
                arg = -1 * Math.PI / 2;
                return arg;
            }
        }

        double tan = (getIm()/(getRe());
         arg = Math.atan(tan);
        return arg;
    }
}
