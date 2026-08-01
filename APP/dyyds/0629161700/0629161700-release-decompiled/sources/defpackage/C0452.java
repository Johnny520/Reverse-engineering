package defpackage;

/* JADX INFO: renamed from: ᛳᛴᛳᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0452 extends defpackage.AbstractC1709 implements java.lang.Iterable {

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public java.util.ArrayList f2227;

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L4
            r1 = 1
            return r1
        L4:
            boolean r0 = r2 instanceof defpackage.C0452
            if (r0 != 0) goto La
            r1 = 0
            return r1
        La:
            ᛳᛴᛳᲈ r2 = (defpackage.C0452) r2
            java.util.ArrayList r1 = r1.f2227
            java.util.ArrayList r2 = r2.f2227
            boolean r1 = r1.equals(r2)
            return r1
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
            r0 = this;
            java.util.ArrayList r0 = r0.f2227
            java.util.Iterator r0 = r0.iterator()
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.util.ArrayList r2 = r2.f2227
            java.lang.String r0 = ""
            java.lang.String r1 = ","
            java.lang.String r2 = defpackage.AbstractC1849.m3251(r1, r0, r2)
            java.lang.String r0 = "["
            java.lang.String r1 = "]"
            java.lang.String r2 = defpackage.AbstractC0225.m817(r0, r2, r1)
            return r2
    }

    @Override // defpackage.AbstractC1709
    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public final defpackage.C0452 mo1228() {
            r0 = this;
            return r0
    }

    @Override // defpackage.AbstractC1709
    /* JADX INFO: renamed from: ᛸᛵᛸᛷ */
    public final java.lang.Class mo483(defpackage.C1412 r1) {
            r0 = this;
            java.lang.Class<java.util.List> r0 = java.util.List.class
            return r0
    }
}
