package org.simpleframework.xml.stream;

import org.simpleframework.xml.stream.Node;

/* JADX INFO: loaded from: classes2.dex */
public interface NodeMap<T extends org.simpleframework.xml.stream.Node> extends java.lang.Iterable<java.lang.String> {
    T get(java.lang.String r1);

    java.lang.String getName();

    T getNode();

    @Override // java.lang.Iterable
    java.util.Iterator<java.lang.String> iterator();

    T put(java.lang.String r1, java.lang.String r2);

    T remove(java.lang.String r1);
}
