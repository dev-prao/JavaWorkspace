package chap_06;

public class _06_VariableScope {
    public static void methodA() {
//        System.out.println(number);
//        System.out.println(result);
    }

    public static void methodB() {
        int result = 1; // 지역 변수 -> result는 methodB 내에서만 사용 가능
    }

    public static void main(String[] args) {
        int number = 3;

//        System.out.println(result);

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

//        System.out.println(i); // for 문 내에서 정의된 i 는 for 문 내에서만 사용 가능

        {
            int j = 0;
            System.out.println(j);
            System.out.println(number);
        }
//        System.out.println(j);

    }
}
