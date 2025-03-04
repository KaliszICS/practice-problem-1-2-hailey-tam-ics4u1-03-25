public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static boolean validIndex(int arr[], int num){
		try{
			int value = arr[num];
			return true;
		}
		catch (ArrayIndexOutOfBoundsException e){
			return false;
		}
	}

	public static int divide (int num1, int num2){
		try{
			int sum = num1/num2;
			return sum;
		}
		catch (ArithmeticException e){
			return 0;
			}
		}
	
		public static int safeConvertStringtoInt(String string){
			try {
			int num = Integer.parseInt(string);
			return num;
			}
			catch (NumberFormatException e){
			return 0;
			}
		}
}
