package sev.tryouts.stuff;

import org.fluttercode.datafactory.impl.DataFactory;

import java.util.ArrayList;
import java.util.List;

public class Something {

    public static List<String> createTestData(final int counter) {
        List<String> result = new ArrayList<String>();
        DataFactory dataFactory = new DataFactory();
        for (int i = 0; i < counter; i++) {
            result.add(String.format("%s %s is from %s and was born %s.",
                    dataFactory.getFirstName(),
                    dataFactory.getLastName(),
                    dataFactory.getCity(),
                    dataFactory.getBirthDate()));
        }
        return result;
    }

}
