package com.sgtesting.tests;

public class ExecuteAutoitScriptDemo {
	public static void main(String[] args) {
		executeDemo();
	}
	private static void executeDemo()
	{
		try
		{
			String path="C:\\Autoit\\SampleMsg.exe";
					Runtime.getRuntime().exec(path);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
