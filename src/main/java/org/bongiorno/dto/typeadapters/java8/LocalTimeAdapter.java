package org.bongiorno.dto.typeadapters.java8;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

/**
 * @author chribong
 */
public class LocalTimeAdapter extends AbstractJava8Adapter<LocalTime> {

    public LocalTimeAdapter() {
        formatter = DateTimeFormatter.ISO_LOCAL_TIME;
    }

    public LocalTimeAdapter(String format) {
        this.formatter = DateTimeFormatter.ofPattern(format);
    }

    @Override
    protected LocalTime parse(String time) {
        return LocalTime.parse(time, formatter);
    }
}
