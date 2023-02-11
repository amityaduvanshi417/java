
public class casting {
    public static void main(String[] args) {
// 1  
        int a = 19;
        float b=a;
        System.out.println(b);
// 2
        float c=23.99f;
        int d=(int)c;
        System.out.println(d);
// 3
        int x= (int)99.99;
        System.out.println(x);
// 4
        char ch='A';
        char ch2='B';
        int z=ch;
        int n=ch2;
        System.out.println(n-z);
// 5    type promotion
        int sum=a+d+x+ch+ch2;
        System.out.println(sum);

        int sum2= (int)(a+c+x+ch+ch2);
        System.out.println(sum2);
    }
}
