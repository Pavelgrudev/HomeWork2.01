import com.sun.jdi.IntegerValue;

public class Main {

    public static void main(String[] args) {
        int a = 5;
        System.out.println("a = " + a);
        doSmth(a);
        System.out.println("a = " + a);
        System.out.println("==============================================");
        String s = "abc";
        System.out.println("s = " + s);
        doSmth(s);
        System.out.println("s = " + s);
        System.out.println("==============================================");
        int value = 33;
        changeValue(value = 33);
        System.out.println(changeValue(33));
        System.out.println(changeValue(value));
        //  Integer value2=33;
        //  System.out.println("value2="+ changeValue2(value2.intValue(33))value2));
        // changeValue2(value2);
        //  System.out.println(changeValue2(value2));
        Integer[] val = {3, 4};
        System.out.println(change(val[0]=3,[1]=4));
      //  System.out.println(change());

    }

    public static void doSmth(int param) {
        param = 6;
        System.out.println("param = " + param);
    }

    public static void doSmth(String s2) {
        s2 = "bcd";
        System.out.println("s2 = " + s2);
    }

    public static int changeValue(int value) {
        int value2 = 22;
        return value2;
    }

    //  public static int changeValue2(Integer value) {
    //  int value2=22;
    // System.out.println(value);
    // return value;
    public static int change(Integer val) {

        Integer [] val2 = {1, 2};

        return val;
    }


}



