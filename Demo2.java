package java005;
//this
public class Demo2 {
	
		int a =10;
		int b =20;

	   void	add(int a , int b)
		{
			System.out.println("Hello" +(this.a+this.b));
			System.out.println("Hello" +(a+b));
		}
		 public static void main(String[] args) {
				Demo2 ff = new Demo2();
			   ff.add(2, 3);
			}
		}

	

