package org.simpleframework.xml.convert;

/* JADX INFO: loaded from: classes2.dex */
class RegistryBinder {
    private final org.simpleframework.xml.util.Cache<java.lang.Class> cache;
    private final org.simpleframework.xml.convert.ConverterFactory factory;

    public RegistryBinder() {
            r1 = this;
            r1.<init>()
            org.simpleframework.xml.util.ConcurrentCache r0 = new org.simpleframework.xml.util.ConcurrentCache
            r0.<init>()
            r1.cache = r0
            org.simpleframework.xml.convert.ConverterFactory r0 = new org.simpleframework.xml.convert.ConverterFactory
            r0.<init>()
            r1.factory = r0
            return
    }

    private org.simpleframework.xml.convert.Converter create(java.lang.Class r2) throws java.lang.Exception {
            r1 = this;
            org.simpleframework.xml.convert.ConverterFactory r0 = r1.factory
            org.simpleframework.xml.convert.Converter r2 = r0.getInstance(r2)
            return r2
    }

    public void bind(java.lang.Class r2, java.lang.Class r3) throws java.lang.Exception {
            r1 = this;
            org.simpleframework.xml.util.Cache<java.lang.Class> r0 = r1.cache
            r0.cache(r2, r3)
            return
    }

    public org.simpleframework.xml.convert.Converter lookup(java.lang.Class r2) throws java.lang.Exception {
            r1 = this;
            org.simpleframework.xml.util.Cache<java.lang.Class> r0 = r1.cache
            java.lang.Object r2 = r0.fetch(r2)
            java.lang.Class r2 = (java.lang.Class) r2
            if (r2 == 0) goto Lf
            org.simpleframework.xml.convert.Converter r2 = r1.create(r2)
            return r2
        Lf:
            r2 = 0
            return r2
    }
}
