package org.simpleframework.xml.transform;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
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

    private org.simpleframework.xml.transform.Transform lookup(java.lang.Class r2) {
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
            org.simpleframework.xml.transform.Transform r1 = r1.match(r2)
            return r1
        L18:
            r1 = 0
            return r1
    }

    private org.simpleframework.xml.transform.Transform match(java.lang.Class r3) {
            r2 = this;
            org.simpleframework.xml.transform.Matcher r0 = r2.matcher
            org.simpleframework.xml.transform.Transform r0 = r0.match(r3)
            if (r0 == 0) goto Le
            org.simpleframework.xml.util.Cache<org.simpleframework.xml.transform.Transform> r2 = r2.cache
            r2.cache(r3, r0)
            return r0
        Le:
            org.simpleframework.xml.util.Cache<java.lang.Object> r1 = r2.error
            r1.cache(r3, r2)
            return r0
    }

    public java.lang.Object read(java.lang.String r1, java.lang.Class r2) {
            r0 = this;
            org.simpleframework.xml.transform.Transform r0 = r0.lookup(r2)
            if (r0 == 0) goto Lb
            java.lang.Object r0 = r0.read(r1)
            return r0
        Lb:
            org.simpleframework.xml.transform.TransformException r0 = new org.simpleframework.xml.transform.TransformException
            java.lang.String r1 = "Transform of %s not supported"
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            r0.<init>(r1, r2)
            throw r0
    }

    public boolean valid(java.lang.Class r1) {
            r0 = this;
            org.simpleframework.xml.transform.Transform r0 = r0.lookup(r1)
            if (r0 == 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    public java.lang.String write(java.lang.Object r1, java.lang.Class r2) {
            r0 = this;
            org.simpleframework.xml.transform.Transform r0 = r0.lookup(r2)
            if (r0 == 0) goto Lb
            java.lang.String r0 = r0.write(r1)
            return r0
        Lb:
            org.simpleframework.xml.transform.TransformException r0 = new org.simpleframework.xml.transform.TransformException
            java.lang.String r1 = "Transform of %s not supported"
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            r0.<init>(r1, r2)
            throw r0
    }
}
