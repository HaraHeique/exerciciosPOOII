package templatemethodarquivos;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import org.apache.poi.xwpf.usermodel.XWPFDocument;

/*Esse codigo não estah mais uma bangunca..*/
public abstract class ExportFiles {
    
    protected BufferedWriter out = null;
    protected XWPFDocument document;
    protected FileOutputStream out1 = null;
    
    protected abstract void printLine(String linha);
    protected abstract void save();
    
    public void export(String txt){
        String[] txtLinhas = txt.split("\n");
        for(Object linhas : txtLinhas )
        {
            printLine((String)linhas);
        }   
        save();   
    }
}
