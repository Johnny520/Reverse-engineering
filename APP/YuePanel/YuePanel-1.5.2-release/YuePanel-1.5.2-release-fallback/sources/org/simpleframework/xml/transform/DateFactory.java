package org.simpleframework.xml.transform;

import java.util.Date;

/* JADX INFO: loaded from: classes2.dex */
class DateFactory<T extends java.util.Date> {
    private final java.lang.reflect.Constructor<T> factory;

    public DateFactory(java.lang.Class<T> r2) throws java.lang.Exception {
            r1 = this;
            java.lang.Class r0 = java.lang.Long.TYPE
            java.lang.Class[] r0 = new java.lang.Class[]{r0}
            r1.<init>(r2, r0)
            return
    }

    public DateFactory(java.lang.Class<T> r1, java.lang.Class... r2) throws java.lang.Exception {
            r0 = this;
            r0.<init>()
            java.lang.reflect.Constructor r1 = r1.getDeclaredConstructor(r2)
            r0.factory = r1
            return
    }

    public T getInstance(java.lang.Object... r2) throws java.lang.Exception {
            r1 = this;
            java.lang.reflect.Constructor<T extends java.util.Date> r0 = r1.factory
            java.lang.Object r2 = r0.newInstance(r2)
            java.util.Date r2 = (java.util.Date) r2
            return r2
    }
}
