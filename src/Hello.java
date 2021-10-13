class Outer
{
    int x=10;
    private class Inner
    {
         public void if1()
         {
             System.out.println("x: "+x);
         }
    }
    Inner inner=new Inner();
}


public class Hello {
    public static void main(String[] args) {
        Outer outer=new Outer();
    }
}
    