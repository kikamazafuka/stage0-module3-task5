package lang.print.gaps.task5;

public class ThreeStuckVars {
    public static void main(String[] args) {

        int first = 1;
        int second = 10;
        int third = 100;
        int res = first*second*third*third+second*third*second+third;
        System.out.println(res);
    }
}
