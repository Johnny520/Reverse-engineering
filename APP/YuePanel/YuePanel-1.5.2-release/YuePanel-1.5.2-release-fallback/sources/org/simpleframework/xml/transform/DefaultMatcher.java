package org.simpleframework.xml.transform;

/* JADX INFO: loaded from: classes2.dex */
class DefaultMatcher implements org.simpleframework.xml.transform.Matcher {
    private org.simpleframework.xml.transform.Matcher array;
    private org.simpleframework.xml.transform.Matcher matcher;
    private org.simpleframework.xml.transform.Matcher primitive;
    private org.simpleframework.xml.transform.Matcher stock;

    public DefaultMatcher(org.simpleframework.xml.transform.Matcher r2) {
            r1 = this;
            r1.<init>()
            org.simpleframework.xml.transform.PrimitiveMatcher r0 = new org.simpleframework.xml.transform.PrimitiveMatcher
            r0.<init>()
            r1.primitive = r0
            org.simpleframework.xml.transform.PackageMatcher r0 = new org.simpleframework.xml.transform.PackageMatcher
            r0.<init>()
            r1.stock = r0
            org.simpleframework.xml.transform.ArrayMatcher r0 = new org.simpleframework.xml.transform.ArrayMatcher
            r0.<init>(r1)
            r1.array = r0
            r1.matcher = r2
            return
    }

    private org.simpleframework.xml.transform.Transform matchType(java.lang.Class r2) throws java.lang.Exception {
            r1 = this;
            boolean r0 = r2.isArray()
            if (r0 == 0) goto Ld
            org.simpleframework.xml.transform.Matcher r0 = r1.array
            org.simpleframework.xml.transform.Transform r2 = r0.match(r2)
            return r2
        Ld:
            boolean r0 = r2.isPrimitive()
            if (r0 == 0) goto L1a
            org.simpleframework.xml.transform.Matcher r0 = r1.primitive
            org.simpleframework.xml.transform.Transform r2 = r0.match(r2)
            return r2
        L1a:
            org.simpleframework.xml.transform.Matcher r0 = r1.stock
            org.simpleframework.xml.transform.Transform r2 = r0.match(r2)
            return r2
    }

    @Override // org.simpleframework.xml.transform.Matcher
    public org.simpleframework.xml.transform.Transform match(java.lang.Class r2) throws java.lang.Exception {
            r1 = this;
            org.simpleframework.xml.transform.Matcher r0 = r1.matcher
            org.simpleframework.xml.transform.Transform r0 = r0.match(r2)
            if (r0 == 0) goto L9
            return r0
        L9:
            org.simpleframework.xml.transform.Transform r2 = r1.matchType(r2)
            return r2
    }
}
