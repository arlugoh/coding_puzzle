package lj.coding_puzzles2;

/**
 * Hello world!
 *
 */
public class AverageLong 
{
    public static final long average(final long a, final long b){
        final long mark = Long.MIN_VALUE;
        if(((a&mark) ^ (b&mark)) ==mark){
            return (a+b)/2;
        }
        if(a>0){
            return (a>>1) + (b>>1)+(a&1&b);
        }
        return (a>>1) + (b>>1) + ((a|b)&1);
        
    }

    public static final long average2(final long a, final long b){
        final long mark = Long.MIN_VALUE;
        if(((a&mark) ^ (b&mark)) ==mark){
            return (a+b)/2;
        }
        return a/2+b/2 + (a>0?(a&1&b):-(a&1&b));
    }
}
