/*
Class To Test Class Construction
 */
public class Constructor
{
    private int variable;
    /*
    Constructor creator setting variable value
    @param number sets value of variable
     */
    public  Constructor(int number1)
    {
        variable = number1;
    }
    /*
    Construct a Constructor with variable = 0
    No Argument Constructor
     */
    public void Constructor()
    {
    variable = 0;
    }
    /*
    Gets the variable value
    No Argument constructor
     */
    public int getVariable()
    {
        return variable;
    }
    /*
    Changes the variable value
    @param variable1 sets value of variable
     */
    public void setVariable(int variable1)
    {
        variable = variable1;
    }
}
