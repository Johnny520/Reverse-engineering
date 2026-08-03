package org.simpleframework.xml.core;

/* JADX INFO: loaded from: classes2.dex */
class ParameterMap extends java.util.LinkedHashMap<java.lang.Object, org.simpleframework.xml.core.Parameter> implements java.lang.Iterable<org.simpleframework.xml.core.Parameter> {
    public ParameterMap() {
            r0 = this;
            r0.<init>()
            return
    }

    public org.simpleframework.xml.core.Parameter get(int r2) {
            r1 = this;
            java.util.List r0 = r1.getAll()
            java.lang.Object r2 = r0.get(r2)
            org.simpleframework.xml.core.Parameter r2 = (org.simpleframework.xml.core.Parameter) r2
            return r2
    }

    public java.util.List<org.simpleframework.xml.core.Parameter> getAll() {
            r2 = this;
            java.util.Collection r0 = r2.values()
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L10
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            return r1
        L10:
            java.util.List r0 = java.util.Collections.emptyList()
            return r0
    }

    @Override // java.lang.Iterable
    public java.util.Iterator<org.simpleframework.xml.core.Parameter> iterator() {
            r1 = this;
            java.util.Collection r0 = r1.values()
            java.util.Iterator r0 = r0.iterator()
            return r0
    }
}
