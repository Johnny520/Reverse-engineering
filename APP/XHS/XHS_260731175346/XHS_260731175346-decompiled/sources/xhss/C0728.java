package xhss;

/* JADX INFO: renamed from: xhss.ᛸᛱᲁᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0728 extends xhss.AbstractC0352 implements xhss.InterfaceC0030 {

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final /* synthetic */ int f2459;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public final /* synthetic */ java.lang.Object f2460;

    public /* synthetic */ C0728(int r1, java.lang.Object r2) {
            r0 = this;
            r0.f2459 = r1
            r0.f2460 = r2
            r1 = 0
            r0.<init>(r1)
            return
    }

    @Override // xhss.InterfaceC0030
    /* JADX INFO: renamed from: ᛷᛵᛵᲈ */
    public final java.lang.Object mo136() {
            r5 = this;
            int r0 = r5.f2459
            java.lang.Object r5 = r5.f2460
            switch(r0) {
                case 0: goto L81;
                case 1: goto L78;
                case 2: goto L4d;
                case 3: goto L43;
                case 4: goto L39;
                default: goto L7;
            }
        L7:
            xhss.ᲁᲇᛸᲀ r5 = (xhss.InterfaceC0996) r5
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.Class<xhss.ᲀᲀᛸᛸ> r1 = xhss.C0899.class
            xhss.ᛱᛸᛷᛸ r1 = xhss.AbstractC0256.m565(r1)
            xhss.ᛵᛳᲇ r2 = new xhss.ᛵᛳᲇ
            r1.mo236()
            r2.<init>()
            r0.add(r2)
            r1 = 0
            xhss.ᛵᛳᲇ[] r1 = new xhss.C0460[r1]
            java.lang.Object[] r0 = r0.toArray(r1)
            xhss.ᛵᛳᲇ[] r0 = (xhss.C0460[]) r0
            int r1 = r0.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
            xhss.ᛵᛳᲇ[] r0 = (xhss.C0460[]) r0
            r5.mo1290()
            xhss.ᛱᲈᛴᛲ r5 = (xhss.InterfaceC0114) r5
            r5.mo309()
            r5 = 0
            throw r5
        L39:
            xhss.ᲇᛴᲇᛴ r0 = new xhss.ᲇᛴᲇᛴ
            xhss.ᛳᛸᛸᛵ r5 = (xhss.C0303) r5
            java.lang.String r5 = r5.f1153
            r0.<init>(r5)
            return r0
        L43:
            xhss.ᛷᛲᛲᛲ r0 = new xhss.ᛷᛲᛲᛲ
            xhss.ᲀᛷᲀᲇ r5 = (xhss.C0877) r5
            java.lang.String r5 = r5.f2828
            r0.<init>(r5)
            return r0
        L4d:
            xhss.ᲇᛴᲇᛴ r5 = (xhss.C1035) r5
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "("
            r0.<init>(r1)
            java.util.ArrayList r1 = r5.f3341
            xhss.ᲀᲈᲇᛱ r2 = xhss.C0919.f2959
            r3 = 30
            java.lang.String r4 = ""
            java.lang.String r1 = xhss.AbstractC0713.m1242(r1, r4, r2, r3)
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r5 = r5.f3344
            java.lang.String r5 = xhss.AbstractC0021.m124(r5)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            return r5
        L78:
            xhss.ᛷᛲᛲᛲ r5 = (xhss.C0630) r5
            java.lang.String r5 = r5.f2168
            java.lang.String r5 = xhss.AbstractC0021.m124(r5)
            return r5
        L81:
            xhss.ᲇᛶᛳᛵ r0 = new xhss.ᲇᛶᛳᛵ
            xhss.ᲇᛸᛳᛸ r5 = (xhss.C1062) r5
            java.lang.String r5 = r5.f3427
            r0.<init>(r5)
            return r0
    }
}
