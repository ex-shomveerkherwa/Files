package com.som.home.copy;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;

import com.som.home.Utility.Timers;

public class Copy {

	public Copy(String source, String destination) {
		super();
		this.source = source;
		this.destination = destination;
	}

	public boolean isDone = false;
	public String source;
	public String destination;
	
	public void FileCopy()  {
		System.out.println(Thread.currentThread().getName());
		try(BufferedInputStream bufferedInputStream = (BufferedInputStream) new File(source).toURI().toURL().openStream();
			FileOutputStream  fileOutBuffer = new FileOutputStream(destination);)
		{
			byte[] dataBuffer = new byte[1024];
			
			int bytesRead=0;
			while((bytesRead = bufferedInputStream.read(dataBuffer, 0, 1024)) != -1) {
				fileOutBuffer.write(dataBuffer, 0, bytesRead);
			}
			isDone=true;
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void FolderCopy() {
		
	}
}
