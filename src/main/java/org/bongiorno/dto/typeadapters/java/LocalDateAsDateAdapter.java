package org.bongiorno.dto.typeadapters.java;

import java.lang.String;import java.text.SimpleDateFormat;

public class LocalDateAsDateAdapter extends AbstractDateAdapter {


    public LocalDateAsDateAdapter(){
        super("yyyyMMdd");
    }

    public LocalDateAsDateAdapter(String format) {
        super(format);
    }

}
