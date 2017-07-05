import java.util.Scanner;


public class pro68 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String s1=s.next();
		String s2=s.next();
		String pin=s.next();
		int N=s.nextInt();
		String first="";
		String last="";
		String LongerName="";
		String ShorterName="";
		String c="";
		String d="";
		String op="";
		if(s1.length()>s2.length())
		{
			LongerName=s1.substring(0,1);
			ShorterName=s2;
		}
		else
		{
			LongerName=s2.substring(0,1);
			ShorterName=s1;
		}
		if(s1.length()==s2.length()){
			for(int i=0;i<s1.length();i++){
				for(int j=0;j<s2.length();j++){
			if(s1.charAt(i)!=s2.charAt(j)){
				char ch1=s1.charAt(i);
				char ch2=s2.charAt(j);
				if(ch1>ch2){
					LongerName=s1.substring(0,1);
					ShorterName=s2;
					break;
				}else{
					LongerName=s2.substring(0,1);
					ShorterName=s1;
					break;
				}	
			}break;
		}
	}
}
		c=pin.substring(N-1,N);
		String rev=new StringBuffer(pin).reverse().toString();
		d=rev.substring(N-1,N);
		System.out.println(LongerName+ShorterName+c+d);
		
	}

}
