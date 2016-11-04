package co.jp.favoriteigo.util;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

/**
 * プロパティユーティリティークラス
 * @author イッシー
 * @version1.0
 * @since 2016/11
 */
public class PropertyUtil {

    private static final String FILE_PATH = "C:/Users/favor/Desktop/ServletApp/properties/system.properties";

    /**
     * コンストラクター
     */
    private PropertyUtil() {

    }

    public static String readProperty() {
         Properties properties = new Properties();

         try(InputStream is = new FileInputStream(FILE_PATH)) {

             properties.load(is);
             properties.getProperty("id");

         } catch(Exception e) {
             e.getMessage();
         }
         return properties.getProperty("db");
    }

}
