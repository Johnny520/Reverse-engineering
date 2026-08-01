package defpackage;

/* JADX INFO: renamed from: ᛷᛶᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1301 extends defpackage.AbstractC1683 {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public final defpackage.C0612 f5761;

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public final defpackage.C0313 f5762;

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public final java.lang.Object f5763;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final defpackage.AbstractC0624 f5764;

    public C1301(defpackage.AbstractC0624 r1, defpackage.C0612 r2, defpackage.C0313 r3, java.lang.Object r4) {
            r0 = this;
            r0.<init>()
            r0.f5764 = r1
            r0.f5761 = r2
            r0.f5762 = r3
            r0.f5763 = r4
            return
    }

    @Override // defpackage.AbstractC1683
    /* JADX INFO: renamed from: ᛲᛴᛱᛶ */
    public final boolean mo987() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // defpackage.AbstractC1683
    /* JADX INFO: renamed from: ᛶᛷᛱᲀ */
    public final void mo988(java.lang.Throwable r6) {
            r5 = this;
            ᛲᛶᲁᛱ r6 = r5.f5762
            ᛲᛶᲁᛱ r0 = defpackage.AbstractC0624.m1432(r6)
            ᛴᛲᛵᛵ r1 = r5.f5764
            ᛴᛱᛷᛱ r2 = r5.f5761
            java.lang.Object r5 = r5.f5763
            if (r0 == 0) goto L15
            boolean r0 = r1.m1441(r2, r0, r5)
            if (r0 == 0) goto L15
            goto L2c
        L15:
            ᛵᛲᛴᛷ r0 = r2.f3010
            ᲇᛱᛷᛷ r3 = new ᲇᛱᛷᛷ
            r4 = 2
            r3.<init>(r4)
            r0.m3881(r3, r4)
            ᛲᛶᲁᛱ r6 = defpackage.AbstractC0624.m1432(r6)
            if (r6 == 0) goto L2d
            boolean r6 = r1.m1441(r2, r6, r5)
            if (r6 == 0) goto L2d
        L2c:
            return
        L2d:
            java.lang.Object r5 = r1.m1437(r2, r5)
            r1.mo1433(r5)
            return
    }
}
