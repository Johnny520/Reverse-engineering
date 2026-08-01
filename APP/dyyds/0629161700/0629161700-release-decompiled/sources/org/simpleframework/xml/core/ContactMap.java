package org.simpleframework.xml.core;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
class ContactMap extends java.util.LinkedHashMap<java.lang.Object, org.simpleframework.xml.core.Contact> implements java.lang.Iterable<org.simpleframework.xml.core.Contact> {
    public ContactMap() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // java.lang.Iterable
    public java.util.Iterator<org.simpleframework.xml.core.Contact> iterator() {
            r0 = this;
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
            return r0
    }
}
