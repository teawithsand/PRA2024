package introduction;

import org.apache.log4j.Logger;
import org.apache.log4j.Priority;

public class HelloWorld {

    private static Logger LOG = Logger.getLogger("name");

    public static void main(String [ ] args) {
        LOG.log(Priority.WARN, "asdf");
    }
}