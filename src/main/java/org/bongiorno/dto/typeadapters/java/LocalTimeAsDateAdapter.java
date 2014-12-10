package org.bongiorno.dto.typeadapters.java;

public class LocalTimeAsDateAdapter extends AbstractDateAdapter {


    public LocalTimeAsDateAdapter(){
        super("HHmm");
    }

    public LocalTimeAsDateAdapter(String format) {
        super(format);
    }


}
