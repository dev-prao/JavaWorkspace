package chap_04;

public class _Quiz_04 {
    public static void main(String[] args) {
        /*
        조건문을 활용하여 주차 요금 정산 프로그램을 작성하시오.
        조건 1) 주차요금은 시간당 4000원 (일일 최대 요금은 30000원)
        조건 2) 경차 또는 장애인 차량은 최종 요금에서 50% 할인 (장애인 차량: 직접 운전 또는 탑승 모두 포함)

        주차요금 예시
        ex1) 일반 차량 5시간 주차 시 20000원
        ex2) 경차 5시간 주차 시 10000원
        ex3) 장애인 차량 10시간 주차 시 15000원
         */
        System.out.println("라오 주차장에 오신 것을 환영합니다.");
        System.out.println("저희 주차장의 주차 요금은 시간당 4,000원이고 일일 최대 요금은 30,000원입니다.");
        System.out.println("경차 또는 장애인 차량은 최종 요금에서 50% 할인이 제공되며, 장애인 차량은 직접 운전 또는 탑승을 모두 포함합니다.");

//        String car = "장애인 차량";
//        int time = 10;
//        int fare_per_time = 4000;
//        int max_fare = 30000;
//        int total_fare;
//        if (time * fare_per_time > max_fare) {
//            total_fare = max_fare;
//        }
//        else {
//            total_fare = time * fare_per_time;
//        }
//
//        if (car == "경차" || car == "장애인 차량") {
//            total_fare /= 2;
//        }
//        System.out.println(car + " " + time + "시간 주차 시 " + total_fare + "원");

        System.out.println("✡✡✡✡✡✡✡✡✡✡✡✡✡✡✡✡✡✡✡✡✡✡✡✡✡✡✡✡✡✡✡✡✡✡✡✡✡✡✡✡✡✡✡✡");
        int hour = 10;
        boolean isSmallCar = false; // 경차 여부
        boolean withDisabledPerson = true; // 장애인 차량 여부

        int fee = hour * 4000; // 시간당 4000원

        // 30000원 초고ㅘ 시 일일 최대 요금으로 수정
        if (fee > 30000) {
            fee = 30000;
        }

        // 경차 또는 장애인 차량인 경우 50% 할인
        if (isSmallCar || withDisabledPerson) {
            fee /= 2; // 50% 할인 적용
        }
        System.out.println("주차 요금은 " + fee + " 원입니다.");
    }
}
