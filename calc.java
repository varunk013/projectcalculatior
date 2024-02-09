 class calc extends MathFunctions
{
    public float Sum(int x,int y)
    {
        return x + y;
    }
    public float Diff(int x,int y)
    {
        return x - y;
    }
    public float Prod(int x,int y)
    {
        return x * y;
    }
    public float Div(int x,int y)
    {
        return x / y;
    }
}

class calculator
{
    public static void main(String args[])
    {
        float num1=10;
        float num2=23;
    calc a = new calc();
    System.out.println("Sum is:" +a.Sum(2,6));
    System.out.println("Difference is:" +a.Diff(2,3));
    System.out.println("Product is:" +a.Prod(2,9));
    System.out.println("Remainder is:" +a.Div(2,7));
    double squre =a.squre(num1);
    System.out.println("Squre of Number  is :" +squre);
        
    double cube =a.cube(num1);
    System.out.println("Cube Number is :"+cube);
    double module =a.module(num1,num2);
    System.out.println("module of  Number is :"+module);
    double power =a.power(num1,num2);
    System.out.println("Power of Number is :"+power);

    
    }
}