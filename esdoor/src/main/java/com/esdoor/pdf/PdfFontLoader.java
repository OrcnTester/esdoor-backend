package com.esdoor.pdf;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.font.PDType0Font;
import java.io.IOException;

public class PdfFontLoader {
    public static PDType0Font loadDejaVu(PDDocument doc) throws IOException {
        return PDType0Font.load(
                doc,
                PdfFontLoader.class.getResourceAsStream("/fonts/DejaVuSans.ttf"),
                true
        );
    }
}
