package com.som.home.FileOperations;

import java.io.File;
import java.util.List;

import com.som.home.Utility.FileUtils;

public class FileUtilsTest {
	
	public static void main(String[] args) {
		List<File> files = FileUtils.GetFilenamesFromFolder();
		
		for(File file : files) {
			System.out.println(file.getAbsolutePath());
		}
	}

}
