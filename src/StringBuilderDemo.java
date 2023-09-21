import java.util.Arrays;
import java.util.Scanner;

public class StringBuilderDemo {
    public static void main(String[] args) {
        // Khởi tạo đối tượng : 3 cách
//        String fullName = "hung hx";
//        StringBuilder string = new StringBuilder(fullName);
//        // các phương thức lam việc
//        // chèn append()
//        string.append(". Tuổi -24");
//        string.append("hshdhfh");
//        string.append(100);
//        string.append(true);
//        System.out.println(string);
        // chèn vào vị trị xác định
//        string.insert(4,"helo world");
//        System.out.println(string);

        // Xóa chuỗi con
//        string.delete(2,5);
//        string.deleteCharAt(7);
//        System.out.println(string);
//      đảo ngược chuỗi
//        string.reverse();
//        System.out.println(string);
//        // thay thế
//        string.replace(0,5,"da thay the");
//        System.out.println(string);

        // ví dụ áp dụng
        // cho  phép người dùng nhập vào 1 chuỗi ,
        // tìm kiếm ra chuỗi con có độ dài lớn nhất
        // mà sắp xếp các kí tự tăng dần
        // input : abcdbzjysjbcbjasukwjbdjwdujqwduwguudd;
        // output : abcd
        // hướng giải quyết
        // b1 : duyệt qua lần lượt từng kí tự của chuỗi và tìm ra
        // tất cả các chuỗi  con tăng dần
        // b2 : tìm trong danh sách các chuỗi đấy, chuỗi nào có độ dài lớn nhất;
        StringBuilder input  = new StringBuilder(new Scanner(System.in).nextLine());
        System.out.println(System.currentTimeMillis());
        String arr = "";
        for (int i = 0; i < input.length(); i++) {
            StringBuilder subString = new StringBuilder();
            subString.append(input.charAt(i));
            for (int j = i+1; j < input.length(); j++) {
                if(input.charAt(j-1)<input.charAt(j)){
                    subString.append(input.charAt(j));
                }else {
                    i=j;
                    break;
                }
            }
//            System.out.println(subString);
            if (arr.isEmpty()){
                arr +=subString;
            }else {
                arr += "," + subString;
            }
        }
        // chuyển đổi thành mảng
        String[] arraySubString = arr.split(",");
//        System.out.println(Arrays.toString(arraySubString));
        int idMax = 0;
        for (int i = 1; i<arraySubString.length;i++) {
            if (arraySubString[i].length()>arraySubString[idMax].length()){
                idMax = i;
            }
        }
        // hiển thị kết quả
        System.out.println(" Chuỗi con dài nhất là "+ arraySubString[idMax]);
        System.out.println(System.currentTimeMillis());
    }
}
