package anagrama;

import java.util.Arrays;


public class Anagrama implements AnagramaInterface {		
	@Override
	public boolean isAnagramas(String str,String strr) {
		if(str == null || strr == null)return false;
		if(str.isEmpty() || strr.isEmpty())return false;
	    char[] a = str.toCharArray();
	    char[] b = strr.toCharArray();
	    Arrays.sort(a);
	    Arrays.sort(b);
	    if (Arrays.equals(a, b)) {
	        return true;
	    } else {
	        return false;
	    }
	}
}
