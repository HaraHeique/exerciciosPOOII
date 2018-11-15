package templateexemplo;
import templatemethodarquivos.*;

public class TemplateMain {

    public static void main(String[] args) {

        ExportFiles exportHtml = new ArquivoHtml();
        ExportFiles exportWord = new ArquivoWord();
        
        String texto = "linha 1\nlinha2\nfim\n";
        exportHtml.export(texto);
        exportWord.export(texto);
    }
}
