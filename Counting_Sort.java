
class Counting_sort
{
    public static void sort012(int a[], int n)
    {
    int [] c=new int [3];
    int [] b=new int [a.length];
    for(int i=0;i<n;i++){
        ++c[a[i]];
    }
    int [] count=new int[3];
 
    for(int i=1;i<3;i++){
        c[i]=c[i-1]+c[i];
    }
    for(int i=n-1;i>=0;i--){
        b[--c[a[i]]]=a[i];
    }
    for(int i=0;i<a.length;i++){
        a[i]=b[i];
    }
    }
}
