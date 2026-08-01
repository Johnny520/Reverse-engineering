package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class iv0 {

    /* JADX INFO: renamed from: ε */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f5210 = null;

    /* JADX INFO: renamed from: ζ */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicLongFieldUpdater f5211 = null;

    /* JADX INFO: renamed from: η */
    public static final p000.C0889uy f5212 = null;
    private volatile /* synthetic */ java.lang.Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;

    /* JADX INFO: renamed from: α */
    public final int f5213;

    /* JADX INFO: renamed from: β */
    public final boolean f5214;

    /* JADX INFO: renamed from: γ */
    public final int f5215;

    /* JADX INFO: renamed from: δ */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceArray f5216;

    static {
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.String r1 = "_next$volatile"
            java.lang.Class<iv0> r2 = p000.iv0.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r0, r1)
            p000.iv0.f5210 = r0
            java.lang.String r0 = "_state$volatile"
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(r2, r0)
            p000.iv0.f5211 = r0
            uy r0 = new uy
            java.lang.String r1 = "REMOVE_FROZEN"
            r2 = 1
            r0.<init>(r1, r2)
            p000.iv0.f5212 = r0
            return
    }

    public iv0(int r2, boolean r3) {
            r1 = this;
            r1.<init>()
            r1.f5213 = r2
            r1.f5214 = r3
            int r3 = r2 + (-1)
            r1.f5215 = r3
            java.util.concurrent.atomic.AtomicReferenceArray r0 = new java.util.concurrent.atomic.AtomicReferenceArray
            r0.<init>(r2)
            r1.f5216 = r0
            r1 = 1073741823(0x3fffffff, float:1.9999999)
            java.lang.String r0 = "Check failed."
            if (r3 > r1) goto L23
            r1 = r2 & r3
            if (r1 != 0) goto L1e
            return
        L1e:
            p000.C1080.m7279(r0)
            r1 = 0
            throw r1
        L23:
            p000.C1080.m7279(r0)
            r1 = 0
            throw r1
    }

    /* JADX INFO: renamed from: α */
    public final int m2808(java.lang.Object r15) {
            r14 = this;
        L0:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = p000.iv0.f5211
            long r3 = r0.get(r14)
            r1 = 3458764513820540928(0x3000000000000000, double:1.727233711018889E-77)
            long r1 = r1 & r3
            r7 = 0
            int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r1 == 0) goto L18
            r14 = 2305843009213693952(0x2000000000000000, double:1.4916681462400413E-154)
            long r14 = r14 & r3
            int r14 = (r14 > r7 ? 1 : (r14 == r7 ? 0 : -1))
            if (r14 == 0) goto L4f
            r14 = 2
            return r14
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
            int r10 = r14.f5215
            r5 = r5 & r10
            r6 = r1 & r10
            if (r5 != r6) goto L31
            goto L4f
        L31:
            boolean r5 = r14.f5214
            r6 = 1073741823(0x3fffffff, float:1.9999999)
            java.util.concurrent.atomic.AtomicReferenceArray r11 = r14.f5216
            if (r5 != 0) goto L51
            r5 = r9 & r10
            java.lang.Object r5 = r11.get(r5)
            if (r5 == 0) goto L51
            r0 = 1024(0x400, float:1.435E-42)
            int r2 = r14.f5213
            if (r2 < r0) goto L4f
            int r9 = r9 - r1
            r0 = r9 & r6
            int r1 = r2 >> 1
            if (r0 <= r1) goto L0
        L4f:
            r14 = 1
            return r14
        L51:
            int r1 = r9 + 1
            r1 = r1 & r6
            r5 = -1152921503533105153(0xf00000003fffffff, double:-3.1050369248997324E231)
            long r5 = r5 & r3
            long r12 = (long) r1
            long r1 = r12 << r2
            long r5 = r5 | r1
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = p000.iv0.f5211
            r2 = r14
            boolean r14 = r1.compareAndSet(r2, r3, r5)
            if (r14 == 0) goto L98
            r14 = r9 & r10
            r11.set(r14, r15)
            r14 = r2
        L6d:
            long r1 = r0.get(r14)
            r3 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r1 = r1 & r3
            int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r1 == 0) goto L96
            iv0 r14 = r14.m2810()
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r14.f5216
            int r2 = r14.f5215
            r2 = r2 & r9
            java.lang.Object r3 = r1.get(r2)
            boolean r4 = r3 instanceof p000.hv0
            if (r4 == 0) goto L93
            hv0 r3 = (p000.hv0) r3
            int r3 = r3.f4822
            if (r3 != r9) goto L93
            r1.set(r2, r15)
            goto L94
        L93:
            r14 = 0
        L94:
            if (r14 != 0) goto L6d
        L96:
            r14 = 0
            return r14
        L98:
            r14 = r2
            goto L0
    }

    /* JADX INFO: renamed from: β */
    public final boolean m2809() {
            r12 = this;
        L0:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = p000.iv0.f5211
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
            r12 = 0
            return r12
        L1b:
            long r4 = r4 | r2
            r1 = r12
            boolean r12 = r0.compareAndSet(r1, r2, r4)
            if (r12 == 0) goto L24
            return r6
        L24:
            r12 = r1
            goto L0
    }

    /* JADX INFO: renamed from: γ */
    public final p000.iv0 m2810() {
            r10 = this;
        L0:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = p000.iv0.f5211
            long r2 = r0.get(r10)
            r4 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r6 = r2 & r4
            r8 = 0
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 == 0) goto L12
            r1 = r10
            goto L1b
        L12:
            long r4 = r4 | r2
            r1 = r10
            boolean r10 = r0.compareAndSet(r1, r2, r4)
            if (r10 == 0) goto L77
            r2 = r4
        L1b:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r10 = p000.iv0.f5210
            java.lang.Object r4 = r10.get(r1)
            iv0 r4 = (p000.iv0) r4
            if (r4 == 0) goto L26
            return r4
        L26:
            iv0 r4 = new iv0
            int r5 = r1.f5213
            int r5 = r5 * 2
            boolean r6 = r1.f5214
            r4.<init>(r5, r6)
            r5 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r5 = r5 & r2
            int r5 = (int) r5
            r6 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r6 = r6 & r2
            r8 = 30
            long r6 = r6 >> r8
            int r6 = (int) r6
        L40:
            int r7 = r1.f5215
            r8 = r5 & r7
            r7 = r7 & r6
            if (r8 == r7) goto L5f
            java.util.concurrent.atomic.AtomicReferenceArray r7 = r1.f5216
            java.lang.Object r7 = r7.get(r8)
            if (r7 != 0) goto L54
            hv0 r7 = new hv0
            r7.<init>(r5)
        L54:
            int r8 = r4.f5215
            r8 = r8 & r5
            java.util.concurrent.atomic.AtomicReferenceArray r9 = r4.f5216
            r9.set(r8, r7)
            int r5 = r5 + 1
            goto L40
        L5f:
            r5 = -1152921504606846977(0xefffffffffffffff, double:-3.1050361846014175E231)
            long r5 = r5 & r2
            r0.set(r4, r5)
        L68:
            r5 = 0
            boolean r5 = r10.compareAndSet(r1, r5, r4)
            if (r5 == 0) goto L70
            goto L1b
        L70:
            java.lang.Object r5 = r10.get(r1)
            if (r5 == 0) goto L68
            goto L1b
        L77:
            r10 = r1
            goto L0
    }

    /* JADX INFO: renamed from: δ */
    public final java.lang.Object m2811() {
            r30 = this;
            r1 = r30
        L2:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r6 = p000.iv0.f5211
            long r2 = r6.get(r1)
            r7 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r4 = r2 & r7
            r9 = 0
            int r0 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r0 == 0) goto L15
            uy r0 = p000.iv0.f5212
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
            int r5 = r1.f5215
            r4 = r4 & r5
            r13 = r0 & r5
            r14 = 0
            if (r4 != r13) goto L2e
            goto L41
        L2e:
            java.util.concurrent.atomic.AtomicReferenceArray r15 = r1.f5216
            java.lang.Object r4 = r15.get(r13)
            boolean r5 = r1.f5214
            if (r4 != 0) goto L3b
            if (r5 == 0) goto L2
            goto L41
        L3b:
            r16 = r7
            boolean r7 = r4 instanceof p000.hv0
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
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = p000.iv0.f5211
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
            iv0 r0 = r1.m2810()
            r1 = r0
            goto L96
        L7d:
            long r2 = r24 & r20
            long r26 = r2 | r7
            java.util.concurrent.atomic.AtomicLongFieldUpdater r22 = p000.iv0.f5211
            r23 = r1
            boolean r1 = r22.compareAndSet(r23, r24, r26)
            r2 = r23
            if (r1 == 0) goto L99
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r2.f5216
            int r2 = r2.f5215
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
