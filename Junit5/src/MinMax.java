



import java.util.Arrays;



public class MinMax{
int a[];
public MinMax(int a[])
{
this.a=a;

}
public int[] getValue() {
return this.a;
}

public static int findMin(int a[] )
{

Arrays.sort(a);
int minimum=a[0];
return minimum;
}



public static int findMax(int a[] )
{
Arrays.sort(a);
int maximum=a[a.length-1];
return maximum;
}
}


