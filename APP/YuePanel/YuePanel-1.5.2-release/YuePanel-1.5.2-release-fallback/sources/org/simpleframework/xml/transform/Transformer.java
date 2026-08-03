package org.simpleframework.xml.transform;

/* JADX INFO: loaded from: classes2.dex */
public class Transformer {
    private final org.simpleframework.xml.util.Cache<org.simpleframework.xml.transform.Transform> cache;
    private final org.simpleframework.xml.util.Cache<java.lang.Object> error;
    private final org.simpleframework.xml.transform.Matcher matcher;

    public Transformer(org.simpleframework.xml.transform.Matcher r2) {
            r1 = this;
            r1.<init>()
            org.simpleframework.xml.util.ConcurrentCache r0 = new org.simpleframework.xml.util.ConcurrentCache
            r0.<init>()
            r1.cache = r0
            org.simpleframework.xml.util.ConcurrentCache r0 = new org.simpleframework.xml.util.ConcurrentCache
            r0.<init>()
            r1.error = r0
            org.simpleframework.xml.transform.DefaultMatcher r0 = new org.simpleframework.xml.transform.DefaultMatcher
            r0.<init>(r2)
            r1.matcher = r0
            return
    }

    private org.simpleframework.xml.transform.Transform lookup(java.lang.Class r2) throws java.lang.Exception {
            r1 = this;
            org.simpleframework.xml.util.Cache<java.lang.Object> r0 = r1.error
            boolean r0 = r0.contains(r2)
            if (r0 != 0) goto L18
            org.simpleframework.xml.util.Cache<org.simpleframework.xml.transform.Transform> r0 = r1.cache
            java.lang.Object r0 = r0.fetch(r2)
            org.simpleframework.xml.transform.Transform r0 = (org.simpleframework.xml.transform.Transform) r0
            if (r0 == 0) goto L13
            return r0
        L13:
            org.simpleframework.xml.transform.Transform r2 = r1.match(r2)
            return r2
        L18:
            r2 = 0
            return r2
    }

    private org.simpleframework.xml.transform.Transform match(java.lang.Class r3) throws java.lang.Exception {
            r2 = this;
            org.simpleframework.xml.transform.Matcher r0 = r2.matcher
            org.simpleframework.xml.transform.Transform r0 = r0.match(r3)
            if (r0 == 0) goto Le
            org.simpleframework.xml.util.Cache<org.simpleframework.xml.transform.Transform> r1 = r2.cache
            r1.cache(r3, r0)
            goto L13
        Le:
            org.simpleframework.xml.util.Cache<java.lang.Object> r1 = r2.error
            r1.cache(r3, r2)
        L13:
            return r0
    }

    public java.lang.Object read(java.lang.String r2, java.lang.Class r3) throws java.lang.Exception {
            r1 = this;
            org.simpleframework.xml.transform.Transform r0 = r1.lookup(r3)
            if (r0 == 0) goto Lb
            java.lang.Object r2 = r0.read(r2)
            return r2
        Lb:
            org.simpleframework.xml.transform.TransformException r2 = new org.simpleframework.xml.transform.TransformException
            java.lang.String r0 = "Transform of %s not supported"
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            r2.<init>(r0, r3)
            throw r2
    }

    public boolean valid(java.lang.Class r1) throws java.lang.Exception {
            r0 = this;
            org.simpleframework.xml.transform.Transform r1 = r0.lookup(r1)
            if (r1 == 0) goto L8
            r1 = 1
            goto L9
        L8:
            r1 = 0
        L9:
            return r1
    }

    public java.lang.String write(java.lang.Object r2, java.lang.Class r3) throws java.lang.Exception {
            r1 = this;
            org.simpleframework.xml.transform.Transform r0 = r1.lookup(r3)
            if (r0 == 0) goto Lb
            java.lang.String r2 = r0.write(r2)
            return r2
        Lb:
            org.simpleframework.xml.transform.TransformException r2 = new org.simpleframework.xml.transform.TransformException
            java.lang.String r0 = "Transform of %s not supported"
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            r2.<init>(r0, r3)
            throw r2
    }
}
