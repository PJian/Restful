package util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by peijia on 6/21/2016.
 */
public class ShellUtil {
    private static final Logger LOGGER = LoggerFactory.getLogger(ShellUtil.class);
    /**
     * 调用bat脚本
     *
     * @param fileName
     */
    public static boolean startShell(String fileName) {

        Runtime rn = Runtime.getRuntime();
        Process p = null;
        try {
            p = rn.exec(fileName);
            LOGGER.info(String.format("{0} executed success!"+fileName));
            return true;
        } catch (Exception e) {
            System.out.println("Error exec!");
            LOGGER.info(String.format("{0} executed failed!"+fileName));
            return false;
        }
    }

    public static String getAppPath(){
        String appPath = ShellUtil.class.getResource("/").getPath();
        appPath.substring(0,appPath.indexOf("tomcat"));
        return appPath;
    }
}
