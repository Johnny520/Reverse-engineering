package defpackage;

/* JADX INFO: renamed from: ᛷᛵᲁᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1281 extends defpackage.AbstractC0638 implements java.lang.Iterable {

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final java.util.ArrayList f5710;

    public C1281() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f5710 = r0
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r2 == r1) goto L15
            boolean r0 = r2 instanceof defpackage.C1281
            if (r0 == 0) goto L13
            ᛷᛵᲁᛱ r2 = (defpackage.C1281) r2
            java.util.ArrayList r2 = r2.f5710
            java.util.ArrayList r1 = r1.f5710
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L13
            goto L15
        L13:
            r1 = 0
            return r1
        L15:
            r1 = 1
            return r1
    }

    public final int hashCode() {
            r0 = this;
            java.util.ArrayList r0 = r0.f5710
            int r0 = r0.hashCode()
            return r0
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
            r0 = this;
            java.util.ArrayList r0 = r0.f5710
            java.util.Iterator r0 = r0.iterator()
            return r0
    }

    @Override // defpackage.AbstractC0638
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ */
    public final java.lang.String mo1474() {
            r2 = this;
            java.util.ArrayList r2 = r2.f5710
            int r0 = r2.size()
            r1 = 1
            if (r0 != r1) goto L15
            r0 = 0
            java.lang.Object r2 = r2.get(r0)
            ᛴᛳᛶᛶ r2 = (defpackage.AbstractC0638) r2
            java.lang.String r2 = r2.mo1474()
            return r2
        L15:
            java.lang.String r2 = "Array must have size 1, but has size "
            java.lang.String r2 = defpackage.AbstractC1124.m2145(r0, r2)
            defpackage.C2264.m3676(r2)
            r2 = 0
            return r2
    }
}
