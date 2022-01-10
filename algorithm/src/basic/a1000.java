package basic;

import java.util.*;

public class a1000 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T, a, b;
		T = sc.nextInt();
		for(int k = 0; k<T; k++) {
			
			a = sc.nextInt();
			b = sc.nextInt();
			int g = 0;
			
			for ( int i = 0; i<b; i++) {
				if(i == 0) {
					g = a;
					continue;
				}
				g = g*a;
			}
			
			int answer;
			if(g <=10) {
				answer = g;
			}else {			
				answer = g % 10;
			}
			
			System.out.println(answer);
		}
		

	}

}
