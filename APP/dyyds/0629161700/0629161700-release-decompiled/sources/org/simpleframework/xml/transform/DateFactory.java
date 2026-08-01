package org.simpleframework.xml.transform;

import java.util.Date;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
class DateFactory<T extends java.util.Date> {
    private final java.lang.reflect.Constructor<T> factory;

    public DateFactory(java.lang.Class<T> r2) {
            r1 = this;
            java.lang.Class r0 = java.lang.Long.TYPE
            java.lang.Class[] r0 = new java.lang.Class[]{r0}
            r1.<init>(r2, r0)
            return
    }

    public DateFactory(java.lang.Class<T> r1, java.lang.Class... r2) {
            r0 = this;
            r0.<init>()
            java.lang.reflect.Constructor r1 = r1.getDeclaredConstructor(r2)
            r0.factory = r1
            return
    }

    public T getInstance(java.lang.Object... r1) {
            r0 = this;
            java.lang.reflect.Constructor<T extends java.util.Date> r0 = r0.factory
            java.lang.Object r0 = r0.newInstance(r1)
            java.util.Date r0 = (java.util.Date) r0
            return r0
    }
}
