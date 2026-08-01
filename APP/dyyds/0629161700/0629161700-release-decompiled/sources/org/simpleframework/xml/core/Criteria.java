package org.simpleframework.xml.core;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
interface Criteria extends java.lang.Iterable<java.lang.Object> {
    void commit(java.lang.Object r1);

    org.simpleframework.xml.core.Variable get(java.lang.Object r1);

    org.simpleframework.xml.core.Variable get(org.simpleframework.xml.core.Label r1);

    org.simpleframework.xml.core.Variable remove(java.lang.Object r1);

    org.simpleframework.xml.core.Variable resolve(java.lang.String r1);

    void set(org.simpleframework.xml.core.Label r1, java.lang.Object r2);
}
