package huawei;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class splitString{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Map<Character,Integer> smap = new HashMap<Character,Integer>();
        for(int i=0;i<s.length();i++){
            char a = s.charAt(i);
            if(String.valueOf(a).matches("[a-zA-Z]")) {
            	if(smap.containsKey(a)){
                    smap.put(a,smap.get(a)+1);
                }else{
                    smap.put(a,1);
                }
            }
        }
        List list = new LinkedList(smap.entrySet());
        Collections.sort(list, new Comparator(){

			public int compare(Object o1, Object o2) {
				return -((Comparable)((Map.Entry)o1).getValue())
						.compareTo(((Map.Entry)o2).getValue());
			}
        	
        });
        
        Map result = new LinkedHashMap();
        for(Iterator it = list.iterator();it.hasNext();) {
        	Map.Entry entry = (Map.Entry)it.next();
        	result.put(entry.getKey(), entry.getValue());
        }
        
        
        Iterator iter = result.entrySet().iterator();
        while(iter.hasNext()){
            Map.Entry entry = (Map.Entry)iter.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            System.out.println(key+"="+value);
        }
    }
}