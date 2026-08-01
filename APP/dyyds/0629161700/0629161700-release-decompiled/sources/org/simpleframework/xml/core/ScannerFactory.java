package org.simpleframework.xml.core;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
class ScannerFactory {
    private final org.simpleframework.xml.util.Cache<org.simpleframework.xml.core.Scanner> cache;
    private final org.simpleframework.xml.core.Support support;

    public ScannerFactory(org.simpleframework.xml.core.Support r2) {
            r1 = this;
            r1.<init>()
            org.simpleframework.xml.util.ConcurrentCache r0 = new org.simpleframework.xml.util.ConcurrentCache
            r0.<init>()
            r1.cache = r0
            r1.support = r2
            return
    }

    public org.simpleframework.xml.core.Scanner getInstance(java.lang.Class r4) {
            r3 = this;
            org.simpleframework.xml.util.Cache<org.simpleframework.xml.core.Scanner> r0 = r3.cache
            java.lang.Object r0 = r0.fetch(r4)
            org.simpleframework.xml.core.Scanner r0 = (org.simpleframework.xml.core.Scanner) r0
            if (r0 != 0) goto L40
            org.simpleframework.xml.core.Support r0 = r3.support
            org.simpleframework.xml.core.Detail r0 = r0.getDetail(r4)
            org.simpleframework.xml.core.Support r1 = r3.support
            boolean r1 = r1.isPrimitive(r4)
            if (r1 == 0) goto L1e
            org.simpleframework.xml.core.PrimitiveScanner r1 = new org.simpleframework.xml.core.PrimitiveScanner
            r1.<init>(r0)
            goto L3a
        L1e:
            org.simpleframework.xml.core.ObjectScanner r1 = new org.simpleframework.xml.core.ObjectScanner
            org.simpleframework.xml.core.Support r2 = r3.support
            r1.<init>(r0, r2)
            boolean r2 = r1.isPrimitive()
            if (r2 == 0) goto L3a
            org.simpleframework.xml.core.Support r2 = r3.support
            boolean r2 = r2.isContainer(r4)
            if (r2 != 0) goto L3a
            org.simpleframework.xml.core.DefaultScanner r1 = new org.simpleframework.xml.core.DefaultScanner
            org.simpleframework.xml.core.Support r2 = r3.support
            r1.<init>(r0, r2)
        L3a:
            org.simpleframework.xml.util.Cache<org.simpleframework.xml.core.Scanner> r3 = r3.cache
            r3.cache(r4, r1)
            return r1
        L40:
            return r0
    }
}
