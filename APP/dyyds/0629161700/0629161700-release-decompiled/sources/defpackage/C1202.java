package defpackage;

/* JADX INFO: renamed from: ᛷᛱᛴᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1202 implements java.lang.reflect.WildcardType {

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final java.lang.reflect.Type f5437;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final java.lang.reflect.Type f5438;

    public C1202(java.lang.reflect.Type[] r5, java.lang.reflect.Type[] r6) {
            r4 = this;
            r4.<init>()
            int r0 = r6.length
            r1 = 0
            r2 = 1
            if (r0 > r2) goto L41
            int r0 = r5.length
            if (r0 != r2) goto L3b
            int r0 = r6.length
            r3 = 0
            if (r0 != r2) goto L2b
            r0 = r6[r3]
            defpackage.AbstractC0209.m778(r0)
            r5 = r5[r3]
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            if (r5 != r0) goto L25
            r5 = r6[r3]
            java.lang.reflect.Type r5 = defpackage.AbstractC0209.m773(r5)
            r4.f5437 = r5
            r4.f5438 = r0
            return
        L25:
            java.lang.String r4 = "When lower bound is specified, upper bound must be Object"
            defpackage.C2264.m3684(r4)
            throw r1
        L2b:
            r6 = r5[r3]
            defpackage.AbstractC0209.m778(r6)
            r4.f5437 = r1
            r5 = r5[r3]
            java.lang.reflect.Type r5 = defpackage.AbstractC0209.m773(r5)
            r4.f5438 = r5
            return
        L3b:
            java.lang.String r4 = "Exactly one upper bound must be specified"
            defpackage.C2264.m3684(r4)
            throw r1
        L41:
            java.lang.String r4 = "At most one lower bound is supported"
            defpackage.C2264.m3684(r4)
            throw r1
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof java.lang.reflect.WildcardType
            if (r0 == 0) goto Le
            java.lang.reflect.WildcardType r2 = (java.lang.reflect.WildcardType) r2
            boolean r1 = defpackage.AbstractC0209.m779(r1, r2)
            if (r1 == 0) goto Le
            r1 = 1
            return r1
        Le:
            r1 = 0
            return r1
    }

    @Override // java.lang.reflect.WildcardType
    public final java.lang.reflect.Type[] getLowerBounds() {
            r2 = this;
            java.lang.reflect.Type r2 = r2.f5437
            if (r2 == 0) goto Lb
            r0 = 1
            java.lang.reflect.Type[] r0 = new java.lang.reflect.Type[r0]
            r1 = 0
            r0[r1] = r2
            return r0
        Lb:
            java.lang.reflect.Type[] r2 = defpackage.AbstractC0209.f1316
            return r2
    }

    @Override // java.lang.reflect.WildcardType
    public final java.lang.reflect.Type[] getUpperBounds() {
            r2 = this;
            r0 = 1
            java.lang.reflect.Type[] r0 = new java.lang.reflect.Type[r0]
            r1 = 0
            java.lang.reflect.Type r2 = r2.f5438
            r0[r1] = r2
            return r0
    }

    public final int hashCode() {
            r1 = this;
            java.lang.reflect.Type r0 = r1.f5437
            if (r0 == 0) goto Lb
            int r0 = r0.hashCode()
            int r0 = r0 + 31
            goto Lc
        Lb:
            r0 = 1
        Lc:
            java.lang.reflect.Type r1 = r1.f5438
            int r1 = r1.hashCode()
            int r1 = r1 + 31
            r1 = r1 ^ r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.reflect.Type r0 = r2.f5437
            if (r0 == 0) goto L17
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r1 = "? super "
            r2.<init>(r1)
            java.lang.String r0 = defpackage.AbstractC0209.m771(r0)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            return r2
        L17:
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.reflect.Type r2 = r2.f5438
            if (r2 != r0) goto L20
            java.lang.String r2 = "?"
            return r2
        L20:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "? extends "
            r0.<init>(r1)
            java.lang.String r2 = defpackage.AbstractC0209.m771(r2)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
