import java.util.Arrays;

public class hello {
    public static void main(String[] args){
        System.out.println("hello, world!");
        System.out.println("args = " + Arrays.deepToString(args));//参数
        System.out.println("hello.main");
        //fori循环
        String[] arr = new String[]{"lin","chen","thinking"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        //iter循环
        for (String s : arr) {
            System.out.println(s);
        }
    }

    public static void say() {
        System.out.println("hello!");
        System.out.println("hello");
        System.out.println("hello.say");
        int i = 10;
        System.out.println("i = " + i);
        int num = 10;
        System.out.println(num);
        
    }
}
