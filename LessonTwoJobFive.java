
public class LessonTwoJobFive {
	public static void main (String args []) {
		int n;
		n = 4268;
		
		int d = n % 10;
		
		int c = ((n - d)/10) % 10;
		
		int b = (((n-d)/10-c)/10)%10;
		
		int a = ((((n-d)/10-c)/10-b)/10)%10;
		
		System.out.println("������������ ����� " + d + c + b + a);
		if (a == b | a == c | a == d | b == c | b == d | c == d) System.out.println( "��������� ���� ����� ���������");
		else System.out.println( "��� ����� ����� ��������");
	}
}
