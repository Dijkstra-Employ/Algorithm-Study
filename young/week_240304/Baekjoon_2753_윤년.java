import java.io.*;
import java.util.*;
public class Baekjoon_2753_윤년 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int year = Integer.parseInt(br.readLine());
		if (year % 400 == 0) {  //연도가 400의 배수이면 윤년
			System.out.print(1);
		} else if (year % 4 == 0 && year % 100 != 0) {  //연도가 4의 배수고 100의 배수가 아니면 윤년
			System.out.print(1);
		} else {  //나머지는 다 윤년이 아니다
			System.out.print(0);
		}
	}
}
