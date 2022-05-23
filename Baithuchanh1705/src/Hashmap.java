import java.util.HanshSet;
import java.util.Scanner;

public class HashAdd {
    public static void main(String[]args){
        int number;
        HashSet<Integer> hashSetInteger = new HashSet<>();
        Scanner sc = new Scanner(Sytem.in);
        //thêm cấc phần tử vào hashSetInteger
        hashSetInteger.add(0);
        hashSetInteger.add(3);
        hashSetInteger.add(1);
        hashSetInteger.add(4);
        hashSetInteger.add(2);
        hashSetInteger.add(8;)
        //hiieenr thị các phần tử trong hashsetInteger
        Sytem.out.println("CÁc phần tử trong HashsetIntger: ");
        Sytem.out.println(HashsetInteger);
        Sytem.out.println("Nhập phần tử cần thêm: ");
        number = scanner.nextInt();
        //thêm một phần tử mới vào hashSetInteger từ bàn phím
        if (!hash SetInteger.contains(number)) {
            hashSetInteger.add(number);
            System.out.println("Thêm thành công !");
            System.out.println(hashSetInteger);
        } else {
            system.out.println("Phần tử" + number + "đã tồn tại" );
        }

    }
}