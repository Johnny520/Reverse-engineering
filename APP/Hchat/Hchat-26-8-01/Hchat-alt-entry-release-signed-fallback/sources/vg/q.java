package vg;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class q extends vg.b implements qg.d1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater f14356d = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f14357c;
    private volatile /* synthetic */ int cleanedAndPointers$volatile;

    static {
            java.lang.Class<vg.q> r0 = vg.q.class
            java.lang.String r1 = "cleanedAndPointers$volatile"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r0, r1)
            vg.q.f14356d = r0
            return
    }

    public q(long r1, vg.q r3, int r4) {
            r0 = this;
            r0.<init>(r3)
            r0.f14357c = r1
            int r1 = r4 << 16
            r0.cleanedAndPointers$volatile = r1
            return
    }

    @Override // vg.b
    public final boolean c() {
            r2 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = vg.q.f14356d
            int r0 = r0.get(r2)
            int r1 = r2.f()
            if (r0 != r1) goto L15
            vg.b r0 = r2.b()
            if (r0 != 0) goto L13
            goto L15
        L13:
            r0 = 1
            return r0
        L15:
            r0 = 0
            return r0
    }

    public final boolean e() {
            r2 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = vg.q.f14356d
            r1 = -65536(0xffffffffffff0000, float:NaN)
            int r0 = r0.addAndGet(r2, r1)
            int r1 = r2.f()
            if (r0 != r1) goto L17
            vg.b r0 = r2.b()
            if (r0 != 0) goto L15
            goto L17
        L15:
            r0 = 1
            return r0
        L17:
            r0 = 0
            return r0
    }

    public abstract int f();

    public abstract void g(int r1, wf.g r2);

    public final void h() {
            r2 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = vg.q.f14356d
            int r0 = r0.incrementAndGet(r2)
            int r1 = r2.f()
            if (r0 != r1) goto Lf
            r2.d()
        Lf:
            return
    }

    public final boolean i() {
            r3 = this;
        L0:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = vg.q.f14356d
            int r1 = r0.get(r3)
            int r2 = r3.f()
            if (r1 != r2) goto L15
            vg.b r2 = r3.b()
            if (r2 != 0) goto L13
            goto L15
        L13:
            r0 = 0
            return r0
        L15:
            r2 = 65536(0x10000, float:9.1835E-41)
            int r2 = r2 + r1
            boolean r0 = r0.compareAndSet(r3, r1, r2)
            if (r0 == 0) goto L0
            r0 = 1
            return r0
    }
}
