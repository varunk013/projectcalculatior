 class calc
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
    calc a = new calc();
    System.out.println("Sum is:" +a.Sum(2,6))
    System.out.println("Difference is:" +a.Diff(2,3))
    System.out.println("Product is:" +a.Prod(2,9))
    System.out.println("Remainder is:" +a.Div(2,7))
    
    }
}
