/**
 * Created by Hubert on 2015-03-05.
 */
public class Complex{
    private double Re;
    private double Im;

    public Complex (double Re, double Im) {
        this.Re = Re;
        this.Im = Im;
    }

    public Double getRe() {
        return this.Re;
    }

    public Double getIm() {
        return this.Im;
    }


    public Complex divide(double addedRe, double addedIm) {
        if (addedRe == 0 && addedIm ==0) {
            throw new IllegalArgumentException();
        } else {
            double newRe = 0;
            double newIm = 0;

            newRe = (Re * addedRe + Im * addedIm) / (Math.sqrt(addedRe) + Math.sqrt(addedIm));
            newIm = (Im * addedRe - Re * addedIm) / (Math.sqrt(addedRe) + Math.sqrt(addedIm));

            return new Complex(newRe, newIm);
        }
    }

    public Complex divide(Complex other) {
        return divide(other.getRe(), other.getIm());
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Complex complex = (Complex) o;

        if (Double.compare(complex.Im, Im) != 0) return false;
        if (Double.compare(complex.Re, Re) != 0) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(Re);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(Im);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
