import java.util.Scanner;

class Prime{
	static boolean p;
	static boolean Prime1(int no){
		p=false;
		if(no==2){
			p=true;
			//System.out.println(no+" is a Prime number");
		}
		else if (no==3){
			p=true;
			//System.out.println(no+" is a Prime number");
		}
		else if(no<0){System.out.println(no+" is not a Natural number.\nEnter Correct Value");
		}else if(no>=0){
			for(int i=2;i<=no/2;i++){
			if(no%i==0){
					//System.out.println(no+" is not a Prime number");
				p=false;  
				break;
				}
				else if(no%i!=0 && i==no/2){
					p=true;
					//System.out.println(no+" is a Prime number");
					break;
				}
			}
		}
		return p;
	}
	static void Primeprint(int no){	
		int sum=0;
		for(int k=0;k<=no;k++){
				if(Prime.Prime1(k)==true){
					System.out.print(k+", ");
					sum++;
				}
			}
		System.out.println();
			System.out.print("No of Prime no's till "+no+" = "+sum+"\n");
	}
	static void Prime2(int no){
		if(Prime.Prime1(no)==true){
			System.out.println(no+" is a Prime Number");
		}else{
			System.out.println(no+" is not a Prime Number");}
	}
}

class Primeno extends Prime{
	private static Scanner s1;
	
	public static void main(String[] args){
		s1 = new Scanner(System.in);
		System.out.println("Enter an Integer\n");
		int a = s1.nextInt();
		Prime.Prime2(a);
		Prime.Primeprint(a);
	}
}
