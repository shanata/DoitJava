package chapter2;

public class ImplicitConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte bNum = 10;
		int num = bNum;
		
		System.out.println(num);
		
		long lNum = 10;
		float fNum = lNum;
		
		System.out.println(fNum);
		
		double dNum = fNum + num;
		System.out.println(dNum); //묵시적 형변환들
	}

}
