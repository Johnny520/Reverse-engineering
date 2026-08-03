package org.simpleframework.xml.convert;

/* JADX INFO: loaded from: classes2.dex */
public interface Converter<T> {
    T read(org.simpleframework.xml.stream.InputNode r1) throws java.lang.Exception;

    void write(org.simpleframework.xml.stream.OutputNode r1, T r2) throws java.lang.Exception;
}
