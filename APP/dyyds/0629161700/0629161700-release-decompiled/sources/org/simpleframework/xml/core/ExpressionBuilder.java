package org.simpleframework.xml.core;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
class ExpressionBuilder {
    private final org.simpleframework.xml.util.Cache<org.simpleframework.xml.core.Expression> cache;
    private final org.simpleframework.xml.stream.Format format;
    private final java.lang.Class type;

    public ExpressionBuilder(org.simpleframework.xml.core.Detail r2, org.simpleframework.xml.core.Support r3) {
            r1 = this;
            r1.<init>()
            org.simpleframework.xml.util.LimitedCache r0 = new org.simpleframework.xml.util.LimitedCache
            r0.<init>()
            r1.cache = r0
            org.simpleframework.xml.stream.Format r3 = r3.getFormat()
            r1.format = r3
            java.lang.Class r2 = r2.getType()
            r1.type = r2
            return
    }

    private org.simpleframework.xml.core.Expression create(java.lang.String r4) {
            r3 = this;
            org.simpleframework.xml.core.ClassType r0 = new org.simpleframework.xml.core.ClassType
            java.lang.Class r1 = r3.type
            r0.<init>(r1)
            org.simpleframework.xml.core.PathParser r1 = new org.simpleframework.xml.core.PathParser
            org.simpleframework.xml.stream.Format r2 = r3.format
            r1.<init>(r4, r0, r2)
            org.simpleframework.xml.util.Cache<org.simpleframework.xml.core.Expression> r3 = r3.cache
            if (r3 == 0) goto L15
            r3.cache(r4, r1)
        L15:
            return r1
    }

    public org.simpleframework.xml.core.Expression build(java.lang.String r2) {
            r1 = this;
            org.simpleframework.xml.util.Cache<org.simpleframework.xml.core.Expression> r0 = r1.cache
            java.lang.Object r0 = r0.fetch(r2)
            org.simpleframework.xml.core.Expression r0 = (org.simpleframework.xml.core.Expression) r0
            if (r0 != 0) goto Lf
            org.simpleframework.xml.core.Expression r1 = r1.create(r2)
            return r1
        Lf:
            return r0
    }
}
