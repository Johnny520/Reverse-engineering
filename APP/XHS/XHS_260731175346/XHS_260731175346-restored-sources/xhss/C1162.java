package xhss;

/* JADX INFO: renamed from: xhss.ᲈᛸᛲᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1162 implements xhss.InterfaceC0030 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f3757;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final /* synthetic */ xhss.C0927 f3758;

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public final /* synthetic */ int f3759;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public final /* synthetic */ int f3760;

    public /* synthetic */ C1162(xhss.C0927 r1, int r2, int r3, int r4) {
            r0 = this;
            r0.f3757 = r4
            r0.f3758 = r1
            r0.f3760 = r2
            r0.f3759 = r3
            r0.<init>()
            return
    }

    @Override // xhss.InterfaceC0030
    /* JADX INFO: renamed from: ᛷᛵᛵᲈ */
    public final java.lang.Object mo136() {
            r6 = this;
            int r0 = r6.f3757
            xhss.ᛵᛷᲈᛶ r1 = xhss.C0500.f1817
            r2 = 2
            int r3 = r6.f3759
            int r4 = r6.f3760
            xhss.ᲁᛲᛵ r6 = r6.f3758
            switch(r0) {
                case 0: goto L1a;
                default: goto Le;
            }
        Le:
            xhss.ᲀᛱᛶᛳ r0 = r6.f3003     // Catch: java.io.IOException -> L15
            r5 = 1
            r0.m1413(r4, r3, r5)     // Catch: java.io.IOException -> L15
            goto L19
        L15:
            r0 = move-exception
            r6.m1520(r2, r2, r0)
        L19:
            return r1
        L1a:
            xhss.ᲀᛱᛶᛳ r0 = r6.f3003     // Catch: java.io.IOException -> L20
            r0.m1415(r4, r3)     // Catch: java.io.IOException -> L20
            goto L24
        L20:
            r0 = move-exception
            r6.m1520(r2, r2, r0)
        L24:
            return r1
    }
}
