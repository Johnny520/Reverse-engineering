package org.simpleframework.xml.core;

/* JADX INFO: loaded from: classes2.dex */
interface Converter {
    java.lang.Object read(org.simpleframework.xml.stream.InputNode r1) throws java.lang.Exception;

    java.lang.Object read(org.simpleframework.xml.stream.InputNode r1, java.lang.Object r2) throws java.lang.Exception;

    boolean validate(org.simpleframework.xml.stream.InputNode r1) throws java.lang.Exception;

    void write(org.simpleframework.xml.stream.OutputNode r1, java.lang.Object r2) throws java.lang.Exception;
}
