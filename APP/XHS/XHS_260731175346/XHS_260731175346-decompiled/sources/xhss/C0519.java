package xhss;

/* JADX INFO: renamed from: xhss.ᛵᲇᛶᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0519 implements xhss.InterfaceC0554 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final java.lang.Object f1887;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f1888;

    public /* synthetic */ C0519(int r1, java.lang.Object r2) {
            r0 = this;
            r0.f1888 = r1
            r0.f1887 = r2
            r0.<init>()
            return
    }

    public final java.lang.String toString() {
            r3 = this;
            int r0 = r3.f1888
            r1 = 93
            switch(r0) {
                case 0: goto L1d;
                default: goto L7;
            }
        L7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "DisposeOnCancel["
            r0.<init>(r2)
            java.lang.Object r3 = r3.f1887
            xhss.ᛱᲇᛲ r3 = (xhss.C0106) r3
            r0.append(r3)
            r0.append(r1)
            java.lang.String r3 = r0.toString()
            return r3
        L1d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "CancelHandler.UserSupplied["
            r0.<init>(r2)
            java.lang.Class<xhss.ᛶᲀᲀᛵ> r2 = xhss.C0591.class
            java.lang.String r2 = r2.getSimpleName()
            r0.append(r2)
            r2 = 64
            r0.append(r2)
            java.lang.String r3 = xhss.AbstractC0561.m1011(r3)
            r0.append(r3)
            r0.append(r1)
            java.lang.String r3 = r0.toString()
            return r3
    }

    @Override // xhss.InterfaceC0554
    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final void mo928(java.lang.Throwable r2) {
            r1 = this;
            int r0 = r1.f1888
            java.lang.Object r1 = r1.f1887
            switch(r0) {
                case 0: goto Ld;
                default: goto L7;
            }
        L7:
            xhss.ᛱᲇᛲ r1 = (xhss.C0106) r1
            r1.mo125()
            return
        Ld:
            xhss.ᛶᲀᲀᛵ r1 = (xhss.C0591) r1
            r1.mo112(r2)
            return
    }
}
