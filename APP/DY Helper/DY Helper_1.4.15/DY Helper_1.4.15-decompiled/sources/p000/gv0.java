package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public class gv0 {

    /* JADX INFO: renamed from: α */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f4479 = null;
    private volatile /* synthetic */ java.lang.Object _cur$volatile;

    static {
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.String r1 = "_cur$volatile"
            java.lang.Class<gv0> r2 = p000.gv0.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r0, r1)
            p000.gv0.f4479 = r0
            return
    }

    public gv0() {
            r3 = this;
            r3.<init>()
            iv0 r0 = new iv0
            r1 = 8
            r2 = 0
            r0.<init>(r1, r2)
            r3._cur$volatile = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public final boolean m2326(java.lang.Runnable r5) {
            r4 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = p000.gv0.f4479
            java.lang.Object r1 = r0.get(r4)
            iv0 r1 = (p000.iv0) r1
            int r2 = r1.m2808(r5)
            r3 = 1
            if (r2 == 0) goto L29
            if (r2 == r3) goto L17
            r0 = 2
            if (r2 == r0) goto L15
            goto L0
        L15:
            r4 = 0
            return r4
        L17:
            iv0 r2 = r1.m2810()
        L1b:
            boolean r3 = r0.compareAndSet(r4, r1, r2)
            if (r3 == 0) goto L22
            goto L0
        L22:
            java.lang.Object r3 = r0.get(r4)
            if (r3 == r1) goto L1b
            goto L0
        L29:
            return r3
    }

    /* JADX INFO: renamed from: β */
    public final void m2327() {
            r4 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = p000.gv0.f4479
            java.lang.Object r1 = r0.get(r4)
            iv0 r1 = (p000.iv0) r1
            boolean r2 = r1.m2809()
            if (r2 == 0) goto Lf
            return
        Lf:
            iv0 r2 = r1.m2810()
        L13:
            boolean r3 = r0.compareAndSet(r4, r1, r2)
            if (r3 == 0) goto L1a
            goto L0
        L1a:
            java.lang.Object r3 = r0.get(r4)
            if (r3 == r1) goto L13
            goto L0
    }

    /* JADX INFO: renamed from: γ */
    public final int m2328() {
            r4 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = p000.gv0.f4479
            java.lang.Object r4 = r0.get(r4)
            iv0 r4 = (p000.iv0) r4
            r4.getClass()
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = p000.iv0.f5211
            long r0 = r0.get(r4)
            r2 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r2 = r2 & r0
            int r4 = (int) r2
            r2 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r0 = r0 & r2
            r2 = 30
            long r0 = r0 >> r2
            int r0 = (int) r0
            int r0 = r0 - r4
            r4 = 1073741823(0x3fffffff, float:1.9999999)
            r4 = r4 & r0
            return r4
    }

    /* JADX INFO: renamed from: δ */
    public final java.lang.Object m2329() {
            r4 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = p000.gv0.f4479
            java.lang.Object r1 = r0.get(r4)
            iv0 r1 = (p000.iv0) r1
            java.lang.Object r2 = r1.m2811()
            uy r3 = p000.iv0.f5212
            if (r2 == r3) goto L11
            return r2
        L11:
            iv0 r2 = r1.m2810()
        L15:
            boolean r3 = r0.compareAndSet(r4, r1, r2)
            if (r3 == 0) goto L1c
            goto L0
        L1c:
            java.lang.Object r3 = r0.get(r4)
            if (r3 == r1) goto L15
            goto L0
    }
}
