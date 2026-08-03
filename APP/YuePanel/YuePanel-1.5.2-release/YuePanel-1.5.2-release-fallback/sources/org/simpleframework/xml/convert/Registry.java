package org.simpleframework.xml.convert;

/* JADX INFO: loaded from: classes2.dex */
public class Registry {
    private final org.simpleframework.xml.convert.RegistryBinder binder;
    private final org.simpleframework.xml.util.Cache<org.simpleframework.xml.convert.Converter> cache;

    public Registry() {
            r1 = this;
            r1.<init>()
            org.simpleframework.xml.util.ConcurrentCache r0 = new org.simpleframework.xml.util.ConcurrentCache
            r0.<init>()
            r1.cache = r0
            org.simpleframework.xml.convert.RegistryBinder r0 = new org.simpleframework.xml.convert.RegistryBinder
            r0.<init>()
            r1.binder = r0
            return
    }

    private org.simpleframework.xml.convert.Converter create(java.lang.Class r3) throws java.lang.Exception {
            r2 = this;
            org.simpleframework.xml.convert.RegistryBinder r0 = r2.binder
            org.simpleframework.xml.convert.Converter r0 = r0.lookup(r3)
            if (r0 == 0) goto Ld
            org.simpleframework.xml.util.Cache<org.simpleframework.xml.convert.Converter> r1 = r2.cache
            r1.cache(r3, r0)
        Ld:
            return r0
    }

    public org.simpleframework.xml.convert.Registry bind(java.lang.Class r2, java.lang.Class r3) throws java.lang.Exception {
            r1 = this;
            if (r2 == 0) goto L7
            org.simpleframework.xml.convert.RegistryBinder r0 = r1.binder
            r0.bind(r2, r3)
        L7:
            return r1
    }

    public org.simpleframework.xml.convert.Registry bind(java.lang.Class r2, org.simpleframework.xml.convert.Converter r3) throws java.lang.Exception {
            r1 = this;
            if (r2 == 0) goto L7
            org.simpleframework.xml.util.Cache<org.simpleframework.xml.convert.Converter> r0 = r1.cache
            r0.cache(r2, r3)
        L7:
            return r1
    }

    public org.simpleframework.xml.convert.Converter lookup(java.lang.Class r2) throws java.lang.Exception {
            r1 = this;
            org.simpleframework.xml.util.Cache<org.simpleframework.xml.convert.Converter> r0 = r1.cache
            java.lang.Object r0 = r0.fetch(r2)
            org.simpleframework.xml.convert.Converter r0 = (org.simpleframework.xml.convert.Converter) r0
            if (r0 != 0) goto Lf
            org.simpleframework.xml.convert.Converter r2 = r1.create(r2)
            return r2
        Lf:
            return r0
    }
}
