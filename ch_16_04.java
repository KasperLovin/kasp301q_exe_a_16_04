public class ch_16_04
{
    /*Write a method called lastIndexOf that accepts an integer value as a parameter and that returns the index in the
    list of the last occurrence of that value, or -1 if the value is not found in the list. For example,
    if a variable list stores the values [1, 18, 2, 7, 18, 39, 18, 40], then the call of list.lastIndexOf(18)
    should return 6. If the call had instead been list.lastIndexOf(3), the method would return –1. */

    public static void main(String[] args)
    {
        LinkedIntList list = new LinkedIntList();
        list.add(1);
        list.add(18);
        list.add(2);
        list.add(7);
        list.add(18);
        list.add(39);
        list.add(18);
        list.add(40);

        System.out.println(lastIndexOf(18, list));

    }
    public static int lastIndexOf(int value, LinkedIntList liste)
    {
        int container = 0;
        for (int i = 0; i <liste.size() ; i++)
        {
           if (value == liste.get(i))
           {
               container = i;
           }
        }
        return container;
    }

}
