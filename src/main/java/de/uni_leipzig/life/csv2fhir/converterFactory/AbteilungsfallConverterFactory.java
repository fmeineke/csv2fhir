package de.uni_leipzig.life.csv2fhir.converterFactory;

import de.uni_leipzig.life.csv2fhir.Converter;
import de.uni_leipzig.life.csv2fhir.ConverterFactory;
import de.uni_leipzig.life.csv2fhir.converter.AbteilungsfallConverter;
import org.apache.commons.csv.CSVRecord;

public class AbteilungsfallConverterFactory implements ConverterFactory {

    private static final String[] NEEDED_COLUMNS = {"Patient-ID", "Startdatum", "Enddatum", "Fachabteilung"};

    @Override
    public Converter create(CSVRecord record) {
        return new AbteilungsfallConverter(record);
    }

    @Override
    public String[] getNeededColumnNames() {
        return NEEDED_COLUMNS;
    }
}
