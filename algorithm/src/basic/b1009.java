package basic;

import java.util.*;

public class b1009 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T;
		T = sc.nextInt();
		int[] sAnswer = new int[T];
		int[]  a = new int[T];
		int[]  b = new int[T];
		for(int k = 0; k<T; k++) {
			a[k] = sc.nextInt();
			b[k] = sc.nextInt();
			int g = 0;
			if(a[k] ==10) {
				sAnswer[k] = 10;
			}else {				
				for ( int i = 0; i<b[k]; i++) {
					if(i == 0) {
						g = a[k];
						continue;
					}
					g = g*a[k];
				}
				
				int answer;
				if(g <=10) {
					answer = g;
				}else {			
					answer = g % 10;
				}
				sAnswer[k] = answer;
			}	
		}
		for(int h = 0; h<T; h++) {
			System.out.println(sAnswer[h] );
		}
		
	}

}
