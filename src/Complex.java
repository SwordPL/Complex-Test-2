public class Complex{
    private final double re;
    private final double im;

    public Complex (double Re, double Im) {
        this.re = Re;
        this.im = Im;
    }

    public Double getRe() {
        return this.re;
    }

    public Double getIm() {
        return this.im;
    }

    public Complex plus(double u, double v) {
        return new Complex(getRe() + u, getIm() + v);
    }

    public Complex plus(Complex complex) {
        return this.plus(complex.getRe(), complex.getIm());
    }

    public Complex minus(double u, double v) {
        return this.plus(-u, -v);
    }

    public Complex minus(Complex complex) {
        return this.plus(-complex.getRe(), -complex.getIm());
    }

    public Complex mul(double c, double d) {
        double newRe = (getRe() * c) - (getIm() * d);
        double newIm = (getRe() * d) + (getIm() * c);
        return new Complex(newRe, newIm);
    }

    public Complex divide(double addedRe, double addedIm) {
        if (addedRe == 0 && addedIm ==0) {
            throw new IllegalArgumentException();
        } else {
            double newRe;
            double newIm;

            newRe = (getRe() * addedRe + getIm() * addedIm) / (addedRe * addedRe + addedIm * addedIm);
            newIm = (getIm() * addedRe - getRe() * addedIm) / (addedRe * addedRe + addedIm * addedIm);

            return new Complex(newRe, newIm);
        }
    }

    public Complex divide(Complex other) {
        return divide(other.getRe(), other.getIm());
    }

    public double modulus() {
        return Math.sqrt(getRe() * getRe() + getIm() * getIm());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Complex complex = (Complex) o;

        return Double.compare(complex.im, im) == 0 && Double.compare(complex.re, re) == 0;

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(re);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(im);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
