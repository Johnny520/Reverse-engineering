package xhss;

/* JADX INFO: renamed from: xhss.ᲀᛷᲈᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0881 extends xhss.AbstractC0252 {

    /* JADX INFO: renamed from: ᲀᲇᛳᲁ, reason: contains not printable characters */
    public final java.lang.String f2839;

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public xhss.AbstractC0252 f2840;

    public C0881(char r1) {
            r0 = this;
            r0.<init>()
            java.lang.String r1 = java.lang.Character.toString(r1)
            r0.f2839 = r1
            r0.f2840 = r0
            return
    }

    @Override // xhss.AbstractC0252
    /* JADX INFO: renamed from: ᛱᛱᛲᲇ */
    public final java.lang.String mo130() {
            r0 = this;
            java.lang.String r0 = r0.f2839
            return r0
    }

    @Override // xhss.AbstractC0252
    /* JADX INFO: renamed from: ᛷᛵᛵᲈ */
    public final void mo131(java.lang.String r2, xhss.AbstractC0356 r3, java.lang.Object r4, xhss.C0530 r5) {
            r1 = this;
            boolean r2 = r1.m559()
            java.lang.String r0 = r1.f2839
            if (r2 == 0) goto Le
            xhss.ᲀᛱᛸᛳ r1 = xhss.AbstractC0356.f1319
            r5.m944(r0, r1, r4)
            return
        Le:
            xhss.ᛳᛳᛵᛱ r1 = r1.m560()
            r1.mo131(r0, r3, r4, r5)
            return
    }

    @Override // xhss.AbstractC0252
    /* JADX INFO: renamed from: ᲀᲇᛳᲁ */
    public final boolean mo133() {
            r0 = this;
            r0 = 1
            return r0
    }
}
