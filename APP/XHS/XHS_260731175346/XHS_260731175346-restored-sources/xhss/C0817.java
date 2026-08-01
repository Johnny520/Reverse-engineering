package xhss;

/* JADX INFO: renamed from: xhss.ᛸᲇᲁᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0817 extends xhss.AbstractC1053 implements xhss.InterfaceC0108, xhss.InterfaceC0038 {

    /* JADX INFO: renamed from: ᛸᛲᲀᛵ, reason: contains not printable characters */
    public static final /* synthetic */ long f2652 = 0;
    private volatile /* synthetic */ java.lang.Object _reusableCancellableContinuation$volatile;

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public final xhss.AbstractC0180 f2653;

    /* JADX INFO: renamed from: ᛸᛴᛶᛳ, reason: contains not printable characters */
    public final java.lang.Object f2654;

    /* JADX INFO: renamed from: ᲀᲇᛳᲁ, reason: contains not printable characters */
    public java.lang.Object f2655;

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public final xhss.AbstractC0748 f2656;

    static {
            sun.misc.Unsafe r0 = xhss.AbstractC1067.f3442
            java.lang.Class<xhss.ᛸᲇᲁᛱ> r1 = xhss.C0817.class
            java.lang.String r2 = "_reusableCancellableContinuation$volatile"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r2)
            long r0 = r0.objectFieldOffset(r1)
            xhss.C0817.f2652 = r0
            return
    }

    public C0817(xhss.AbstractC0180 r2, xhss.AbstractC0748 r3) {
            r1 = this;
            r0 = -1
            r1.<init>(r0)
            r1.f2653 = r2
            r1.f2656 = r3
            xhss.ᛶᛲᛷᛵ r2 = xhss.AbstractC1178.f3792
            r1.f2655 = r2
            xhss.ᛴᛵᛳᛵ r2 = r3.f2508
            r3 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            xhss.ᲁᛱᲀᛲ r0 = xhss.C0614.f2122
            java.lang.Object r2 = r2.mo598(r3, r0)
            r1.f2654 = r2
            return
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "DispatchedContinuation["
            r0.<init>(r1)
            xhss.ᛲᛶᲇᲇ r1 = r2.f2653
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            xhss.ᛸᛴᛳᛷ r2 = r2.f2656
            java.lang.String r2 = xhss.AbstractC0561.m999(r2)
            r0.append(r2)
            r2 = 93
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    @Override // xhss.AbstractC1053
    /* JADX INFO: renamed from: ᛱᛱᛲᲇ */
    public final xhss.InterfaceC0038 mo412() {
            r0 = this;
            return r0
    }

    @Override // xhss.InterfaceC0108
    /* JADX INFO: renamed from: ᛷᛴᛷᛱ */
    public final xhss.InterfaceC0108 mo296() {
            r0 = this;
            xhss.ᛸᛴᛳᛷ r0 = r0.f2656
            return r0
    }

    @Override // xhss.AbstractC1053
    /* JADX INFO: renamed from: ᛸᛲᲀᛵ */
    public final java.lang.Object mo420() {
            r2 = this;
            java.lang.Object r0 = r2.f2655
            xhss.ᛶᛲᛷᛵ r1 = xhss.AbstractC1178.f3792
            r2.f2655 = r1
            return r0
    }

    @Override // xhss.InterfaceC0038
    /* JADX INFO: renamed from: ᛸᛴᛶᛳ */
    public final void mo152(java.lang.Object r10) {
            r9 = this;
            java.lang.Throwable r0 = xhss.AbstractC0134.m364(r10)
            r1 = 0
            if (r0 != 0) goto L9
            r2 = r10
            goto Le
        L9:
            xhss.ᛷᲁᲇᛷ r2 = new xhss.ᛷᲁᲇᛷ
            r2.<init>(r0, r1)
        Le:
            xhss.ᛸᛴᛳᛷ r0 = r9.f2656
            xhss.ᛴᛵᛳᛵ r3 = r0.f2508
            xhss.ᛲᛶᲇᲇ r4 = r9.f2653
            boolean r5 = r4.mo441(r3)
            if (r5 == 0) goto L22
            r9.f2655 = r2
            r9.f3380 = r1
            r4.mo359(r3, r9)
            return
        L22:
            xhss.ᛵᛸᛲᛲ r4 = xhss.AbstractC0863.m1439()
            long r5 = r4.f1825
            r7 = 4294967296(0x100000000, double:2.121995791E-314)
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 < 0) goto L44
            r9.f2655 = r2
            r9.f3380 = r1
            xhss.ᛸᲀᛷᛷ r10 = r4.f1826
            if (r10 != 0) goto L40
            xhss.ᛸᲀᛷᛷ r10 = new xhss.ᛸᲀᛷᛷ
            r10.<init>()
            r4.f1826 = r10
        L40:
            r10.addLast(r9)
            return
        L44:
            r1 = 1
            r4.m910(r1)
            java.lang.Object r1 = r9.f2654     // Catch: java.lang.Throwable -> L5e
            java.lang.Object r1 = xhss.C0614.m1072(r3, r1)     // Catch: java.lang.Throwable -> L5e
            r0.mo152(r10)     // Catch: java.lang.Throwable -> L60
            xhss.C0614.m1065(r3, r1)     // Catch: java.lang.Throwable -> L5e
        L54:
            boolean r10 = r4.m918()     // Catch: java.lang.Throwable -> L5e
            if (r10 != 0) goto L54
        L5a:
            r4.m911()
            goto L69
        L5e:
            r10 = move-exception
            goto L65
        L60:
            r10 = move-exception
            xhss.C0614.m1065(r3, r1)     // Catch: java.lang.Throwable -> L5e
            throw r10     // Catch: java.lang.Throwable -> L5e
        L65:
            r9.m1713(r10)     // Catch: java.lang.Throwable -> L6a
            goto L5a
        L69:
            return
        L6a:
            r9 = move-exception
            r4.m911()
            throw r9
    }

    @Override // xhss.InterfaceC0038
    /* JADX INFO: renamed from: ᲇᛶᛴᲀ */
    public final xhss.InterfaceC0362 mo153() {
            r0 = this;
            xhss.ᛸᛴᛳᛷ r0 = r0.f2656
            xhss.ᛴᛵᛳᛵ r0 = r0.f2508
            return r0
    }
}
