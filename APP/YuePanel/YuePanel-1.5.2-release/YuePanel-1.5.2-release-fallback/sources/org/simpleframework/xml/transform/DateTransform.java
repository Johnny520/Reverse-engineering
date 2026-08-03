package org.simpleframework.xml.transform;

import java.util.Date;

/* JADX INFO: loaded from: classes2.dex */
class DateTransform<T extends java.util.Date> implements org.simpleframework.xml.transform.Transform<T> {
    private final org.simpleframework.xml.transform.DateFactory<T> factory;

    public DateTransform(java.lang.Class<T> r2) throws java.lang.Exception {
            r1 = this;
            r1.<init>()
            org.simpleframework.xml.transform.DateFactory r0 = new org.simpleframework.xml.transform.DateFactory
            r0.<init>(r2)
            r1.factory = r0
            return
    }

    @Override // org.simpleframework.xml.transform.Transform
    public /* bridge */ /* synthetic */ java.lang.Object read(java.lang.String r1) throws java.lang.Exception {
            r0 = this;
            java.util.Date r1 = r0.read(r1)
            return r1
    }

    @Override // org.simpleframework.xml.transform.Transform
    public synchronized T read(java.lang.String r3) throws java.lang.Exception {
            r2 = this;
            monitor-enter(r2)
            java.util.Date r3 = org.simpleframework.xml.transform.DateType.getDate(r3)     // Catch: java.lang.Throwable -> L19
            long r0 = r3.getTime()     // Catch: java.lang.Throwable -> L19
            java.lang.Long r3 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Throwable -> L19
            org.simpleframework.xml.transform.DateFactory<T extends java.util.Date> r0 = r2.factory     // Catch: java.lang.Throwable -> L19
            java.lang.Object[] r3 = new java.lang.Object[]{r3}     // Catch: java.lang.Throwable -> L19
            java.util.Date r3 = r0.getInstance(r3)     // Catch: java.lang.Throwable -> L19
            monitor-exit(r2)
            return r3
        L19:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L19
            throw r3
    }

    @Override // org.simpleframework.xml.transform.Transform
    public /* bridge */ /* synthetic */ java.lang.String write(java.lang.Object r1) throws java.lang.Exception {
            r0 = this;
            java.util.Date r1 = (java.util.Date) r1
            java.lang.String r1 = r0.write(r1)
            return r1
    }

    public synchronized java.lang.String write(T r1) throws java.lang.Exception {
            r0 = this;
            monitor-enter(r0)
            java.lang.String r1 = org.simpleframework.xml.transform.DateType.getText(r1)     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)
            return r1
        L7:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r1
    }
}
