package org.simpleframework.xml;

/* JADX INFO: loaded from: classes2.dex */
public interface Serializer {
    <T> T read(java.lang.Class<? extends T> r1, java.io.File r2) throws java.lang.Exception;

    <T> T read(java.lang.Class<? extends T> r1, java.io.File r2, boolean r3) throws java.lang.Exception;

    <T> T read(java.lang.Class<? extends T> r1, java.io.InputStream r2) throws java.lang.Exception;

    <T> T read(java.lang.Class<? extends T> r1, java.io.InputStream r2, boolean r3) throws java.lang.Exception;

    <T> T read(java.lang.Class<? extends T> r1, java.io.Reader r2) throws java.lang.Exception;

    <T> T read(java.lang.Class<? extends T> r1, java.io.Reader r2, boolean r3) throws java.lang.Exception;

    <T> T read(java.lang.Class<? extends T> r1, java.lang.String r2) throws java.lang.Exception;

    <T> T read(java.lang.Class<? extends T> r1, java.lang.String r2, boolean r3) throws java.lang.Exception;

    <T> T read(java.lang.Class<? extends T> r1, org.simpleframework.xml.stream.InputNode r2) throws java.lang.Exception;

    <T> T read(java.lang.Class<? extends T> r1, org.simpleframework.xml.stream.InputNode r2, boolean r3) throws java.lang.Exception;

    <T> T read(T r1, java.io.File r2) throws java.lang.Exception;

    <T> T read(T r1, java.io.File r2, boolean r3) throws java.lang.Exception;

    <T> T read(T r1, java.io.InputStream r2) throws java.lang.Exception;

    <T> T read(T r1, java.io.InputStream r2, boolean r3) throws java.lang.Exception;

    <T> T read(T r1, java.io.Reader r2) throws java.lang.Exception;

    <T> T read(T r1, java.io.Reader r2, boolean r3) throws java.lang.Exception;

    <T> T read(T r1, java.lang.String r2) throws java.lang.Exception;

    <T> T read(T r1, java.lang.String r2, boolean r3) throws java.lang.Exception;

    <T> T read(T r1, org.simpleframework.xml.stream.InputNode r2) throws java.lang.Exception;

    <T> T read(T r1, org.simpleframework.xml.stream.InputNode r2, boolean r3) throws java.lang.Exception;

    boolean validate(java.lang.Class r1, java.io.File r2) throws java.lang.Exception;

    boolean validate(java.lang.Class r1, java.io.File r2, boolean r3) throws java.lang.Exception;

    boolean validate(java.lang.Class r1, java.io.InputStream r2) throws java.lang.Exception;

    boolean validate(java.lang.Class r1, java.io.InputStream r2, boolean r3) throws java.lang.Exception;

    boolean validate(java.lang.Class r1, java.io.Reader r2) throws java.lang.Exception;

    boolean validate(java.lang.Class r1, java.io.Reader r2, boolean r3) throws java.lang.Exception;

    boolean validate(java.lang.Class r1, java.lang.String r2) throws java.lang.Exception;

    boolean validate(java.lang.Class r1, java.lang.String r2, boolean r3) throws java.lang.Exception;

    boolean validate(java.lang.Class r1, org.simpleframework.xml.stream.InputNode r2) throws java.lang.Exception;

    boolean validate(java.lang.Class r1, org.simpleframework.xml.stream.InputNode r2, boolean r3) throws java.lang.Exception;

    void write(java.lang.Object r1, java.io.File r2) throws java.lang.Exception;

    void write(java.lang.Object r1, java.io.OutputStream r2) throws java.lang.Exception;

    void write(java.lang.Object r1, java.io.Writer r2) throws java.lang.Exception;

    void write(java.lang.Object r1, org.simpleframework.xml.stream.OutputNode r2) throws java.lang.Exception;
}
