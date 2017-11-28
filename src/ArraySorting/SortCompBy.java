package ArraySorting;

import java.util.Comparator;

public class SortCompBy implements Comparator<ComparatorSort>{
        
	@Override
	public int compare(ComparatorSort x, ComparatorSort y) {
		// TODO Auto-generated method stub
		return x.rollNo - y.rollNo;
	}

}
