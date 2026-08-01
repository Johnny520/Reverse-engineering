package defpackage;

/* JADX INFO: renamed from: ᲈᛶᛳᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public class C2260 extends defpackage.AbstractC0754 implements defpackage.InterfaceC1046, defpackage.InterfaceC1735, defpackage.InterfaceC1434 {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public static final /* synthetic */ long f9594 = 0;

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public static final /* synthetic */ long f9595 = 0;

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public static final /* synthetic */ long f9596 = 0;
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ java.lang.Object _parentHandle$volatile;
    private volatile /* synthetic */ java.lang.Object _state$volatile;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final defpackage.InterfaceC0140 f9597;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final defpackage.InterfaceC0493 f9598;

    static {
            sun.misc.Unsafe r0 = defpackage.AbstractC0051.f569
            java.lang.Class<ᲈᛶᛳᛷ> r1 = defpackage.C2260.class
            java.lang.String r2 = "_decisionAndIndex$volatile"
            java.lang.reflect.Field r2 = r1.getDeclaredField(r2)
            long r2 = r0.objectFieldOffset(r2)
            defpackage.C2260.f9594 = r2
            java.lang.String r2 = "_state$volatile"
            java.lang.reflect.Field r2 = r1.getDeclaredField(r2)
            long r2 = r0.objectFieldOffset(r2)
            defpackage.C2260.f9596 = r2
            java.lang.String r2 = "_parentHandle$volatile"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r2)
            long r0 = r0.objectFieldOffset(r1)
            defpackage.C2260.f9595 = r0
            return
    }

    public C2260(int r1, defpackage.InterfaceC0140 r2) {
            r0 = this;
            r0.<init>(r1)
            r0.f9597 = r2
            ᛳᛵᲈᛵ r1 = r2.mo663()
            r0.f9598 = r1
            r1 = 536870911(0x1fffffff, float:1.0842021E-19)
            r0._decisionAndIndex$volatile = r1
            ᛳᛸᛲᛳ r1 = defpackage.C0522.f2577
            r0._state$volatile = r1
            return
    }

    /* JADX INFO: renamed from: ᛶᲈᲈᛸ, reason: contains not printable characters */
    public static java.lang.Object m3651(defpackage.InterfaceC0484 r6, java.lang.Object r7, int r8, defpackage.InterfaceC1286 r9) {
            boolean r0 = r7 instanceof defpackage.C0142
            if (r0 == 0) goto L5
            return r7
        L5:
            r0 = 1
            if (r8 == r0) goto Ld
            r0 = 2
            if (r8 != r0) goto Lc
            goto Ld
        Lc:
            return r7
        Ld:
            if (r9 != 0) goto L14
            boolean r8 = r6 instanceof defpackage.InterfaceC1818
            if (r8 != 0) goto L14
            return r7
        L14:
            ᛸᲇᲁ r0 = new ᛸᲇᲁ
            boolean r8 = r6 instanceof defpackage.InterfaceC1818
            if (r8 == 0) goto L1e
            ᲁᛲᛸᲈ r6 = (defpackage.InterfaceC1818) r6
        L1c:
            r2 = r6
            goto L20
        L1e:
            r6 = 0
            goto L1c
        L20:
            r4 = 0
            r5 = 16
            r1 = r7
            r3 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
    }

    /* JADX INFO: renamed from: ᲁᲈᛳ, reason: contains not printable characters */
    public static void m3652(defpackage.InterfaceC0484 r3, java.lang.Object r4) {
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

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = r3.mo1324()
            r0.<init>(r1)
            r1 = 40
            r0.append(r1)
            ᛱᛸᛲᲀ r1 = r3.f9597
            java.lang.String r1 = defpackage.AbstractC0762.m1683(r1)
            r0.append(r1)
            java.lang.String r1 = "){"
            r0.append(r1)
            java.lang.Object r1 = r3.m3658()
            boolean r2 = r1 instanceof defpackage.InterfaceC0484
            if (r2 == 0) goto L27
            java.lang.String r1 = "Active"
            goto L30
        L27:
            boolean r1 = r1 instanceof defpackage.C0987
            if (r1 == 0) goto L2e
            java.lang.String r1 = "Cancelled"
            goto L30
        L2e:
            java.lang.String r1 = "Completed"
        L30:
            r0.append(r1)
            java.lang.String r1 = "}@"
            r0.append(r1)
            java.lang.String r3 = defpackage.AbstractC0762.m1681(r3)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }

    @Override // defpackage.AbstractC0754
    /* JADX INFO: renamed from: ᛱᛳᛲᛸ */
    public final java.lang.Throwable mo1669(java.lang.Object r1) {
            r0 = this;
            java.lang.Throwable r0 = super.mo1669(r1)
            if (r0 == 0) goto L7
            return r0
        L7:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: ᛲᛲᛸᲈ, reason: contains not printable characters */
    public final void m3653(defpackage.AbstractC1805 r4) {
            r3 = this;
            ᛱᛸᛲᲀ r0 = r3.f9597
            boolean r1 = r0 instanceof defpackage.C1395
            r2 = 0
            if (r1 == 0) goto La
            ᛷᲇᲇᲇ r0 = (defpackage.C1395) r0
            goto Lb
        La:
            r0 = r2
        Lb:
            if (r0 == 0) goto L10
            ᲁᛲᛱᛵ r0 = r0.f6055
            goto L11
        L10:
            r0 = r2
        L11:
            if (r0 != r4) goto L15
            r4 = 4
            goto L17
        L15:
            int r4 = r3.f3535
        L17:
            ᲁᲀᛱᲁ r0 = defpackage.C1907.f8270
            r3.m3661(r0, r4, r2)
            return
    }

    @Override // defpackage.AbstractC0754
    /* JADX INFO: renamed from: ᛲᛴᛱᛶ */
    public final java.lang.Object mo1671() {
            r0 = this;
            java.lang.Object r0 = r0.m3658()
            return r0
    }

    @Override // defpackage.AbstractC0754
    /* JADX INFO: renamed from: ᛲᛴᲇᛳ */
    public final java.lang.Object mo1672(java.lang.Object r1) {
            r0 = this;
            boolean r0 = r1 instanceof defpackage.C1588
            if (r0 == 0) goto L9
            ᛸᲇᲁ r1 = (defpackage.C1588) r1
            java.lang.Object r0 = r1.f7031
            return r0
        L9:
            return r1
    }

    /* JADX INFO: renamed from: ᛲᲈᛷᛵ, reason: contains not printable characters */
    public final java.lang.Object m3654() {
            r7 = this;
            boolean r0 = r7.m3665()
        L4:
            sun.misc.Unsafe r1 = defpackage.AbstractC0051.f569
            long r3 = defpackage.C2260.f9594
            int r5 = r1.getIntVolatile(r7, r3)
            int r2 = r5 >> 29
            if (r2 == 0) goto L55
            r1 = 2
            if (r2 != r1) goto L4e
            if (r0 == 0) goto L18
            r7.m3657()
        L18:
            java.lang.Object r0 = r7.m3658()
            boolean r2 = r0 instanceof defpackage.C0142
            if (r2 != 0) goto L49
            int r2 = r7.f3535
            r3 = 1
            if (r2 == r3) goto L27
            if (r2 != r1) goto L44
        L27:
            ᛳᛵᲈᛵ r1 = r7.f9598
            ᛷᲈᲀ r2 = defpackage.C1403.f6097
            ᛶᲁᛳᲈ r1 = r1.mo970(r2)
            ᲇᛳᛸᛳ r1 = (defpackage.InterfaceC2023) r1
            if (r1 == 0) goto L44
            boolean r2 = r1.mo1449()
            if (r2 == 0) goto L3a
            goto L44
        L3a:
            ᛴᛲᛵᛵ r1 = (defpackage.AbstractC0624) r1
            java.util.concurrent.CancellationException r0 = r1.m1448()
            r7.mo1673(r0)
            throw r0
        L44:
            java.lang.Object r7 = r7.mo1672(r0)
            return r7
        L49:
            ᛱᛸᛳᛱ r0 = (defpackage.C0142) r0
            java.lang.Throwable r7 = r0.f1092
            throw r7
        L4e:
            java.lang.String r7 = "Already suspended"
            defpackage.C2264.m3676(r7)
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
            long r3 = defpackage.C2260.f9595
            java.lang.Object r7 = r1.getObjectVolatile(r2, r3)
            ᛵᛲᲇᲇ r7 = (defpackage.InterfaceC0843) r7
            if (r7 != 0) goto L70
            r2.m3662()
        L70:
            if (r0 == 0) goto L75
            r2.m3657()
        L75:
            ᛴᛵ r7 = defpackage.EnumC0670.f3246
            return r7
        L78:
            r7 = r2
            goto L4
    }

    /* JADX INFO: renamed from: ᛳᲁᲈᲁ */
    public java.lang.Throwable mo1323(defpackage.AbstractC0624 r1) {
            r0 = this;
            java.util.concurrent.CancellationException r0 = r1.m1448()
            return r0
    }

    /* JADX INFO: renamed from: ᛴᛸᲀ, reason: contains not printable characters */
    public final void m3655(defpackage.InterfaceC1286 r3, java.lang.Throwable r4, java.lang.Object r5) {
            r2 = this;
            ᛳᛵᲈᛵ r0 = r2.f9598
            r3.mo591(r4, r5, r0)     // Catch: java.lang.Throwable -> L6
            return
        L6:
            r3 = move-exception
            ᛸᛵᛳᲀ r4 = new ᛸᛵᛳᲀ
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r1 = "Exception in resume onCancellation handler for "
            r5.<init>(r1)
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            r4.<init>(r2, r3)
            defpackage.AbstractC2279.m3703(r0, r4)
            return
    }

    /* JADX INFO: renamed from: ᛴᛸᲈᲈ, reason: contains not printable characters */
    public final void m3656(int r7) {
            r6 = this;
        L0:
            sun.misc.Unsafe r0 = defpackage.AbstractC0051.f569
            long r2 = defpackage.C2260.f9594
            int r4 = r0.getIntVolatile(r6, r2)
            int r1 = r4 >> 29
            if (r1 == 0) goto L86
            r2 = 1
            if (r1 != r2) goto L80
            r0 = 4
            r1 = 0
            if (r7 != r0) goto L15
            r0 = r2
            goto L16
        L15:
            r0 = r1
        L16:
            ᛱᛸᛲᲀ r3 = r6.f9597
            if (r0 != 0) goto L7c
            boolean r4 = r3 instanceof defpackage.C1395
            if (r4 == 0) goto L7c
            r4 = 2
            if (r7 == r2) goto L26
            if (r7 != r4) goto L24
            goto L26
        L24:
            r7 = r1
            goto L27
        L26:
            r7 = r2
        L27:
            int r5 = r6.f3535
            if (r5 == r2) goto L2d
            if (r5 != r4) goto L2e
        L2d:
            r1 = r2
        L2e:
            if (r7 != r1) goto L7c
            r7 = r3
            ᛷᲇᲇᲇ r7 = (defpackage.C1395) r7
            ᲁᛲᛱᛵ r0 = r7.f6055
            ᛶᛱᲀᛶ r7 = r7.f6056
            ᛳᛵᲈᛵ r7 = r7.f4527
            boolean r1 = r0.mo2540(r7)
            if (r1 == 0) goto L43
            r0.mo572(r7, r6)
            return
        L43:
            ᛱᛵᛶᲇ r7 = defpackage.AbstractC1054.m2007()
            long r0 = r7.f887
            r4 = 4294967296(0x100000000, double:2.121995791E-314)
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 < 0) goto L61
            ᛶᲈᛷᛵ r0 = r7.f888
            if (r0 != 0) goto L5d
            ᛶᲈᛷᛵ r0 = new ᛶᲈᛷᛵ
            r0.<init>()
            r7.f888 = r0
        L5d:
            r0.addLast(r6)
            return
        L61:
            r7.m575(r2)
            defpackage.AbstractC0425.m1190(r6, r3, r2)     // Catch: java.lang.Throwable -> L71
        L67:
            boolean r0 = r7.m577()     // Catch: java.lang.Throwable -> L71
            if (r0 != 0) goto L67
        L6d:
            r7.m580(r2)
            goto L94
        L71:
            r0 = move-exception
            r6.m1670(r0)     // Catch: java.lang.Throwable -> L76
            goto L6d
        L76:
            r0 = move-exception
            r6 = r0
            r7.m580(r2)
            throw r6
        L7c:
            defpackage.AbstractC0425.m1190(r6, r3, r0)
            return
        L80:
            java.lang.String r6 = "Already resumed"
            defpackage.C2264.m3676(r6)
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

    /* JADX INFO: renamed from: ᛴᲀᲁᛴ */
    public java.lang.String mo1324() {
            r0 = this;
            java.lang.String r0 = "CancellableContinuation"
            return r0
    }

    @Override // defpackage.InterfaceC0140
    /* JADX INFO: renamed from: ᛵᛱᛵᛲ */
    public final void mo662(java.lang.Object r3) {
            r2 = this;
            java.lang.Throwable r0 = defpackage.C2165.m3569(r3)
            if (r0 != 0) goto L7
            goto Ld
        L7:
            ᛱᛸᛳᛱ r3 = new ᛱᛸᛳᛱ
            r1 = 0
            r3.<init>(r0, r1)
        Ld:
            int r0 = r2.f3535
            r1 = 0
            r2.m3661(r3, r0, r1)
            return
    }

    /* JADX INFO: renamed from: ᛶᛳᲀᲈ, reason: contains not printable characters */
    public final void m3657() {
            r10 = this;
            ᛱᛸᛲᲀ r0 = r10.f9597
            boolean r1 = r0 instanceof defpackage.C1395
            r2 = 0
            if (r1 == 0) goto Lb
            ᛷᲇᲇᲇ r0 = (defpackage.C1395) r0
            r4 = r0
            goto Lc
        Lb:
            r4 = r2
        Lc:
            if (r4 == 0) goto L63
            long r0 = defpackage.C1395.f6052
        L10:
            sun.misc.Unsafe r3 = defpackage.AbstractC0051.f569
            java.lang.Object r7 = r3.getObjectVolatile(r4, r0)
            r3 = r7
            ᛳᛴᛵᛱ r7 = defpackage.AbstractC1592.f7041
            if (r3 != r7) goto L32
        L1b:
            sun.misc.Unsafe r3 = defpackage.AbstractC0051.f569
            long r5 = defpackage.C1395.f6052
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
            sun.misc.Unsafe r3 = defpackage.AbstractC0051.f569
            long r5 = defpackage.C1395.f6052
            r8 = 0
            boolean r10 = r3.compareAndSwapObject(r4, r5, r7, r8)
            if (r10 == 0) goto L50
            r2 = r7
            java.lang.Throwable r2 = (java.lang.Throwable) r2
        L46:
            if (r2 != 0) goto L49
            goto L63
        L49:
            r9.m3664()
            r9.m3663(r2)
            return
        L50:
            java.lang.Object r10 = r3.getObjectVolatile(r4, r0)
            if (r10 != r7) goto L57
            goto L38
        L57:
            java.lang.String r10 = "Failed requirement."
            defpackage.C2264.m3684(r10)
            return
        L5d:
            r7 = r3
            java.lang.String r10 = "Inconsistent state "
            defpackage.C2264.m3681(r7, r10)
        L63:
            return
    }

    @Override // defpackage.InterfaceC1046
    /* JADX INFO: renamed from: ᛶᛷᛱᲀ */
    public final void mo2003(java.lang.Object r1) {
            r0 = this;
            int r1 = r0.f3535
            r0.m3656(r1)
            return
    }

    @Override // defpackage.InterfaceC0140
    /* JADX INFO: renamed from: ᛷᛲᲇᲈ */
    public final defpackage.InterfaceC0493 mo663() {
            r0 = this;
            ᛳᛵᲈᛵ r0 = r0.f9598
            return r0
    }

    /* JADX INFO: renamed from: ᛷᛷᲀᛴ, reason: contains not printable characters */
    public final java.lang.Object m3658() {
            r3 = this;
            sun.misc.Unsafe r0 = defpackage.AbstractC0051.f569
            long r1 = defpackage.C2260.f9596
            java.lang.Object r3 = r0.getObjectVolatile(r3, r1)
            return r3
    }

    @Override // defpackage.InterfaceC1735
    /* JADX INFO: renamed from: ᛷᛸᛵᲇ */
    public final defpackage.InterfaceC1735 mo1504() {
            r1 = this;
            ᛱᛸᛲᲀ r1 = r1.f9597
            boolean r0 = r1 instanceof defpackage.InterfaceC1735
            if (r0 == 0) goto L9
            ᲀᲀᛴ r1 = (defpackage.InterfaceC1735) r1
            return r1
        L9:
            r1 = 0
            return r1
    }

    @Override // defpackage.InterfaceC1434
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ */
    public final void mo2642(defpackage.C2053 r7, int r8) {
            r6 = this;
        L0:
            sun.misc.Unsafe r0 = defpackage.AbstractC0051.f569
            long r2 = defpackage.C2260.f9594
            int r4 = r0.getIntVolatile(r6, r2)
            r1 = 536870911(0x1fffffff, float:1.0842021E-19)
            r5 = r4 & r1
            if (r5 != r1) goto L22
            int r1 = r4 >> 29
            int r1 = r1 << 29
            int r5 = r1 + r8
            r1 = r6
            boolean r6 = r0.compareAndSwapInt(r1, r2, r4, r5)
            if (r6 == 0) goto L20
            r1.m3667(r7)
            return
        L20:
            r6 = r1
            goto L0
        L22:
            java.lang.String r6 = "invokeOnCancellation should be called at most once"
            defpackage.C2264.m3676(r6)
            return
    }

    @Override // defpackage.InterfaceC1046
    /* JADX INFO: renamed from: ᛸᛵᛸᛷ */
    public final void mo2004(defpackage.C1913 r3) {
            r2 = this;
            ᲁᲀᛱᲁ r0 = defpackage.C1907.f8270
            int r1 = r2.f3535
            r2.m3661(r0, r1, r3)
            return
    }

    /* JADX INFO: renamed from: ᲀᛳᲀᛵ, reason: contains not printable characters */
    public final void m3659(defpackage.InterfaceC1818 r3, java.lang.Throwable r4) {
            r2 = this;
            r3.mo742(r4)     // Catch: java.lang.Throwable -> L4
            return
        L4:
            r3 = move-exception
            ᛸᛵᛳᲀ r4 = new ᛸᛵᛳᲀ
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Exception in invokeOnCancellation handler for "
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r4.<init>(r0, r3)
            ᛳᛵᲈᛵ r2 = r2.f9598
            defpackage.AbstractC2279.m3703(r2, r4)
            return
    }

    /* JADX INFO: renamed from: ᲀᲀᛴᛳ, reason: contains not printable characters */
    public final void m3660() {
            r4 = this;
            ᛵᛲᲇᲇ r0 = r4.m3662()
            if (r0 != 0) goto L7
            goto L1b
        L7:
            java.lang.Object r1 = r4.m3658()
            boolean r1 = r1 instanceof defpackage.InterfaceC0484
            if (r1 != 0) goto L1b
            r0.mo1182()
            sun.misc.Unsafe r0 = defpackage.AbstractC0051.f569
            long r1 = defpackage.C2260.f9595
            ᲈᛲᛴᛱ r3 = defpackage.C2187.f9280
            r0.putObjectVolatile(r4, r1, r3)
        L1b:
            return
    }

    /* JADX INFO: renamed from: ᲁᛱᛲᲈ, reason: contains not printable characters */
    public final void m3661(java.lang.Object r10, int r11, defpackage.InterfaceC1286 r12) {
            r9 = this;
        L0:
            sun.misc.Unsafe r0 = defpackage.AbstractC0051.f569
            long r1 = defpackage.C2260.f9596
            java.lang.Object r7 = r0.getObjectVolatile(r9, r1)
            boolean r3 = r7 instanceof defpackage.InterfaceC0484
            if (r3 == 0) goto L36
            r0 = r7
            ᛳᛵᛶᛴ r0 = (defpackage.InterfaceC0484) r0
            java.lang.Object r8 = m3651(r0, r10, r11, r12)
        L13:
            sun.misc.Unsafe r3 = defpackage.AbstractC0051.f569
            long r5 = defpackage.C2260.f9596
            r4 = r9
            boolean r9 = r3.compareAndSwapObject(r4, r5, r7, r8)
            r6 = r4
            if (r9 == 0) goto L2c
            boolean r9 = r6.m3665()
            if (r9 != 0) goto L28
            r6.m3664()
        L28:
            r6.m3656(r11)
            return
        L2c:
            java.lang.Object r9 = r3.getObjectVolatile(r6, r1)
            if (r9 == r7) goto L34
            r9 = r6
            goto L0
        L34:
            r9 = r6
            goto L13
        L36:
            r6 = r9
            boolean r9 = r7 instanceof defpackage.C0987
            if (r9 == 0) goto L50
            r1 = r7
            ᛵᲇᲈᛴ r1 = (defpackage.C0987) r1
            r5 = 1
            long r2 = defpackage.C0987.f4414
            r4 = 0
            boolean r9 = r0.compareAndSwapInt(r1, r2, r4, r5)
            if (r9 == 0) goto L50
            if (r12 == 0) goto L4f
            java.lang.Throwable r9 = r1.f1092
            r6.m3655(r12, r9, r10)
        L4f:
            return
        L50:
            java.lang.String r9 = "Already resumed, but proposed with update "
            defpackage.C2264.m3681(r10, r9)
            return
    }

    /* JADX INFO: renamed from: ᲁᛴᛵᛲ, reason: contains not printable characters */
    public final defpackage.InterfaceC0843 m3662() {
            r9 = this;
            ᛳᛵᲈᛵ r0 = r9.f9598
            ᛷᲈᲀ r1 = defpackage.C1403.f6097
            ᛶᲁᛳᲈ r0 = r0.mo970(r1)
            ᲇᛳᛸᛳ r0 = (defpackage.InterfaceC2023) r0
            if (r0 != 0) goto Le
            r9 = 0
            return r9
        Le:
            ᲁᲇᛱᲀ r1 = new ᲁᲇᛱᲀ
            r1.<init>(r9)
            r2 = 1
            ᛵᛲᲇᲇ r8 = defpackage.AbstractC0762.m1685(r0, r2, r1)
        L18:
            sun.misc.Unsafe r3 = defpackage.AbstractC0051.f569
            long r5 = defpackage.C2260.f9595
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

    /* JADX INFO: renamed from: ᲁᲈᲇᲁ, reason: contains not printable characters */
    public final boolean m3663(java.lang.Throwable r11) {
            r10 = this;
        L0:
            sun.misc.Unsafe r0 = defpackage.AbstractC0051.f569
            long r1 = defpackage.C2260.f9596
            java.lang.Object r7 = r0.getObjectVolatile(r10, r1)
            boolean r0 = r7 instanceof defpackage.InterfaceC0484
            r3 = 0
            if (r0 != 0) goto Le
            return r3
        Le:
            ᛵᲇᲈᛴ r8 = new ᛵᲇᲈᛴ
            boolean r0 = r7 instanceof defpackage.InterfaceC1818
            r9 = 1
            if (r0 != 0) goto L19
            boolean r0 = r7 instanceof defpackage.AbstractC0606
            if (r0 == 0) goto L1a
        L19:
            r3 = r9
        L1a:
            r8.<init>(r10, r11, r3)
        L1d:
            sun.misc.Unsafe r3 = defpackage.AbstractC0051.f569
            long r5 = defpackage.C2260.f9596
            r4 = r10
            boolean r10 = r3.compareAndSwapObject(r4, r5, r7, r8)
            if (r10 == 0) goto L4d
            r10 = r7
            ᛳᛵᛶᛴ r10 = (defpackage.InterfaceC0484) r10
            boolean r0 = r10 instanceof defpackage.InterfaceC1818
            if (r0 == 0) goto L35
            ᲁᛲᛸᲈ r7 = (defpackage.InterfaceC1818) r7
            r4.m3659(r7, r11)
            goto L3e
        L35:
            boolean r10 = r10 instanceof defpackage.AbstractC0606
            if (r10 == 0) goto L3e
            ᛴᛱᛴᛳ r7 = (defpackage.AbstractC0606) r7
            r4.m3666(r7, r11)
        L3e:
            boolean r10 = r4.m3665()
            if (r10 != 0) goto L47
            r4.m3664()
        L47:
            int r10 = r4.f3535
            r4.m3656(r10)
            return r9
        L4d:
            java.lang.Object r10 = r3.getObjectVolatile(r4, r1)
            if (r10 == r7) goto L55
            r10 = r4
            goto L0
        L55:
            r10 = r4
            goto L1d
    }

    /* JADX INFO: renamed from: ᲇᛱᛸᲇ, reason: contains not printable characters */
    public final void m3664() {
            r4 = this;
            sun.misc.Unsafe r0 = defpackage.AbstractC0051.f569
            long r1 = defpackage.C2260.f9595
            java.lang.Object r3 = r0.getObjectVolatile(r4, r1)
            ᛵᛲᲇᲇ r3 = (defpackage.InterfaceC0843) r3
            if (r3 != 0) goto Ld
            return
        Ld:
            r3.mo1182()
            ᲈᛲᛴᛱ r3 = defpackage.C2187.f9280
            r0.putObjectVolatile(r4, r1, r3)
            return
    }

    /* JADX INFO: renamed from: ᲇᛳᛴᲈ, reason: contains not printable characters */
    public final boolean m3665() {
            r3 = this;
            int r0 = r3.f3535
            r1 = 2
            if (r0 != r1) goto L15
            ᛱᛸᛲᲀ r3 = r3.f9597
            ᛷᲇᲇᲇ r3 = (defpackage.C1395) r3
            sun.misc.Unsafe r0 = defpackage.AbstractC0051.f569
            long r1 = defpackage.C1395.f6052
            java.lang.Object r3 = r0.getObjectVolatile(r3, r1)
            if (r3 == 0) goto L15
            r3 = 1
            return r3
        L15:
            r3 = 0
            return r3
    }

    @Override // defpackage.AbstractC0754
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ */
    public final void mo1673(java.util.concurrent.CancellationException r11) {
            r10 = this;
        L0:
            sun.misc.Unsafe r0 = defpackage.AbstractC0051.f569
            long r1 = defpackage.C2260.f9596
            java.lang.Object r7 = r0.getObjectVolatile(r10, r1)
            boolean r0 = r7 instanceof defpackage.InterfaceC0484
            if (r0 != 0) goto L7a
            boolean r0 = r7 instanceof defpackage.C0142
            if (r0 == 0) goto L12
            goto L6e
        L12:
            boolean r0 = r7 instanceof defpackage.C1588
            if (r0 == 0) goto L52
            r0 = r7
            ᛸᲇᲁ r0 = (defpackage.C1588) r0
            java.lang.Throwable r3 = r0.f7028
            if (r3 != 0) goto L4c
            r3 = 0
            r4 = 15
            ᛸᲇᲁ r8 = defpackage.C1588.m2868(r0, r3, r11, r4)
        L24:
            sun.misc.Unsafe r3 = defpackage.AbstractC0051.f569
            long r5 = defpackage.C2260.f9596
            r4 = r10
            boolean r10 = r3.compareAndSwapObject(r4, r5, r7, r8)
            r9 = r4
            if (r10 == 0) goto L41
            ᲁᛲᛸᲈ r10 = r0.f7032
            if (r10 == 0) goto L37
            r9.m3659(r10, r11)
        L37:
            ᛷᛶᛲ r10 = r0.f7030
            if (r10 == 0) goto L6e
            java.lang.Object r0 = r0.f7031
            r9.m3655(r10, r11, r0)
            return
        L41:
            java.lang.Object r10 = r3.getObjectVolatile(r9, r1)
            if (r10 == r7) goto L4a
            r10 = r11
            r4 = r9
            goto L75
        L4a:
            r10 = r9
            goto L24
        L4c:
            java.lang.String r10 = "Must be called at most once"
            defpackage.C2264.m3676(r10)
            return
        L52:
            r9 = r10
            ᛸᲇᲁ r3 = new ᛸᲇᲁ
            r6 = 0
            r8 = 14
            r5 = 0
            r4 = r7
            r7 = r11
            r3.<init>(r4, r5, r6, r7, r8)
            r10 = r7
            r7 = r4
        L60:
            r8 = r3
            sun.misc.Unsafe r3 = defpackage.AbstractC0051.f569
            long r5 = defpackage.C2260.f9596
            r4 = r9
            boolean r11 = r3.compareAndSwapObject(r4, r5, r7, r8)
            r0 = r3
            r3 = r8
            if (r11 == 0) goto L6f
        L6e:
            return
        L6f:
            java.lang.Object r11 = r0.getObjectVolatile(r4, r1)
            if (r11 == r7) goto L78
        L75:
            r11 = r10
            r10 = r4
            goto L0
        L78:
            r9 = r4
            goto L60
        L7a:
            java.lang.String r10 = "Not completed"
            defpackage.C2264.m3676(r10)
            return
    }

    @Override // defpackage.InterfaceC1046
    /* JADX INFO: renamed from: ᲇᛸᲁᛱ */
    public final defpackage.C0454 mo2005(defpackage.C1913 r2) {
            r1 = this;
            ᲁᲀᛱᲁ r0 = defpackage.C1907.f8270
            ᛳᛴᛵᛱ r1 = r1.m3668(r0, r2)
            return r1
    }

    /* JADX INFO: renamed from: ᲇᲀᛲᛱ, reason: contains not printable characters */
    public final void m3666(defpackage.AbstractC0606 r3, java.lang.Throwable r4) {
            r2 = this;
            sun.misc.Unsafe r4 = defpackage.AbstractC0051.f569
            long r0 = defpackage.C2260.f9594
            int r4 = r4.getIntVolatile(r2, r0)
            r0 = 536870911(0x1fffffff, float:1.0842021E-19)
            r4 = r4 & r0
            if (r4 == r0) goto L2c
            r3.mo1404(r4)     // Catch: java.lang.Throwable -> L12
            return
        L12:
            r3 = move-exception
            ᛸᛵᛳᲀ r4 = new ᛸᛵᛳᲀ
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Exception in invokeOnCancellation handler for "
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r4.<init>(r0, r3)
            ᛳᛵᲈᛵ r2 = r2.f9598
            defpackage.AbstractC2279.m3703(r2, r4)
            return
        L2c:
            java.lang.String r2 = "The index for Segment.onCancellation(..) is broken"
            defpackage.C2264.m3676(r2)
            return
    }

    /* JADX INFO: renamed from: ᲈᛵᲀᛱ, reason: contains not printable characters */
    public final void m3667(defpackage.InterfaceC0484 r11) {
            r10 = this;
        L0:
            sun.misc.Unsafe r0 = defpackage.AbstractC0051.f569
            long r1 = defpackage.C2260.f9596
            java.lang.Object r7 = r0.getObjectVolatile(r10, r1)
            boolean r3 = r7 instanceof defpackage.C0522
            if (r3 == 0) goto L28
        Lc:
            sun.misc.Unsafe r3 = defpackage.AbstractC0051.f569
            long r5 = defpackage.C2260.f9596
            r4 = r10
            r8 = r11
            boolean r10 = r3.compareAndSwapObject(r4, r5, r7, r8)
            r11 = r4
            r9 = r8
            if (r10 == 0) goto L1c
            goto Lb9
        L1c:
            java.lang.Object r10 = r3.getObjectVolatile(r11, r1)
            if (r10 == r7) goto L25
        L22:
            r4 = r11
            goto Lc0
        L25:
            r10 = r11
            r11 = r9
            goto Lc
        L28:
            r9 = r11
            r11 = r10
            boolean r10 = r7 instanceof defpackage.InterfaceC1818
            r6 = 0
            if (r10 != 0) goto Lc6
            boolean r10 = r7 instanceof defpackage.AbstractC0606
            if (r10 != 0) goto Lc6
            boolean r10 = r7 instanceof defpackage.C0142
            if (r10 == 0) goto L60
            r1 = r7
            ᛱᛸᛳᛱ r1 = (defpackage.C0142) r1
            r5 = 1
            long r2 = defpackage.C0142.f1091
            r4 = 0
            boolean r10 = r0.compareAndSwapInt(r1, r2, r4, r5)
            if (r10 == 0) goto L5c
            boolean r10 = r7 instanceof defpackage.C0987
            if (r10 == 0) goto Lb9
            java.lang.Throwable r10 = r1.f1092
            boolean r0 = r9 instanceof defpackage.InterfaceC1818
            if (r0 == 0) goto L55
            r0 = r9
            ᲁᛲᛸᲈ r0 = (defpackage.InterfaceC1818) r0
            r11.m3659(r0, r10)
            return
        L55:
            r0 = r9
            ᛴᛱᛴᛳ r0 = (defpackage.AbstractC0606) r0
            r11.m3666(r0, r10)
            return
        L5c:
            m3652(r9, r7)
            throw r6
        L60:
            boolean r10 = r7 instanceof defpackage.C1588
            if (r10 == 0) goto L98
            r10 = r7
            ᛸᲇᲁ r10 = (defpackage.C1588) r10
            ᲁᛲᛸᲈ r0 = r10.f7032
            if (r0 != 0) goto L94
            boolean r0 = r9 instanceof defpackage.AbstractC0606
            if (r0 == 0) goto L70
            goto Lb9
        L70:
            r0 = r9
            ᲁᛲᛸᲈ r0 = (defpackage.InterfaceC1818) r0
            java.lang.Throwable r3 = r10.f7028
            if (r3 == 0) goto L7b
            r11.m3659(r0, r3)
            return
        L7b:
            r3 = 29
            ᛸᲇᲁ r8 = defpackage.C1588.m2868(r10, r0, r6, r3)
        L81:
            sun.misc.Unsafe r3 = defpackage.AbstractC0051.f569
            long r5 = defpackage.C2260.f9596
            r4 = r11
            boolean r10 = r3.compareAndSwapObject(r4, r5, r7, r8)
            if (r10 == 0) goto L8d
            goto Lb9
        L8d:
            java.lang.Object r10 = r3.getObjectVolatile(r11, r1)
            if (r10 == r7) goto L81
            goto L22
        L94:
            m3652(r9, r7)
            throw r6
        L98:
            boolean r10 = r9 instanceof defpackage.AbstractC0606
            if (r10 == 0) goto L9d
            goto Lb9
        L9d:
            r5 = r9
            ᲁᛲᛸᲈ r5 = (defpackage.InterfaceC1818) r5
            ᛸᲇᲁ r3 = new ᛸᲇᲁ
            r4 = r7
            r7 = 0
            r8 = 28
            r6 = 0
            r3.<init>(r4, r5, r6, r7, r8)
            r7 = r4
        Lab:
            r8 = r3
            sun.misc.Unsafe r3 = defpackage.AbstractC0051.f569
            long r5 = defpackage.C2260.f9596
            r4 = r11
            boolean r10 = r3.compareAndSwapObject(r4, r5, r7, r8)
            r11 = r3
            r3 = r8
            if (r10 == 0) goto Lba
        Lb9:
            return
        Lba:
            java.lang.Object r10 = r11.getObjectVolatile(r4, r1)
            if (r10 == r7) goto Lc4
        Lc0:
            r10 = r4
            r11 = r9
            goto L0
        Lc4:
            r11 = r4
            goto Lab
        Lc6:
            m3652(r9, r7)
            throw r6
    }

    /* JADX INFO: renamed from: ᲈᛸᲇ, reason: contains not printable characters */
    public final defpackage.C0454 m3668(java.lang.Object r11, defpackage.InterfaceC1286 r12) {
            r10 = this;
            ᛳᛴᛵᛱ r0 = defpackage.AbstractC0762.f3551
        L2:
            sun.misc.Unsafe r1 = defpackage.AbstractC0051.f569
            long r2 = defpackage.C2260.f9596
            java.lang.Object r8 = r1.getObjectVolatile(r10, r2)
            boolean r1 = r8 instanceof defpackage.InterfaceC0484
            if (r1 == 0) goto L36
            r1 = r8
            ᛳᛵᛶᛴ r1 = (defpackage.InterfaceC0484) r1
            int r4 = r10.f3535
            java.lang.Object r9 = m3651(r1, r11, r4, r12)
        L17:
            sun.misc.Unsafe r4 = defpackage.AbstractC0051.f569
            long r6 = defpackage.C2260.f9596
            r5 = r10
            boolean r10 = r4.compareAndSwapObject(r5, r6, r8, r9)
            if (r10 == 0) goto L2c
            boolean r10 = r5.m3665()
            if (r10 != 0) goto L2b
            r5.m3664()
        L2b:
            return r0
        L2c:
            java.lang.Object r10 = r4.getObjectVolatile(r5, r2)
            if (r10 == r8) goto L34
            r10 = r5
            goto L2
        L34:
            r10 = r5
            goto L17
        L36:
            r10 = 0
            return r10
    }

    @Override // defpackage.AbstractC0754
    /* JADX INFO: renamed from: ᲈᲈᛸᲁ */
    public final defpackage.InterfaceC0140 mo1674() {
            r0 = this;
            ᛱᛸᛲᲀ r0 = r0.f9597
            return r0
    }
}
