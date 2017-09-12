public class Main
{
    public static void main(String[] args)
    {
        Constructor test =  new Constructor();
        //Constructor test =  new Constructor(10);
        // why is this wrong ?
        test.Constructor(10);
        System.out.println(test.getVariable());

    }
}
