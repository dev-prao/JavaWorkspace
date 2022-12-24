package chap_03;

public class _Quiz_03 {
    public static void main(String[] args) {
        String idNo = "960718-1122512";
        System.out.println(idNo.substring(0,8)); // 0 위치부터 8 위치 직전까지

        idNo = "010227-2237461";
        System.out.println(idNo.substring(0, idNo.indexOf("-") + 2)); // 0 위치부터 하이픈 위치 + 2 직전까지
    }
}
