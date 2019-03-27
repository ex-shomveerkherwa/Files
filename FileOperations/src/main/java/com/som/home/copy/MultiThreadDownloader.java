package com.som.home.copy;

public class MultiThreadDownloader implements Runnable{

	public MultiThreadDownloader(String source, String destination) {
		super();
		this.source = source;
		this.destination = destination;
	}

	public String source;
	public String destination;
	
	@Override
	public void run() {
		
		new Copy(source,destination).FileCopy();
	}

}
