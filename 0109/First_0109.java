/**
 * @author dex
 *
 */
public class First_0109 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hi World!!!");
		System.out.println("Command Line Program Imported to Eclipse!!");
		FreshJuice juice = new FreshJuice();
		juice.size = FreshJuice.FreshJuiceSize.MEDIUM;
		System.out.println("Size : " + juice.size);
	}

}

class FreshJuice {
	enum FreshJuiceSize { SMALL, MEDIUM, LARGE }
	FreshJuiceSize size;
}