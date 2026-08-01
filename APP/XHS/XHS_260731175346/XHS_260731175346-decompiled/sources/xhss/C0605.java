package xhss;

/* JADX INFO: renamed from: xhss.ᛶᲇᲇᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0605 extends xhss.AbstractC0352 implements xhss.InterfaceC0030 {

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final /* synthetic */ int f2081;

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public final /* synthetic */ org.luckypray.dexkit.DexKitBridge f2082;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public final /* synthetic */ xhss.AbstractC0954 f2083;

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f2084;

    public /* synthetic */ C0605(org.luckypray.dexkit.DexKitBridge r1, xhss.AbstractC0954 r2, int r3, int r4) {
            r0 = this;
            r0.f2081 = r4
            r0.f2082 = r1
            r0.f2083 = r2
            r0.f2084 = r3
            r1 = 0
            r0.<init>(r1)
            return
    }

    public C0605(xhss.C1062 r2, org.luckypray.dexkit.DexKitBridge r3, int r4) {
            r1 = this;
            r0 = 1
            r1.f2081 = r0
            r1.f2083 = r2
            r1.f2082 = r3
            r1.f2084 = r4
            r2 = 0
            r1.<init>(r2)
            return
    }

    @Override // xhss.InterfaceC0030
    /* JADX INFO: renamed from: ᛷᛵᛵᲈ */
    public final java.lang.Object mo136() {
            r7 = this;
            int r0 = r7.f2081
            r1 = 0
            r2 = 1
            int r3 = r7.f2084
            xhss.ᲁᛵᛷᛷ r4 = r7.f2083
            org.luckypray.dexkit.DexKitBridge r7 = r7.f2082
            switch(r0) {
                case 0: goto L49;
                case 1: goto L24;
                default: goto Ld;
            }
        Ld:
            xhss.ᲀᛷᲀᲇ r4 = (xhss.C0877) r4
            int r0 = r4.f2833
            long r3 = xhss.AbstractC0954.m1548(r3, r0)
            long[] r0 = new long[r2]
            r0[r1] = r3
            xhss.ᛵᛲᛴᛵ r7 = r7.m88(r0)
            java.lang.Object r7 = r7.first()
            xhss.ᲇᛸᛳᛸ r7 = (xhss.C1062) r7
            return r7
        L24:
            xhss.ᲇᛸᛳᛸ r4 = (xhss.C1062) r4
            java.lang.Integer r0 = r4.f3433
            r4 = 0
            if (r0 == 0) goto L48
            int r0 = r0.intValue()
            long r5 = xhss.AbstractC0954.m1548(r3, r0)
            long[] r0 = new long[r2]
            r0[r1] = r5
            xhss.ᛵᛲᛴᛵ r7 = r7.m88(r0)
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L42
            goto L46
        L42:
            java.lang.Object r4 = r7.first()
        L46:
            xhss.ᲇᛸᛳᛸ r4 = (xhss.C1062) r4
        L48:
            return r4
        L49:
            xhss.ᲇᛸᛳᛸ r4 = (xhss.C1062) r4
            java.util.ArrayList r0 = r4.f3431
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = xhss.AbstractC0249.m554(r0)
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L5a:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L76
            java.lang.Object r2 = r0.next()
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            long r4 = xhss.AbstractC0954.m1548(r3, r2)
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            r1.add(r2)
            goto L5a
        L76:
            long[] r0 = xhss.AbstractC0713.m1241(r1)
            xhss.ᛵᛲᛴᛵ r7 = r7.m88(r0)
            return r7
    }
}
