package week1.day2;

public class PalindromeNumber {

	public static void main(String[] args) {

		int num=34343,res=0;
		{
			while(num!=0) {
				int rem=num%10;
				res=res*10+rem;
				num=num/10;
			}
			if(num==res) {
				System.out.println("Palindrome Number");
			}
			else {
				System.out.println("Not Palindrome Number");
			}
		}
	}

}
