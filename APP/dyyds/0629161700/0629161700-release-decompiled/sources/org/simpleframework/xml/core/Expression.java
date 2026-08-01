package org.simpleframework.xml.core;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
interface Expression extends java.lang.Iterable<java.lang.String> {
    java.lang.String getAttribute(java.lang.String r1);

    java.lang.String getElement(java.lang.String r1);

    java.lang.String getFirst();

    int getIndex();

    java.lang.String getLast();

    java.lang.String getPath();

    org.simpleframework.xml.core.Expression getPath(int r1);

    org.simpleframework.xml.core.Expression getPath(int r1, int r2);

    java.lang.String getPrefix();

    boolean isAttribute();

    boolean isEmpty();

    boolean isPath();

    java.lang.String toString();
}
