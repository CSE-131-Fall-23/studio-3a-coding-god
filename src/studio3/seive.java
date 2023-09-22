package studio3;
import java.util.Arrays;

public class seive {

	public static void main(String[] args) {
//		boolean [] number_list = {true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true};
		boolean[] number_list = new boolean[20];
		Arrays.fill(number_list, true);
		int count = 1;
		while (Math.pow(count, 2)<number_list.length) {
			count ++;
			int origin = count;
			for (int i=count; i <= number_list.length; i = i + count) {
				if (i != origin) {
					if (number_list[i-1]== true) {
						number_list[i-1] = false;
					}
				}
			}
		}
		for (int i=0; i < number_list.length; i ++) {
			System.out.println(Integer.toString(i+1)+ ": " + number_list[i]);
		}
	}
}
