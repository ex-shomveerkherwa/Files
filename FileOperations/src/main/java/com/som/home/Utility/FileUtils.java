package com.som.home.Utility;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileUtils {

	public static final String fileName = "C:\\Users\\kherws\\Downloads\\GOT.mkv";
	public static final String folderName = "C:\\Users\\kherws\\Desktop\\jaggu";
	public static final String destination = "Copied";
	
	public static List<File> GetFilenamesFromFolder() {
		File[] files = new File(folderName).listFiles();
		return Arrays.asList(files);
	}
}
