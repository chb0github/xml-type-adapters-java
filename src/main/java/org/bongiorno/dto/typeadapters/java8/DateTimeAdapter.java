package org.bongiorno.dto.typeadapters.java8;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author chribong
 */
public class DateTimeAdapter extends AbstractJava8Adapter<LocalDateTime>{


    public DateTimeAdapter() {
        super.formatter = DateTimeFormatter.ISO_DATE_TIME;
    }

    public DateTimeAdapter(String format) {
        super.formatter = DateTimeFormatter.ofPattern(format);
    }

    @Override
    protected LocalDateTime parse(String time) {
        return LocalDateTime.parse(time,formatter);
    }
}
