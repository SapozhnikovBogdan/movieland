package com.sapozhnikov.movieland.common;

import java.beans.PropertyEditorSupport;

public class SortDirectionConverter extends PropertyEditorSupport {

    public void setAsText(final String text) throws IllegalArgumentException {
        setValue(SortDirection.getByName(text));
    }
}
