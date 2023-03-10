import java.io.IOException;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;

public class Add_Pages {

public static void main(String args[]) throws IOException {
	PDDocument document = new PDDocument();
	for (int i=0; i<10; i++) {
		PDPage blankPage = new PDPage();
		document.addPage( blankPage );
	}
	document.save("Destination/blank.pdf");
	System.out.println("PDF created");
	document.close();
}
}
