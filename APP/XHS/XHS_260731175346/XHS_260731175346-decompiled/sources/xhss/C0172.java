package xhss;

/* JADX INFO: renamed from: xhss.ᛲᛶᛳᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0172 extends xhss.AbstractC1053 implements xhss.InterfaceC0108, xhss.InterfaceC0038 {

    /* JADX INFO: renamed from: ᛸᛲᲀᛵ, reason: contains not printable characters */
    public static final /* synthetic */ long f687 = 0;

    /* JADX INFO: renamed from: ᛸᛴᛶᛳ, reason: contains not printable characters */
    public static final /* synthetic */ long f688 = 0;

    /* JADX INFO: renamed from: ᲀᲇᛳᲁ, reason: contains not printable characters */
    public static final /* synthetic */ long f689 = 0;
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ java.lang.Object _parentHandle$volatile;
    private volatile /* synthetic */ java.lang.Object _state$volatile;

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public final xhss.InterfaceC0038 f690;

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public final xhss.InterfaceC0362 f691;

    static {
            sun.misc.Unsafe r0 = xhss.AbstractC1067.f3442
            java.lang.Class<xhss.ᛲᛶᛳᲁ> r1 = xhss.C0172.class
            java.lang.String r2 = "_decisionAndIndex$volatile"
            java.lang.reflect.Field r2 = r1.getDeclaredField(r2)
            long r2 = r0.objectFieldOffset(r2)
            xhss.C0172.f689 = r2
            java.lang.String r2 = "_state$volatile"
            java.lang.reflect.Field r2 = r1.getDeclaredField(r2)
            long r2 = r0.objectFieldOffset(r2)
            xhss.C0172.f687 = r2
            java.lang.String r2 = "_parentHandle$volatile"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r2)
            long r0 = r0.objectFieldOffset(r1)
            xhss.C0172.f688 = r0
            return
    }

    public C0172(xhss.InterfaceC0038 r2) {
            r1 = this;
            r0 = 1
            r1.<init>(r0)
            r1.f690 = r2
            xhss.ᛴᛵᛳᛵ r2 = r2.mo153()
            r1.f691 = r2
            r2 = 536870911(0x1fffffff, float:1.0842021E-19)
            r1._decisionAndIndex$volatile = r2
            xhss.ᛶᲀᛵᲇ r2 = xhss.C0590.f2047
            r1._state$volatile = r2
            return
    }

    /* JADX INFO: renamed from: ᛴᲈᛱᛴ, reason: contains not printable characters */
    public static void m409(xhss.C0172 r9, java.lang.Object r10, int r11) {
        L0:
            sun.misc.Unsafe r0 = xhss.AbstractC1067.f3442
            long r1 = xhss.C0172.f687
            java.lang.Object r7 = r0.getObjectVolatile(r9, r1)
            boolean r3 = r7 instanceof xhss.InterfaceC0214
            if (r3 == 0) goto L35
            r0 = r7
            xhss.ᛲᲇᛱᛶ r0 = (xhss.InterfaceC0214) r0
            java.lang.Object r8 = m411(r0, r10, r11)
        L13:
            sun.misc.Unsafe r3 = xhss.AbstractC1067.f3442
            long r5 = xhss.C0172.f687
            r4 = r9
            boolean r9 = r3.compareAndSwapObject(r4, r5, r7, r8)
            if (r9 == 0) goto L2b
            boolean r9 = r4.m416()
            if (r9 != 0) goto L27
            r4.m418()
        L27:
            r4.m421(r11)
            return
        L2b:
            java.lang.Object r9 = r3.getObjectVolatile(r4, r1)
            if (r9 == r7) goto L33
            r9 = r4
            goto L0
        L33:
            r9 = r4
            goto L13
        L35:
            boolean r9 = r7 instanceof xhss.C0403
            if (r9 == 0) goto L47
            r1 = r7
            xhss.ᛴᲀᛳᛱ r1 = (xhss.C0403) r1
            r5 = 1
            long r2 = xhss.C0403.f1420
            r4 = 0
            boolean r9 = r0.compareAndSwapInt(r1, r2, r4, r5)
            if (r9 == 0) goto L47
            return
        L47:
            java.lang.String r9 = "Already resumed, but proposed with update "
            xhss.C0532.m948(r10, r9)
            return
    }

    /* JADX INFO: renamed from: ᛸᛶᛴᲈ, reason: contains not printable characters */
    public static void m410(xhss.InterfaceC0554 r3, java.lang.Object r4) {
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "It's prohibited to register multiple handlers, tried to register "
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r3 = ", already has "
            r1.append(r3)
            r1.append(r4)
            java.lang.String r3 = r1.toString()
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
    }

    /* JADX INFO: renamed from: ᲁᛲᛴᛴ, reason: contains not printable characters */
    public static java.lang.Object m411(xhss.InterfaceC0214 r2, java.lang.Object r3, int r4) {
            boolean r0 = r3 instanceof xhss.C0711
            if (r0 == 0) goto L5
            return r3
        L5:
            r0 = 1
            if (r4 == r0) goto Ld
            r0 = 2
            if (r4 != r0) goto Lc
            goto Ld
        Lc:
            return r3
        Ld:
            boolean r4 = r2 instanceof xhss.InterfaceC0554
            if (r4 != 0) goto L12
            return r3
        L12:
            xhss.ᲇᲁᛲᛳ r4 = new xhss.ᲇᲁᛲᛳ
            boolean r0 = r2 instanceof xhss.InterfaceC0554
            r1 = 0
            if (r0 == 0) goto L1c
            xhss.ᛶᛳᲁᲈ r2 = (xhss.InterfaceC0554) r2
            goto L1d
        L1c:
            r2 = r1
        L1d:
            r0 = 16
            r4.<init>(r3, r2, r1, r0)
            return r4
    }

    public final java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "CancellableContinuation("
            r0.<init>(r1)
            xhss.ᛱᛴᛶᛴ r1 = r4.f690
            java.lang.String r1 = xhss.AbstractC0561.m999(r1)
            r0.append(r1)
            java.lang.String r1 = "){"
            r0.append(r1)
            sun.misc.Unsafe r1 = xhss.AbstractC1067.f3442
            long r2 = xhss.C0172.f687
            java.lang.Object r1 = r1.getObjectVolatile(r4, r2)
            boolean r2 = r1 instanceof xhss.InterfaceC0214
            if (r2 == 0) goto L24
            java.lang.String r1 = "Active"
            goto L2d
        L24:
            boolean r1 = r1 instanceof xhss.C0403
            if (r1 == 0) goto L2b
            java.lang.String r1 = "Cancelled"
            goto L2d
        L2b:
            java.lang.String r1 = "Completed"
        L2d:
            r0.append(r1)
            java.lang.String r1 = "}@"
            r0.append(r1)
            java.lang.String r4 = xhss.AbstractC0561.m1011(r4)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            return r4
    }

    @Override // xhss.AbstractC1053
    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final xhss.InterfaceC0038 mo412() {
            r0 = this;
            xhss.ᛱᛴᛶᛴ r0 = r0.f690
            return r0
    }

    /* JADX INFO: renamed from: ᛳᛶᛷᲀ, reason: contains not printable characters */
    public final void m413(xhss.AbstractC0180 r4) {
            r3 = this;
            xhss.ᛱᛴᛶᛴ r0 = r3.f690
            boolean r1 = r0 instanceof xhss.C0817
            r2 = 0
            if (r1 == 0) goto La
            xhss.ᛸᲇᲁᛱ r0 = (xhss.C0817) r0
            goto Lb
        La:
            r0 = r2
        Lb:
            if (r0 == 0) goto Lf
            xhss.ᛲᛶᲇᲇ r2 = r0.f2653
        Lf:
            if (r2 != r4) goto L13
            r4 = 4
            goto L15
        L13:
            int r4 = r3.f3380
        L15:
            xhss.ᛵᛷᲈᛶ r0 = xhss.C0500.f1817
            m409(r3, r0, r4)
            return
    }

    @Override // xhss.AbstractC1053
    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final java.lang.Throwable mo414(java.lang.Object r1) {
            r0 = this;
            java.lang.Throwable r0 = super.mo414(r1)
            if (r0 == 0) goto L7
            return r0
        L7:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: ᛳᲈᲈᛲ, reason: contains not printable characters */
    public final xhss.InterfaceC0022 m415() {
            r9 = this;
            xhss.ᛴᛵᛳᛵ r0 = r9.f691
            xhss.ᛳᛴᲀᲁ r1 = xhss.C0263.f977
            xhss.ᛳᛵᲈᛲ r0 = r0.mo442(r1)
            xhss.ᛸᛷᛳᲈ r0 = (xhss.AbstractC0784) r0
            if (r0 != 0) goto Le
            r9 = 0
            return r9
        Le:
            xhss.ᛳᛶᛳᛳ r1 = new xhss.ᛳᛶᛳᛳ
            r1.<init>(r9)
            r2 = 1
            xhss.ᛱᛲᲁᲇ r8 = xhss.AbstractC0473.m862(r0, r2, r1)
        L18:
            sun.misc.Unsafe r3 = xhss.AbstractC1067.f3442
            long r5 = xhss.C0172.f688
            r7 = 0
            r4 = r9
            boolean r9 = r3.compareAndSwapObject(r4, r5, r7, r8)
            if (r9 == 0) goto L25
            goto L2b
        L25:
            java.lang.Object r9 = r3.getObjectVolatile(r4, r5)
            if (r9 == 0) goto L2c
        L2b:
            return r8
        L2c:
            r9 = r4
            goto L18
    }

    /* JADX INFO: renamed from: ᛶᲇᲈᛸ, reason: contains not printable characters */
    public final boolean m416() {
            r3 = this;
            int r0 = r3.f3380
            r1 = 2
            if (r0 != r1) goto L15
            xhss.ᛱᛴᛶᛴ r3 = r3.f690
            xhss.ᛸᲇᲁᛱ r3 = (xhss.C0817) r3
            sun.misc.Unsafe r0 = xhss.AbstractC1067.f3442
            long r1 = xhss.C0817.f2652
            java.lang.Object r3 = r0.getObjectVolatile(r3, r1)
            if (r3 == 0) goto L15
            r3 = 1
            return r3
        L15:
            r3 = 0
            return r3
    }

    @Override // xhss.InterfaceC0108
    /* JADX INFO: renamed from: ᛷᛴᛷᛱ */
    public final xhss.InterfaceC0108 mo296() {
            r1 = this;
            xhss.ᛱᛴᛶᛴ r1 = r1.f690
            boolean r0 = r1 instanceof xhss.InterfaceC0108
            if (r0 == 0) goto L9
            xhss.ᛱᲇᲀᛷ r1 = (xhss.InterfaceC0108) r1
            return r1
        L9:
            r1 = 0
            return r1
    }

    @Override // xhss.AbstractC1053
    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final void mo417(java.util.concurrent.CancellationException r10) {
            r9 = this;
        L0:
            sun.misc.Unsafe r0 = xhss.AbstractC1067.f3442
            long r1 = xhss.C0172.f687
            java.lang.Object r7 = r0.getObjectVolatile(r9, r1)
            boolean r0 = r7 instanceof xhss.InterfaceC0214
            if (r0 != 0) goto L60
            boolean r0 = r7 instanceof xhss.C0711
            if (r0 == 0) goto L11
            goto L57
        L11:
            boolean r0 = r7 instanceof xhss.C1088
            r3 = 0
            if (r0 == 0) goto L45
            r0 = r7
            xhss.ᲇᲁᛲᛳ r0 = (xhss.C1088) r0
            java.lang.Throwable r4 = r0.f3515
            if (r4 != 0) goto L3f
            r4 = 15
            xhss.ᲇᲁᛲᛳ r8 = xhss.C1088.m1774(r0, r3, r10, r4)
        L23:
            sun.misc.Unsafe r3 = xhss.AbstractC1067.f3442
            long r5 = xhss.C0172.f687
            r4 = r9
            boolean r9 = r3.compareAndSwapObject(r4, r5, r7, r8)
            if (r9 == 0) goto L36
            xhss.ᛶᛳᲁᲈ r9 = r0.f3512
            if (r9 == 0) goto L57
            r4.m422(r9, r10)
            return
        L36:
            java.lang.Object r9 = r3.getObjectVolatile(r4, r1)
            if (r9 == r7) goto L3d
            goto L5e
        L3d:
            r9 = r4
            goto L23
        L3f:
            java.lang.String r9 = "Must be called at most once"
            xhss.C0532.m950(r9)
            return
        L45:
            r4 = r9
            xhss.ᲇᲁᛲᛳ r8 = new xhss.ᲇᲁᛲᛳ
            r9 = 14
            r8.<init>(r7, r3, r10, r9)
        L4d:
            sun.misc.Unsafe r3 = xhss.AbstractC1067.f3442
            long r5 = xhss.C0172.f687
            boolean r9 = r3.compareAndSwapObject(r4, r5, r7, r8)
            if (r9 == 0) goto L58
        L57:
            return
        L58:
            java.lang.Object r9 = r3.getObjectVolatile(r4, r1)
            if (r9 == r7) goto L4d
        L5e:
            r9 = r4
            goto L0
        L60:
            java.lang.String r9 = "Not completed"
            xhss.C0532.m950(r9)
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᲁ, reason: contains not printable characters */
    public final void m418() {
            r4 = this;
            sun.misc.Unsafe r0 = xhss.AbstractC1067.f3442
            long r1 = xhss.C0172.f688
            java.lang.Object r3 = r0.getObjectVolatile(r4, r1)
            xhss.ᛱᛲᲁᲇ r3 = (xhss.InterfaceC0022) r3
            if (r3 != 0) goto Ld
            return
        Ld:
            r3.mo125()
            xhss.ᛵᛵᲇᛳ r3 = xhss.C0475.f1712
            r0.putObjectVolatile(r4, r1, r3)
            return
    }

    /* JADX INFO: renamed from: ᛸᛲᛷᛱ, reason: contains not printable characters */
    public final void m419() {
            r10 = this;
            xhss.ᛱᛴᛶᛴ r0 = r10.f690
            boolean r1 = r0 instanceof xhss.C0817
            r2 = 0
            if (r1 == 0) goto Lb
            xhss.ᛸᲇᲁᛱ r0 = (xhss.C0817) r0
            r4 = r0
            goto Lc
        Lb:
            r4 = r2
        Lc:
            if (r4 == 0) goto L63
            long r0 = xhss.C0817.f2652
        L10:
            sun.misc.Unsafe r3 = xhss.AbstractC1067.f3442
            java.lang.Object r7 = r3.getObjectVolatile(r4, r0)
            r3 = r7
            xhss.ᛶᛲᛷᛵ r7 = xhss.AbstractC1178.f3789
            if (r3 != r7) goto L32
        L1b:
            sun.misc.Unsafe r3 = xhss.AbstractC1067.f3442
            long r5 = xhss.C0817.f2652
            r8 = r10
            boolean r10 = r3.compareAndSwapObject(r4, r5, r7, r8)
            r9 = r8
            if (r10 == 0) goto L28
            goto L46
        L28:
            java.lang.Object r10 = r3.getObjectVolatile(r4, r0)
            if (r10 == r7) goto L30
            r10 = r9
            goto L10
        L30:
            r10 = r9
            goto L1b
        L32:
            r9 = r10
            boolean r10 = r3 instanceof java.lang.Throwable
            if (r10 == 0) goto L5d
            r7 = r3
        L38:
            sun.misc.Unsafe r3 = xhss.AbstractC1067.f3442
            long r5 = xhss.C0817.f2652
            r8 = 0
            boolean r10 = r3.compareAndSwapObject(r4, r5, r7, r8)
            if (r10 == 0) goto L50
            r2 = r7
            java.lang.Throwable r2 = (java.lang.Throwable) r2
        L46:
            if (r2 != 0) goto L49
            goto L63
        L49:
            r9.m418()
            r9.m425(r2)
            return
        L50:
            java.lang.Object r10 = r3.getObjectVolatile(r4, r0)
            if (r10 != r7) goto L57
            goto L38
        L57:
            java.lang.String r10 = "Failed requirement."
            xhss.C0532.m959(r10)
            return
        L5d:
            r7 = r3
            java.lang.String r10 = "Inconsistent state "
            xhss.C0532.m948(r7, r10)
        L63:
            return
    }

    @Override // xhss.AbstractC1053
    /* JADX INFO: renamed from: ᛸᛲᲀᛵ, reason: contains not printable characters */
    public final java.lang.Object mo420() {
            r3 = this;
            sun.misc.Unsafe r0 = xhss.AbstractC1067.f3442
            long r1 = xhss.C0172.f687
            java.lang.Object r3 = r0.getObjectVolatile(r3, r1)
            return r3
    }

    @Override // xhss.InterfaceC0038
    /* JADX INFO: renamed from: ᛸᛴᛶᛳ */
    public final void mo152(java.lang.Object r3) {
            r2 = this;
            java.lang.Throwable r0 = xhss.AbstractC0134.m364(r3)
            if (r0 != 0) goto L7
            goto Ld
        L7:
            xhss.ᛷᲁᲇᛷ r3 = new xhss.ᛷᲁᲇᛷ
            r1 = 0
            r3.<init>(r0, r1)
        Ld:
            int r0 = r2.f3380
            m409(r2, r3, r0)
            return
    }

    /* JADX INFO: renamed from: ᛸᛶᲈᛶ, reason: contains not printable characters */
    public final void m421(int r7) {
            r6 = this;
        L0:
            sun.misc.Unsafe r0 = xhss.AbstractC1067.f3442
            long r2 = xhss.C0172.f689
            int r4 = r0.getIntVolatile(r6, r2)
            int r1 = r4 >> 29
            if (r1 == 0) goto L86
            r0 = 1
            if (r1 != r0) goto L80
            r1 = 4
            r2 = 0
            if (r7 != r1) goto L15
            r1 = r0
            goto L16
        L15:
            r1 = r2
        L16:
            xhss.ᛱᛴᛶᛴ r3 = r6.f690
            if (r1 != 0) goto L7c
            boolean r4 = r3 instanceof xhss.C0817
            if (r4 == 0) goto L7c
            r4 = 2
            if (r7 == r0) goto L26
            if (r7 != r4) goto L24
            goto L26
        L24:
            r7 = r2
            goto L27
        L26:
            r7 = r0
        L27:
            int r5 = r6.f3380
            if (r5 == r0) goto L2d
            if (r5 != r4) goto L2e
        L2d:
            r2 = r0
        L2e:
            if (r7 != r2) goto L7c
            r7 = r3
            xhss.ᛸᲇᲁᛱ r7 = (xhss.C0817) r7
            xhss.ᛲᛶᲇᲇ r1 = r7.f2653
            xhss.ᛸᛴᛳᛷ r7 = r7.f2656
            xhss.ᛴᛵᛳᛵ r7 = r7.f2508
            boolean r2 = r1.mo441(r7)
            if (r2 == 0) goto L43
            r1.mo359(r7, r6)
            return
        L43:
            xhss.ᛵᛸᛲᛲ r7 = xhss.AbstractC0863.m1439()
            long r1 = r7.f1825
            r4 = 4294967296(0x100000000, double:2.121995791E-314)
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 < 0) goto L61
            xhss.ᛸᲀᛷᛷ r0 = r7.f1826
            if (r0 != 0) goto L5d
            xhss.ᛸᲀᛷᛷ r0 = new xhss.ᛸᲀᛷᛷ
            r0.<init>()
            r7.f1826 = r0
        L5d:
            r0.addLast(r6)
            return
        L61:
            r7.m910(r0)
            xhss.AbstractC0060.m193(r6, r3, r0)     // Catch: java.lang.Throwable -> L71
        L67:
            boolean r0 = r7.m918()     // Catch: java.lang.Throwable -> L71
            if (r0 != 0) goto L67
        L6d:
            r7.m911()
            goto L94
        L71:
            r0 = move-exception
            r6.m1713(r0)     // Catch: java.lang.Throwable -> L76
            goto L6d
        L76:
            r0 = move-exception
            r6 = r0
            r7.m911()
            throw r6
        L7c:
            xhss.AbstractC0060.m193(r6, r3, r1)
            return
        L80:
            java.lang.String r6 = "Already resumed"
            xhss.C0532.m950(r6)
            return
        L86:
            r1 = 536870911(0x1fffffff, float:1.0842021E-19)
            r1 = r1 & r4
            r5 = 1073741824(0x40000000, float:2.0)
            int r5 = r5 + r1
            r1 = r6
            boolean r6 = r0.compareAndSwapInt(r1, r2, r4, r5)
            if (r6 == 0) goto L95
        L94:
            return
        L95:
            r6 = r1
            goto L0
    }

    /* JADX INFO: renamed from: ᛸᛷᲈᲈ, reason: contains not printable characters */
    public final void m422(xhss.InterfaceC0554 r3, java.lang.Throwable r4) {
            r2 = this;
            r3.mo928(r4)     // Catch: java.lang.Throwable -> L4
            return
        L4:
            r3 = move-exception
            xhss.ᛵᛲᛲᲇ r4 = new xhss.ᛵᛲᛲᲇ
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Exception in invokeOnCancellation handler for "
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r4.<init>(r0, r3)
            xhss.ᛴᛵᛳᛵ r2 = r2.f691
            xhss.AbstractC0955.m1565(r2, r4)
            return
    }

    @Override // xhss.AbstractC1053
    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public final java.lang.Object mo423(java.lang.Object r1) {
            r0 = this;
            boolean r0 = r1 instanceof xhss.C1088
            if (r0 == 0) goto L9
            xhss.ᲇᲁᛲᛳ r1 = (xhss.C1088) r1
            java.lang.Object r0 = r1.f3514
            return r0
        L9:
            return r1
    }

    @Override // xhss.InterfaceC0038
    /* JADX INFO: renamed from: ᲇᛶᛴᲀ */
    public final xhss.InterfaceC0362 mo153() {
            r0 = this;
            xhss.ᛴᛵᛳᛵ r0 = r0.f691
            return r0
    }

    /* JADX INFO: renamed from: ᲇᛸᛳᲁ, reason: contains not printable characters */
    public final java.lang.Object m424() {
            r7 = this;
            boolean r0 = r7.m416()
        L4:
            sun.misc.Unsafe r1 = xhss.AbstractC1067.f3442
            long r3 = xhss.C0172.f689
            int r5 = r1.getIntVolatile(r7, r3)
            int r2 = r5 >> 29
            if (r2 == 0) goto L55
            r3 = 2
            if (r2 != r3) goto L4e
            if (r0 == 0) goto L18
            r7.m419()
        L18:
            long r4 = xhss.C0172.f687
            java.lang.Object r0 = r1.getObjectVolatile(r7, r4)
            boolean r1 = r0 instanceof xhss.C0711
            if (r1 != 0) goto L49
            int r1 = r7.f3380
            r2 = 1
            if (r1 == r2) goto L29
            if (r1 != r3) goto L44
        L29:
            xhss.ᛴᛵᛳᛵ r1 = r7.f691
            xhss.ᛳᛴᲀᲁ r2 = xhss.C0263.f977
            xhss.ᛳᛵᲈᛲ r1 = r1.mo442(r2)
            xhss.ᛸᛷᛳᲈ r1 = (xhss.AbstractC0784) r1
            if (r1 == 0) goto L44
            boolean r2 = r1.m1333()
            if (r2 == 0) goto L3c
            goto L44
        L3c:
            java.util.concurrent.CancellationException r0 = r1.m1343()
            r7.mo417(r0)
            throw r0
        L44:
            java.lang.Object r7 = r7.mo423(r0)
            return r7
        L49:
            xhss.ᛷᲁᲇᛷ r0 = (xhss.C0711) r0
            java.lang.Throwable r7 = r0.f2385
            throw r7
        L4e:
            java.lang.String r7 = "Already suspended"
            xhss.C0532.m950(r7)
            r7 = 0
            return r7
        L55:
            r2 = 536870911(0x1fffffff, float:1.0842021E-19)
            r2 = r2 & r5
            r6 = 536870912(0x20000000, float:1.0842022E-19)
            int r6 = r6 + r2
            r2 = r7
            boolean r7 = r1.compareAndSwapInt(r2, r3, r5, r6)
            if (r7 == 0) goto L78
            long r3 = xhss.C0172.f688
            java.lang.Object r7 = r1.getObjectVolatile(r2, r3)
            xhss.ᛱᛲᲁᲇ r7 = (xhss.InterfaceC0022) r7
            if (r7 != 0) goto L70
            r2.m415()
        L70:
            if (r0 == 0) goto L75
            r2.m419()
        L75:
            xhss.ᛸᛴᛸᲈ r7 = xhss.EnumC0757.f2533
            return r7
        L78:
            r7 = r2
            goto L4
    }

    /* JADX INFO: renamed from: ᲈᛳᲀ, reason: contains not printable characters */
    public final void m425(java.lang.Throwable r10) {
            r9 = this;
        L0:
            sun.misc.Unsafe r0 = xhss.AbstractC1067.f3442
            long r1 = xhss.C0172.f687
            java.lang.Object r7 = r0.getObjectVolatile(r9, r1)
            boolean r0 = r7 instanceof xhss.InterfaceC0214
            if (r0 != 0) goto Ld
            return
        Ld:
            xhss.ᛴᲀᛳᛱ r8 = new xhss.ᛴᲀᛳᛱ
            boolean r0 = r7 instanceof xhss.InterfaceC0554
            r8.<init>(r9, r10, r0)
        L14:
            sun.misc.Unsafe r3 = xhss.AbstractC1067.f3442
            long r5 = xhss.C0172.f687
            r4 = r9
            boolean r9 = r3.compareAndSwapObject(r4, r5, r7, r8)
            if (r9 == 0) goto L3a
            r9 = r7
            xhss.ᛲᲇᛱᛶ r9 = (xhss.InterfaceC0214) r9
            boolean r9 = r9 instanceof xhss.InterfaceC0554
            if (r9 == 0) goto L2b
            xhss.ᛶᛳᲁᲈ r7 = (xhss.InterfaceC0554) r7
            r4.m422(r7, r10)
        L2b:
            boolean r9 = r4.m416()
            if (r9 != 0) goto L34
            r4.m418()
        L34:
            int r9 = r4.f3380
            r4.m421(r9)
            return
        L3a:
            java.lang.Object r9 = r3.getObjectVolatile(r4, r1)
            if (r9 == r7) goto L42
            r9 = r4
            goto L0
        L42:
            r9 = r4
            goto L14
    }
}
