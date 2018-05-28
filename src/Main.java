import com.opencsv.CSVReader;
import com.opencsv.ResultSetColumnNameHelperService;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        CSVReader seznam = new CSVReader(new FileReader("resources/seznam.csv"), ';');
        CSVReader konGly = new CSVReader(new FileReader("resources/DataKonverzeGlyconect.csv"), ';');
        CSVReader konUni = new CSVReader(new FileReader("resources/DataKonverzeUnicarb.csv"), ';');
        CSVReader toucan = new CSVReader(new FileReader("resources/glytoucan.csv"), ';');
        CSVReader metaGly = new CSVReader(new FileReader("resources/DataMetaGlyconect.csv"), ';');
        CSVReader metaUni = new CSVReader(new FileReader("resources/DataMetaUnicarb.csv"), ';');
        String [] newLine;
        List<String []> seznamList = seznam.readAll(); /*idGly, GlycoCT accnum*/
        List<String []> konGlyList= konGly.readAll(); /*idGly, Inchi, Inchikey smiles*/
        List<String []> konUniList= konUni.readAll();/*idGly, Inchi, Inchikey smiles*/
        List<String []> toucanList= toucan.readAll(); /*accnum, entryURL, toucanCID, url*/
        List<String []> metaGlyList= metaGly.readAll(); /*metaGlyCID metaGlyId conectionGly, identconGly */
        List<String []> metaUniList= metaUni.readAll(); /*metaUniCID metaUniId conectionUni, identconUni */


        for (var entry: konGlyList) {
            for (var Unientry: konUniList){
                if (entry[1].equals(Unientry[1])){
               /*     if(seznamList)
                    System.out.println("huuda");*/
                }
            }

          /*  if (konUniList.contains(entry[1])){
                var kon = konUniList.indexOf(entry[1]);
                var kolist = konUniList.get(konUniList.indexOf(entry[1]));
                System.out.println(kolist);
                System.out.println("assd");
*/
            }
          /*  System.out.println(entry);*/
            
                System.out.println("oazse");
    /*    while ((newLine = seznam.readNext()) != null) {
            var idSeznam = newLine[0];
            var GlycoCTSeznam = newLine[1];
            var refSeznam = newLine[2];

        }
       while ((newLine = konGly.readNext()) != null) {
            var idKonGly = newLine[0];
            var InChIKonGly = newLine[1];
            var InChIKeyKonGly = newLine[2];
            var SmilesKonGly = newLine[3];
        }
        while ((newLine = konUni.readNext()) != null) {
            var idKonUni = newLine[0];
            var InChIKonUni = newLine[1];
            var InChIKeyKonUni = newLine[2];
            var SmilesKonUni = newLine[3];
        }
        while ((newLine = toucan.readNext()) != null){
            var accnum = newLine[0];
            var entrylabel = newLine[1];
            var toucanCID = newLine[2];
            var url = newLine[3];
        }
        while ((newLine = metaGly.readNext()) != null){
            var metaGlyCID = newLine[0];
            var metaGlyId = newLine[1];
            var conectionGly = newLine[2];
            var identconGly = newLine[3];
        }
        while ((newLine = metaUni.readNext()) != null){
            var metaUniCID = newLine[0];
            var metaUniId = newLine[1];
            var conectionUni = newLine[2];
            var identconUni = newLine[3];
        }*/


    }
}
