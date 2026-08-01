package org.simpleframework.xml.stream;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
interface Provider {
    org.simpleframework.xml.stream.EventReader provide(java.io.InputStream r1);

    org.simpleframework.xml.stream.EventReader provide(java.io.Reader r1);
}
