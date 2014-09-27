package com.rp.composite;

public class File extends AbstractFile {
	
	public File(String name) {
		super(name);
	}

	@Override
	public void ls() {
		System.out.println("Arquivo: " + getName());
	}

}
