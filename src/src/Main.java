import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // tạo 1 đối tượng Scanner
        System.out.println("Mời người dùng nhập một chuỗi: "); // in ra người dùng nhập chuỗi
        String inputUser = scanner.nextLine(); // đọc và lưu chuỗi người dùng nhập vào trong inputString

        String[] words = inputUser.split(" ");  //tách các từ trong chuỗi

        String text = ""; // tạo 1 biến change kiểu dữ liệu String và gán " " chuỗi rỗng

        // chạy vòng lặp for, duyệt qua từ đầu ve cuối mảng
        for (int i = words.length - 1; i >= 0; i--) {
            text += words[i]; // nối từ
            if (i > 0) {   // nếu k phải từ cuối cùng, cộng thêm 1 khoảng trắng giữa các từ
                text += " ";
            }
        }
        System.out.println("Kết quả sau khi đảo ngược: " + text); // xuất ra kết quả đảo ngược
        scanner.close(); // đóng đối tượng scanner
    }
}
