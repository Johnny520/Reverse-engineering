package org.simpleframework.xml.transform;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public class RegistryMatcher implements org.simpleframework.xml.transform.Matcher {
    private final org.simpleframework.xml.util.Cache<org.simpleframework.xml.transform.Transform> transforms;
    private final org.simpleframework.xml.util.Cache<java.lang.Class> types;

    public RegistryMatcher() {
            r1 = this;
            r1.<init>()
            org.simpleframework.xml.util.ConcurrentCache r0 = new org.simpleframework.xml.util.ConcurrentCache
            r0.<init>()
            r1.transforms = r0
            org.simpleframework.xml.util.ConcurrentCache r0 = new org.simpleframework.xml.util.ConcurrentCache
            r0.<init>()
            r1.types = r0
            return
    }

    private org.simpleframework.xml.transform.Transform create(java.lang.Class r2) {
            r1 = this;
            org.simpleframework.xml.util.Cache<java.lang.Class> r0 = r1.types
            java.lang.Object r0 = r0.fetch(r2)
            java.lang.Class r0 = (java.lang.Class) r0
            if (r0 == 0) goto Lf
            org.simpleframework.xml.transform.Transform r1 = r1.create(r2, r0)
            return r1
        Lf:
            r1 = 0
            return r1
    }

    private org.simpleframework.xml.transform.Transform create(java.lang.Class r1, java.lang.Class r2) {
            r0 = this;
            java.lang.Object r2 = r2.newInstance()
            org.simpleframework.xml.transform.Transform r2 = (org.simpleframework.xml.transform.Transform) r2
            if (r2 == 0) goto Ld
            org.simpleframework.xml.util.Cache<org.simpleframework.xml.transform.Transform> r0 = r0.transforms
            r0.cache(r1, r2)
        Ld:
            return r2
    }

    public void bind(java.lang.Class r1, java.lang.Class r2) {
            r0 = this;
            org.simpleframework.xml.util.Cache<java.lang.Class> r0 = r0.types
            r0.cache(r1, r2)
            return
    }

    public void bind(java.lang.Class r1, org.simpleframework.xml.transform.Transform r2) {
            r0 = this;
            org.simpleframework.xml.util.Cache<org.simpleframework.xml.transform.Transform> r0 = r0.transforms
            r0.cache(r1, r2)
            return
    }

    @Override // org.simpleframework.xml.transform.Matcher
    public org.simpleframework.xml.transform.Transform match(java.lang.Class r2) {
            r1 = this;
            org.simpleframework.xml.util.Cache<org.simpleframework.xml.transform.Transform> r0 = r1.transforms
            java.lang.Object r0 = r0.fetch(r2)
            org.simpleframework.xml.transform.Transform r0 = (org.simpleframework.xml.transform.Transform) r0
            if (r0 != 0) goto Lf
            org.simpleframework.xml.transform.Transform r1 = r1.create(r2)
            return r1
        Lf:
            return r0
    }
}
