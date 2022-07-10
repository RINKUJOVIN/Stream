import java.util.function.BiPredicate;

public class FunctionalInterface {
    public static void main(String[] args) {
        BiPredicate<String,String>check=(a,b)->a.equals(b);
        System.out.println(check.test("rinku","jovin"));


        BiPredicate<Integer,Integer>check1=(a,b)->a>b;
        BiPredicate<Integer,Integer>check2=(a,b)->a==b;
        boolean result = check1.and(check2).test(10,20);
        System.out.println(result);
        boolean result1 = check1.or(check2).test(10,20);
        System.out.println(result1);
    }
}
