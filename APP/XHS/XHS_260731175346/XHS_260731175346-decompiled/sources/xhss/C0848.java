package xhss;

/* JADX INFO: renamed from: xhss.ᲀᛳᛲᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public class C0848 {

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public static final /* synthetic */ long f2755 = 0;
    private volatile /* synthetic */ java.lang.Object _cur$volatile;

    static {
            sun.misc.Unsafe r0 = xhss.AbstractC1067.f3442
            java.lang.Class<xhss.ᲀᛳᛲᲈ> r1 = xhss.C0848.class
            java.lang.String r2 = "_cur$volatile"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r2)
            long r0 = r0.objectFieldOffset(r1)
            xhss.C0848.f2755 = r0
            return
    }

    public C0848() {
            r3 = this;
            r3.<init>()
            xhss.ᛱᛴᛲᛳ r0 = new xhss.ᛱᛴᛲᛳ
            r1 = 8
            r2 = 0
            r0.<init>(r1, r2)
            r3._cur$volatile = r0
            return
    }

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final void m1432() {
            r9 = this;
        L0:
            sun.misc.Unsafe r0 = xhss.AbstractC1067.f3442
            long r1 = xhss.C0848.f2755
            java.lang.Object r0 = r0.getObjectVolatile(r9, r1)
            r7 = r0
            xhss.ᛱᛴᛲᛳ r7 = (xhss.C0033) r7
            boolean r0 = r7.m139()
            if (r0 == 0) goto L12
            return
        L12:
            xhss.ᛱᛴᛲᛳ r8 = r7.m140()
        L16:
            sun.misc.Unsafe r3 = xhss.AbstractC1067.f3442
            long r5 = xhss.C0848.f2755
            r4 = r9
            boolean r9 = r3.compareAndSwapObject(r4, r5, r7, r8)
            if (r9 == 0) goto L22
            goto L2a
        L22:
            sun.misc.Unsafe r9 = xhss.AbstractC1067.f3442
            java.lang.Object r9 = r9.getObjectVolatile(r4, r1)
            if (r9 == r7) goto L2c
        L2a:
            r9 = r4
            goto L0
        L2c:
            r9 = r4
            goto L16
    }

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final int m1433() {
            r4 = this;
            sun.misc.Unsafe r0 = xhss.AbstractC1067.f3442
            long r1 = xhss.C0848.f2755
            java.lang.Object r4 = r0.getObjectVolatile(r4, r1)
            xhss.ᛱᛴᛲᛳ r4 = (xhss.C0033) r4
            r4.getClass()
            sun.misc.Unsafe r0 = xhss.AbstractC1067.f3442
            long r1 = xhss.C0033.f213
            long r0 = r0.getLongVolatile(r4, r1)
            r2 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r2 = r2 & r0
            int r4 = (int) r2
            r2 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r0 = r0 & r2
            r2 = 30
            long r0 = r0 >> r2
            int r0 = (int) r0
            int r0 = r0 - r4
            r4 = 1073741823(0x3fffffff, float:1.9999999)
            r4 = r4 & r0
            return r4
    }

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final boolean m1434(java.lang.Runnable r10) {
            r9 = this;
        L0:
            sun.misc.Unsafe r0 = xhss.AbstractC1067.f3442
            long r1 = xhss.C0848.f2755
            java.lang.Object r0 = r0.getObjectVolatile(r9, r1)
            r7 = r0
            xhss.ᛱᛴᛲᛳ r7 = (xhss.C0033) r7
            int r0 = r7.m141(r10)
            r3 = 1
            if (r0 == 0) goto L35
            if (r0 == r3) goto L1b
            r1 = 2
            if (r0 == r1) goto L19
            r4 = r9
            goto L31
        L19:
            r9 = 0
            return r9
        L1b:
            xhss.ᛱᛴᛲᛳ r8 = r7.m140()
        L1f:
            sun.misc.Unsafe r3 = xhss.AbstractC1067.f3442
            long r5 = xhss.C0848.f2755
            r4 = r9
            boolean r9 = r3.compareAndSwapObject(r4, r5, r7, r8)
            if (r9 == 0) goto L2b
            goto L31
        L2b:
            java.lang.Object r9 = r3.getObjectVolatile(r4, r1)
            if (r9 == r7) goto L33
        L31:
            r9 = r4
            goto L0
        L33:
            r9 = r4
            goto L1f
        L35:
            return r3
    }

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public final java.lang.Object m1435() {
            r9 = this;
        L0:
            sun.misc.Unsafe r0 = xhss.AbstractC1067.f3442
            long r1 = xhss.C0848.f2755
            java.lang.Object r0 = r0.getObjectVolatile(r9, r1)
            r7 = r0
            xhss.ᛱᛴᛲᛳ r7 = (xhss.C0033) r7
            java.lang.Object r0 = r7.m142()
            xhss.ᛶᛲᛷᛵ r3 = xhss.C0033.f212
            if (r0 == r3) goto L14
            return r0
        L14:
            xhss.ᛱᛴᛲᛳ r8 = r7.m140()
        L18:
            sun.misc.Unsafe r3 = xhss.AbstractC1067.f3442
            long r5 = xhss.C0848.f2755
            r4 = r9
            boolean r9 = r3.compareAndSwapObject(r4, r5, r7, r8)
            if (r9 == 0) goto L24
            goto L2c
        L24:
            sun.misc.Unsafe r9 = xhss.AbstractC1067.f3442
            java.lang.Object r9 = r9.getObjectVolatile(r4, r1)
            if (r9 == r7) goto L2e
        L2c:
            r9 = r4
            goto L0
        L2e:
            r9 = r4
            goto L18
    }
}
