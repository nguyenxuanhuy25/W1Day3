import java.util.Arrays;
import java.util.Scanner;

public class SortArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // khởi tạo đối tượng scanner
        System.out.println("Mời người dùng nhập số lượng phần tử mảng :"); // in ra cho người dùng nhập
        int n = sc.nextInt(); // khởi tạo biến n với giá trị int, và đọc dữ liệu từ người dùng nhập vào

        System.out.println("Mời người dùng nhập các phần từ mảng");
        int[] arr = new int[n]; // khởi tạo mảng arr
        for (int i = 0 ; i < n; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr); // hàm sort() sắp sếp các phần từ trong mảng tăng dần

        System.out.println("kết quả chuỗi tăng dần trả về : ");
        for (int num : arr){   // chạy vòng lặp for-each, chạy qua các phần tử vừa  sắp xếp tăng dần
            System.out.print(num+" "); // in ra kết quả chuỗi tăng dần
        }

        // Đảo ngược vị trí từ lớn đến bé
        System.out.println("\n kết quả chuỗi đảo ngược trả về :");
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
