package chap_06;

public class _03_Return {
    // 회사 전화번호
    public static String getPhoneNumber() {
        String phoneNumber = "1588-3820";
        return phoneNumber;
    }
    // 회사 주소
    public static String getAddress() {
        return "경기도 성남시 분당구";
    }
    // 회사 액티비티
    public static String getWelfare() {
        return "볼링장, 탁구장, 노래방";
    }


    public static void main(String[] args) {
        // 반환값, Return
        String contactNumber = getPhoneNumber();
        System.out.println("회사 전화번호 : " + contactNumber);

        String address = getAddress();
        System.out.println("회사 주소 : " + getAddress());

        System.out.println("회사 복리후생 : " + getWelfare());
    }
}
