

public class RationalNumber extends Number {

    private int numerator;
    private int denominator;
    private int whole;

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setWhole(int whole) {
        this.whole = whole;
    }

    public int getWhole() {
        return whole;
    }

    @Override
    public int intValue() {
        return 0;
    }

    @Override
    public long longValue() {
        return 0;
    }

    @Override
    public float floatValue() {
        return 0;
    }

    @Override
    public double doubleValue() {
        return 0;
    }

    public String toString(){
        String mystring;
        mystring ="the number is: "+whole+"  "+numerator +"/"+denominator;

        return mystring;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public RationalNumber(int numerator, int denominator) {
        this.whole= 0;
        this.numerator = numerator;
        this.denominator = denominator;
    }
    public RationalNumber(int whole,int numerator,int denominator){
        this.whole=whole;
        this.numerator=numerator;
        this.denominator=denominator;
    }

    public void reduce(RationalNumber number){
        while(number.denominator<number.numerator ){
            number.numerator-=number.denominator;
            number.whole++;
        }
        for (int i = number.numerator;i>1;i--){
            if (number.numerator%i==0 && number.denominator%i==0){
                number.numerator/=i;
                number.denominator/=i;
                i=number.numerator;
            }

        }
    }

    public void add(RationalNumber number){
        int n1DenominatorTemp=this.denominator;

        reduce(this);
        reduce(number);

        this.denominator*=number.denominator;
        this.numerator*=number.denominator;

        number.denominator*=n1DenominatorTemp;
        number.numerator*=n1DenominatorTemp;

        this.numerator+=number.numerator;

        reduce(this);
        System.out.println(this.toString());
    }

    public void subtract(RationalNumber number){

        int n1DenominatorTemp=this.denominator;

        reduce(this);
        reduce(number);

        this.denominator*=number.denominator;
        this.numerator*=number.denominator;

        number.denominator*=n1DenominatorTemp;
        number.numerator*=n1DenominatorTemp;

        this.numerator-=number.numerator;

        reduce(this);
        System.out.println(this.toString());

    }

    public void multiplay(RationalNumber number){
        this.denominator*=number.denominator;
        this.numerator*=number.numerator;

        reduce(this);
        System.out.println(this.toString());
    }

    public void devide(RationalNumber number){
        this.denominator*=number.numerator;
        this.numerator*=number.denominator;

        reduce(this);
        System.out.println(this.toString());
    }
}
