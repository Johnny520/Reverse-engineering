package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۧۨۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5550 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final Yue.C5550 f20500 = null;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final int f20501 = 0;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final Yue.C5546 f20502 = null;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final int f20503 = 0;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final java.util.concurrent.atomic.AtomicReference<Yue.C5546>[] f20504 = null;

    static {
            Yue.ۥۡۧۨۡ r0 = new Yue.ۥۡۧۨۡ
            r0.<init>()
            Yue.C5550.f20500 = r0
            r0 = 65536(0x10000, float:9.1835E-41)
            Yue.C5550.f20501 = r0
            Yue.ۥۡۧۨ r0 = new Yue.ۥۡۧۨ
            r7 = 0
            byte[] r2 = new byte[r7]
            r5 = 0
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            Yue.C5550.f20502 = r0
            java.lang.Runtime r0 = java.lang.Runtime.getRuntime()
            int r0 = r0.availableProcessors()
            int r0 = r0 * 2
            int r0 = r0 + (-1)
            int r0 = java.lang.Integer.highestOneBit(r0)
            Yue.C5550.f20503 = r0
            java.util.concurrent.atomic.AtomicReference[] r1 = new java.util.concurrent.atomic.AtomicReference[r0]
        L2e:
            if (r7 >= r0) goto L3a
            java.util.concurrent.atomic.AtomicReference r2 = new java.util.concurrent.atomic.AtomicReference
            r2.<init>()
            r1[r7] = r2
            int r7 = r7 + 1
            goto L2e
        L3a:
            Yue.C5550.f20504 = r1
            return
    }

    public C5550() {
            r0 = this;
            r0.<init>()
            return
    }

    @Yue.InterfaceC3427
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final void m20825(@Yue.InterfaceC4418 Yue.C5546 r5) {
            java.lang.String r0 = "segment"
            Yue.C3329.m13906(r5, r0)
            Yue.ۥۡۧۨ r0 = r5.f20495
            if (r0 != 0) goto L3e
            Yue.ۥۡۧۨ r0 = r5.f20496
            if (r0 != 0) goto L3e
            boolean r0 = r5.f20493
            if (r0 == 0) goto L12
            return
        L12:
            Yue.ۥۡۧۨۡ r0 = Yue.C5550.f20500
            java.util.concurrent.atomic.AtomicReference r0 = r0.m20827()
            Yue.ۥۡۧۨ r1 = Yue.C5550.f20502
            java.lang.Object r2 = r0.getAndSet(r1)
            Yue.ۥۡۧۨ r2 = (Yue.C5546) r2
            if (r2 != r1) goto L23
            return
        L23:
            r1 = 0
            if (r2 == 0) goto L29
            int r3 = r2.f20492
            goto L2a
        L29:
            r3 = r1
        L2a:
            int r4 = Yue.C5550.f20501
            if (r3 < r4) goto L32
            r0.set(r2)
            return
        L32:
            r5.f20495 = r2
            r5.f20491 = r1
            int r3 = r3 + 8192
            r5.f20492 = r3
            r0.set(r5)
            return
        L3e:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Failed requirement."
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3427
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final Yue.C5546 m20826() {
            Yue.ۥۡۧۨۡ r0 = Yue.C5550.f20500
            java.util.concurrent.atomic.AtomicReference r0 = r0.m20827()
            Yue.ۥۡۧۨ r1 = Yue.C5550.f20502
            java.lang.Object r2 = r0.getAndSet(r1)
            Yue.ۥۡۧۨ r2 = (Yue.C5546) r2
            if (r2 != r1) goto L16
            Yue.ۥۡۧۨ r0 = new Yue.ۥۡۧۨ
            r0.<init>()
            return r0
        L16:
            r1 = 0
            if (r2 != 0) goto L22
            r0.set(r1)
            Yue.ۥۡۧۨ r0 = new Yue.ۥۡۧۨ
            r0.<init>()
            return r0
        L22:
            Yue.ۥۡۧۨ r3 = r2.f20495
            r0.set(r3)
            r2.f20495 = r1
            r0 = 0
            r2.f20492 = r0
            return r2
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final java.util.concurrent.atomic.AtomicReference<Yue.C5546> m20827() {
            r6 = this;
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            long r0 = r0.getId()
            int r2 = Yue.C5550.f20503
            long r2 = (long) r2
            r4 = 1
            long r2 = r2 - r4
            long r0 = r0 & r2
            int r0 = (int) r0
            java.util.concurrent.atomic.AtomicReference<Yue.ۥۡۧۨ>[] r1 = Yue.C5550.f20504
            r0 = r1[r0]
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final int m20828() {
            r1 = this;
            java.util.concurrent.atomic.AtomicReference r0 = r1.m20827()
            java.lang.Object r0 = r0.get()
            Yue.ۥۡۧۨ r0 = (Yue.C5546) r0
            if (r0 != 0) goto Le
            r0 = 0
            return r0
        Le:
            int r0 = r0.f20492
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final int m20829() {
            r1 = this;
            int r0 = Yue.C5550.f20501
            return r0
    }
}
