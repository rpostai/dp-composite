package com.rp.composite;


public abstract class AbstractFile {

	private final String name;

	public AbstractFile(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}
	
	public abstract void ls();
}
