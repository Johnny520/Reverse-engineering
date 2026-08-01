package org.simpleframework.xml.stream;

import org.simpleframework.xml.stream.Node;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public interface NodeMap<T extends org.simpleframework.xml.stream.Node> extends java.lang.Iterable<java.lang.String> {
    T get(java.lang.String r1);

    java.lang.String getName();

    T getNode();

    @Override // java.lang.Iterable
    java.util.Iterator<java.lang.String> iterator();

    T put(java.lang.String r1, java.lang.String r2);

    T remove(java.lang.String r1);
}
