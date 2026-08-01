package defpackage;

/* JADX INFO: renamed from: ᛴᛸᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0732 extends defpackage.AbstractC2115 implements java.util.RandomAccess {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final int f3463;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final int f3464;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final defpackage.AbstractC2115 f3465;

    public C0732(defpackage.AbstractC2115 r1, int r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.f3465 = r1
            r0.f3464 = r2
            int r1 = r1.mo395()
            defpackage.AbstractC0498.m1276(r2, r3, r1)
            int r3 = r3 - r2
            r0.f3463 = r3
            return
    }

    @Override // java.util.List
    public final java.lang.Object get(int r4) {
            r3 = this;
            int r0 = r3.f3463
            if (r4 < 0) goto L10
            if (r4 >= r0) goto L10
            int r0 = r3.f3464
            int r0 = r0 + r4
            ᲇᲀᛲᛱ r3 = r3.f3465
            java.lang.Object r3 = r3.get(r0)
            return r3
        L10:
            java.lang.IndexOutOfBoundsException r3 = new java.lang.IndexOutOfBoundsException
            java.lang.String r1 = "index: "
            java.lang.String r2 = ", size: "
            java.lang.String r4 = defpackage.AbstractC1124.m2143(r4, r0, r1, r2)
            r3.<init>(r4)
            throw r3
    }

    @Override // defpackage.AbstractC2115, java.util.List
    public final java.util.List subList(int r3, int r4) {
            r2 = this;
            int r0 = r2.f3463
            defpackage.AbstractC0498.m1276(r3, r4, r0)
            ᛴᛸᲀ r0 = new ᛴᛸᲀ
            int r1 = r2.f3464
            int r3 = r3 + r1
            int r1 = r1 + r4
            ᲇᲀᛲᛱ r2 = r2.f3465
            r0.<init>(r2, r3, r1)
            return r0
    }

    @Override // defpackage.AbstractC0050
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ */
    public final int mo395() {
            r0 = this;
            int r0 = r0.f3463
            return r0
    }
}
