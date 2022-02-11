import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question1 {
	public static void main(String[] args) {
		List<String[]> rows = new ArrayList<String[]>();
		rows.add(new String[] {"abcdqw","aafdcw4ffs","ddheehed","ddwq43334"});
		rows.add(new String[] {"ab","acbdw","dddddddddd","fdfdfdfdffe333d"});
		rows.add(new String[] {"fdswddddd","ab","dddd","ddd3dffff3"});
//		rows.add(new String[] {"fdswddddd","ab","dddd","ddd3dffff3","dddd","ddd3dffff3"});

		System.out.println(Arrays.toString(maxColLengths(rows)));
	}
	
	public static int[] maxColLengths(List<String[]> rows) {
		int[] maxStringLength = new int[getHighestColumnSize(rows)];

		for(String[] row: rows) {
			for(int i = 0; i < row.length; i++) {
				if(row[i].length() > maxStringLength[i]) {
					maxStringLength[i] = row[i].length();
				}
			}
		}
		
		return maxStringLength;
	}
	
	public static int getHighestColumnSize(List<String[]> rows) {
		int highestColumnSize = 0;
		
		for(String[] row: rows) {
			if(row.length > highestColumnSize) {
				highestColumnSize = row.length;
			}
		}
		
		return highestColumnSize;
	}
}
