package com.revature;

import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.IntStream;

public class Solution {

	/**
	 * Implement the method below, then right click on
	 * SolutionTests.java within src/test/java/ -> com.revature to test your code
	 * before committing and pushing to your repository.
	 */
	
	public static int[] solution(int[] data, int n) {
		
		if (n<1) {
			return new int[0];
		}
		
		if (data.length < 1) {
			return data;
		}
		
		return Arrays.stream(data).filter(d->Arrays.stream(data).filter(x->x==d).count()<=n).toArray();
		
	}

}
