package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class yr {
    public static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater e = null;
    public static final java.util.concurrent.atomic.AtomicLongFieldUpdater f = null;
    public static final defpackage.l0 g = null;
    private volatile java.lang.Object _next;
    private volatile long _state;
    public final int a;
    public final boolean b;
    public final int c;
    public final java.util.concurrent.atomic.AtomicReferenceArray d;

    static {
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.String r1 = "_next"
            java.lang.Class<yr> r2 = defpackage.yr.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r0, r1)
            defpackage.yr.e = r0
            java.lang.String r0 = "_state"
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(r2, r0)
            defpackage.yr.f = r0
            l0 r0 = new l0
            java.lang.String r1 = "REMOVE_FROZEN"
            r2 = 27
            r0.<init>(r2, r1)
            defpackage.yr.g = r0
            return
    }

    public yr(int r3, boolean r4) {
            r2 = this;
            r2.<init>()
            r2.a = r3
            r2.b = r4
            int r4 = r3 + (-1)
            r2.c = r4
            java.util.concurrent.atomic.AtomicReferenceArray r0 = new java.util.concurrent.atomic.AtomicReferenceArray
            r0.<init>(r3)
            r2.d = r0
            r0 = 1073741823(0x3fffffff, float:1.9999999)
            java.lang.String r1 = "Check failed."
            if (r4 > r0) goto L23
            r3 = r3 & r4
            if (r3 != 0) goto L1d
            return
        L1d:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            r3.<init>(r1)
            throw r3
        L23:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            r3.<init>(r1)
            throw r3
    }

    public final int a(java.lang.Object r15) {
            r14 = this;
        L0:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = defpackage.yr.f
            long r3 = r0.get(r14)
            r1 = 3458764513820540928(0x3000000000000000, double:1.727233711018889E-77)
            long r1 = r1 & r3
            r7 = 0
            int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r1 == 0) goto L18
            r0 = 2305843009213693952(0x2000000000000000, double:1.4916681462400413E-154)
            long r0 = r0 & r3
            int r15 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r15 == 0) goto L4f
            r15 = 2
            return r15
        L18:
            r1 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r1 = r1 & r3
            int r1 = (int) r1
            r5 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r5 = r5 & r3
            r2 = 30
            long r5 = r5 >> r2
            int r9 = (int) r5
            int r5 = r9 + 2
            int r10 = r14.c
            r5 = r5 & r10
            r6 = r1 & r10
            if (r5 != r6) goto L31
            goto L4f
        L31:
            boolean r5 = r14.b
            r6 = 1073741823(0x3fffffff, float:1.9999999)
            java.util.concurrent.atomic.AtomicReferenceArray r11 = r14.d
            if (r5 != 0) goto L51
            r5 = r9 & r10
            java.lang.Object r5 = r11.get(r5)
            if (r5 == 0) goto L51
            r0 = 1024(0x400, float:1.435E-42)
            int r2 = r14.a
            if (r2 < r0) goto L4f
            int r9 = r9 - r1
            r0 = r9 & r6
            int r1 = r2 >> 1
            if (r0 <= r1) goto L0
        L4f:
            r15 = 1
            return r15
        L51:
            int r1 = r9 + 1
            r1 = r1 & r6
            r5 = -1152921503533105153(0xf00000003fffffff, double:-3.1050369248997324E231)
            long r5 = r5 & r3
            long r12 = (long) r1
            long r1 = r12 << r2
            long r5 = r5 | r1
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = defpackage.yr.f
            r2 = r14
            boolean r1 = r1.compareAndSet(r2, r3, r5)
            if (r1 == 0) goto L0
            r1 = r9 & r10
            r11.set(r1, r15)
            r1 = r14
        L6d:
            long r2 = r0.get(r1)
            r4 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r2 = r2 & r4
            int r2 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r2 == 0) goto L96
            yr r1 = r1.c()
            java.util.concurrent.atomic.AtomicReferenceArray r2 = r1.d
            int r3 = r1.c
            r3 = r3 & r9
            java.lang.Object r4 = r2.get(r3)
            boolean r5 = r4 instanceof defpackage.xr
            if (r5 == 0) goto L93
            xr r4 = (defpackage.xr) r4
            int r4 = r4.a
            if (r4 != r9) goto L93
            r2.set(r3, r15)
            goto L94
        L93:
            r1 = 0
        L94:
            if (r1 != 0) goto L6d
        L96:
            r15 = 0
            return r15
    }

    public final boolean b() {
            r12 = this;
        L0:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = defpackage.yr.f
            long r2 = r0.get(r12)
            r4 = 2305843009213693952(0x2000000000000000, double:1.4916681462400413E-154)
            long r6 = r2 & r4
            r8 = 0
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            r6 = 1
            if (r1 == 0) goto L12
            return r6
        L12:
            r10 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r10 = r10 & r2
            int r1 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r1 == 0) goto L1b
            r0 = 0
            return r0
        L1b:
            long r4 = r4 | r2
            r1 = r12
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto L0
            return r6
    }

    public final defpackage.yr c() {
            r11 = this;
        L0:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = defpackage.yr.f
            long r2 = r0.get(r11)
            r4 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r6 = r2 & r4
            r8 = 0
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 == 0) goto L12
            r1 = r11
            goto L1b
        L12:
            long r4 = r4 | r2
            r1 = r11
            boolean r2 = r0.compareAndSet(r1, r2, r4)
            if (r2 == 0) goto L0
            r2 = r4
        L1b:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = defpackage.yr.e
            java.lang.Object r5 = r4.get(r11)
            yr r5 = (defpackage.yr) r5
            if (r5 == 0) goto L26
            return r5
        L26:
            yr r5 = new yr
            int r6 = r1.a
            int r6 = r6 * 2
            boolean r7 = r1.b
            r5.<init>(r6, r7)
            r6 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r6 = r6 & r2
            int r6 = (int) r6
            r7 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r7 = r7 & r2
            r9 = 30
            long r7 = r7 >> r9
            int r7 = (int) r7
        L40:
            int r8 = r1.c
            r9 = r6 & r8
            r8 = r8 & r7
            if (r9 == r8) goto L5f
            java.util.concurrent.atomic.AtomicReferenceArray r8 = r1.d
            java.lang.Object r8 = r8.get(r9)
            if (r8 != 0) goto L54
            xr r8 = new xr
            r8.<init>(r6)
        L54:
            int r9 = r5.c
            r9 = r9 & r6
            java.util.concurrent.atomic.AtomicReferenceArray r10 = r5.d
            r10.set(r9, r8)
            int r6 = r6 + 1
            goto L40
        L5f:
            r6 = -1152921504606846977(0xefffffffffffffff, double:-3.1050361846014175E231)
            long r6 = r6 & r2
            r0.set(r5, r6)
        L68:
            r6 = 0
            boolean r6 = r4.compareAndSet(r11, r6, r5)
            if (r6 == 0) goto L70
            goto L1b
        L70:
            java.lang.Object r6 = r4.get(r11)
            if (r6 == 0) goto L68
            goto L1b
    }

    public final java.lang.Object d() {
            r30 = this;
            r1 = r30
        L2:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r6 = defpackage.yr.f
            long r2 = r6.get(r1)
            r7 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r4 = r2 & r7
            r9 = 0
            int r0 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r0 == 0) goto L15
            l0 r0 = defpackage.yr.g
            return r0
        L15:
            r11 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r4 = r2 & r11
            int r0 = (int) r4
            r4 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r4 = r4 & r2
            r13 = 30
            long r4 = r4 >> r13
            int r4 = (int) r4
            int r5 = r1.c
            r4 = r4 & r5
            r13 = r0 & r5
            r14 = 0
            if (r4 != r13) goto L2e
            goto L41
        L2e:
            java.util.concurrent.atomic.AtomicReferenceArray r15 = r1.d
            java.lang.Object r4 = r15.get(r13)
            boolean r5 = r1.b
            if (r4 != 0) goto L3b
            if (r5 == 0) goto L2
            goto L41
        L3b:
            r16 = r7
            boolean r7 = r4 instanceof defpackage.xr
            if (r7 == 0) goto L42
        L41:
            return r14
        L42:
            int r0 = r0 + 1
            r7 = 1073741823(0x3fffffff, float:1.9999999)
            r0 = r0 & r7
            r7 = -1073741824(0xffffffffc0000000, double:NaN)
            long r18 = r2 & r7
            r20 = r7
            long r7 = (long) r0
            long r18 = r18 | r7
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = defpackage.yr.f
            r28 = r18
            r18 = r4
            r19 = r5
            r4 = r28
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto L66
            r15.set(r13, r14)
            return r18
        L66:
            r1 = r30
            if (r19 == 0) goto L2
        L6a:
            long r24 = r6.get(r1)
            long r2 = r24 & r11
            int r0 = (int) r2
            long r2 = r24 & r16
            int r2 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r2 == 0) goto L7d
            yr r0 = r1.c()
            r1 = r0
            goto L96
        L7d:
            long r2 = r24 & r20
            long r26 = r2 | r7
            java.util.concurrent.atomic.AtomicLongFieldUpdater r22 = defpackage.yr.f
            r23 = r1
            boolean r1 = r22.compareAndSet(r23, r24, r26)
            r2 = r23
            if (r1 == 0) goto L99
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r2.d
            int r2 = r2.c
            r0 = r0 & r2
            r1.set(r0, r14)
            r1 = r14
        L96:
            if (r1 != 0) goto L6a
            return r18
        L99:
            r1 = r2
            goto L6a
    }
}
