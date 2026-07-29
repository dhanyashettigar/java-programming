package str_package;


import java.util.Arrays;

public class class1 {
    public static void main(String[] args){
        StringBuilder s1=new StringBuilder("NSAMBSc");
        System.out.println(s1);
        StringBuffer s2=new StringBuffer("NSAM BCA");
        StringBuffer s3=new StringBuffer("NSAM BCom");
        System.out.println(s2);
        s1.append("college");
        System.out.println(s1);
        s2.insert(2,"abcd");
        System.out.println(s2);
        s3.replace(5,8,"bba");
        System.out.println(s3);
        s1.reverse();
        System.out.println(s1);

        String str1="java";
        String str2=new String("java");
        String x="java";
        String y="java";
        System.out.println(x==y);
        String p=new String("java");
        String q=new String("java");
        System.out.println(p==q);
        String z="Dhanya";
        System.out.println(z.indexOf('a'));
        System.out.println(z.lastIndexOf('a'));
        System.out.println(z.toLowerCase());
        System.out.println(z.toUpperCase());
        String v="dhanya";
        System.out.println(z.equals(v));
        System.out.println(z.substring(2,5));
        char arr[]=z.toCharArray();
        System.out.println(Arrays.toString(arr));






    }
}
