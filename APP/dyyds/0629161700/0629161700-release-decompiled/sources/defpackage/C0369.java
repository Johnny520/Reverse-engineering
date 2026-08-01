package defpackage;

/* JADX INFO: renamed from: ᛲᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0369 {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public static final defpackage.C0454 f1912 = null;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public static final /* synthetic */ long f1913 = 0;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public static final /* synthetic */ long f1914 = 0;
    private volatile /* synthetic */ java.lang.Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceArray f1915;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final int f1916;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final int f1917;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final boolean f1918;

    static {
            sun.misc.Unsafe r0 = defpackage.AbstractC0051.f569
            java.lang.Class<ᛲᲇ> r1 = defpackage.C0369.class
            java.lang.String r2 = "_next$volatile"
            java.lang.reflect.Field r2 = r1.getDeclaredField(r2)
            long r2 = r0.objectFieldOffset(r2)
            defpackage.C0369.f1913 = r2
            java.lang.String r2 = "_state$volatile"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r2)
            long r0 = r0.objectFieldOffset(r1)
            defpackage.C0369.f1914 = r0
            ᛳᛴᛵᛱ r0 = new ᛳᛴᛵᛱ
            java.lang.String r1 = "REMOVE_FROZEN"
            r2 = 2
            r0.<init>(r1, r2)
            defpackage.C0369.f1912 = r0
            return
    }

    public C0369(int r2, boolean r3) {
            r1 = this;
            r1.<init>()
            r1.f1917 = r2
            r1.f1918 = r3
            int r3 = r2 + (-1)
            r1.f1916 = r3
            java.util.concurrent.atomic.AtomicReferenceArray r0 = new java.util.concurrent.atomic.AtomicReferenceArray
            r0.<init>(r2)
            r1.f1915 = r0
            r1 = 1073741823(0x3fffffff, float:1.9999999)
            java.lang.String r0 = "Check failed."
            if (r3 > r1) goto L23
            r1 = r2 & r3
            if (r1 != 0) goto L1e
            return
        L1e:
            defpackage.C2264.m3676(r0)
            r1 = 0
            throw r1
        L23:
            defpackage.C2264.m3676(r0)
            r1 = 0
            throw r1
    }

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final java.lang.Object m1095() {
            r34 = this;
            r1 = r34
        L2:
            sun.misc.Unsafe r0 = defpackage.AbstractC0051.f569
            long r2 = defpackage.C0369.f1914
            long r4 = r0.getLongVolatile(r1, r2)
            r8 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r6 = r4 & r8
            r10 = 0
            int r6 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r6 == 0) goto L17
            ᛳᛴᛵᛱ r0 = defpackage.C0369.f1912
            return r0
        L17:
            r12 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r6 = r4 & r12
            int r6 = (int) r6
            r14 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r14 = r14 & r4
            r7 = 30
            long r14 = r14 >> r7
            int r7 = (int) r14
            int r14 = r1.f1916
            r7 = r7 & r14
            r14 = r14 & r6
            r15 = 0
            if (r7 != r14) goto L2f
            goto L44
        L2f:
            java.util.concurrent.atomic.AtomicReferenceArray r7 = r1.f1915
            r16 = r8
            java.lang.Object r8 = r7.get(r14)
            boolean r9 = r1.f1918
            if (r8 != 0) goto L3e
            if (r9 == 0) goto L2
            goto L44
        L3e:
            r18 = r10
            boolean r10 = r8 instanceof defpackage.C0687
            if (r10 == 0) goto L45
        L44:
            return r15
        L45:
            int r6 = r6 + 1
            r10 = 1073741823(0x3fffffff, float:1.9999999)
            r6 = r6 & r10
            r10 = -1073741824(0xffffffffc0000000, double:NaN)
            long r20 = r4 & r10
            r22 = r10
            long r10 = (long) r6
            long r20 = r20 | r10
            r24 = r12
            r12 = r7
            r6 = r20
            boolean r0 = r0.compareAndSwapLong(r1, r2, r4, r6)
            if (r0 == 0) goto L64
            r12.set(r14, r15)
            return r8
        L64:
            r1 = r34
            if (r9 == 0) goto L2
        L68:
            sun.misc.Unsafe r0 = defpackage.AbstractC0051.f569
            long r2 = defpackage.C0369.f1914
            long r30 = r0.getLongVolatile(r1, r2)
            long r4 = r30 & r24
            int r4 = (int) r4
            long r5 = r30 & r16
            int r5 = (r5 > r18 ? 1 : (r5 == r18 ? 0 : -1))
            if (r5 == 0) goto L7f
            ᛲᲇ r0 = r1.m1096()
            r1 = r0
            goto L98
        L7f:
            long r5 = r30 & r22
            long r32 = r5 | r10
            r26 = r0
            r27 = r1
            r28 = r2
            boolean r0 = r26.compareAndSwapLong(r27, r28, r30, r32)
            if (r0 == 0) goto L68
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r1.f1915
            int r1 = r1.f1916
            r1 = r1 & r4
            r0.set(r1, r15)
            r1 = r15
        L98:
            if (r1 != 0) goto L68
            return r8
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final defpackage.C0369 m1096() {
            r16 = this;
            r1 = r16
        L2:
            sun.misc.Unsafe r0 = defpackage.AbstractC0051.f569
            long r2 = defpackage.C0369.f1914
            long r4 = r0.getLongVolatile(r1, r2)
            r6 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r8 = r4 & r6
            r10 = 0
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto L16
            r6 = r4
            goto L1d
        L16:
            long r6 = r6 | r4
            boolean r0 = r0.compareAndSwapLong(r1, r2, r4, r6)
            if (r0 == 0) goto L2
        L1d:
            sun.misc.Unsafe r0 = defpackage.AbstractC0051.f569
            long r8 = defpackage.C0369.f1913
            java.lang.Object r0 = r0.getObjectVolatile(r1, r8)
            ᛲᲇ r0 = (defpackage.C0369) r0
            if (r0 == 0) goto L2a
            return r0
        L2a:
            ᛲᲇ r5 = new ᛲᲇ
            int r0 = r1.f1917
            int r0 = r0 * 2
            boolean r2 = r1.f1918
            r5.<init>(r0, r2)
            r2 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r2 = r2 & r6
            int r0 = (int) r2
            r2 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r2 = r2 & r6
            r4 = 30
            long r2 = r2 >> r4
            int r2 = (int) r2
        L44:
            int r3 = r1.f1916
            r4 = r0 & r3
            r3 = r3 & r2
            if (r4 == r3) goto L63
            java.util.concurrent.atomic.AtomicReferenceArray r3 = r1.f1915
            java.lang.Object r3 = r3.get(r4)
            if (r3 != 0) goto L58
            ᛴᛶᛲᲀ r3 = new ᛴᛶᛲᲀ
            r3.<init>(r0)
        L58:
            int r4 = r5.f1916
            r4 = r4 & r0
            java.util.concurrent.atomic.AtomicReferenceArray r10 = r5.f1915
            r10.set(r4, r3)
            int r0 = r0 + 1
            goto L44
        L63:
            r2 = -1152921504606846977(0xefffffffffffffff, double:-3.1050361846014175E231)
            long r14 = r6 & r2
            sun.misc.Unsafe r10 = defpackage.AbstractC0051.f569
            long r12 = defpackage.C0369.f1914
            r11 = r5
            r10.putLongVolatile(r11, r12, r14)
        L72:
            sun.misc.Unsafe r0 = defpackage.AbstractC0051.f569
            long r2 = defpackage.C0369.f1913
            r4 = 0
            boolean r2 = r0.compareAndSwapObject(r1, r2, r4, r5)
            if (r2 == 0) goto L7e
            goto L1d
        L7e:
            java.lang.Object r0 = r0.getObjectVolatile(r1, r8)
            if (r0 == 0) goto L72
            goto L1d
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final int m1097(java.lang.Object r19) {
            r18 = this;
            r1 = r18
            r8 = r19
        L4:
            sun.misc.Unsafe r0 = defpackage.AbstractC0051.f569
            long r9 = defpackage.C0369.f1914
            long r4 = r0.getLongVolatile(r1, r9)
            r2 = 3458764513820540928(0x3000000000000000, double:1.727233711018889E-77)
            long r2 = r2 & r4
            r11 = 0
            int r2 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r2 == 0) goto L1e
            r0 = 2305843009213693952(0x2000000000000000, double:1.4916681462400413E-154)
            long r0 = r0 & r4
            int r0 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r0 == 0) goto L55
            r0 = 2
            return r0
        L1e:
            r2 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r2 = r2 & r4
            int r2 = (int) r2
            r6 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r6 = r6 & r4
            r3 = 30
            long r6 = r6 >> r3
            int r13 = (int) r6
            int r6 = r13 + 2
            int r14 = r1.f1916
            r6 = r6 & r14
            r7 = r2 & r14
            if (r6 != r7) goto L37
            goto L55
        L37:
            boolean r6 = r1.f1918
            r7 = 1073741823(0x3fffffff, float:1.9999999)
            java.util.concurrent.atomic.AtomicReferenceArray r15 = r1.f1915
            if (r6 != 0) goto L57
            r6 = r13 & r14
            java.lang.Object r6 = r15.get(r6)
            if (r6 == 0) goto L57
            r0 = 1024(0x400, float:1.435E-42)
            int r3 = r1.f1917
            if (r3 < r0) goto L55
            int r13 = r13 - r2
            r0 = r13 & r7
            int r2 = r3 >> 1
            if (r0 <= r2) goto L4
        L55:
            r0 = 1
            return r0
        L57:
            int r2 = r13 + 1
            r2 = r2 & r7
            r6 = -1152921503533105153(0xf00000003fffffff, double:-3.1050369248997324E231)
            long r6 = r6 & r4
            r16 = r4
            r5 = r3
            long r3 = (long) r2
            long r2 = r3 << r5
            long r6 = r6 | r2
            long r2 = defpackage.C0369.f1914
            r4 = r16
            boolean r0 = r0.compareAndSwapLong(r1, r2, r4, r6)
            if (r0 == 0) goto La5
            r0 = r13 & r14
            r15.set(r0, r8)
            r0 = r18
        L78:
            sun.misc.Unsafe r1 = defpackage.AbstractC0051.f569
            long r1 = r1.getLongVolatile(r0, r9)
            r3 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r1 = r1 & r3
            int r1 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r1 == 0) goto La3
            ᛲᲇ r0 = r0.m1096()
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r0.f1915
            int r2 = r0.f1916
            r2 = r2 & r13
            java.lang.Object r3 = r1.get(r2)
            boolean r4 = r3 instanceof defpackage.C0687
            if (r4 == 0) goto La0
            ᛴᛶᛲᲀ r3 = (defpackage.C0687) r3
            int r3 = r3.f3311
            if (r3 != r13) goto La0
            r1.set(r2, r8)
            goto La1
        La0:
            r0 = 0
        La1:
            if (r0 != 0) goto L78
        La3:
            r0 = 0
            return r0
        La5:
            r1 = r18
            goto L4
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final boolean m1098() {
            r12 = this;
        L0:
            sun.misc.Unsafe r0 = defpackage.AbstractC0051.f569
            long r1 = defpackage.C0369.f1914
            long r7 = r0.getLongVolatile(r12, r1)
            r0 = 2305843009213693952(0x2000000000000000, double:1.4916681462400413E-154)
            long r2 = r7 & r0
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r11 = 1
            if (r2 == 0) goto L14
            return r11
        L14:
            r2 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r2 = r2 & r7
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L1d
            r12 = 0
            return r12
        L1d:
            long r9 = r7 | r0
            sun.misc.Unsafe r3 = defpackage.AbstractC0051.f569
            long r5 = defpackage.C0369.f1914
            r4 = r12
            boolean r12 = r3.compareAndSwapLong(r4, r5, r7, r9)
            if (r12 == 0) goto L2b
            return r11
        L2b:
            r12 = r4
            goto L0
    }
}
