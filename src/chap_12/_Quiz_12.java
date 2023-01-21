package chap_12;

public class _Quiz_12 {
    public static void main(String[] args) {
        // 상품 A와 상품 B로 이루어진 세트 상품을 효율적으로 포장하는 프로그램을 작성하시오
        // 조건
        // 1) 상품 A와 상품 B는 각각 5개씩 준비
        // 2) 상품 A와 상품 B는 두 사람이 독립적으로 준비
        // 3) 상품 A와 상품 B가 모두 준비된 이후 세트 상품 포장 시작
        // 4) 포장이 필요한 세트 상품은 총 5개
        // 5) (필요 시) 모든 클래스는 하나의 파일에 정의
        // ex) B 상품 준비 1/5
        // ex) -- B 상품 준비 완료 --
        // ex) == 세트 상품 포장 시작 ==
        // ex) == 세트 상품 포장 완료 ==
        Runnable packager1 = new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 5; i++) {
                    System.out.println("A 상품 준비 " + i + "/5");
                }
                System.out.println("-- A 상품 준비 완료 --");
            }
        };

        Runnable packager2 = new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 5; i++) {
                    System.out.println("B 상품 준비 " + i + "/5");
                }
                System.out.println("-- B 상품 준비 완료 --");
            }
        };

        Runnable packager3 = new Runnable() {
            @Override
            public void run() {

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("== 세트 상품 포장 시작 ==");
                for (int i = 1; i <= 5; i++) {
                    System.out.println("세트 상품 포장 " + i + "/5");
                }
                System.out.println("== 세트 상품 포장 완료 ==");
            }

        };
        Thread packagerThread1 = new Thread(packager1);
        Thread packagerThread2 = new Thread(packager2);
        Thread packagerThread3 = new Thread(packager3);
        packagerThread1.start();
        packagerThread2.start();
        packagerThread3.start();
    }

//        public static void packager3() {
//        System.out.println("== 세트 상품 포장 시작 ==");
//        for(int i = 1; i <= 5; i++) {
//            System.out.println("세트 상품 포장 " + i + "/5");
//        }
//        System.out.println("== 세트 상품 포장 완료 ==");
//    }
}