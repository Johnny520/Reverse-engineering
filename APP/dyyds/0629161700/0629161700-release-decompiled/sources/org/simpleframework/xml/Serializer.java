package org.simpleframework.xml;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public interface Serializer {
    <T> T read(java.lang.Class<? extends T> r1, java.io.File r2);

    <T> T read(java.lang.Class<? extends T> r1, java.io.File r2, boolean r3);

    <T> T read(java.lang.Class<? extends T> r1, java.io.InputStream r2);

    <T> T read(java.lang.Class<? extends T> r1, java.io.InputStream r2, boolean r3);

    <T> T read(java.lang.Class<? extends T> r1, java.io.Reader r2);

    <T> T read(java.lang.Class<? extends T> r1, java.io.Reader r2, boolean r3);

    <T> T read(java.lang.Class<? extends T> r1, java.lang.String r2);

    <T> T read(java.lang.Class<? extends T> r1, java.lang.String r2, boolean r3);

    <T> T read(java.lang.Class<? extends T> r1, org.simpleframework.xml.stream.InputNode r2);

    <T> T read(java.lang.Class<? extends T> r1, org.simpleframework.xml.stream.InputNode r2, boolean r3);

    <T> T read(T r1, java.io.File r2);

    <T> T read(T r1, java.io.File r2, boolean r3);

    <T> T read(T r1, java.io.InputStream r2);

    <T> T read(T r1, java.io.InputStream r2, boolean r3);

    <T> T read(T r1, java.io.Reader r2);

    <T> T read(T r1, java.io.Reader r2, boolean r3);

    <T> T read(T r1, java.lang.String r2);

    <T> T read(T r1, java.lang.String r2, boolean r3);

    <T> T read(T r1, org.simpleframework.xml.stream.InputNode r2);

    <T> T read(T r1, org.simpleframework.xml.stream.InputNode r2, boolean r3);

    boolean validate(java.lang.Class r1, java.io.File r2);

    boolean validate(java.lang.Class r1, java.io.File r2, boolean r3);

    boolean validate(java.lang.Class r1, java.io.InputStream r2);

    boolean validate(java.lang.Class r1, java.io.InputStream r2, boolean r3);

    boolean validate(java.lang.Class r1, java.io.Reader r2);

    boolean validate(java.lang.Class r1, java.io.Reader r2, boolean r3);

    boolean validate(java.lang.Class r1, java.lang.String r2);

    boolean validate(java.lang.Class r1, java.lang.String r2, boolean r3);

    boolean validate(java.lang.Class r1, org.simpleframework.xml.stream.InputNode r2);

    boolean validate(java.lang.Class r1, org.simpleframework.xml.stream.InputNode r2, boolean r3);

    void write(java.lang.Object r1, java.io.File r2);

    void write(java.lang.Object r1, java.io.OutputStream r2);

    void write(java.lang.Object r1, java.io.Writer r2);

    void write(java.lang.Object r1, org.simpleframework.xml.stream.OutputNode r2);
}
