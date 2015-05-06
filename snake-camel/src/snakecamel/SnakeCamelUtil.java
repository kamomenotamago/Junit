package snakecamel;
import java.util.ArrayList;
public class SnakeCamelUtil {

	public String snakeToCamelcase(String snake_case) {
		StringBuilder sb = new StringBuilder();
		ArrayList<String> array = new ArrayList<String>();
		String[] words = snake_case.split("_");
		
		for(int j=0;j<words.length;j++){
			if(words[j].length()!=0){
				array.add(words[j]);//arrayに""をぬいた配列をつくる
			}
		}
		
		int l = array.size();
		String[] words2 = new String[l];
		
		for (int i = 0; i < l; i++) {
			words2[i]=array.get(i);//arrayをString配列に直す
			sb.append(capitalize(words2[i]));
		}
		
		return new String(sb);
	}
	 
	public String camelToSnakecase(String camelcase) {
		StringBuilder sb = new StringBuilder();
		int j = 0;
		for (int i = 0; i < camelcase.length(); i++) {
			char c = camelcase.charAt(i);
			if (Character.isUpperCase(c)) {
				sb.append(camelcase.substring(j, i));
				if (sb.length() > 0) {
					sb.append("_");
				}
				sb.append(Character.toLowerCase(c));
				j = i+1;
			}
		}
		sb.append(camelcase.substring(j));
		return new String(sb);
	}
	
	public String capitalize(String s) {
		if(s=="") return "";
		char first = s.charAt(0);
	    char upperFirst = Character.toUpperCase(first);
		if(s.length()==1) return String.valueOf(upperFirst);
		String rest = s.substring(1);
		return upperFirst + rest;
	}

	public String uncapitalize(String s) {
		if(s=="") return "";
		char first = s.charAt(0);
		char lowerFirst = Character.toLowerCase(first);
		if(s.length()==1) return String.valueOf(lowerFirst);
		String rest = s.substring(1);
		return lowerFirst + rest;
	}
	
}
