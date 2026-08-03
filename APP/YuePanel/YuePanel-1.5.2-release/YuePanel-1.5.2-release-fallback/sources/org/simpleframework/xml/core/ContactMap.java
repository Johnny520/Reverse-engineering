package org.simpleframework.xml.core;

/* JADX INFO: loaded from: classes2.dex */
class ContactMap extends java.util.LinkedHashMap<java.lang.Object, org.simpleframework.xml.core.Contact> implements java.lang.Iterable<org.simpleframework.xml.core.Contact> {
    public ContactMap() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // java.lang.Iterable
    public java.util.Iterator<org.simpleframework.xml.core.Contact> iterator() {
            r1 = this;
            java.util.Collection r0 = r1.values()
            java.util.Iterator r0 = r0.iterator()
            return r0
    }
}
