package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TesteEscritaFileWriter {

	public static void main(String[] args) throws IOException {

		//Fluxo de Entrada com Arquivo
//		OutputStream fos = new FileOutputStream("lorem2.txt");
//		Writer osw = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(osw);
	
		BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));
		bw.write("dshsdfhfs gfdgsdfgdsfg dsfgsadg dsfdh");
		bw.newLine();
		bw.newLine();
		bw.write("dsfhgsdfh");
		
		bw.close();
		
	}
}
