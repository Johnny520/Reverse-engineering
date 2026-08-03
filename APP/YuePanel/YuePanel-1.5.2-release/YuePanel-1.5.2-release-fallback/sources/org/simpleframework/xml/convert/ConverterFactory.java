package org.simpleframework.xml.convert;

/* JADX INFO: loaded from: classes2.dex */
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

    private java.lang.reflect.Constructor getConstructor(java.lang.Class r2) throws java.lang.Exception {
            r1 = this;
            r0 = 0
            java.lang.reflect.Constructor r2 = r2.getDeclaredConstructor(r0)
            boolean r0 = r2.isAccessible()
            if (r0 != 0) goto Lf
            r0 = 1
            r2.setAccessible(r0)
        Lf:
            return r2
    }

    private org.simpleframework.xml.convert.Converter getConverter(java.lang.Class r3) throws java.lang.Exception {
            r2 = this;
            java.lang.reflect.Constructor r0 = r2.getConstructor(r3)
            if (r0 == 0) goto Lb
            org.simpleframework.xml.convert.Converter r3 = r2.getConverter(r3, r0)
            return r3
        Lb:
            org.simpleframework.xml.convert.ConvertException r0 = new org.simpleframework.xml.convert.ConvertException
            java.lang.String r1 = "No default constructor for %s"
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            r0.<init>(r1, r3)
            throw r0
    }

    private org.simpleframework.xml.convert.Converter getConverter(java.lang.Class r2, java.lang.reflect.Constructor r3) throws java.lang.Exception {
            r1 = this;
            r0 = 0
            java.lang.Object r3 = r3.newInstance(r0)
            org.simpleframework.xml.convert.Converter r3 = (org.simpleframework.xml.convert.Converter) r3
            if (r3 == 0) goto Le
            org.simpleframework.xml.util.Cache<org.simpleframework.xml.convert.Converter> r0 = r1.cache
            r0.cache(r2, r3)
        Le:
            return r3
    }

    public org.simpleframework.xml.convert.Converter getInstance(java.lang.Class r2) throws java.lang.Exception {
            r1 = this;
            org.simpleframework.xml.util.Cache<org.simpleframework.xml.convert.Converter> r0 = r1.cache
            java.lang.Object r0 = r0.fetch(r2)
            org.simpleframework.xml.convert.Converter r0 = (org.simpleframework.xml.convert.Converter) r0
            if (r0 != 0) goto Lf
            org.simpleframework.xml.convert.Converter r2 = r1.getConverter(r2)
            return r2
        Lf:
            return r0
    }

    public org.simpleframework.xml.convert.Converter getInstance(org.simpleframework.xml.convert.Convert r3) throws java.lang.Exception {
            r2 = this;
            java.lang.Class r3 = r3.value()
            boolean r0 = r3.isInterface()
            if (r0 != 0) goto Lf
            org.simpleframework.xml.convert.Converter r3 = r2.getInstance(r3)
            return r3
        Lf:
            org.simpleframework.xml.convert.ConvertException r0 = new org.simpleframework.xml.convert.ConvertException
            java.lang.String r1 = "Can not instantiate %s"
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            r0.<init>(r1, r3)
            throw r0
    }
}
