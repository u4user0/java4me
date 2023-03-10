import java.io.IOException;
import org.apache.pdfbox.pdmodel.PDDocument;
public class Create_Pdf {
public static void main(String[] args) throws IOException {
	PDDocument doc = new PDDocument();
	doc.save("Destination/blank.pdf");
	System.out.println("PDF created");
	doc.close();
}
}
