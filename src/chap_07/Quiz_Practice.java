package chap_07;

public class Quiz_Practice {
    public static void main(String[] args) {

        SamsungGroup[] samsungGroups = new SamsungGroup[3];
        samsungGroups[0] = new SamsungGroup();
        samsungGroups[1] = new SamsungDisplay();
        samsungGroups[2] = new SamsungBattery();

        System.out.println("삼성의 그룹 계열사");
        System.out.println("--------------");
        for (SamsungGroup samsungGroup : samsungGroups) {
            samsungGroup.business();
            System.out.println("--------------");
        }
        System.out.println("정보를 확인하세요.");
    }
}

class SamsungGroup {
    public String name;

    public SamsungGroup() {
        this("삼성그룹");
    }

    public SamsungGroup(String name) {
        this.name = name;
    }

    public void business() {
        System.out.println(this.name + "의 사업 목록입니다.");
        System.out.println("<< 민생 안정");
        System.out.println("<< 물가 안정");
        System.out.println("<< 기업 안정");
    }
}

class SamsungDisplay extends SamsungGroup {
    public SamsungDisplay() {
        super("삼성디스플레이");
    }

    public void business () {
        super.business();
        System.out.println("<< 디스플레이 양산");
    }
}

class SamsungBattery extends SamsungGroup {
    public SamsungBattery() {
        super("삼성배터리");
    }

    public void business() {
        super.business();
        System.out.println("<< 배터리 양산");
    }
}

