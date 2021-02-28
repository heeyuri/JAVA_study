import java.util.Scanner;

public class Calculrator_ver1 {
    
// 210228 사칙연산 계산기_ver1 by.쪙
//    if문 또는 switch문을 통해 2개의 정수 값을 받아 사칙연산을 해주는 프로그램

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        
        int input1 = 0; // 첫번째 값
        int input2 = 0; // 두번째 값
        int calType = 0; // 연산 유형 값
        int result = 0; // 결과 값

//      사칙연산 안내 문구
        System.out.println("사칙연산을 시작합니다. 선택해주세요.");
        System.out.println("①덧셈");
        System.out.println("②뺄셈");
        System.out.println("③곱셈");
        System.out.println("④나눗셈");

//      사칙연산 유형 값 받기
        calType = scanner.nextInt();

//      연산할 값 2개 받기
        System.out.println("첫번째 값을 입력하세요.");
        input1 = scanner.nextInt();

        System.out.println("두번째 값을 입력하세요.");
        input2 = scanner.nextInt();



//        switch문을 통한 연산 수행
        switch (calType){

            case 1 :
                    result = input1 + input2;
                    break;
                    // break를 통해 switch문 종료를 꼭 시켜주는게 좋다.
                    // 만일 case 1,3을 동시에 만족하는 경우, 결과 값이 2개 도출됨!!

            case 2 :
                    result = input1 - input2;
                    break;

            case 3 :
                    result = input1 * input2;
                    break;
                    
            case 4 :
                    result = input1 / input2;
                    break;
                    
            default:
                System.out.println("1~4까지만 입력하세요.");

        }


        /*if문을 통한 연산 수행
        if(calType == 1) {

            result = input1 + input2;

        }   else if( calType == 2) {

            result = input1 - input2;

        } else if(calType == 3) {

            result = input1 * input2;

        } else if(calType == 4) {

            result = input1 / input2;

        }*/

//        결과 값 출력 및 시스템 종료
        System.out.println("결과 값 : " + result);
        System.out.println("시스템을 종료합니다.");

    }
}
