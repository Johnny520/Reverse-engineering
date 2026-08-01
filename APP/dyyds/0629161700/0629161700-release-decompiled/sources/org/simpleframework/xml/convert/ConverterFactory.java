package org.simpleframework.xml.convert;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
class ConverterFactory {
    private final org.simpleframework.xml.util.Cache<org.simpleframework.xml.convert.Converter> cache;

    public ConverterFactory() {
            r1 = this;
            r1.<init>()
            org.simpleframework.xml.util.ConcurrentCache r0 = new org.simpleframework.xml.util.ConcurrentCache
            r0.<init>()
            r1.cache = r0
            return
    }

    private java.lang.reflect.Constructor getConstructor(java.lang.Class r1) {
            r0 = this;
            r0 = 0
            java.lang.reflect.Constructor r0 = r1.getDeclaredConstructor(r0)
            boolean r1 = r0.isAccessible()
            if (r1 != 0) goto Lf
            r1 = 1
            r0.setAccessible(r1)
        Lf:
            return r0
    }

    private org.simpleframework.xml.convert.Converter getConverter(java.lang.Class r2) {
            r1 = this;
            java.lang.reflect.Constructor r0 = r1.getConstructor(r2)
            if (r0 == 0) goto Lb
            org.simpleframework.xml.convert.Converter r1 = r1.getConverter(r2, r0)
            return r1
        Lb:
            org.simpleframework.xml.convert.ConvertException r1 = new org.simpleframework.xml.convert.ConvertException
            java.lang.String r0 = "No default constructor for %s"
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            r1.<init>(r0, r2)
            throw r1
    }

    private org.simpleframework.xml.convert.Converter getConverter(java.lang.Class r2, java.lang.reflect.Constructor r3) {
            r1 = this;
            r0 = 0
            java.lang.Object r3 = r3.newInstance(r0)
            org.simpleframework.xml.convert.Converter r3 = (org.simpleframework.xml.convert.Converter) r3
            if (r3 == 0) goto Le
            org.simpleframework.xml.util.Cache<org.simpleframework.xml.convert.Converter> r1 = r1.cache
            r1.cache(r2, r3)
        Le:
            return r3
    }

    public org.simpleframework.xml.convert.Converter getInstance(java.lang.Class r2) {
            r1 = this;
            org.simpleframework.xml.util.Cache<org.simpleframework.xml.convert.Converter> r0 = r1.cache
            java.lang.Object r0 = r0.fetch(r2)
            org.simpleframework.xml.convert.Converter r0 = (org.simpleframework.xml.convert.Converter) r0
            if (r0 != 0) goto Lf
            org.simpleframework.xml.convert.Converter r1 = r1.getConverter(r2)
            return r1
        Lf:
            return r0
    }

    public org.simpleframework.xml.convert.Converter getInstance(org.simpleframework.xml.convert.Convert r2) {
            r1 = this;
            java.lang.Class r2 = r2.value()
            boolean r0 = r2.isInterface()
            if (r0 != 0) goto Lf
            org.simpleframework.xml.convert.Converter r1 = r1.getInstance(r2)
            return r1
        Lf:
            org.simpleframework.xml.convert.ConvertException r1 = new org.simpleframework.xml.convert.ConvertException
            java.lang.String r0 = "Can not instantiate %s"
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            r1.<init>(r0, r2)
            throw r1
    }
}
