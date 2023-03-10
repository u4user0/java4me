import java.io.File;
import java.io.IOException;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
public class Insert_Text {
public static void main(String[] args) throws IOException {
	PDDocument document = new PDDocument();
	PDPage page1 = new PDPage();
	document.addPage(page1);
	PDPageContentStream contentStream = new PDPageContentStream(document, page1);
	contentStream.beginText();
	contentStream.setFont(PDType1Font.TIMES_ROMAN,15);
	contentStream.newLineAtOffset(25, 500);
	contentStream.showText("My 1st line from pdfbox in java");
	contentStream.newLine();
	contentStream.endText();
	contentStream.close();
        document.save("Destination/blank.pdf");
        System.out.println("PDF created");
        document.close();
}
}
