package leetcode;
import java.util.*;

public class LongestCommonPrefix {
	public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        int index=0;
        String first = strs[0], last = strs[strs.length-1], common="";
        while((index<first.length()) && (index<last.length())){
            if(first.charAt(index)==last.charAt(index)){
                index++;
            }else{
                break;
            }
        }
    common = first.substring(0,index);
    return common;
    }
}
