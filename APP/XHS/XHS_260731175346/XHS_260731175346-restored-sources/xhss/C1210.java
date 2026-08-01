package xhss;

/* JADX INFO: renamed from: xhss.ᲈᲈᲈᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C1210 extends xhss.AbstractC0381 {

    /* JADX INFO: renamed from: ᛸᛲᲀᛵ, reason: contains not printable characters */
    public final java.lang.Object f3926;

    /* JADX INFO: renamed from: ᛸᛴᛶᛳ, reason: contains not printable characters */
    public final xhss.C0357 f3927;

    /* JADX INFO: renamed from: ᲀᲇᛳᲁ, reason: contains not printable characters */
    public final xhss.C1105 f3928;

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public final xhss.AbstractC0784 f3929;

    public C1210(xhss.AbstractC0784 r1, xhss.C1105 r2, xhss.C0357 r3, java.lang.Object r4) {
            r0 = this;
            r0.<init>()
            r0.f3929 = r1
            r0.f3928 = r2
            r0.f3927 = r3
            r0.f3926 = r4
            return
    }

    @Override // xhss.AbstractC0381
    /* JADX INFO: renamed from: ᛷᲁᲁ */
    public final boolean mo438() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // xhss.AbstractC0381
    /* JADX INFO: renamed from: ᛸᛶᲈᛶ */
    public final void mo439(java.lang.Throwable r6) {
            r5 = this;
            xhss.ᛴᛴᛷᛲ r6 = r5.f3927
            xhss.ᛴᛴᛷᛲ r0 = xhss.AbstractC0784.m1327(r6)
            xhss.ᛸᛷᛳᲈ r1 = r5.f3929
            xhss.ᲇᲈᛵᲁ r2 = r5.f3928
            java.lang.Object r5 = r5.f3926
            if (r0 == 0) goto L15
            boolean r0 = r1.m1328(r2, r0, r5)
            if (r0 == 0) goto L15
            goto L2c
        L15:
            xhss.ᛴᲁᛶᛲ r0 = r2.f3573
            xhss.ᛷᛳᛷᛷ r3 = new xhss.ᛷᛳᛷᛷ
            r4 = 2
            r3.<init>(r4)
            r0.m216(r3, r4)
            xhss.ᛴᛴᛷᛲ r6 = xhss.AbstractC0784.m1327(r6)
            if (r6 == 0) goto L2d
            boolean r6 = r1.m1328(r2, r6, r5)
            if (r6 == 0) goto L2d
        L2c:
            return
        L2d:
            java.lang.Object r5 = r1.m1345(r2, r5)
            r1.mo541(r5)
            return
    }
}
