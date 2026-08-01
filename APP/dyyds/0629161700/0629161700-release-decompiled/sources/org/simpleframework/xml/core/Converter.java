package org.simpleframework.xml.core;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
interface Converter {
    java.lang.Object read(org.simpleframework.xml.stream.InputNode r1);

    java.lang.Object read(org.simpleframework.xml.stream.InputNode r1, java.lang.Object r2);

    boolean validate(org.simpleframework.xml.stream.InputNode r1);

    void write(org.simpleframework.xml.stream.OutputNode r1, java.lang.Object r2);
}
