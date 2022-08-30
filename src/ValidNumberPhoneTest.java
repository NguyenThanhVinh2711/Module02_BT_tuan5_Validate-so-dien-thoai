import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ValidNumberPhoneTest {
    public static void main(String[] args) {
        List<String> arr = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập độ dài của dãy số điện thoại:");
        int n = scanner.nextInt();

        ValidNumberPhone validName = new ValidNumberPhone();

        for (int i = 0; i < n; i++) {
            System.out.println("Nhập số điện thoại thứ " + (i+1));
            String np = scanner.next();
            arr.add(np);
        }

        System.out.println("Check số điện thoại:");
        for (String name : arr) {
            boolean isValid = validName.checkRegex(name);
            System.out.println("SĐT : " + name + " " + isValid);
        }
    }
}
