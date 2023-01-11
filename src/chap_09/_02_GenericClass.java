package chap_09;

import chap_09.coffee.*;
import chap_09.user.User;
import chap_09.user.VIPUser;

public class _02_GenericClass {
    public static void main(String[] args) {
        // 제네릭 클래스
        CoffeeByNumber c1 = new CoffeeByNumber(33);
        c1.ready();

        CoffeeByNickname c2 = new CoffeeByNickname("유기리니");
        c2.ready();

        System.out.println("------------------------------");

        CoffeeByName c3 = new CoffeeByName(34);
        c3.ready();

        CoffeeByName c4 = new CoffeeByName("하유빈");
        c4.ready();

        System.out.println("------------------------------");
        int c3Name = (int) c3.name;
        System.out.println("주문 고객 번호 : " + c3Name);

        String c4Name = (String) c4.name;
        System.out.println("주문 고객 이름 : " + c4Name);

        System.out.println("------------------------------");

        Coffee<Integer> c5 = new Coffee<>(35);
        c5.ready();
        int c5Name = c5.name;
        System.out.println("주문 고객 번호 : " + c5.name);

        Coffee<String> c6 = new Coffee<>("girin");
        c6.ready();
        String c6Name = c6.name;
        System.out.println("주문 고객 이름 : " + c6.name);

        System.out.println("------------------------------");
        CoffeeByUser<User> c7 = new CoffeeByUser<>(new User("prao"));
        c7.ready();

        CoffeeByUser<User> c8 = new CoffeeByUser<>(new VIPUser("orap"));
        c8.ready();
        orderCoffee("오해원");
        orderCoffee(36);

        System.out.println("------------------------------");
        orderCoffee("임나영","아메리카노");
        orderCoffee(37,"카페라뗴");

    }
    public static <T> void orderCoffee(T name) {
        System.out.println("커피 준비 완료 : " + name);
    }
    public static <T, V> void orderCoffee(T name, V coffee) {
        System.out.println(coffee + " 준비 완료 : " + name);
    }
}
