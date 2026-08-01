package org.simpleframework.xml.core;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
class ParameterMap extends java.util.LinkedHashMap<java.lang.Object, org.simpleframework.xml.core.Parameter> implements java.lang.Iterable<org.simpleframework.xml.core.Parameter> {
    public ParameterMap() {
            r0 = this;
            r0.<init>()
            return
    }

    public org.simpleframework.xml.core.Parameter get(int r1) {
            r0 = this;
            java.util.List r0 = r0.getAll()
            java.lang.Object r0 = r0.get(r1)
            org.simpleframework.xml.core.Parameter r0 = (org.simpleframework.xml.core.Parameter) r0
            return r0
    }

    public java.util.List<org.simpleframework.xml.core.Parameter> getAll() {
            r1 = this;
            java.util.Collection r1 = r1.values()
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L10
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r1)
            return r0
        L10:
            java.util.List r1 = java.util.Collections.EMPTY_LIST
            return r1
    }

    @Override // java.lang.Iterable
    public java.util.Iterator<org.simpleframework.xml.core.Parameter> iterator() {
            r0 = this;
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
            return r0
    }
}
