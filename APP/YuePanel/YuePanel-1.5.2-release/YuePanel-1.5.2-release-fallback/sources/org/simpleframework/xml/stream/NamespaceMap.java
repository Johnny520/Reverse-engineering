package org.simpleframework.xml.stream;

/* JADX INFO: loaded from: classes2.dex */
public interface NamespaceMap extends java.lang.Iterable<java.lang.String> {
    java.lang.String getPrefix();

    java.lang.String getPrefix(java.lang.String r1);

    java.lang.String getReference(java.lang.String r1);

    @Override // java.lang.Iterable
    java.util.Iterator<java.lang.String> iterator();

    java.lang.String setReference(java.lang.String r1);

    java.lang.String setReference(java.lang.String r1, java.lang.String r2);
}
