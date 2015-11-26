package org.test;

import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Wanglei on 15/11/2.
 */
public class TestSql {

    @Test
    public void genData() throws FileNotFoundException {
        String path= "/Users/wanglei/sql_follow.txt";

        File file=new File(path);
        FileOutputStream fop=new FileOutputStream(file);

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date now = new Date();
        String time = dateFormat.format(now);

        String crlf=System.getProperty("line.separator");
        try{
            if (!file.exists()) {
                file.createNewFile();
            }

            for(int i=0;i<1000000;i++){

//                生成用户关系
//                String content = (i+100 )+ "," + (i+99) +"," + time + "," + time + "," + 2 + "," + 0 + crlf;

//                生成followNumber
                for (int j = 0 ;j < 3 ;j++){
                    String content = i + "," + (i + 100 ) + "," + j + "," + 20 + "," +time + "," +time +crlf  ;
                    byte[] contents=content.getBytes();
                    fop.write(contents);
                }

            }
            fop.flush();
            fop.close();

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}
