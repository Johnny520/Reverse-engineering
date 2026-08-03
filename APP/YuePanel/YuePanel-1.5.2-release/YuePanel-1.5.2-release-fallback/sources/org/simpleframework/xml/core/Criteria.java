package org.simpleframework.xml.core;

/* JADX INFO: loaded from: classes2.dex */
interface Criteria extends java.lang.Iterable<java.lang.Object> {
    void commit(java.lang.Object r1) throws java.lang.Exception;

    org.simpleframework.xml.core.Variable get(java.lang.Object r1) throws java.lang.Exception;

    org.simpleframework.xml.core.Variable get(org.simpleframework.xml.core.Label r1) throws java.lang.Exception;

    org.simpleframework.xml.core.Variable remove(java.lang.Object r1) throws java.lang.Exception;

    org.simpleframework.xml.core.Variable resolve(java.lang.String r1) throws java.lang.Exception;

    void set(org.simpleframework.xml.core.Label r1, java.lang.Object r2) throws java.lang.Exception;
}
