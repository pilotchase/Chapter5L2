public abstract class Compare3 implements Comparable<Compare3>
{
    public static String largest(String st1, String st2) {
        if(st1.compareTo(st2) > 1)
        {
            return st2;
        } else {
            return st1;
        }
    }

}
