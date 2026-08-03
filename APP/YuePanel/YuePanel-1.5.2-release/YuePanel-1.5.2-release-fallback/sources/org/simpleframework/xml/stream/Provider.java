package org.simpleframework.xml.stream;

/* JADX INFO: loaded from: classes2.dex */
interface Provider {
    org.simpleframework.xml.stream.EventReader provide(java.io.InputStream r1) throws java.lang.Exception;

    org.simpleframework.xml.stream.EventReader provide(java.io.Reader r1) throws java.lang.Exception;
}
