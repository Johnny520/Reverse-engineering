package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class tr1 {

    /* JADX INFO: renamed from: α */
    public static final p000.rr1 f10436 = null;

    /* JADX INFO: renamed from: β */
    public static final int f10437 = 0;

    /* JADX INFO: renamed from: γ */
    public static final java.util.concurrent.atomic.AtomicReference[] f10438 = null;

    static {
            rr1 r0 = new rr1
            r1 = 0
            byte[] r2 = new byte[r1]
            r0.<init>(r2, r1, r1, r1)
            p000.tr1.f10436 = r0
            java.lang.Runtime r0 = java.lang.Runtime.getRuntime()
            int r0 = r0.availableProcessors()
            int r0 = r0 * 2
            int r0 = r0 + (-1)
            int r0 = java.lang.Integer.highestOneBit(r0)
            p000.tr1.f10437 = r0
            java.util.concurrent.atomic.AtomicReference[] r2 = new java.util.concurrent.atomic.AtomicReference[r0]
        L1e:
            if (r1 >= r0) goto L2a
            java.util.concurrent.atomic.AtomicReference r3 = new java.util.concurrent.atomic.AtomicReference
            r3.<init>()
            r2[r1] = r3
            int r1 = r1 + 1
            goto L1e
        L2a:
            p000.tr1.f10438 = r2
            return
    }

    /* JADX INFO: renamed from: α */
    public static final void m5737(p000.rr1 r6) {
            r6.getClass()
            rr1 r0 = r6.f9476
            if (r0 != 0) goto L4a
            rr1 r0 = r6.f9477
            if (r0 != 0) goto L4a
            boolean r0 = r6.f9474
            if (r0 == 0) goto L10
            goto L2e
        L10:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            long r0 = r0.getId()
            int r2 = p000.tr1.f10437
            long r2 = (long) r2
            r4 = 1
            long r2 = r2 - r4
            long r0 = r0 & r2
            int r0 = (int) r0
            java.util.concurrent.atomic.AtomicReference[] r1 = p000.tr1.f10438
            r0 = r1[r0]
            rr1 r1 = p000.tr1.f10436
            java.lang.Object r2 = r0.getAndSet(r1)
            rr1 r2 = (p000.rr1) r2
            if (r2 != r1) goto L2f
        L2e:
            return
        L2f:
            r1 = 0
            if (r2 == 0) goto L35
            int r3 = r2.f9473
            goto L36
        L35:
            r3 = r1
        L36:
            r4 = 65536(0x10000, float:9.1835E-41)
            if (r3 < r4) goto L3e
            r0.set(r2)
            return
        L3e:
            r6.f9476 = r2
            r6.f9472 = r1
            int r3 = r3 + 8192
            r6.f9473 = r3
            r0.set(r6)
            return
        L4a:
            java.lang.String r6 = "Failed requirement."
            p000.C1080.m7275(r6)
            return
    }

    /* JADX INFO: renamed from: β */
    public static final p000.rr1 m5738() {
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            long r0 = r0.getId()
            int r2 = p000.tr1.f10437
            long r2 = (long) r2
            r4 = 1
            long r2 = r2 - r4
            long r0 = r0 & r2
            int r0 = (int) r0
            java.util.concurrent.atomic.AtomicReference[] r1 = p000.tr1.f10438
            r0 = r1[r0]
            rr1 r1 = p000.tr1.f10436
            java.lang.Object r2 = r0.getAndSet(r1)
            rr1 r2 = (p000.rr1) r2
            if (r2 != r1) goto L24
            rr1 r0 = new rr1
            r0.<init>()
            return r0
        L24:
            r1 = 0
            if (r2 != 0) goto L30
            r0.set(r1)
            rr1 r0 = new rr1
            r0.<init>()
            return r0
        L30:
            rr1 r3 = r2.f9476
            r0.set(r3)
            r2.f9476 = r1
            r0 = 0
            r2.f9473 = r0
            return r2
    }
}
