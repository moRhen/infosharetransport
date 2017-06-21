import com.fasterxml.jackson.databind.ObjectMapper;
import dataStructure.WholeFile;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import java.io.IOException;

@Startup
@Singleton
public class LoadDataOnStart {

    private WholeFile wholeFile;
    private static final String JSON_FILE_NAME = "data.json";

    @PostConstruct
    public void readJsonFile() {
        ObjectMapper objectMapper = new ObjectMapper();
//        objectMapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);

        try {
            wholeFile = objectMapper
                    .readValue(LoadDataOnStart.class.getClassLoader()
                            .getResource(JSON_FILE_NAME), WholeFile.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public WholeFile getWholeFile() {
        return wholeFile;
    }
}
