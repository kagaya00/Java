import java.util.*;
public class JavaKadai055 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("月を入力してくださいーー＞");
		int months = sc.nextInt();
		
		switch (months) {
		case 1:
			System.out.print("冬です");
			break;
		case 2:
			System.out.print("冬です");
			break;
		case 12:
			System.out.print("冬です");
			break;
			
		case 3:
			System.out.print("春です");
			break;
		case 4:
			System.out.print("春です");
			break;
		case 5:
			System.out.print("春です");
			break;
		case 6:
			System.out.print("夏です");
			break;
		case 7:
			System.out.print("夏です");
			break;
		case 8:
			System.out.print("夏です");
			break;
		case 9:
			System.out.print("秋です");
			break;
		case 10:
			System.out.print("秋です");
			break;
		case 11:
			System.out.print("秋です");
			break;
			
		default:
			System.out.println("エーら");
			break;
		}
	

	}

}
