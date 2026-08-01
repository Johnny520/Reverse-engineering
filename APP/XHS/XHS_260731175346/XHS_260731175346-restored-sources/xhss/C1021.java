package xhss;

/* JADX INFO: renamed from: xhss.ᲇᛳᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C1021 {

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public static final xhss.C1021 f3316 = null;

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public static final xhss.C1021 f3317 = null;

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final xhss.C0564 f3318;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final xhss.C0564 f3319;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final boolean f3320;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public final xhss.InterfaceC0807 f3321;

    static {
            xhss.ᲇᛳᛶ r0 = new xhss.ᲇᛳᛶ
            r1 = 0
            r0.<init>(r1)
            xhss.C1021.f3316 = r0
            xhss.ᲇᛳᛶ r0 = new xhss.ᲇᛳᛶ
            r1 = 2
            r0.<init>(r1)
            xhss.C1021.f3317 = r0
            return
    }

    public C1021(int r2) {
            r1 = this;
            r1.<init>()
            r2 = r2 & 2
            r0 = 0
            if (r2 != 0) goto La
            r2 = 1
            goto Lb
        La:
            r2 = r0
        Lb:
            r1.f3320 = r0
            xhss.ᛶᛵᲇᛸ r0 = xhss.AbstractC0060.f347
            r1.f3319 = r0
            r1.f3318 = r0
            if (r2 == 0) goto L1a
            xhss.ᛳᛴᲀᲁ r2 = xhss.AbstractC0060.f346
            r1.f3321 = r2
            return
        L1a:
            xhss.ᛶᛵᲇᛸ r2 = xhss.AbstractC0060.f345
            r1.f3321 = r2
            return
    }

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final void m1665(java.lang.String r3, java.lang.StringBuilder r4) {
            r2 = this;
            xhss.ᛶᛵᲇᛸ r0 = r2.f3319
            boolean r0 = r0.m1035(r3)
            if (r0 != 0) goto Lc
            r4.append(r3)
            return
        Lc:
            r0 = 34
            r4.append(r0)
            xhss.ᲇᛳᛶ r1 = xhss.AbstractC0518.f1886
            if (r3 != 0) goto L16
            goto L1b
        L16:
            xhss.ᛸᲁᛵᲀ r2 = r2.f3321
            r2.mo583(r3, r4)
        L1b:
            r4.append(r0)
            return
    }
}
