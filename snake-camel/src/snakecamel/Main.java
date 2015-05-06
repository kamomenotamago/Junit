package snakecamel;

public class Main {
	public static void main(String[] args){
		SnakeCamelUtil scu = new SnakeCamelUtil();
		System.out.println(scu.capitalize(""));//空
		System.out.println(scu.capitalize("a"));//A
		System.out.println(scu.capitalize("xyz"));//Xyz
		
		System.out.println(scu.uncapitalize(""));//空
		System.out.println(scu.uncapitalize("A"));//a
		System.out.println(scu.uncapitalize("Xyz"));//xyz
		
		System.out.println(scu.snakeToCamelcase("abc"));//Abc
		System.out.println(scu.snakeToCamelcase("abc_def"));//AbcDef
		System.out.println(scu.snakeToCamelcase("abc_def_gh"));//AbcDefGh
		System.out.println(scu.snakeToCamelcase("abc__def___gh"));//AbcDefGh
		System.out.println(scu.snakeToCamelcase("_abc_def__"));//AbcDef
		
		System.out.println(scu.camelToSnakecase("Abc"));//abc
		System.out.println(scu.camelToSnakecase("AbcDef"));//abc_def
		System.out.println(scu.camelToSnakecase("AbcDefGh"));//abc_def_gh
	}
}
