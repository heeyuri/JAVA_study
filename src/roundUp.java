import java.util.Scanner;

public class roundUp {

//    210228 소수 첫째 자리에서 반올림 하는 메소드
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double input; // 입력받는 실수 값
        int integer; // input의 정수 값
        int result; // 반올림 결과 값


        // 반올림 숫자 입력 안내
        System.out.println("반올림할 숫자를 입력하세요.");

        // 반올림 할 숫자 입력 받기
        input = scanner.nextDouble();

        integer = (int) input;

        // input의 소수자리가 0.5 보다 작으면 내림
        if( (input - integer) < 0.5 ) {

            result = integer;

        // input의 소수자리가 0.5 이상이면 올림
        } else {

            result = integer + 1;
        }
        System.out.println("반올림 값 : " + result);
    }

}
