package java_stream;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class Summary_statics {

	public static void main(String[] args) {
		List<Integer> a=Arrays.asList(1,33,23,4,56,2,99,133,55,-2);
		
		// A state object for collecting statistics such as count, min, max, sum, andaverage.
		IntSummaryStatistics stats=a.stream().mapToInt(x->x).summaryStatistics();
		//stats
		System.out.println("max:"+stats.getMax());
		System.out.println("min:"+stats.getMin());
		System.out.println("Avg:"+stats.getAverage());
		System.out.println("Sum:"+stats.getSum());
		System.out.println("count:"+stats.getCount());

	}

}
