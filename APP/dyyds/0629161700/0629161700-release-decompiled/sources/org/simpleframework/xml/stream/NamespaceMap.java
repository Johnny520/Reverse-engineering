package org.simpleframework.xml.stream;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public interface NamespaceMap extends java.lang.Iterable<java.lang.String> {
    java.lang.String getPrefix();

    java.lang.String getPrefix(java.lang.String r1);

    java.lang.String getReference(java.lang.String r1);

    @Override // java.lang.Iterable
    java.util.Iterator<java.lang.String> iterator();

    java.lang.String setReference(java.lang.String r1);

    java.lang.String setReference(java.lang.String r1, java.lang.String r2);
}
