package com.som.home.FileOperations;

import java.io.File;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import com.som.home.Utility.FileUtils;
import com.som.home.Utility.Timers;
import com.som.home.copy.Copy;
import com.som.home.copy.MultiThreadDownloader;

public class MultiThreadApp {

	static ExecutorService executors = Executors.newFixedThreadPool(6);
	
	 public static void main( String[] args ) throws InterruptedException
	    {
	       // copySingleLargeFile();
	        copyFolder();
		
	    }

		private static void copyFolder() throws InterruptedException {
			
			List<File> filesToCopy = FileUtils.GetFilenamesFromFolder();
			int nameIndex=0;
			System.out.println(Timers.getStartTime());
			
			long startTime = Timers.getCurrentTimeInLong();
			for(File file : filesToCopy) {
				System.out.println("copying "+file.getAbsolutePath());
				executors.submit(new MultiThreadDownloader(file.getAbsolutePath(),FileUtils.destination+"folder"+nameIndex++));
			}
			executors.shutdown();
			executors.awaitTermination(1, TimeUnit.DAYS );
			
			long endTime = Timers.getCurrentTimeInLong();
			long totalTime =  endTime-startTime;
			System.out.println("TimeTaken "+totalTime);
			System.out.println(Timers.getEndTime());
			
		}

}
