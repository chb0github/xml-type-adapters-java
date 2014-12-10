package org.bongiorno.dto.typeadapters.java8;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.IsoFields;
import java.time.temporal.TemporalField;
import java.util.Date;

/**
 * @author chribong
 */
public class LocalDateAdapter extends AbstractJava8Adapter<LocalDate> {

    public LocalDateAdapter() {
        super.formatter = DateTimeFormatter.ISO_LOCAL_DATE;
    }

    public LocalDateAdapter(String format) {
        super.formatter = DateTimeFormatter.ofPattern(format);
    }
    protected LocalDate parse(String time) {
        return LocalDate.parse(time, formatter);
    }

}
