package org.simpleframework.xml.transform;

/* JADX INFO: loaded from: classes2.dex */
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

    private org.simpleframework.xml.transform.Transform create(java.lang.Class r2) throws java.lang.Exception {
            r1 = this;
            org.simpleframework.xml.util.Cache<java.lang.Class> r0 = r1.types
            java.lang.Object r0 = r0.fetch(r2)
            java.lang.Class r0 = (java.lang.Class) r0
            if (r0 == 0) goto Lf
            org.simpleframework.xml.transform.Transform r2 = r1.create(r2, r0)
            return r2
        Lf:
            r2 = 0
            return r2
    }

    private org.simpleframework.xml.transform.Transform create(java.lang.Class r2, java.lang.Class r3) throws java.lang.Exception {
            r1 = this;
            java.lang.Object r3 = r3.newInstance()
            org.simpleframework.xml.transform.Transform r3 = (org.simpleframework.xml.transform.Transform) r3
            if (r3 == 0) goto Ld
            org.simpleframework.xml.util.Cache<org.simpleframework.xml.transform.Transform> r0 = r1.transforms
            r0.cache(r2, r3)
        Ld:
            return r3
    }

    public void bind(java.lang.Class r2, java.lang.Class r3) {
            r1 = this;
            org.simpleframework.xml.util.Cache<java.lang.Class> r0 = r1.types
            r0.cache(r2, r3)
            return
    }

    public void bind(java.lang.Class r2, org.simpleframework.xml.transform.Transform r3) {
            r1 = this;
            org.simpleframework.xml.util.Cache<org.simpleframework.xml.transform.Transform> r0 = r1.transforms
            r0.cache(r2, r3)
            return
    }

    @Override // org.simpleframework.xml.transform.Matcher
    public org.simpleframework.xml.transform.Transform match(java.lang.Class r2) throws java.lang.Exception {
            r1 = this;
            org.simpleframework.xml.util.Cache<org.simpleframework.xml.transform.Transform> r0 = r1.transforms
            java.lang.Object r0 = r0.fetch(r2)
            org.simpleframework.xml.transform.Transform r0 = (org.simpleframework.xml.transform.Transform) r0
            if (r0 != 0) goto Lf
            org.simpleframework.xml.transform.Transform r2 = r1.create(r2)
            return r2
        Lf:
            return r0
    }
}
