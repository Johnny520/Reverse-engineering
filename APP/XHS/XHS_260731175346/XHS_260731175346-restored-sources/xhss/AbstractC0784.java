package xhss;

/* JADX INFO: renamed from: xhss.ᛸᛷᛳᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0784 implements xhss.InterfaceC0281 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public static final /* synthetic */ long f2568 = 0;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public static final /* synthetic */ long f2569 = 0;
    private volatile /* synthetic */ java.lang.Object _parentHandle$volatile;
    private volatile /* synthetic */ java.lang.Object _state$volatile;

    static {
            sun.misc.Unsafe r0 = xhss.AbstractC1067.f3442
            java.lang.Class<xhss.ᛸᛷᛳᲈ> r1 = xhss.AbstractC0784.class
            java.lang.String r2 = "_state$volatile"
            java.lang.reflect.Field r2 = r1.getDeclaredField(r2)
            long r2 = r0.objectFieldOffset(r2)
            xhss.AbstractC0784.f2569 = r2
            java.lang.String r2 = "_parentHandle$volatile"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r2)
            long r0 = r0.objectFieldOffset(r1)
            xhss.AbstractC0784.f2568 = r0
            return
    }

    public AbstractC0784(boolean r1) {
            r0 = this;
            r0.<init>()
            if (r1 == 0) goto L8
            xhss.ᛳᛵᲁᛵ r1 = xhss.AbstractC0485.f1781
            goto La
        L8:
            xhss.ᛳᛵᲁᛵ r1 = xhss.AbstractC0485.f1782
        La:
            r0._state$volatile = r1
            return
    }

    /* JADX INFO: renamed from: ᛱᛱᛴᲀ, reason: contains not printable characters */
    public static java.lang.String m1326(java.lang.Object r1) {
            boolean r0 = r1 instanceof xhss.C1105
            if (r0 == 0) goto L18
            xhss.ᲇᲈᛵᲁ r1 = (xhss.C1105) r1
            boolean r0 = r1.m1798()
            if (r0 == 0) goto Lf
            java.lang.String r1 = "Cancelling"
            return r1
        Lf:
            boolean r1 = r1.m1801()
            if (r1 == 0) goto L24
            java.lang.String r1 = "Completing"
            return r1
        L18:
            boolean r0 = r1 instanceof xhss.InterfaceC0204
            if (r0 == 0) goto L2a
            xhss.ᛲᲀᛵᛳ r1 = (xhss.InterfaceC0204) r1
            boolean r1 = r1.mo465()
            if (r1 == 0) goto L27
        L24:
            java.lang.String r1 = "Active"
            return r1
        L27:
            java.lang.String r1 = "New"
            return r1
        L2a:
            boolean r1 = r1 instanceof xhss.C0711
            if (r1 == 0) goto L31
            java.lang.String r1 = "Cancelled"
            return r1
        L31:
            java.lang.String r1 = "Completed"
            return r1
    }

    /* JADX INFO: renamed from: ᲁᛴᛴᛸ, reason: contains not printable characters */
    public static xhss.C0357 m1327(xhss.AbstractC0070 r1) {
        L0:
            boolean r0 = r1.mo222()
            if (r0 == 0) goto Lb
            xhss.ᛱᛸᛲᛴ r1 = r1.m219()
            goto L0
        Lb:
            xhss.ᛱᛸᛲᛴ r1 = r1.m217()
            boolean r0 = r1.mo222()
            if (r0 != 0) goto Lb
            boolean r0 = r1 instanceof xhss.C0357
            if (r0 == 0) goto L1c
            xhss.ᛴᛴᛷᛲ r1 = (xhss.C0357) r1
            return r1
        L1c:
            boolean r0 = r1 instanceof xhss.C0409
            if (r0 == 0) goto Lb
            r1 = 0
            return r1
    }

    @Override // xhss.InterfaceC0281
    public final xhss.InterfaceC1091 getKey() {
            r0 = this;
            xhss.ᛳᛴᲀᲁ r0 = xhss.C0263.f977
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.Class r2 = r3.getClass()
            java.lang.String r2 = r2.getSimpleName()
            r1.<init>(r2)
            r2 = 123(0x7b, float:1.72E-43)
            r1.append(r2)
            java.lang.Object r2 = r3.m1351()
            java.lang.String r2 = m1326(r2)
            r1.append(r2)
            r2 = 125(0x7d, float:1.75E-43)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            r1 = 64
            r0.append(r1)
            java.lang.String r3 = xhss.AbstractC0561.m1011(r3)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }

    /* JADX INFO: renamed from: ᛱᛲᛸᲇ, reason: contains not printable characters */
    public final boolean m1328(xhss.C1105 r4, xhss.C0357 r5, java.lang.Object r6) {
            r3 = this;
        L0:
            xhss.ᛸᛷᛳᲈ r0 = r5.f1321
            xhss.ᲈᲈᲈᲈ r1 = new xhss.ᲈᲈᲈᲈ
            r1.<init>(r3, r4, r5, r6)
            r2 = 0
            xhss.ᛱᛲᲁᲇ r0 = xhss.AbstractC0473.m862(r0, r2, r1)
            xhss.ᛵᛵᲇᛳ r1 = xhss.C0475.f1712
            if (r0 == r1) goto L12
            r3 = 1
            return r3
        L12:
            xhss.ᛴᛴᛷᛲ r5 = m1327(r5)
            if (r5 != 0) goto L0
            return r2
    }

    /* JADX INFO: renamed from: ᛱᛳᲁᲈ, reason: contains not printable characters */
    public final void m1329(xhss.AbstractC0784 r10) {
            r9 = this;
            long r0 = xhss.AbstractC0784.f2568
            xhss.ᛵᛵᲇᛳ r2 = xhss.C0475.f1712
            if (r10 != 0) goto Lc
            sun.misc.Unsafe r10 = xhss.AbstractC1067.f3442
            r10.putObjectVolatile(r9, r0, r2)
            return
        Lc:
            r10.m1337()
            xhss.ᛴᛴᛷᛲ r8 = new xhss.ᛴᛴᛷᛲ
            r8.<init>(r9)
            r8.f1375 = r10
        L16:
            java.lang.Object r7 = r10.m1351()
            boolean r3 = r7 instanceof xhss.C0276
            if (r3 == 0) goto L40
            r3 = r7
            xhss.ᛳᛵᲁᛵ r3 = (xhss.C0276) r3
            boolean r4 = r3.f1069
            if (r4 == 0) goto L3b
        L25:
            sun.misc.Unsafe r3 = xhss.AbstractC1067.f3442
            long r5 = xhss.AbstractC0784.f2569
            r4 = r10
            boolean r10 = r3.compareAndSwapObject(r4, r5, r7, r8)
            if (r10 == 0) goto L32
            goto L9a
        L32:
            java.lang.Object r10 = r3.getObjectVolatile(r4, r5)
            if (r10 == r7) goto L39
            goto L54
        L39:
            r10 = r4
            goto L25
        L3b:
            r4 = r10
            r4.m1344(r3)
            goto L54
        L40:
            r4 = r10
            boolean r10 = r7 instanceof xhss.InterfaceC0204
            r3 = 0
            if (r10 == 0) goto L86
            r10 = r7
            xhss.ᛲᲀᛵᛳ r10 = (xhss.InterfaceC0204) r10
            xhss.ᛴᲁᛶᛲ r10 = r10.mo466()
            if (r10 != 0) goto L56
            xhss.ᛴᛷᛴᲀ r7 = (xhss.AbstractC0381) r7
            r4.m1349(r7)
        L54:
            r10 = r4
            goto L16
        L56:
            r5 = 7
            boolean r5 = r10.m216(r8, r5)
            if (r5 == 0) goto L5e
            goto L9a
        L5e:
            r5 = 3
            boolean r10 = r10.m216(r8, r5)
            java.lang.Object r4 = r4.m1351()
            boolean r5 = r4 instanceof xhss.C1105
            if (r5 == 0) goto L72
            xhss.ᲇᲈᛵᲁ r4 = (xhss.C1105) r4
            java.lang.Throwable r3 = r4.m1797()
            goto L7e
        L72:
            boolean r5 = r4 instanceof xhss.C0711
            if (r5 == 0) goto L79
            xhss.ᛷᲁᲇᛷ r4 = (xhss.C0711) r4
            goto L7a
        L79:
            r4 = r3
        L7a:
            if (r4 == 0) goto L7e
            java.lang.Throwable r3 = r4.f2385
        L7e:
            r8.mo439(r3)
            if (r10 == 0) goto L84
            goto L9a
        L84:
            r8 = r2
            goto L9a
        L86:
            java.lang.Object r10 = r4.m1351()
            boolean r4 = r10 instanceof xhss.C0711
            if (r4 == 0) goto L91
            xhss.ᛷᲁᲇᛷ r10 = (xhss.C0711) r10
            goto L92
        L91:
            r10 = r3
        L92:
            if (r10 == 0) goto L96
            java.lang.Throwable r3 = r10.f2385
        L96:
            r8.mo439(r3)
            goto L84
        L9a:
            sun.misc.Unsafe r10 = xhss.AbstractC1067.f3442
            r10.putObjectVolatile(r9, r0, r8)
            java.lang.Object r3 = r9.m1351()
            boolean r3 = r3 instanceof xhss.InterfaceC0204
            if (r3 != 0) goto Lad
            r8.mo125()
            r10.putObjectVolatile(r9, r0, r2)
        Lad:
            return
    }

    /* JADX INFO: renamed from: ᛱᲁᛳᛲ, reason: contains not printable characters */
    public final java.lang.Object m1330(java.lang.Object r14, java.lang.Object r15) {
            r13 = this;
            boolean r0 = r14 instanceof xhss.InterfaceC0204
            if (r0 != 0) goto L7
            xhss.ᛶᛲᛷᛵ r13 = xhss.AbstractC0485.f1778
            return r13
        L7:
            boolean r0 = r14 instanceof xhss.C0276
            if (r0 != 0) goto L12
            boolean r0 = r14 instanceof xhss.AbstractC0381
            if (r0 == 0) goto L10
            goto L12
        L10:
            r2 = r13
            goto L49
        L12:
            boolean r0 = r14 instanceof xhss.C0357
            if (r0 != 0) goto L10
            boolean r0 = r15 instanceof xhss.C0711
            if (r0 != 0) goto L10
            r5 = r14
            xhss.ᛲᲀᛵᛳ r5 = (xhss.InterfaceC0204) r5
            boolean r14 = r15 instanceof xhss.InterfaceC0204
            if (r14 == 0) goto L2b
            xhss.ᲀᛳᲈᛳ r14 = new xhss.ᲀᛳᲈᛳ
            r0 = r15
            xhss.ᛲᲀᛵᛳ r0 = (xhss.InterfaceC0204) r0
            r14.<init>(r0)
            r6 = r14
            goto L2c
        L2b:
            r6 = r15
        L2c:
            sun.misc.Unsafe r1 = xhss.AbstractC1067.f3442
            long r3 = xhss.AbstractC0784.f2569
            r2 = r13
            boolean r13 = r1.compareAndSwapObject(r2, r3, r5, r6)
            if (r13 == 0) goto L3e
            r2.mo1340(r15)
            r2.m1336(r5, r15)
            return r15
        L3e:
            java.lang.Object r13 = r1.getObjectVolatile(r2, r3)
            if (r13 == r5) goto L47
            xhss.ᛶᛲᛷᛵ r13 = xhss.AbstractC0485.f1779
            return r13
        L47:
            r13 = r2
            goto L2c
        L49:
            r11 = r14
            xhss.ᛲᲀᛵᛳ r11 = (xhss.InterfaceC0204) r11
            xhss.ᛴᲁᛶᛲ r13 = r2.m1348(r11)
            if (r13 != 0) goto L55
            xhss.ᛶᛲᛷᛵ r13 = xhss.AbstractC0485.f1779
            return r13
        L55:
            boolean r14 = r11 instanceof xhss.C1105
            r0 = 0
            if (r14 == 0) goto L5e
            r14 = r11
            xhss.ᲇᲈᛵᲁ r14 = (xhss.C1105) r14
            goto L5f
        L5e:
            r14 = r0
        L5f:
            if (r14 != 0) goto L66
            xhss.ᲇᲈᛵᲁ r14 = new xhss.ᲇᲈᛵᲁ
            r14.<init>(r13, r0)
        L66:
            r12 = r14
            monitor-enter(r12)
            boolean r14 = r12.m1801()     // Catch: java.lang.Throwable -> L72
            if (r14 == 0) goto L76
            xhss.ᛶᛲᛷᛵ r13 = xhss.AbstractC0485.f1778     // Catch: java.lang.Throwable -> L72
            monitor-exit(r12)
            return r13
        L72:
            r0 = move-exception
            r13 = r0
            goto Le4
        L76:
            sun.misc.Unsafe r14 = xhss.AbstractC1067.f3442     // Catch: java.lang.Throwable -> L72
            long r3 = xhss.C1105.f3572     // Catch: java.lang.Throwable -> L72
            r1 = 1
            r14.putIntVolatile(r12, r3, r1)     // Catch: java.lang.Throwable -> L72
            if (r12 == r11) goto L97
        L80:
            sun.misc.Unsafe r7 = xhss.AbstractC1067.f3442     // Catch: java.lang.Throwable -> L72
            long r9 = xhss.AbstractC0784.f2569     // Catch: java.lang.Throwable -> L72
            r8 = r2
            boolean r14 = r7.compareAndSwapObject(r8, r9, r11, r12)     // Catch: java.lang.Throwable -> L72
            r2 = r8
            if (r14 == 0) goto L8d
            goto L97
        L8d:
            java.lang.Object r14 = r7.getObjectVolatile(r2, r9)     // Catch: java.lang.Throwable -> L72
            if (r14 == r11) goto L80
            xhss.ᛶᛲᛷᛵ r13 = xhss.AbstractC0485.f1779     // Catch: java.lang.Throwable -> L72
            monitor-exit(r12)
            return r13
        L97:
            boolean r14 = r12.m1798()     // Catch: java.lang.Throwable -> L72
            boolean r1 = r15 instanceof xhss.C0711     // Catch: java.lang.Throwable -> L72
            if (r1 == 0) goto La3
            r1 = r15
            xhss.ᛷᲁᲇᛷ r1 = (xhss.C0711) r1     // Catch: java.lang.Throwable -> L72
            goto La4
        La3:
            r1 = r0
        La4:
            if (r1 == 0) goto Lab
            java.lang.Throwable r1 = r1.f2385     // Catch: java.lang.Throwable -> L72
            r12.m1799(r1)     // Catch: java.lang.Throwable -> L72
        Lab:
            java.lang.Throwable r1 = r12.m1797()     // Catch: java.lang.Throwable -> L72
            if (r14 != 0) goto Lb2
            r0 = r1
        Lb2:
            monitor-exit(r12)
            if (r0 == 0) goto Lb8
            r2.m1339(r13, r0)
        Lb8:
            xhss.ᛴᛴᛷᛲ r14 = m1327(r13)
            if (r14 == 0) goto Lc7
            boolean r14 = r2.m1328(r12, r14, r15)
            if (r14 == 0) goto Lc7
            xhss.ᛶᛲᛷᛵ r13 = xhss.AbstractC0485.f1784
            return r13
        Lc7:
            xhss.ᛷᛳᛷᛷ r14 = new xhss.ᛷᛳᛷᛷ
            r0 = 2
            r14.<init>(r0)
            r13.m216(r14, r0)
            xhss.ᛴᛴᛷᛲ r13 = m1327(r13)
            if (r13 == 0) goto Ldf
            boolean r13 = r2.m1328(r12, r13, r15)
            if (r13 == 0) goto Ldf
            xhss.ᛶᛲᛷᛵ r13 = xhss.AbstractC0485.f1784
            return r13
        Ldf:
            java.lang.Object r13 = r2.m1345(r12, r15)
            return r13
        Le4:
            monitor-exit(r12)
            throw r13
    }

    /* JADX INFO: renamed from: ᛱᲈᛳᛴ, reason: contains not printable characters */
    public void m1331() {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: ᛲᛴᲀᲈ, reason: contains not printable characters */
    public final xhss.InterfaceC0022 m1332(boolean r7, xhss.AbstractC0381 r8) {
            r6 = this;
            r8.f1375 = r6
        L2:
            java.lang.Object r4 = r6.m1351()
            boolean r0 = r4 instanceof xhss.C0276
            if (r0 == 0) goto L2e
            r0 = r4
            xhss.ᛳᛵᲁᛵ r0 = (xhss.C0276) r0
            boolean r1 = r0.f1069
            if (r1 == 0) goto L28
        L11:
            sun.misc.Unsafe r0 = xhss.AbstractC1067.f3442
            long r2 = xhss.AbstractC0784.f2569
            r1 = r6
            r5 = r8
            boolean r6 = r0.compareAndSwapObject(r1, r2, r4, r5)
            if (r6 == 0) goto L1e
            goto L6f
        L1e:
            java.lang.Object r6 = r0.getObjectVolatile(r1, r2)
            if (r6 == r4) goto L25
            goto L70
        L25:
            r6 = r1
            r8 = r5
            goto L11
        L28:
            r1 = r6
            r5 = r8
            r1.m1344(r0)
            goto L70
        L2e:
            r1 = r6
            r5 = r8
            boolean r6 = r4 instanceof xhss.InterfaceC0204
            xhss.ᛵᛵᲇᛳ r8 = xhss.C0475.f1712
            r0 = 0
            if (r6 == 0) goto L73
            r6 = r4
            xhss.ᛲᲀᛵᛳ r6 = (xhss.InterfaceC0204) r6
            xhss.ᛴᲁᛶᛲ r2 = r6.mo466()
            if (r2 != 0) goto L46
            xhss.ᛴᛷᛴᲀ r4 = (xhss.AbstractC0381) r4
            r1.m1349(r4)
            goto L70
        L46:
            boolean r3 = r5.mo438()
            if (r3 == 0) goto L68
            boolean r3 = r6 instanceof xhss.C1105
            if (r3 == 0) goto L53
            xhss.ᲇᲈᛵᲁ r6 = (xhss.C1105) r6
            goto L54
        L53:
            r6 = r0
        L54:
            if (r6 == 0) goto L5a
            java.lang.Throwable r0 = r6.m1797()
        L5a:
            if (r0 != 0) goto L62
            r6 = 5
            boolean r6 = r2.m216(r5, r6)
            goto L6d
        L62:
            if (r7 == 0) goto L88
            r5.mo439(r0)
            return r8
        L68:
            r6 = 1
            boolean r6 = r2.m216(r5, r6)
        L6d:
            if (r6 == 0) goto L70
        L6f:
            return r5
        L70:
            r6 = r1
            r8 = r5
            goto L2
        L73:
            if (r7 == 0) goto L88
            java.lang.Object r6 = r1.m1351()
            boolean r7 = r6 instanceof xhss.C0711
            if (r7 == 0) goto L80
            xhss.ᛷᲁᲇᛷ r6 = (xhss.C0711) r6
            goto L81
        L80:
            r6 = r0
        L81:
            if (r6 == 0) goto L85
            java.lang.Throwable r0 = r6.f2385
        L85:
            r5.mo439(r0)
        L88:
            return r8
    }

    /* JADX INFO: renamed from: ᛲᛴᲇᛲ, reason: contains not printable characters */
    public boolean m1333() {
            r1 = this;
            java.lang.Object r1 = r1.m1351()
            boolean r0 = r1 instanceof xhss.InterfaceC0204
            if (r0 == 0) goto L12
            xhss.ᛲᲀᛵᛳ r1 = (xhss.InterfaceC0204) r1
            boolean r1 = r1.mo465()
            if (r1 == 0) goto L12
            r1 = 1
            return r1
        L12:
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: ᛳᛶᛷᲀ, reason: contains not printable characters */
    public boolean mo1334() {
            r0 = this;
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: ᛳᛸᛵᲀ, reason: contains not printable characters */
    public final java.lang.Object m1335(java.lang.Object r4) {
            r3 = this;
        L0:
            java.lang.Object r0 = r3.m1351()
            java.lang.Object r0 = r3.m1330(r0, r4)
            xhss.ᛶᛲᛷᛵ r1 = xhss.AbstractC0485.f1778
            if (r0 != r1) goto L35
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Job "
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r3 = " is already complete or completing, but is being completed with "
            r1.append(r3)
            r1.append(r4)
            java.lang.String r3 = r1.toString()
            boolean r1 = r4 instanceof xhss.C0711
            r2 = 0
            if (r1 == 0) goto L2c
            xhss.ᛷᲁᲇᛷ r4 = (xhss.C0711) r4
            goto L2d
        L2c:
            r4 = r2
        L2d:
            if (r4 == 0) goto L31
            java.lang.Throwable r2 = r4.f2385
        L31:
            r0.<init>(r3, r2)
            throw r0
        L35:
            xhss.ᛶᛲᛷᛵ r1 = xhss.AbstractC0485.f1779
            if (r0 == r1) goto L0
            return r0
    }

    @Override // xhss.InterfaceC0362
    /* JADX INFO: renamed from: ᛳᲁᲇᛸ */
    public final java.lang.Object mo598(java.lang.Object r1, xhss.InterfaceC0517 r2) {
            r0 = this;
            java.lang.Object r0 = r2.mo115(r1, r0)
            return r0
    }

    /* JADX INFO: renamed from: ᛳᲈᲈᛲ, reason: contains not printable characters */
    public final void m1336(xhss.InterfaceC0204 r7, java.lang.Object r8) {
            r6 = this;
            sun.misc.Unsafe r0 = xhss.AbstractC1067.f3442
            long r1 = xhss.AbstractC0784.f2568
            java.lang.Object r3 = r0.getObjectVolatile(r6, r1)
            xhss.ᛶᛷᛴᛶ r3 = (xhss.InterfaceC0573) r3
            if (r3 == 0) goto L14
            r3.mo125()
            xhss.ᛵᛵᲇᛳ r3 = xhss.C0475.f1712
            r0.putObjectVolatile(r6, r1, r3)
        L14:
            boolean r0 = r8 instanceof xhss.C0711
            r1 = 0
            if (r0 == 0) goto L1c
            xhss.ᛷᲁᲇᛷ r8 = (xhss.C0711) r8
            goto L1d
        L1c:
            r8 = r1
        L1d:
            if (r8 == 0) goto L22
            java.lang.Throwable r8 = r8.f2385
            goto L23
        L22:
            r8 = r1
        L23:
            boolean r0 = r7 instanceof xhss.AbstractC0381
            java.lang.String r2 = " for "
            java.lang.String r3 = "Exception in completion handler "
            if (r0 == 0) goto L4e
            r0 = r7
            xhss.ᛴᛷᛴᲀ r0 = (xhss.AbstractC0381) r0     // Catch: java.lang.Throwable -> L32
            r0.mo439(r8)     // Catch: java.lang.Throwable -> L32
            return
        L32:
            r8 = move-exception
            xhss.ᛵᛲᛲᲇ r0 = new xhss.ᛵᛲᛲᲇ
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r3)
            r1.append(r7)
            r1.append(r2)
            r1.append(r6)
            java.lang.String r7 = r1.toString()
            r0.<init>(r7, r8)
            r6.mo1347(r0)
            goto L9c
        L4e:
            xhss.ᛴᲁᛶᛲ r7 = r7.mo466()
            if (r7 == 0) goto L9c
            xhss.ᛷᛳᛷᛷ r0 = new xhss.ᛷᛳᛷᛷ
            r4 = 1
            r0.<init>(r4)
            r7.m216(r0, r4)
            java.lang.Object r0 = r7.m218()
            xhss.ᛱᛸᛲᛴ r0 = (xhss.AbstractC0070) r0
        L63:
            boolean r4 = xhss.AbstractC0007.m97(r0, r7)
            if (r4 != 0) goto L97
            boolean r4 = r0 instanceof xhss.AbstractC0381
            if (r4 == 0) goto L92
            r4 = r0
            xhss.ᛴᛷᛴᲀ r4 = (xhss.AbstractC0381) r4     // Catch: java.lang.Throwable -> L74
            r4.mo439(r8)     // Catch: java.lang.Throwable -> L74
            goto L92
        L74:
            r4 = move-exception
            if (r1 == 0) goto L7b
            xhss.AbstractC1178.m1874(r1, r4)
            goto L92
        L7b:
            xhss.ᛵᛲᛲᲇ r1 = new xhss.ᛵᛲᛲᲇ
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r3)
            r5.append(r0)
            r5.append(r2)
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r1.<init>(r5, r4)
        L92:
            xhss.ᛱᛸᛲᛴ r0 = r0.m217()
            goto L63
        L97:
            if (r1 == 0) goto L9c
            r6.mo1347(r1)
        L9c:
            return
    }

    /* JADX INFO: renamed from: ᛴᲀᛸᛵ, reason: contains not printable characters */
    public final boolean m1337() {
            r8 = this;
        L0:
            java.lang.Object r4 = r8.m1351()
            boolean r0 = r4 instanceof xhss.C0276
            long r6 = xhss.AbstractC0784.f2569
            if (r0 == 0) goto L29
            r0 = r4
            xhss.ᛳᛵᲁᛵ r0 = (xhss.C0276) r0
            boolean r0 = r0.f1069
            if (r0 == 0) goto L12
            goto L47
        L12:
            sun.misc.Unsafe r0 = xhss.AbstractC1067.f3442
            long r2 = xhss.AbstractC0784.f2569
            xhss.ᛳᛵᲁᛵ r5 = xhss.AbstractC0485.f1781
            r1 = r8
            boolean r8 = r0.compareAndSwapObject(r1, r2, r4, r5)
            if (r8 == 0) goto L20
            goto L3d
        L20:
            java.lang.Object r8 = r0.getObjectVolatile(r1, r6)
            if (r8 == r4) goto L27
            goto L45
        L27:
            r8 = r1
            goto L12
        L29:
            r1 = r8
            boolean r8 = r4 instanceof xhss.C0398
            if (r8 == 0) goto L47
            r8 = r4
            xhss.ᛴᛸᲇᛲ r8 = (xhss.C0398) r8
            xhss.ᛴᲁᛶᛲ r5 = r8.f1411
        L33:
            sun.misc.Unsafe r0 = xhss.AbstractC1067.f3442
            long r2 = xhss.AbstractC0784.f2569
            boolean r8 = r0.compareAndSwapObject(r1, r2, r4, r5)
            if (r8 == 0) goto L3f
        L3d:
            r8 = 1
            return r8
        L3f:
            java.lang.Object r8 = r0.getObjectVolatile(r1, r6)
            if (r8 == r4) goto L33
        L45:
            r8 = r1
            goto L0
        L47:
            r8 = 0
            return r8
    }

    /* JADX INFO: renamed from: ᛴᲈᛱᛴ, reason: contains not printable characters */
    public boolean mo1338() {
            r0 = this;
            r0 = 1
            return r0
    }

    /* JADX INFO: renamed from: ᛵᛲᲁᛶ, reason: contains not printable characters */
    public final void m1339(xhss.C0409 r6, java.lang.Throwable r7) {
            r5 = this;
            xhss.ᛷᛳᛷᛷ r0 = new xhss.ᛷᛳᛷᛷ
            r1 = 4
            r0.<init>(r1)
            r6.m216(r0, r1)
            java.lang.Object r0 = r6.m218()
            xhss.ᛱᛸᛲᛴ r0 = (xhss.AbstractC0070) r0
            r1 = 0
        L10:
            boolean r2 = xhss.AbstractC0007.m97(r0, r6)
            if (r2 != 0) goto L51
            boolean r2 = r0 instanceof xhss.AbstractC0381
            if (r2 == 0) goto L4c
            r2 = r0
            xhss.ᛴᛷᛴᲀ r2 = (xhss.AbstractC0381) r2
            boolean r2 = r2.mo438()
            if (r2 == 0) goto L4c
            r2 = r0
            xhss.ᛴᛷᛴᲀ r2 = (xhss.AbstractC0381) r2     // Catch: java.lang.Throwable -> L2a
            r2.mo439(r7)     // Catch: java.lang.Throwable -> L2a
            goto L4c
        L2a:
            r2 = move-exception
            if (r1 == 0) goto L31
            xhss.AbstractC1178.m1874(r1, r2)
            goto L4c
        L31:
            xhss.ᛵᛲᛲᲇ r1 = new xhss.ᛵᛲᛲᲇ
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Exception in completion handler "
            r3.<init>(r4)
            r3.append(r0)
            java.lang.String r4 = " for "
            r3.append(r4)
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            r1.<init>(r3, r2)
        L4c:
            xhss.ᛱᛸᛲᛴ r0 = r0.m217()
            goto L10
        L51:
            if (r1 == 0) goto L56
            r5.mo1347(r1)
        L56:
            r5.m1342(r7)
            return
    }

    /* JADX INFO: renamed from: ᛵᛷᛲᛸ, reason: contains not printable characters */
    public void mo1340(java.lang.Object r1) {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: ᛶᲇᲈᛸ, reason: contains not printable characters */
    public final java.lang.Throwable m1341(java.lang.Object r4) {
            r3 = this;
            if (r4 != 0) goto L4
            r0 = 1
            goto L6
        L4:
            boolean r0 = r4 instanceof java.lang.Throwable
        L6:
            r1 = 0
            if (r0 == 0) goto L17
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            if (r4 != 0) goto L16
            xhss.ᲈᛶᲈᛵ r4 = new xhss.ᲈᛶᲈᛵ
            java.lang.String r0 = r3.mo1346()
            r4.<init>(r0, r1, r3)
        L16:
            return r4
        L17:
            xhss.ᛸᛷᛳᲈ r4 = (xhss.AbstractC0784) r4
            java.lang.Object r3 = r4.m1351()
            boolean r0 = r3 instanceof xhss.C1105
            if (r0 == 0) goto L29
            r0 = r3
            xhss.ᲇᲈᛵᲁ r0 = (xhss.C1105) r0
            java.lang.Throwable r0 = r0.m1797()
            goto L38
        L29:
            boolean r0 = r3 instanceof xhss.C0711
            if (r0 == 0) goto L33
            r0 = r3
            xhss.ᛷᲁᲇᛷ r0 = (xhss.C0711) r0
            java.lang.Throwable r0 = r0.f2385
            goto L38
        L33:
            boolean r0 = r3 instanceof xhss.InterfaceC0204
            if (r0 != 0) goto L51
            r0 = r1
        L38:
            boolean r2 = r0 instanceof java.util.concurrent.CancellationException
            if (r2 == 0) goto L3f
            r1 = r0
            java.util.concurrent.CancellationException r1 = (java.util.concurrent.CancellationException) r1
        L3f:
            if (r1 != 0) goto L50
            xhss.ᲈᛶᲈᛵ r1 = new xhss.ᲈᛶᲈᛵ
            java.lang.String r3 = m1326(r3)
            java.lang.String r2 = "Parent job is "
            java.lang.String r3 = r2.concat(r3)
            r1.<init>(r3, r0, r4)
        L50:
            return r1
        L51:
            java.lang.String r4 = "Cannot be cancelling child in this state: "
            xhss.C0532.m948(r3, r4)
            return r1
    }

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ */
    public void mo541(java.lang.Object r1) {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᲁ, reason: contains not printable characters */
    public final boolean m1342(java.lang.Throwable r5) {
            r4 = this;
            boolean r0 = r4.mo674()
            if (r0 == 0) goto L7
            goto L25
        L7:
            boolean r0 = r5 instanceof java.util.concurrent.CancellationException
            sun.misc.Unsafe r1 = xhss.AbstractC1067.f3442
            long r2 = xhss.AbstractC0784.f2568
            java.lang.Object r4 = r1.getObjectVolatile(r4, r2)
            xhss.ᛶᛷᛴᛶ r4 = (xhss.InterfaceC0573) r4
            if (r4 == 0) goto L27
            xhss.ᛵᛵᲇᛳ r1 = xhss.C0475.f1712
            if (r4 != r1) goto L1a
            goto L27
        L1a:
            boolean r4 = r4.mo716(r5)
            if (r4 != 0) goto L25
            if (r0 == 0) goto L23
            goto L25
        L23:
            r4 = 0
            return r4
        L25:
            r4 = 1
            return r4
        L27:
            return r0
    }

    /* JADX INFO: renamed from: ᛸᛲᛷᛱ, reason: contains not printable characters */
    public final java.util.concurrent.CancellationException m1343() {
            r4 = this;
            java.lang.Object r0 = r4.m1351()
            boolean r1 = r0 instanceof xhss.C1105
            java.lang.String r2 = "Job is still new or active: "
            r3 = 0
            if (r1 == 0) goto L35
            xhss.ᲇᲈᛵᲁ r0 = (xhss.C1105) r0
            java.lang.Throwable r0 = r0.m1797()
            if (r0 == 0) goto L31
            java.lang.Class r1 = r4.getClass()
            java.lang.String r1 = r1.getSimpleName()
            java.lang.String r2 = " is cancelling"
            java.lang.String r1 = r1.concat(r2)
            boolean r2 = r0 instanceof java.util.concurrent.CancellationException
            if (r2 == 0) goto L28
            r3 = r0
            java.util.concurrent.CancellationException r3 = (java.util.concurrent.CancellationException) r3
        L28:
            if (r3 != 0) goto L30
            xhss.ᲈᛶᲈᛵ r2 = new xhss.ᲈᛶᲈᛵ
            r2.<init>(r1, r0, r4)
            return r2
        L30:
            return r3
        L31:
            xhss.C0532.m948(r4, r2)
            return r3
        L35:
            boolean r1 = r0 instanceof xhss.InterfaceC0204
            if (r1 != 0) goto L69
            boolean r1 = r0 instanceof xhss.C0711
            if (r1 == 0) goto L55
            xhss.ᛷᲁᲇᛷ r0 = (xhss.C0711) r0
            java.lang.Throwable r0 = r0.f2385
            boolean r1 = r0 instanceof java.util.concurrent.CancellationException
            if (r1 == 0) goto L48
            r3 = r0
            java.util.concurrent.CancellationException r3 = (java.util.concurrent.CancellationException) r3
        L48:
            if (r3 != 0) goto L54
            xhss.ᲈᛶᲈᛵ r1 = new xhss.ᲈᛶᲈᛵ
            java.lang.String r2 = r4.mo1346()
            r1.<init>(r2, r0, r4)
            return r1
        L54:
            return r3
        L55:
            xhss.ᲈᛶᲈᛵ r0 = new xhss.ᲈᛶᲈᛵ
            java.lang.Class r1 = r4.getClass()
            java.lang.String r1 = r1.getSimpleName()
            java.lang.String r2 = " has completed normally"
            java.lang.String r1 = r1.concat(r2)
            r0.<init>(r1, r3, r4)
            return r0
        L69:
            xhss.C0532.m948(r4, r2)
            return r3
    }

    @Override // xhss.InterfaceC0362
    /* JADX INFO: renamed from: ᛸᛲᲀᛵ */
    public final xhss.InterfaceC0362 mo440(xhss.InterfaceC1091 r2) {
            r1 = this;
            xhss.ᛳᛴᲀᲁ r0 = xhss.C0263.f977
            boolean r2 = xhss.AbstractC0007.m97(r0, r2)
            if (r2 == 0) goto La
            xhss.ᲇᛷᲁᛷ r1 = xhss.C1059.f3421
        La:
            return r1
    }

    /* JADX INFO: renamed from: ᛸᛴᛸᛲ, reason: contains not printable characters */
    public final void m1344(xhss.C0276 r9) {
            r8 = this;
            xhss.ᛴᲁᛶᛲ r0 = new xhss.ᛴᲁᛶᛲ
            r0.<init>()
            boolean r1 = r9.f1069
            if (r1 == 0) goto Lb
            r7 = r0
            goto L11
        Lb:
            xhss.ᛴᛸᲇᛲ r1 = new xhss.ᛴᛸᲇᛲ
            r1.<init>(r0)
            r7 = r1
        L11:
            sun.misc.Unsafe r2 = xhss.AbstractC1067.f3442
            long r4 = xhss.AbstractC0784.f2569
            r3 = r8
            r6 = r9
            boolean r8 = r2.compareAndSwapObject(r3, r4, r6, r7)
            if (r8 == 0) goto L1e
            goto L24
        L1e:
            java.lang.Object r8 = r2.getObjectVolatile(r3, r4)
            if (r8 == r6) goto L25
        L24:
            return
        L25:
            r8 = r3
            r9 = r6
            goto L11
    }

    /* JADX INFO: renamed from: ᛸᛶᛴᲈ, reason: contains not printable characters */
    public final java.lang.Object m1345(xhss.C1105 r9, java.lang.Object r10) {
            r8 = this;
            boolean r0 = r10 instanceof xhss.C0711
            r1 = 0
            if (r0 == 0) goto L9
            r0 = r10
            xhss.ᛷᲁᲇᛷ r0 = (xhss.C0711) r0
            goto La
        L9:
            r0 = r1
        La:
            if (r0 == 0) goto Lf
            java.lang.Throwable r0 = r0.f2385
            goto L10
        Lf:
            r0 = r1
        L10:
            monitor-enter(r9)
            r9.m1798()     // Catch: java.lang.Throwable -> Le5
            java.util.ArrayList r2 = r9.m1800(r0)     // Catch: java.lang.Throwable -> Le5
            boolean r3 = r2.isEmpty()     // Catch: java.lang.Throwable -> Le5
            r4 = 0
            if (r3 == 0) goto L30
            boolean r3 = r9.m1798()     // Catch: java.lang.Throwable -> L47
            if (r3 == 0) goto L55
            xhss.ᲈᛶᲈᛵ r3 = new xhss.ᲈᛶᲈᛵ     // Catch: java.lang.Throwable -> L47
            java.lang.String r5 = r8.mo1346()     // Catch: java.lang.Throwable -> L47
            r3.<init>(r5, r1, r8)     // Catch: java.lang.Throwable -> L47
            r1 = r3
            goto L55
        L30:
            java.util.Iterator r3 = r2.iterator()     // Catch: java.lang.Throwable -> Le5
        L34:
            boolean r5 = r3.hasNext()     // Catch: java.lang.Throwable -> Le5
            if (r5 == 0) goto L4a
            java.lang.Object r5 = r3.next()     // Catch: java.lang.Throwable -> L47
            r6 = r5
            java.lang.Throwable r6 = (java.lang.Throwable) r6     // Catch: java.lang.Throwable -> L47
            boolean r6 = r6 instanceof java.util.concurrent.CancellationException     // Catch: java.lang.Throwable -> L47
            if (r6 != 0) goto L34
            r1 = r5
            goto L4a
        L47:
            r0 = move-exception
            r8 = r0
            goto L8e
        L4a:
            java.lang.Throwable r1 = (java.lang.Throwable) r1     // Catch: java.lang.Throwable -> Le5
            if (r1 == 0) goto L4f
            goto L55
        L4f:
            java.lang.Object r1 = r2.get(r4)     // Catch: java.lang.Throwable -> Le5
            java.lang.Throwable r1 = (java.lang.Throwable) r1     // Catch: java.lang.Throwable -> Le5
        L55:
            if (r1 == 0) goto L90
            int r3 = r2.size()     // Catch: java.lang.Throwable -> L47
            r5 = 1
            if (r3 > r5) goto L5f
            goto L90
        L5f:
            int r3 = r2.size()     // Catch: java.lang.Throwable -> L47
            java.util.IdentityHashMap r5 = new java.util.IdentityHashMap     // Catch: java.lang.Throwable -> L47
            r5.<init>(r3)     // Catch: java.lang.Throwable -> L47
            java.util.Set r3 = java.util.Collections.newSetFromMap(r5)     // Catch: java.lang.Throwable -> L47
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L47
        L70:
            boolean r5 = r2.hasNext()     // Catch: java.lang.Throwable -> L47
            if (r5 == 0) goto L90
            java.lang.Object r5 = r2.next()     // Catch: java.lang.Throwable -> L47
            java.lang.Throwable r5 = (java.lang.Throwable) r5     // Catch: java.lang.Throwable -> L47
            if (r5 == r1) goto L70
            if (r5 == r1) goto L70
            boolean r6 = r5 instanceof java.util.concurrent.CancellationException     // Catch: java.lang.Throwable -> L47
            if (r6 != 0) goto L70
            boolean r6 = r3.add(r5)     // Catch: java.lang.Throwable -> L47
            if (r6 == 0) goto L70
            xhss.AbstractC1178.m1874(r1, r5)     // Catch: java.lang.Throwable -> L47
            goto L70
        L8e:
            r6 = r9
            goto Le8
        L90:
            monitor-exit(r9)
            if (r1 != 0) goto L94
            goto L9c
        L94:
            if (r1 != r0) goto L97
            goto L9c
        L97:
            xhss.ᛷᲁᲇᛷ r10 = new xhss.ᛷᲁᲇᛷ
            r10.<init>(r1, r4)
        L9c:
            if (r1 == 0) goto Lb9
            boolean r0 = r8.m1342(r1)
            if (r0 != 0) goto Laa
            boolean r0 = r8.mo246(r1)
            if (r0 == 0) goto Lb9
        Laa:
            r2 = r10
            xhss.ᛷᲁᲇᛷ r2 = (xhss.C0711) r2
            r2.getClass()
            sun.misc.Unsafe r1 = xhss.AbstractC1067.f3442
            long r3 = xhss.C0711.f2384
            r5 = 0
            r6 = 1
            r1.compareAndSwapInt(r2, r3, r5, r6)
        Lb9:
            r8.mo1340(r10)
            boolean r0 = r10 instanceof xhss.InterfaceC0204
            if (r0 == 0) goto Lca
            xhss.ᲀᛳᲈᛳ r0 = new xhss.ᲀᛳᲈᛳ
            r1 = r10
            xhss.ᛲᲀᛵᛳ r1 = (xhss.InterfaceC0204) r1
            r0.<init>(r1)
            r7 = r0
            goto Lcb
        Lca:
            r7 = r10
        Lcb:
            sun.misc.Unsafe r2 = xhss.AbstractC1067.f3442
            long r4 = xhss.AbstractC0784.f2569
            r3 = r8
            r6 = r9
            boolean r8 = r2.compareAndSwapObject(r3, r4, r6, r7)
            if (r8 == 0) goto Ld8
            goto Lde
        Ld8:
            java.lang.Object r8 = r2.getObjectVolatile(r3, r4)
            if (r8 == r6) goto Le2
        Lde:
            r3.m1336(r6, r10)
            return r10
        Le2:
            r8 = r3
            r9 = r6
            goto Lcb
        Le5:
            r0 = move-exception
            r6 = r9
            r8 = r0
        Le8:
            monitor-exit(r6)
            throw r8
    }

    /* JADX INFO: renamed from: ᛸᛶᲈᛶ, reason: contains not printable characters */
    public java.lang.String mo1346() {
            r0 = this;
            java.lang.String r0 = "Job was cancelled"
            return r0
    }

    /* JADX INFO: renamed from: ᛸᛷᲈᲈ */
    public void mo542(java.lang.Object r1) {
            r0 = this;
            r0.mo541(r1)
            return
    }

    /* JADX INFO: renamed from: ᲀᛷᲁᲀ, reason: contains not printable characters */
    public void mo1347(xhss.C0442 r1) {
            r0 = this;
            throw r1
    }

    @Override // xhss.InterfaceC0362
    /* JADX INFO: renamed from: ᲀᲇᛳᲁ */
    public final xhss.InterfaceC0362 mo599(xhss.InterfaceC0362 r1) {
            r0 = this;
            xhss.ᛴᛵᛳᛵ r0 = xhss.AbstractC0060.m188(r0, r1)
            return r0
    }

    /* JADX INFO: renamed from: ᲁᛲᛴᛴ, reason: contains not printable characters */
    public final xhss.C0409 m1348(xhss.InterfaceC0204 r3) {
            r2 = this;
            xhss.ᛴᲁᛶᛲ r0 = r3.mo466()
            if (r0 != 0) goto L21
            boolean r0 = r3 instanceof xhss.C0276
            if (r0 == 0) goto L10
            xhss.ᛴᲁᛶᛲ r2 = new xhss.ᛴᲁᛶᛲ
            r2.<init>()
            return r2
        L10:
            boolean r0 = r3 instanceof xhss.AbstractC0381
            r1 = 0
            if (r0 == 0) goto L1b
            xhss.ᛴᛷᛴᲀ r3 = (xhss.AbstractC0381) r3
            r2.m1349(r3)
            return r1
        L1b:
            java.lang.String r2 = "State should have list: "
            xhss.C0532.m948(r3, r2)
            return r1
        L21:
            return r0
    }

    /* JADX INFO: renamed from: ᲁᛴᲇᛲ */
    public boolean mo246(java.lang.Throwable r1) {
            r0 = this;
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: ᲁᛷᲇᲇ, reason: contains not printable characters */
    public final void m1349(xhss.AbstractC0381 r15) {
            r14 = this;
            xhss.ᛴᲁᛶᛲ r5 = new xhss.ᛴᲁᛶᛲ
            r5.<init>()
            sun.misc.Unsafe r0 = xhss.AbstractC1067.f3442
            long r1 = xhss.AbstractC0070.f369
            r0.putObjectVolatile(r5, r1, r15)
            long r6 = xhss.AbstractC0070.f368
            r0.putObjectVolatile(r5, r6, r15)
        L11:
            java.lang.Object r0 = r15.m218()
            if (r0 == r15) goto L19
            r1 = r15
            goto L28
        L19:
            sun.misc.Unsafe r0 = xhss.AbstractC1067.f3442
            long r2 = xhss.AbstractC0070.f368
            r4 = r15
            r1 = r15
            boolean r15 = r0.compareAndSwapObject(r1, r2, r4, r5)
            if (r15 == 0) goto L42
            r5.m220(r1)
        L28:
            xhss.ᛱᛸᛲᛴ r13 = r1.m217()
        L2c:
            sun.misc.Unsafe r8 = xhss.AbstractC1067.f3442
            long r10 = xhss.AbstractC0784.f2569
            r9 = r14
            r12 = r1
            boolean r14 = r8.compareAndSwapObject(r9, r10, r12, r13)
            if (r14 == 0) goto L39
            goto L3f
        L39:
            java.lang.Object r14 = r8.getObjectVolatile(r9, r10)
            if (r14 == r1) goto L40
        L3f:
            return
        L40:
            r14 = r9
            goto L2c
        L42:
            r9 = r14
            java.lang.Object r14 = r0.getObjectVolatile(r1, r6)
            r15 = r1
            if (r14 == r1) goto L4c
            r14 = r9
            goto L11
        L4c:
            r14 = r9
            goto L19
    }

    /* JADX INFO: renamed from: ᲁᲁᛴᲁ */
    public boolean mo674() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // xhss.InterfaceC0362
    /* JADX INFO: renamed from: ᲇᛴᲇᛵ */
    public final xhss.InterfaceC0281 mo442(xhss.InterfaceC1091 r2) {
            r1 = this;
            xhss.ᛳᛴᲀᲁ r0 = xhss.C0263.f977
            boolean r2 = xhss.AbstractC0007.m97(r0, r2)
            if (r2 == 0) goto L9
            return r1
        L9:
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: ᲇᛸᛳᲁ, reason: contains not printable characters */
    public boolean mo1350(java.lang.Throwable r2) {
            r1 = this;
            boolean r0 = r2 instanceof java.util.concurrent.CancellationException
            if (r0 == 0) goto L5
            goto L11
        L5:
            boolean r2 = r1.m1352(r2)
            if (r2 == 0) goto L13
            boolean r1 = r1.mo1338()
            if (r1 == 0) goto L13
        L11:
            r1 = 1
            return r1
        L13:
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: ᲈᛲᛵᲁ, reason: contains not printable characters */
    public final java.lang.Object m1351() {
            r3 = this;
            sun.misc.Unsafe r0 = xhss.AbstractC1067.f3442
            long r1 = xhss.AbstractC0784.f2569
            java.lang.Object r3 = r0.getObjectVolatile(r3, r1)
            return r3
    }

    /* JADX INFO: renamed from: ᲈᛳᲀ, reason: contains not printable characters */
    public final boolean m1352(java.lang.Object r13) {
            r12 = this;
            xhss.ᛶᛲᛷᛵ r0 = xhss.AbstractC0485.f1778
            boolean r1 = r12.mo1334()
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L3a
        La:
            java.lang.Object r0 = r12.m1351()
            boolean r1 = r0 instanceof xhss.InterfaceC0204
            if (r1 == 0) goto L32
            boolean r1 = r0 instanceof xhss.C1105
            if (r1 == 0) goto L20
            r1 = r0
            xhss.ᲇᲈᛵᲁ r1 = (xhss.C1105) r1
            boolean r1 = r1.m1801()
            if (r1 == 0) goto L20
            goto L32
        L20:
            xhss.ᛷᲁᲇᛷ r1 = new xhss.ᛷᲁᲇᛷ
            java.lang.Throwable r4 = r12.m1341(r13)
            r1.<init>(r4, r2)
            java.lang.Object r0 = r12.m1330(r0, r1)
            xhss.ᛶᛲᛷᛵ r1 = xhss.AbstractC0485.f1779
            if (r0 == r1) goto La
            goto L34
        L32:
            xhss.ᛶᛲᛷᛵ r0 = xhss.AbstractC0485.f1778
        L34:
            xhss.ᛶᛲᛷᛵ r1 = xhss.AbstractC0485.f1784
            if (r0 != r1) goto L3a
            goto Lf7
        L3a:
            xhss.ᛶᛲᛷᛵ r1 = xhss.AbstractC0485.f1778
            if (r0 != r1) goto Led
            r0 = 0
            r1 = r0
        L40:
            java.lang.Object r4 = r12.m1351()
            boolean r5 = r4 instanceof xhss.C1105
            if (r5 == 0) goto L92
            monitor-enter(r4)
            r5 = r4
            xhss.ᲇᲈᛵᲁ r5 = (xhss.C1105) r5     // Catch: java.lang.Throwable -> L5f
            sun.misc.Unsafe r6 = xhss.AbstractC1067.f3442     // Catch: java.lang.Throwable -> L5f
            long r7 = xhss.C1105.f3570     // Catch: java.lang.Throwable -> L5f
            java.lang.Object r5 = r6.getObjectVolatile(r5, r7)     // Catch: java.lang.Throwable -> L5f
            xhss.ᛶᛲᛷᛵ r6 = xhss.AbstractC0485.f1783     // Catch: java.lang.Throwable -> L5f
            if (r5 != r6) goto L62
            xhss.ᛶᛲᛷᛵ r13 = xhss.AbstractC0485.f1785     // Catch: java.lang.Throwable -> L5f
            monitor-exit(r4)
        L5b:
            r6 = r12
            r0 = r13
            goto Lee
        L5f:
            r0 = move-exception
            r12 = r0
            goto L90
        L62:
            r5 = r4
            xhss.ᲇᲈᛵᲁ r5 = (xhss.C1105) r5     // Catch: java.lang.Throwable -> L5f
            boolean r5 = r5.m1798()     // Catch: java.lang.Throwable -> L5f
            if (r13 != 0) goto L6d
            if (r5 != 0) goto L79
        L6d:
            if (r1 != 0) goto L73
            java.lang.Throwable r1 = r12.m1341(r13)     // Catch: java.lang.Throwable -> L5f
        L73:
            r13 = r4
            xhss.ᲇᲈᛵᲁ r13 = (xhss.C1105) r13     // Catch: java.lang.Throwable -> L5f
            r13.m1799(r1)     // Catch: java.lang.Throwable -> L5f
        L79:
            r13 = r4
            xhss.ᲇᲈᛵᲁ r13 = (xhss.C1105) r13     // Catch: java.lang.Throwable -> L5f
            java.lang.Throwable r13 = r13.m1797()     // Catch: java.lang.Throwable -> L5f
            if (r5 != 0) goto L83
            r0 = r13
        L83:
            monitor-exit(r4)
            if (r0 == 0) goto L8d
            xhss.ᲇᲈᛵᲁ r4 = (xhss.C1105) r4
            xhss.ᛴᲁᛶᛲ r13 = r4.f3573
            r12.m1339(r13, r0)
        L8d:
            xhss.ᛶᛲᛷᛵ r13 = xhss.AbstractC0485.f1778
            goto L5b
        L90:
            monitor-exit(r4)
            throw r12
        L92:
            boolean r5 = r4 instanceof xhss.InterfaceC0204
            if (r5 == 0) goto Le9
            if (r1 != 0) goto L9c
            java.lang.Throwable r1 = r12.m1341(r13)
        L9c:
            r9 = r4
            xhss.ᛲᲀᛵᛳ r9 = (xhss.InterfaceC0204) r9
            boolean r5 = r9.mo465()
            if (r5 == 0) goto Lcd
            xhss.ᛴᲁᛶᛲ r11 = r12.m1348(r9)
            if (r11 != 0) goto Lad
            r6 = r12
            goto Le0
        Lad:
            xhss.ᲇᲈᛵᲁ r10 = new xhss.ᲇᲈᛵᲁ
            r10.<init>(r11, r1)
        Lb2:
            sun.misc.Unsafe r5 = xhss.AbstractC1067.f3442
            long r7 = xhss.AbstractC0784.f2569
            r6 = r12
            boolean r12 = r5.compareAndSwapObject(r6, r7, r9, r10)
            if (r12 == 0) goto Lc4
            r6.m1339(r11, r1)
            xhss.ᛶᛲᛷᛵ r12 = xhss.AbstractC0485.f1778
        Lc2:
            r0 = r12
            goto Lee
        Lc4:
            java.lang.Object r12 = r5.getObjectVolatile(r6, r7)
            if (r12 == r9) goto Lcb
            goto Le0
        Lcb:
            r12 = r6
            goto Lb2
        Lcd:
            r6 = r12
            xhss.ᛷᲁᲇᛷ r12 = new xhss.ᛷᲁᲇᛷ
            r12.<init>(r1, r2)
            java.lang.Object r12 = r6.m1330(r4, r12)
            xhss.ᛶᛲᛷᛵ r5 = xhss.AbstractC0485.f1778
            if (r12 == r5) goto Le3
            xhss.ᛶᛲᛷᛵ r4 = xhss.AbstractC0485.f1779
            if (r12 == r4) goto Le0
            goto Lc2
        Le0:
            r12 = r6
            goto L40
        Le3:
            java.lang.String r12 = "Cannot happen in "
            xhss.C0532.m948(r4, r12)
            return r2
        Le9:
            r6 = r12
            xhss.ᛶᛲᛷᛵ r12 = xhss.AbstractC0485.f1785
            goto Lc2
        Led:
            r6 = r12
        Lee:
            xhss.ᛶᛲᛷᛵ r12 = xhss.AbstractC0485.f1778
            if (r0 != r12) goto Lf3
            goto Lf7
        Lf3:
            xhss.ᛶᛲᛷᛵ r12 = xhss.AbstractC0485.f1784
            if (r0 != r12) goto Lf8
        Lf7:
            return r3
        Lf8:
            xhss.ᛶᛲᛷᛵ r12 = xhss.AbstractC0485.f1785
            if (r0 != r12) goto Lfd
            return r2
        Lfd:
            r6.mo541(r0)
            return r3
    }
}
