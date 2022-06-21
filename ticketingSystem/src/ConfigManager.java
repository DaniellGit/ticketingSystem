import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigManager {



    ConfigManager() {


    }

    public static String getValue(String key) {

        Properties prop = new Properties();

        try (InputStream input = new FileInputStream("src/configs/config.properties")) {

            prop.load(input);

        } catch (IOException ex) {

            ex.printStackTrace();

        }

        return prop.getProperty(key);
    }

}
