package com.rp.composite;

public class Sistema {
	
	public static void main(String[] args) {
		Folder dir = new Folder("\\");
		File   file = new File("teste.txt");
		dir.add(file);
		
		Folder dir2 = new Folder("home");
		dir.add(dir2);
		
		dir2.add(new Folder("rodrigo"));
		
		dir.ls();
	}

}
