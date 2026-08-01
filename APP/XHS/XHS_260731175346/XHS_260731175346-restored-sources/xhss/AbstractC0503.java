package xhss;

/* JADX INFO: renamed from: xhss.ᛵᛸᛲᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0503 extends xhss.AbstractC0180 implements xhss.InterfaceC0654 {

    /* JADX INFO: renamed from: ᛸᛲᲀᛵ, reason: contains not printable characters */
    public static final /* synthetic */ int f1821 = 0;

    /* JADX INFO: renamed from: ᛸᛴᛶᛳ, reason: contains not printable characters */
    public static final /* synthetic */ long f1822 = 0;

    /* JADX INFO: renamed from: ᲀᲇᛳᲁ, reason: contains not printable characters */
    public static final /* synthetic */ long f1823 = 0;

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public static final /* synthetic */ long f1824 = 0;
    private volatile /* synthetic */ java.lang.Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile;
    private volatile /* synthetic */ java.lang.Object _queue$volatile;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public long f1825;

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public xhss.C0801 f1826;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public boolean f1827;

    static {
            sun.misc.Unsafe r0 = xhss.AbstractC1067.f3442
            java.lang.Class<xhss.ᛵᛸᛲᛲ> r1 = xhss.AbstractC0503.class
            java.lang.String r2 = "_queue$volatile"
            java.lang.reflect.Field r2 = r1.getDeclaredField(r2)
            long r2 = r0.objectFieldOffset(r2)
            xhss.AbstractC0503.f1822 = r2
            java.lang.String r2 = "_delayed$volatile"
            java.lang.reflect.Field r2 = r1.getDeclaredField(r2)
            long r2 = r0.objectFieldOffset(r2)
            xhss.AbstractC0503.f1824 = r2
            java.lang.String r2 = "_isCompleted$volatile"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r2)
            long r0 = r0.objectFieldOffset(r1)
            xhss.AbstractC0503.f1823 = r0
            return
    }

    public AbstractC0503() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1._isCompleted$volatile = r0
            return
    }

    public void shutdown() {
            r11 = this;
            java.lang.ThreadLocal r0 = xhss.AbstractC0863.f2793
            r6 = 0
            r0.set(r6)
            sun.misc.Unsafe r0 = xhss.AbstractC1067.f3442
            long r2 = xhss.AbstractC0503.f1823
            r7 = 1
            r0.putIntVolatile(r11, r2, r7)
            xhss.ᛶᛲᛷᛵ r5 = xhss.C0614.f2121
            long r8 = xhss.AbstractC0503.f1822
        L12:
            sun.misc.Unsafe r0 = xhss.AbstractC1067.f3442
            java.lang.Object r4 = r0.getObjectVolatile(r11, r8)
            if (r4 != 0) goto L32
        L1a:
            sun.misc.Unsafe r0 = xhss.AbstractC1067.f3442
            long r2 = xhss.AbstractC0503.f1822
            r4 = 0
            r1 = r11
            boolean r2 = r0.compareAndSwapObject(r1, r2, r4, r5)
            r10 = r5
            if (r2 == 0) goto L28
            goto L58
        L28:
            java.lang.Object r0 = r0.getObjectVolatile(r11, r8)
            if (r0 == 0) goto L30
            goto L94
        L30:
            r5 = r10
            goto L1a
        L32:
            r10 = r5
            boolean r0 = r4 instanceof xhss.C0033
            if (r0 == 0) goto L3d
            xhss.ᛱᛴᛲᛳ r4 = (xhss.C0033) r4
            r4.m139()
            goto L58
        L3d:
            if (r4 != r10) goto L40
            goto L58
        L40:
            xhss.ᛱᛴᛲᛳ r5 = new xhss.ᛱᛴᛲᛳ
            r0 = 8
            r5.<init>(r0, r7)
            r0 = r4
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            r5.m141(r0)
        L4d:
            sun.misc.Unsafe r0 = xhss.AbstractC1067.f3442
            long r2 = xhss.AbstractC0503.f1822
            r1 = r11
            boolean r2 = r0.compareAndSwapObject(r1, r2, r4, r5)
            if (r2 == 0) goto L8e
        L58:
            long r2 = r11.m919()
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L58
            long r2 = java.lang.System.nanoTime()
        L66:
            sun.misc.Unsafe r0 = xhss.AbstractC1067.f3442
            long r4 = xhss.AbstractC0503.f1824
            java.lang.Object r0 = r0.getObjectVolatile(r11, r4)
            r4 = r0
            xhss.ᛵᛲᲀᛵ r4 = (xhss.C0448) r4
            if (r4 == 0) goto L8d
            monitor-enter(r4)
            int r0 = r4.m1544()     // Catch: java.lang.Throwable -> L80
            if (r0 <= 0) goto L82
            r0 = 0
            xhss.ᲇᛴᲀᛴ r0 = r4.m1545(r0)     // Catch: java.lang.Throwable -> L80
            goto L83
        L80:
            r0 = move-exception
            goto L8b
        L82:
            r0 = r6
        L83:
            monitor-exit(r4)
            if (r0 != 0) goto L87
            goto L8d
        L87:
            r11.mo916(r2, r0)
            goto L66
        L8b:
            monitor-exit(r4)
            throw r0
        L8d:
            return
        L8e:
            java.lang.Object r0 = r0.getObjectVolatile(r11, r8)
            if (r0 == r4) goto L4d
        L94:
            r5 = r10
            goto L12
    }

    @Override // xhss.InterfaceC0654
    /* JADX INFO: renamed from: ᛱᛱᛲᲇ */
    public final void mo903(long r4, xhss.C0172 r6) {
            r3 = this;
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 > 0) goto L7
            goto L1a
        L7:
            r0 = 9223372036854(0x8637bd05af6, double:4.5569512622224E-311)
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 < 0) goto L16
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L1a
        L16:
            r0 = 1000000(0xf4240, double:4.940656E-318)
            long r0 = r0 * r4
        L1a:
            r4 = 4611686018427387903(0x3fffffffffffffff, double:1.9999999999999998)
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 >= 0) goto L39
            long r4 = java.lang.System.nanoTime()
            xhss.ᛱᲇᛲ r2 = new xhss.ᛱᲇᛲ
            long r0 = r0 + r4
            r2.<init>(r3, r0, r6)
            r3.m909(r4, r2)
            xhss.ᛵᲇᛶᛸ r3 = new xhss.ᛵᲇᛶᛸ
            r4 = 1
            r3.<init>(r4, r2)
            xhss.AbstractC0060.m186(r6, r3)
        L39:
            return
    }

    /* JADX INFO: renamed from: ᛱᛳᲁᲈ, reason: contains not printable characters */
    public final void m909(long r12, xhss.AbstractRunnableC1032 r14) {
            r11 = this;
            long r0 = xhss.AbstractC0503.f1824
            sun.misc.Unsafe r2 = xhss.AbstractC1067.f3442
            long r3 = xhss.AbstractC0503.f1823
            int r3 = r2.getIntVolatile(r11, r3)
            r4 = 1
            if (r3 == 0) goto L10
            r6 = r11
            r11 = r4
            goto L42
        L10:
            java.lang.Object r3 = r2.getObjectVolatile(r11, r0)
            xhss.ᛵᛲᲀᛵ r3 = (xhss.C0448) r3
            if (r3 != 0) goto L3d
            xhss.ᛵᛲᲀᛵ r10 = new xhss.ᛵᛲᲀᛵ
            r10.<init>()
            r10.f1601 = r12
        L1f:
            sun.misc.Unsafe r5 = xhss.AbstractC1067.f3442
            long r7 = xhss.AbstractC0503.f1824
            r9 = 0
            r6 = r11
            boolean r11 = r5.compareAndSwapObject(r6, r7, r9, r10)
            if (r11 == 0) goto L2c
            goto L32
        L2c:
            java.lang.Object r11 = r5.getObjectVolatile(r6, r0)
            if (r11 == 0) goto L3b
        L32:
            java.lang.Object r11 = r5.getObjectVolatile(r6, r0)
            r3 = r11
            xhss.ᛵᛲᲀᛵ r3 = (xhss.C0448) r3
            r2 = r5
            goto L3e
        L3b:
            r11 = r6
            goto L1f
        L3d:
            r6 = r11
        L3e:
            int r11 = r14.m1682(r12, r3, r6)
        L42:
            if (r11 == 0) goto L54
            if (r11 == r4) goto L50
            r12 = 2
            if (r11 != r12) goto L4a
            goto L7c
        L4a:
            java.lang.String r11 = "unexpected result"
            xhss.C0532.m950(r11)
            return
        L50:
            r6.mo916(r12, r14)
            return
        L54:
            java.lang.Object r11 = r2.getObjectVolatile(r6, r0)
            xhss.ᛵᛲᲀᛵ r11 = (xhss.C0448) r11
            r12 = 0
            if (r11 == 0) goto L6d
            monitor-enter(r11)
            xhss.ᲇᛴᲀᛴ[] r13 = r11.f3089     // Catch: java.lang.Throwable -> L66
            if (r13 == 0) goto L69
            r12 = 0
            r12 = r13[r12]     // Catch: java.lang.Throwable -> L66
            goto L69
        L66:
            r0 = move-exception
            r12 = r0
            goto L6b
        L69:
            monitor-exit(r11)
            goto L6d
        L6b:
            monitor-exit(r11)
            throw r12
        L6d:
            if (r12 != r14) goto L7c
            java.lang.Thread r11 = r6.mo912()
            java.lang.Thread r12 = java.lang.Thread.currentThread()
            if (r12 == r11) goto L7c
            java.util.concurrent.locks.LockSupport.unpark(r11)
        L7c:
            return
    }

    /* JADX INFO: renamed from: ᛳᛶᛷᲀ, reason: contains not printable characters */
    public final void m910(boolean r5) {
            r4 = this;
            long r0 = r4.f1825
            if (r5 == 0) goto La
            r2 = 4294967296(0x100000000, double:2.121995791E-314)
            goto Lc
        La:
            r2 = 1
        Lc:
            long r2 = r2 + r0
            r4.f1825 = r2
            if (r5 != 0) goto L14
            r5 = 1
            r4.f1827 = r5
        L14:
            return
    }

    /* JADX INFO: renamed from: ᛳᲈᲈᛲ, reason: contains not printable characters */
    public final void m911() {
            r4 = this;
            long r0 = r4.f1825
            r2 = 4294967296(0x100000000, double:2.121995791E-314)
            long r0 = r0 - r2
            r4.f1825 = r0
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L11
            goto L18
        L11:
            boolean r0 = r4.f1827
            if (r0 == 0) goto L18
            r4.shutdown()
        L18:
            return
    }

    /* JADX INFO: renamed from: ᛴᲈᛱᛴ, reason: contains not printable characters */
    public abstract java.lang.Thread mo912();

    /* JADX INFO: renamed from: ᛶᲇᲈᛸ, reason: contains not printable characters */
    public void mo913(java.lang.Runnable r2) {
            r1 = this;
            r1.m915()
            boolean r0 = r1.m914(r2)
            if (r0 == 0) goto L17
            java.lang.Thread r1 = r1.mo912()
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            if (r2 == r1) goto L16
            java.util.concurrent.locks.LockSupport.unpark(r1)
        L16:
            return
        L17:
            xhss.ᛵᲈᛳᲀ r1 = xhss.RunnableC0528.f1929
            r1.mo913(r2)
            return
    }

    @Override // xhss.AbstractC0180
    /* JADX INFO: renamed from: ᛷᲁᲁ */
    public final void mo359(xhss.InterfaceC0362 r1, java.lang.Runnable r2) {
            r0 = this;
            r0.mo913(r2)
            return
    }

    /* JADX INFO: renamed from: ᛸᛲᛷᛱ, reason: contains not printable characters */
    public final boolean m914(java.lang.Runnable r15) {
            r14 = this;
        L0:
            sun.misc.Unsafe r0 = xhss.AbstractC1067.f3442
            long r1 = xhss.AbstractC0503.f1822
            java.lang.Object r7 = r0.getObjectVolatile(r14, r1)
            long r3 = xhss.AbstractC0503.f1823
            int r0 = r0.getIntVolatile(r14, r3)
            r3 = 0
            if (r0 == 0) goto L12
            return r3
        L12:
            r0 = 1
            if (r7 != 0) goto L2e
        L15:
            sun.misc.Unsafe r8 = xhss.AbstractC1067.f3442
            long r10 = xhss.AbstractC0503.f1822
            r12 = 0
            r9 = r14
            r13 = r15
            boolean r14 = r8.compareAndSwapObject(r9, r10, r12, r13)
            r4 = r9
            if (r14 == 0) goto L24
            goto L78
        L24:
            java.lang.Object r14 = r8.getObjectVolatile(r4, r1)
            if (r14 == 0) goto L2b
            goto L7f
        L2b:
            r14 = r4
            r15 = r13
            goto L15
        L2e:
            r4 = r14
            r13 = r15
            boolean r14 = r7 instanceof xhss.C0033
            if (r14 == 0) goto L59
            r14 = r7
            xhss.ᛱᛴᛲᛳ r14 = (xhss.C0033) r14
            int r15 = r14.m141(r13)
            if (r15 == 0) goto L78
            if (r15 == r0) goto L43
            r14 = 2
            if (r15 == r14) goto L5d
            goto L7f
        L43:
            xhss.ᛱᛴᛲᛳ r8 = r14.m140()
        L47:
            sun.misc.Unsafe r3 = xhss.AbstractC1067.f3442
            long r5 = xhss.AbstractC0503.f1822
            boolean r14 = r3.compareAndSwapObject(r4, r5, r7, r8)
            if (r14 == 0) goto L52
            goto L7f
        L52:
            java.lang.Object r14 = r3.getObjectVolatile(r4, r1)
            if (r14 == r7) goto L47
            goto L7f
        L59:
            xhss.ᛶᛲᛷᛵ r14 = xhss.C0614.f2121
            if (r7 != r14) goto L5e
        L5d:
            return r3
        L5e:
            xhss.ᛱᛴᛲᛳ r8 = new xhss.ᛱᛴᛲᛳ
            r14 = 8
            r8.<init>(r14, r0)
            r14 = r7
            java.lang.Runnable r14 = (java.lang.Runnable) r14
            r8.m141(r14)
            r8.m141(r13)
        L6e:
            sun.misc.Unsafe r3 = xhss.AbstractC1067.f3442
            long r5 = xhss.AbstractC0503.f1822
            boolean r14 = r3.compareAndSwapObject(r4, r5, r7, r8)
            if (r14 == 0) goto L79
        L78:
            return r0
        L79:
            java.lang.Object r14 = r3.getObjectVolatile(r4, r1)
            if (r14 == r7) goto L6e
        L7f:
            r14 = r4
            r15 = r13
            goto L0
    }

    /* JADX INFO: renamed from: ᛸᛶᛴᲈ, reason: contains not printable characters */
    public final void m915() {
            r10 = this;
            sun.misc.Unsafe r0 = xhss.AbstractC1067.f3442
            long r1 = xhss.AbstractC0503.f1824
            java.lang.Object r0 = r0.getObjectVolatile(r10, r1)
            xhss.ᛵᛲᲀᛵ r0 = (xhss.C0448) r0
            if (r0 == 0) goto L44
            int r1 = r0.m1544()
            if (r1 != 0) goto L13
            return
        L13:
            long r1 = java.lang.System.nanoTime()
        L17:
            monitor-enter(r0)
            xhss.ᲇᛴᲀᛴ[] r3 = r0.f3089     // Catch: java.lang.Throwable -> L35
            r4 = 0
            r5 = 0
            if (r3 == 0) goto L21
            r3 = r3[r5]     // Catch: java.lang.Throwable -> L35
            goto L22
        L21:
            r3 = r4
        L22:
            if (r3 != 0) goto L26
            monitor-exit(r0)
            goto L3f
        L26:
            long r6 = r3.f3336     // Catch: java.lang.Throwable -> L35
            long r6 = r1 - r6
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 < 0) goto L37
            boolean r3 = r10.m914(r3)     // Catch: java.lang.Throwable -> L35
            goto L38
        L35:
            r10 = move-exception
            goto L42
        L37:
            r3 = r5
        L38:
            if (r3 == 0) goto L3e
            xhss.ᲇᛴᲀᛴ r4 = r0.m1545(r5)     // Catch: java.lang.Throwable -> L35
        L3e:
            monitor-exit(r0)
        L3f:
            if (r4 != 0) goto L17
            goto L44
        L42:
            monitor-exit(r0)
            throw r10
        L44:
            return
    }

    /* JADX INFO: renamed from: ᲀᛷᲁᲀ, reason: contains not printable characters */
    public void mo916(long r1, xhss.AbstractRunnableC1032 r3) {
            r0 = this;
            xhss.ᛵᲈᛳᲀ r0 = xhss.RunnableC0528.f1929
            r0.m909(r1, r3)
            return
    }

    /* JADX INFO: renamed from: ᲁᛲᛴᛴ, reason: contains not printable characters */
    public final boolean m917() {
            r7 = this;
            xhss.ᛸᲀᛷᛷ r0 = r7.f1826
            r1 = 1
            if (r0 == 0) goto La
            boolean r0 = r0.isEmpty()
            goto Lb
        La:
            r0 = r1
        Lb:
            r2 = 0
            if (r0 != 0) goto Lf
            goto L50
        Lf:
            sun.misc.Unsafe r0 = xhss.AbstractC1067.f3442
            long r3 = xhss.AbstractC0503.f1824
            java.lang.Object r3 = r0.getObjectVolatile(r7, r3)
            xhss.ᛵᛲᲀᛵ r3 = (xhss.C0448) r3
            if (r3 == 0) goto L23
            int r3 = r3.m1544()
            if (r3 != 0) goto L22
            goto L23
        L22:
            return r2
        L23:
            long r3 = xhss.AbstractC0503.f1822
            java.lang.Object r7 = r0.getObjectVolatile(r7, r3)
            if (r7 != 0) goto L2c
            goto L4f
        L2c:
            boolean r3 = r7 instanceof xhss.C0033
            if (r3 == 0) goto L4b
            xhss.ᛱᛴᛲᛳ r7 = (xhss.C0033) r7
            long r3 = xhss.C0033.f213
            long r3 = r0.getLongVolatile(r7, r3)
            r5 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r5 = r5 & r3
            int r7 = (int) r5
            r5 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r3 = r3 & r5
            r0 = 30
            long r3 = r3 >> r0
            int r0 = (int) r3
            if (r7 != r0) goto L4a
            return r1
        L4a:
            return r2
        L4b:
            xhss.ᛶᛲᛷᛵ r0 = xhss.C0614.f2121
            if (r7 != r0) goto L50
        L4f:
            return r1
        L50:
            return r2
    }

    /* JADX INFO: renamed from: ᲁᛴᲇᛲ, reason: contains not printable characters */
    public final boolean m918() {
            r2 = this;
            xhss.ᛸᲀᛷᛷ r2 = r2.f1826
            r0 = 0
            if (r2 != 0) goto L6
            return r0
        L6:
            boolean r1 = r2.isEmpty()
            if (r1 == 0) goto Le
            r2 = 0
            goto L12
        Le:
            java.lang.Object r2 = r2.removeFirst()
        L12:
            xhss.ᲇᛷᛲᛱ r2 = (xhss.AbstractC1053) r2
            if (r2 != 0) goto L17
            return r0
        L17:
            r2.run()
            r2 = 1
            return r2
    }

    /* JADX INFO: renamed from: ᲈᛲᛵᲁ, reason: contains not printable characters */
    public final long m919() {
            r13 = this;
            xhss.ᛶᛲᛷᛵ r0 = xhss.C0614.f2121
            long r1 = xhss.AbstractC0503.f1822
            boolean r3 = r13.m918()
            r4 = 0
            if (r3 == 0) goto Le
            goto Lcc
        Le:
            r13.m915()
        L11:
            sun.misc.Unsafe r3 = xhss.AbstractC1067.f3442
            java.lang.Object r10 = r3.getObjectVolatile(r13, r1)
            r12 = 0
            if (r10 != 0) goto L1e
            r7 = r13
        L1b:
            r6 = r3
            r13 = r12
            goto L62
        L1e:
            boolean r6 = r10 instanceof xhss.C0033
            if (r6 == 0) goto L4f
            r6 = r10
            xhss.ᛱᛴᛲᛳ r6 = (xhss.C0033) r6
            java.lang.Object r7 = r6.m142()
            xhss.ᛶᛲᛷᛵ r8 = xhss.C0033.f212
            if (r7 == r8) goto L34
            java.lang.Runnable r7 = (java.lang.Runnable) r7
            r6 = r7
            r7 = r13
            r13 = r6
            r6 = r3
            goto L62
        L34:
            xhss.ᛱᛴᛲᛳ r11 = r6.m140()
        L38:
            sun.misc.Unsafe r6 = xhss.AbstractC1067.f3442
            long r8 = xhss.AbstractC0503.f1822
            r7 = r13
            boolean r13 = r6.compareAndSwapObject(r7, r8, r10, r11)
            if (r13 == 0) goto L45
            goto Ld7
        L45:
            java.lang.Object r13 = r6.getObjectVolatile(r7, r1)
            if (r13 == r10) goto L4d
            goto Ld7
        L4d:
            r13 = r7
            goto L38
        L4f:
            r7 = r13
            if (r10 != r0) goto L53
            goto L1b
        L53:
            sun.misc.Unsafe r6 = xhss.AbstractC1067.f3442
            long r8 = xhss.AbstractC0503.f1822
            r11 = 0
            boolean r13 = r6.compareAndSwapObject(r7, r8, r10, r11)
            if (r13 == 0) goto Ld1
            r13 = r10
            java.lang.Runnable r13 = (java.lang.Runnable) r13
            r3 = r6
        L62:
            if (r13 == 0) goto L68
            r13.run()
            return r4
        L68:
            xhss.ᛸᲀᛷᛷ r13 = r7.f1826
            r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r13 != 0) goto L73
        L71:
            r10 = r8
            goto L7b
        L73:
            boolean r13 = r13.isEmpty()
            if (r13 == 0) goto L7a
            goto L71
        L7a:
            r10 = r4
        L7b:
            int r13 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r13 != 0) goto L80
            goto Lcc
        L80:
            java.lang.Object r13 = r3.getObjectVolatile(r7, r1)
            if (r13 == 0) goto La8
            boolean r1 = r13 instanceof xhss.C0033
            if (r1 == 0) goto La5
            xhss.ᛱᛴᛲᛳ r13 = (xhss.C0033) r13
            long r0 = xhss.C0033.f213
            long r0 = r6.getLongVolatile(r13, r0)
            r10 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r10 = r10 & r0
            int r13 = (int) r10
            r10 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r0 = r0 & r10
            r2 = 30
            long r0 = r0 >> r2
            int r0 = (int) r0
            if (r13 != r0) goto La4
            goto La8
        La4:
            return r4
        La5:
            if (r13 != r0) goto Lcc
            goto Ld0
        La8:
            long r0 = xhss.AbstractC0503.f1824
            java.lang.Object r13 = r3.getObjectVolatile(r7, r0)
            xhss.ᛵᛲᲀᛵ r13 = (xhss.C0448) r13
            if (r13 == 0) goto Ld0
            monitor-enter(r13)
            xhss.ᲇᛴᲀᛴ[] r0 = r13.f3089     // Catch: java.lang.Throwable -> Lbb
            if (r0 == 0) goto Lbd
            r1 = 0
            r12 = r0[r1]     // Catch: java.lang.Throwable -> Lbb
            goto Lbd
        Lbb:
            r0 = move-exception
            goto Lce
        Lbd:
            monitor-exit(r13)
            if (r12 != 0) goto Lc1
            goto Ld0
        Lc1:
            long r0 = r12.f3336
            long r2 = java.lang.System.nanoTime()
            long r0 = r0 - r2
            int r13 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r13 >= 0) goto Lcd
        Lcc:
            return r4
        Lcd:
            return r0
        Lce:
            monitor-exit(r13)
            throw r0
        Ld0:
            return r8
        Ld1:
            java.lang.Object r13 = r6.getObjectVolatile(r7, r1)
            if (r13 == r10) goto L53
        Ld7:
            r13 = r7
            goto L11
    }
}
