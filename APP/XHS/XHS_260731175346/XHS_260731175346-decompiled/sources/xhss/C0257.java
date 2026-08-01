package xhss;

/* JADX INFO: renamed from: xhss.ᛳᛳᲈᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0257 extends xhss.AbstractC0381 {

    /* JADX INFO: renamed from: ᛸᛲᲀᛵ, reason: contains not printable characters */
    public static final /* synthetic */ long f947 = 0;
    private volatile /* synthetic */ java.lang.Object _disposer$volatile;

    /* JADX INFO: renamed from: ᛸᛴᛶᛳ, reason: contains not printable characters */
    public final /* synthetic */ xhss.C0724 f948;

    /* JADX INFO: renamed from: ᲀᲇᛳᲁ, reason: contains not printable characters */
    public xhss.InterfaceC0022 f949;

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public final xhss.C0172 f950;

    static {
            sun.misc.Unsafe r0 = xhss.AbstractC1067.f3442
            java.lang.Class<xhss.ᛳᛳᲈᲈ> r1 = xhss.C0257.class
            java.lang.String r2 = "_disposer$volatile"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r2)
            long r0 = r0.objectFieldOffset(r1)
            xhss.C0257.f947 = r0
            return
    }

    public C0257(xhss.C0724 r1, xhss.C0172 r2) {
            r0 = this;
            r0.f948 = r1
            r0.<init>()
            r0.f950 = r2
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
    public final void mo439(java.lang.Throwable r12) {
            r11 = this;
            r0 = 0
            r1 = 0
            xhss.ᛲᛶᛳᲁ r3 = r11.f950
            if (r12 == 0) goto L54
            xhss.ᛷᲁᲇᛷ r8 = new xhss.ᛷᲁᲇᛷ
            r8.<init>(r12, r1)
            xhss.ᛶᛲᛷᛵ r12 = xhss.AbstractC0007.f149
            long r9 = xhss.C0172.f687
        Lf:
            sun.misc.Unsafe r1 = xhss.AbstractC1067.f3442
            java.lang.Object r6 = r1.getObjectVolatile(r3, r9)
            boolean r2 = r6 instanceof xhss.InterfaceC0214
            if (r2 == 0) goto L3f
            r1 = r6
            xhss.ᛲᲇᛱᛶ r1 = (xhss.InterfaceC0214) r1
            int r2 = r3.f3380
            java.lang.Object r7 = xhss.C0172.m411(r1, r8, r2)
        L22:
            sun.misc.Unsafe r2 = xhss.AbstractC1067.f3442
            long r4 = xhss.C0172.f687
            boolean r1 = r2.compareAndSwapObject(r3, r4, r6, r7)
            if (r1 == 0) goto L38
            boolean r0 = r3.m416()
            if (r0 != 0) goto L35
            r3.m418()
        L35:
            r0 = r12
            r1 = r2
            goto L3f
        L38:
            java.lang.Object r1 = r2.getObjectVolatile(r3, r9)
            if (r1 == r6) goto L22
            goto Lf
        L3f:
            if (r0 == 0) goto L98
            int r12 = r3.f3380
            r3.m421(r12)
            long r2 = xhss.C0257.f947
            java.lang.Object r11 = r1.getObjectVolatile(r11, r2)
            xhss.ᛷᲁᛸᲀ r11 = (xhss.C0707) r11
            if (r11 == 0) goto L98
            r11.m1226()
            return
        L54:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r12 = xhss.C0724.f2453
            xhss.ᛸᛱᛶᛲ r11 = r11.f948
            int r12 = r12.decrementAndGet(r11)
            if (r12 != 0) goto L98
            xhss.ᛲᛳᛲᛷ[] r11 = r11.f2454
            java.util.ArrayList r12 = new java.util.ArrayList
            int r2 = r11.length
            r12.<init>(r2)
            int r2 = r11.length
        L67:
            if (r1 >= r2) goto L95
            r4 = r11[r1]
            java.lang.Object r4 = r4.m1351()
            boolean r5 = r4 instanceof xhss.InterfaceC0204
            if (r5 != 0) goto L8f
            boolean r5 = r4 instanceof xhss.C0711
            if (r5 != 0) goto L8a
            boolean r5 = r4 instanceof xhss.C0853
            if (r5 == 0) goto L7f
            r5 = r4
            xhss.ᲀᛳᲈᛳ r5 = (xhss.C0853) r5
            goto L80
        L7f:
            r5 = r0
        L80:
            if (r5 == 0) goto L84
            xhss.ᛲᲀᛵᛳ r4 = r5.f2763
        L84:
            r12.add(r4)
            int r1 = r1 + 1
            goto L67
        L8a:
            xhss.ᛷᲁᲇᛷ r4 = (xhss.C0711) r4
            java.lang.Throwable r11 = r4.f2385
            throw r11
        L8f:
            java.lang.String r11 = "This job has not completed yet"
            xhss.C0532.m950(r11)
            return
        L95:
            r3.mo152(r12)
        L98:
            return
    }
}
