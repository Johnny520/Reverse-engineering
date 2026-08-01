package org.simpleframework.xml.convert;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
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

    private org.simpleframework.xml.convert.Converter create(java.lang.Class r1) {
            r0 = this;
            org.simpleframework.xml.convert.ConverterFactory r0 = r0.factory
            org.simpleframework.xml.convert.Converter r0 = r0.getInstance(r1)
            return r0
    }

    public void bind(java.lang.Class r1, java.lang.Class r2) {
            r0 = this;
            org.simpleframework.xml.util.Cache<java.lang.Class> r0 = r0.cache
            r0.cache(r1, r2)
            return
    }

    public org.simpleframework.xml.convert.Converter lookup(java.lang.Class r2) {
            r1 = this;
            org.simpleframework.xml.util.Cache<java.lang.Class> r0 = r1.cache
            java.lang.Object r2 = r0.fetch(r2)
            java.lang.Class r2 = (java.lang.Class) r2
            if (r2 == 0) goto Lf
            org.simpleframework.xml.convert.Converter r1 = r1.create(r2)
            return r1
        Lf:
            r1 = 0
            return r1
    }
}
