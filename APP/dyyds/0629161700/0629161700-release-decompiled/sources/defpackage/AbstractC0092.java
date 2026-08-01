package defpackage;

/* JADX INFO: renamed from: ᛱᛵᛶᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0092 extends defpackage.AbstractC1805 implements defpackage.InterfaceC1925 {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public static final /* synthetic */ long f882 = 0;

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public static final /* synthetic */ long f883 = 0;

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public static final /* synthetic */ int f884 = 0;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public static final /* synthetic */ long f885 = 0;
    private volatile /* synthetic */ java.lang.Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile;
    private volatile /* synthetic */ java.lang.Object _queue$volatile;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public boolean f886;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public long f887;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public defpackage.C1185 f888;

    static {
            sun.misc.Unsafe r0 = defpackage.AbstractC0051.f569
            java.lang.Class<ᛱᛵᛶᲇ> r1 = defpackage.AbstractC0092.class
            java.lang.String r2 = "_queue$volatile"
            java.lang.reflect.Field r2 = r1.getDeclaredField(r2)
            long r2 = r0.objectFieldOffset(r2)
            defpackage.AbstractC0092.f883 = r2
            java.lang.String r2 = "_delayed$volatile"
            java.lang.reflect.Field r2 = r1.getDeclaredField(r2)
            long r2 = r0.objectFieldOffset(r2)
            defpackage.AbstractC0092.f885 = r2
            java.lang.String r2 = "_isCompleted$volatile"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r2)
            long r0 = r0.objectFieldOffset(r1)
            defpackage.AbstractC0092.f882 = r0
            return
    }

    public AbstractC0092() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1._isCompleted$volatile = r0
            return
    }

    public void shutdown() {
            r11 = this;
            java.lang.ThreadLocal r0 = defpackage.AbstractC1054.f4655
            r6 = 0
            r0.set(r6)
            sun.misc.Unsafe r0 = defpackage.AbstractC0051.f569
            long r2 = defpackage.AbstractC0092.f882
            r7 = 1
            r0.putIntVolatile(r11, r2, r7)
            ᛳᛴᛵᛱ r5 = defpackage.C0292.f1590
            long r8 = defpackage.AbstractC0092.f883
        L12:
            sun.misc.Unsafe r0 = defpackage.AbstractC0051.f569
            java.lang.Object r4 = r0.getObjectVolatile(r11, r8)
            if (r4 != 0) goto L32
        L1a:
            sun.misc.Unsafe r0 = defpackage.AbstractC0051.f569
            long r2 = defpackage.AbstractC0092.f883
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
            boolean r0 = r4 instanceof defpackage.C0369
            if (r0 == 0) goto L3d
            ᛲᲇ r4 = (defpackage.C0369) r4
            r4.m1098()
            goto L58
        L3d:
            if (r4 != r10) goto L40
            goto L58
        L40:
            ᛲᲇ r5 = new ᛲᲇ
            r0 = 8
            r5.<init>(r0, r7)
            r0 = r4
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            r5.m1097(r0)
        L4d:
            sun.misc.Unsafe r0 = defpackage.AbstractC0051.f569
            long r2 = defpackage.AbstractC0092.f883
            r1 = r11
            boolean r2 = r0.compareAndSwapObject(r1, r2, r4, r5)
            if (r2 == 0) goto L8e
        L58:
            long r2 = r11.m582()
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L58
            long r2 = java.lang.System.nanoTime()
        L66:
            sun.misc.Unsafe r0 = defpackage.AbstractC0051.f569
            long r4 = defpackage.AbstractC0092.f885
            java.lang.Object r0 = r0.getObjectVolatile(r11, r4)
            r4 = r0
            ᛵᛵᛵᛸ r4 = (defpackage.C0888) r4
            if (r4 == 0) goto L8d
            monitor-enter(r4)
            int r0 = r4.m1243()     // Catch: java.lang.Throwable -> L80
            if (r0 <= 0) goto L82
            r0 = 0
            ᛳᛲᛷᛳ r0 = r4.m1241(r0)     // Catch: java.lang.Throwable -> L80
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
            r11.mo570(r2, r0)
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

    /* JADX INFO: renamed from: ᛱᛳᛷ, reason: contains not printable characters */
    public void mo570(long r1, defpackage.AbstractRunnableC0422 r3) {
            r0 = this;
            ᲀᲁᲁᛳ r0 = defpackage.RunnableC1761.f7778
            r0.m576(r1, r3)
            return
    }

    @Override // defpackage.InterfaceC1925
    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public final void mo571(long r4, defpackage.C2260 r6) {
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
            ᛴᛷᛸᛸ r2 = new ᛴᛷᛸᛸ
            long r0 = r0 + r4
            r2.<init>(r3, r0, r6)
            r3.m576(r4, r2)
            ᛱᲇᛷᛸ r3 = new ᛱᲇᛷᛸ
            r4 = 2
            r3.<init>(r4, r2)
            r6.m3667(r3)
        L39:
            return
    }

    @Override // defpackage.AbstractC1805
    /* JADX INFO: renamed from: ᛲᛲᛸᲈ, reason: contains not printable characters */
    public final void mo572(defpackage.InterfaceC0493 r1, java.lang.Runnable r2) {
            r0 = this;
            r0.mo574(r2)
            return
    }

    @Override // defpackage.InterfaceC1925
    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public defpackage.InterfaceC0843 mo573(long r1, defpackage.RunnableC1062 r3, defpackage.InterfaceC0493 r4) {
            r0 = this;
            ᲁᲁᛴᛸ r0 = defpackage.AbstractC0164.f1140
            ᛵᛲᲇᲇ r0 = r0.mo573(r1, r3, r4)
            return r0
    }

    /* JADX INFO: renamed from: ᛳᛳᛳᲈ, reason: contains not printable characters */
    public void mo574(java.lang.Runnable r2) {
            r1 = this;
            r1.m579()
            boolean r0 = r1.m578(r2)
            if (r0 == 0) goto L17
            java.lang.Thread r1 = r1.mo581()
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            if (r2 == r1) goto L16
            java.util.concurrent.locks.LockSupport.unpark(r1)
        L16:
            return
        L17:
            ᲀᲁᲁᛳ r1 = defpackage.RunnableC1761.f7778
            r1.mo574(r2)
            return
    }

    /* JADX INFO: renamed from: ᛳᛸᛱᲇ, reason: contains not printable characters */
    public final void m575(boolean r5) {
            r4 = this;
            long r0 = r4.f887
            if (r5 == 0) goto La
            r2 = 4294967296(0x100000000, double:2.121995791E-314)
            goto Lc
        La:
            r2 = 1
        Lc:
            long r2 = r2 + r0
            r4.f887 = r2
            if (r5 != 0) goto L14
            r5 = 1
            r4.f886 = r5
        L14:
            return
    }

    /* JADX INFO: renamed from: ᛴᛴᛲᲈ, reason: contains not printable characters */
    public final void m576(long r12, defpackage.AbstractRunnableC0422 r14) {
            r11 = this;
            long r0 = defpackage.AbstractC0092.f885
            sun.misc.Unsafe r2 = defpackage.AbstractC0051.f569
            long r3 = defpackage.AbstractC0092.f882
            int r3 = r2.getIntVolatile(r11, r3)
            r4 = 1
            if (r3 == 0) goto L10
            r6 = r11
            r11 = r4
            goto L42
        L10:
            java.lang.Object r3 = r2.getObjectVolatile(r11, r0)
            ᛵᛵᛵᛸ r3 = (defpackage.C0888) r3
            if (r3 != 0) goto L3d
            ᛵᛵᛵᛸ r10 = new ᛵᛵᛵᛸ
            r10.<init>()
            r10.f4008 = r12
        L1f:
            sun.misc.Unsafe r5 = defpackage.AbstractC0051.f569
            long r7 = defpackage.AbstractC0092.f885
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
            ᛵᛵᛵᛸ r3 = (defpackage.C0888) r3
            r2 = r5
            goto L3e
        L3b:
            r11 = r6
            goto L1f
        L3d:
            r6 = r11
        L3e:
            int r11 = r14.m1181(r12, r3, r6)
        L42:
            if (r11 == 0) goto L54
            if (r11 == r4) goto L50
            r12 = 2
            if (r11 != r12) goto L4a
            goto L7c
        L4a:
            java.lang.String r11 = "unexpected result"
            defpackage.C2264.m3676(r11)
            return
        L50:
            r6.mo570(r12, r14)
            return
        L54:
            java.lang.Object r11 = r2.getObjectVolatile(r6, r0)
            ᛵᛵᛵᛸ r11 = (defpackage.C0888) r11
            r12 = 0
            if (r11 == 0) goto L6d
            monitor-enter(r11)
            ᛳᛲᛷᛳ[] r13 = r11.f2337     // Catch: java.lang.Throwable -> L66
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
            java.lang.Thread r11 = r6.mo581()
            java.lang.Thread r12 = java.lang.Thread.currentThread()
            if (r12 == r11) goto L7c
            java.util.concurrent.locks.LockSupport.unpark(r11)
        L7c:
            return
    }

    /* JADX INFO: renamed from: ᛷᛲᲁᛳ, reason: contains not printable characters */
    public final boolean m577() {
            r2 = this;
            ᛶᲈᛷᛵ r2 = r2.f888
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
            ᛴᲀᲁᛱ r2 = (defpackage.AbstractC0754) r2
            if (r2 != 0) goto L17
            return r0
        L17:
            r2.run()
            r2 = 1
            return r2
    }

    /* JADX INFO: renamed from: ᛷᛵᛷᛷ, reason: contains not printable characters */
    public final boolean m578(java.lang.Runnable r15) {
            r14 = this;
        L0:
            sun.misc.Unsafe r0 = defpackage.AbstractC0051.f569
            long r1 = defpackage.AbstractC0092.f883
            java.lang.Object r7 = r0.getObjectVolatile(r14, r1)
            long r3 = defpackage.AbstractC0092.f882
            int r0 = r0.getIntVolatile(r14, r3)
            r3 = 0
            if (r0 == 0) goto L12
            return r3
        L12:
            r0 = 1
            if (r7 != 0) goto L2e
        L15:
            sun.misc.Unsafe r8 = defpackage.AbstractC0051.f569
            long r10 = defpackage.AbstractC0092.f883
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
            boolean r14 = r7 instanceof defpackage.C0369
            if (r14 == 0) goto L59
            r14 = r7
            ᛲᲇ r14 = (defpackage.C0369) r14
            int r15 = r14.m1097(r13)
            if (r15 == 0) goto L78
            if (r15 == r0) goto L43
            r14 = 2
            if (r15 == r14) goto L5d
            goto L7f
        L43:
            ᛲᲇ r8 = r14.m1096()
        L47:
            sun.misc.Unsafe r3 = defpackage.AbstractC0051.f569
            long r5 = defpackage.AbstractC0092.f883
            boolean r14 = r3.compareAndSwapObject(r4, r5, r7, r8)
            if (r14 == 0) goto L52
            goto L7f
        L52:
            java.lang.Object r14 = r3.getObjectVolatile(r4, r1)
            if (r14 == r7) goto L47
            goto L7f
        L59:
            ᛳᛴᛵᛱ r14 = defpackage.C0292.f1590
            if (r7 != r14) goto L5e
        L5d:
            return r3
        L5e:
            ᛲᲇ r8 = new ᛲᲇ
            r14 = 8
            r8.<init>(r14, r0)
            r14 = r7
            java.lang.Runnable r14 = (java.lang.Runnable) r14
            r8.m1097(r14)
            r8.m1097(r13)
        L6e:
            sun.misc.Unsafe r3 = defpackage.AbstractC0051.f569
            long r5 = defpackage.AbstractC0092.f883
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

    /* JADX INFO: renamed from: ᛷᛵᲇᛶ, reason: contains not printable characters */
    public final void m579() {
            r10 = this;
            sun.misc.Unsafe r0 = defpackage.AbstractC0051.f569
            long r1 = defpackage.AbstractC0092.f885
            java.lang.Object r0 = r0.getObjectVolatile(r10, r1)
            ᛵᛵᛵᛸ r0 = (defpackage.C0888) r0
            if (r0 == 0) goto L44
            int r1 = r0.m1243()
            if (r1 != 0) goto L13
            return
        L13:
            long r1 = java.lang.System.nanoTime()
        L17:
            monitor-enter(r0)
            ᛳᛲᛷᛳ[] r3 = r0.f2337     // Catch: java.lang.Throwable -> L35
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
            long r6 = r3.f2112     // Catch: java.lang.Throwable -> L35
            long r6 = r1 - r6
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 < 0) goto L37
            boolean r3 = r10.m578(r3)     // Catch: java.lang.Throwable -> L35
            goto L38
        L35:
            r10 = move-exception
            goto L42
        L37:
            r3 = r5
        L38:
            if (r3 == 0) goto L3e
            ᛳᛲᛷᛳ r4 = r0.m1241(r5)     // Catch: java.lang.Throwable -> L35
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

    /* JADX INFO: renamed from: ᛷᛷᛱᛱ, reason: contains not printable characters */
    public final void m580(boolean r5) {
            r4 = this;
            long r0 = r4.f887
            if (r5 == 0) goto La
            r2 = 4294967296(0x100000000, double:2.121995791E-314)
            goto Lc
        La:
            r2 = 1
        Lc:
            long r0 = r0 - r2
            r4.f887 = r0
            r2 = 0
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 <= 0) goto L16
            goto L1d
        L16:
            boolean r5 = r4.f886
            if (r5 == 0) goto L1d
            r4.shutdown()
        L1d:
            return
    }

    /* JADX INFO: renamed from: ᛷᲇᛷᛶ, reason: contains not printable characters */
    public abstract java.lang.Thread mo581();

    /* JADX INFO: renamed from: ᛸᛱᲈᛳ, reason: contains not printable characters */
    public final long m582() {
            r13 = this;
            ᛳᛴᛵᛱ r0 = defpackage.C0292.f1590
            long r1 = defpackage.AbstractC0092.f883
            boolean r3 = r13.m577()
            r4 = 0
            if (r3 == 0) goto Le
            goto Lcc
        Le:
            r13.m579()
        L11:
            sun.misc.Unsafe r3 = defpackage.AbstractC0051.f569
            java.lang.Object r10 = r3.getObjectVolatile(r13, r1)
            r12 = 0
            if (r10 != 0) goto L1e
            r7 = r13
        L1b:
            r6 = r3
            r13 = r12
            goto L62
        L1e:
            boolean r6 = r10 instanceof defpackage.C0369
            if (r6 == 0) goto L4f
            r6 = r10
            ᛲᲇ r6 = (defpackage.C0369) r6
            java.lang.Object r7 = r6.m1095()
            ᛳᛴᛵᛱ r8 = defpackage.C0369.f1912
            if (r7 == r8) goto L34
            java.lang.Runnable r7 = (java.lang.Runnable) r7
            r6 = r7
            r7 = r13
            r13 = r6
            r6 = r3
            goto L62
        L34:
            ᛲᲇ r11 = r6.m1096()
        L38:
            sun.misc.Unsafe r6 = defpackage.AbstractC0051.f569
            long r8 = defpackage.AbstractC0092.f883
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
            sun.misc.Unsafe r6 = defpackage.AbstractC0051.f569
            long r8 = defpackage.AbstractC0092.f883
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
            ᛶᲈᛷᛵ r13 = r7.f888
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
            boolean r1 = r13 instanceof defpackage.C0369
            if (r1 == 0) goto La5
            ᛲᲇ r13 = (defpackage.C0369) r13
            long r0 = defpackage.C0369.f1914
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
            long r0 = defpackage.AbstractC0092.f885
            java.lang.Object r13 = r3.getObjectVolatile(r7, r0)
            ᛵᛵᛵᛸ r13 = (defpackage.C0888) r13
            if (r13 == 0) goto Ld0
            monitor-enter(r13)
            ᛳᛲᛷᛳ[] r0 = r13.f2337     // Catch: java.lang.Throwable -> Lbb
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
            long r0 = r12.f2112
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

    /* JADX INFO: renamed from: ᲇᛶᛱᛱ, reason: contains not printable characters */
    public final boolean m583() {
            r7 = this;
            ᛶᲈᛷᛵ r0 = r7.f888
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
            sun.misc.Unsafe r0 = defpackage.AbstractC0051.f569
            long r3 = defpackage.AbstractC0092.f885
            java.lang.Object r3 = r0.getObjectVolatile(r7, r3)
            ᛵᛵᛵᛸ r3 = (defpackage.C0888) r3
            if (r3 == 0) goto L23
            int r3 = r3.m1243()
            if (r3 != 0) goto L22
            goto L23
        L22:
            return r2
        L23:
            long r3 = defpackage.AbstractC0092.f883
            java.lang.Object r7 = r0.getObjectVolatile(r7, r3)
            if (r7 != 0) goto L2c
            goto L4f
        L2c:
            boolean r3 = r7 instanceof defpackage.C0369
            if (r3 == 0) goto L4b
            ᛲᲇ r7 = (defpackage.C0369) r7
            long r3 = defpackage.C0369.f1914
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
            ᛳᛴᛵᛱ r0 = defpackage.C0292.f1590
            if (r7 != r0) goto L50
        L4f:
            return r1
        L50:
            return r2
    }
}
