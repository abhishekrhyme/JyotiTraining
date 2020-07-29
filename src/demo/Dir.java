package demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Dir {

	public static void main(String[] args) {
		
		String command = "dir";
        String location = "/Users/abhisheksen/My Computer/Drivers";
        String[] cmd = {command , location };

	try
	{
		Process process = Runtime.getRuntime().exec(cmd);

		BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
		String line;
		while ((line = reader.readLine()) != null) {
			System.out.println(line);
		}

		reader.close();

	}catch(IOException e)
	{
		e.printStackTrace();
	}
}}
