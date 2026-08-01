package org.simpleframework.xml.convert;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public interface Converter<T> {
    T read(org.simpleframework.xml.stream.InputNode r1);

    void write(org.simpleframework.xml.stream.OutputNode r1, T r2);
}
