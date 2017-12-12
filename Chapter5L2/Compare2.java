public abstract class Compare2 extends Number implements Comparable<Compare2>
{
    public static int largest(int i1, int i2) {
        if(Integer.valueOf(i1).compareTo(Integer.valueOf(i2)) < 0)
        {
            return i1;
        } else {
            return i2;
        }
    }

}
