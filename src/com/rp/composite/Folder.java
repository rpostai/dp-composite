package com.rp.composite;

import java.util.ArrayList;
import java.util.List;

public class Folder extends AbstractFile {
	
	private List<AbstractFile> files = new ArrayList<AbstractFile>();
	
	public Folder(String name) {
		super(name);
	}
	
	public void add(AbstractFile file) {
		files.add(file);
	}

	@Override
	public void ls() {
		System.out.println("Pasta: " + this.getName());
		for (AbstractFile f: files) {
			f.ls();
		}
	}

}
