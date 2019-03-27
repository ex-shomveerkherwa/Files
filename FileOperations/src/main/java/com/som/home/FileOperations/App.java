package com.som.home.FileOperations;

import java.io.File;
import java.nio.file.Files;
import java.util.List;

import com.som.home.Utility.FileUtils;
import com.som.home.Utility.Timers;
import com.som.home.copy.Copy;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
       // copySingleLargeFile();
        copyFolder();
	
    }

	private static void copyFolder() {
		
		List<File> filesToCopy = FileUtils.GetFilenamesFromFolder();
		int nameIndex=0;
		
		System.out.println(Timers.getStartTime());
		long startTime = Timers.getCurrentTimeInLong();
		
		for(File file : filesToCopy) {
			System.out.println("copying "+file.getAbsolutePath());
			Copy copy = new Copy(file.getAbsolutePath(),FileUtils.destination+"folder"+nameIndex++);
			copy.FileCopy();
		}
		
		long endTime = Timers.getCurrentTimeInLong();
		long totalTime =  endTime-startTime;
		System.out.println("TimeTaken "+totalTime);
		System.out.println(Timers.getEndTime());
		
	}

	private static void copySingleLargeFile() {
		Copy copy = new Copy(FileUtils.fileName, FileUtils.destination);
        String start = Timers.getStartTime();
		System.out.println(start);
		copy.FileCopy();
		
		String end = Timers.getEndTime();
		System.out.println(end);
	}
}
