package seedu.duke;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class DataReaderTest {
    @Test
    public void getUniversitiesTest() {
        DataReader dataReader = new DataReader();
        assertEquals(5, dataReader.getUniversities().size());
    }
}
