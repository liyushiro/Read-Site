package br.com.chikasawa.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LeituraDeArquivo {
	
	private final String SPACE = " ";
	
	public String[] readFile(String fileName) throws IOException {
		 
        BufferedReader br = new BufferedReader(new FileReader(
                new File(fileName)));
 
        String text = br.readLine();
 
        return text.split(SPACE);
    }
	
	public String[] readFile1(String fileName) throws IOException {
		 
        BufferedReader br = new BufferedReader(new FileReader(
                new File(fileName)));
 
        String text = br.readLine();
 
        return text.split(SPACE);
    }
 

}
