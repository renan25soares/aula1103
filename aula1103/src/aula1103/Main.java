package aula1103;

import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.JOptionPane;

import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfWriter;

public class Main {
	public void createPDF() {
		String fileName = JOptionPane.showInputDialog("nome do arquivo");
		String pathFile = "/home/alunos/Documentos/aula1103/aula1103" + fileName;

		Document document = new Document();
		try {
			PdfWriter.getInstance(document, new FileOutputStream(pathFile + ".pdf"));
			document.open();
			document.add(new Paragraph("exemplo simples"));
			document.close();
			JOptionPane.showMessageDialog(null,"arquivo salvo com sucesso");
		} catch (DocumentException de){
			System.out.println(de.getMessage());		
		} catch (IOException ioe) {
			System.out.println(ioe.getMessage());
		}

	}
	
	public static void main (String[] args) {
		Main m = new Main();
		m.createPDF();
	}


}
