package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class qr0 extends kotlinx.coroutines.AbstractC0479 implements p000.InterfaceC0845tr {

    /* JADX INFO: renamed from: μ */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater f9085 = null;
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ p000.InterfaceC0845tr f9086;

    /* JADX INFO: renamed from: θ */
    public final kotlinx.coroutines.AbstractC0479 f9087;

    /* JADX INFO: renamed from: ι */
    public final int f9088;

    /* JADX INFO: renamed from: κ */
    public final p000.gv0 f9089;

    /* JADX INFO: renamed from: λ */
    public final java.lang.Object f9090;

    static {
            java.lang.Class<qr0> r0 = p000.qr0.class
            java.lang.String r1 = "runningWorkers$volatile"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r0, r1)
            p000.qr0.f9085 = r0
            return
    }

    public qr0(kotlinx.coroutines.AbstractC0479 r2, int r3) {
            r1 = this;
            r1.<init>()
            boolean r0 = r2 instanceof p000.InterfaceC0845tr
            if (r0 == 0) goto Lb
            r0 = r2
            tr r0 = (p000.InterfaceC0845tr) r0
            goto Lc
        Lb:
            r0 = 0
        Lc:
            if (r0 != 0) goto L10
            tr r0 = p000.AbstractC0050ar.f1286
        L10:
            r1.f9086 = r0
            r1.f9087 = r2
            r1.f9088 = r3
            gv0 r2 = new gv0
            r2.<init>()
            r1.f9089 = r2
            java.lang.Object r2 = new java.lang.Object
            r2.<init>()
            r1.f9090 = r2
            return
    }

    @Override // kotlinx.coroutines.AbstractC0479
    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            kotlinx.coroutines.α r1 = r2.f9087
            r0.append(r1)
            java.lang.String r1 = ".limitedParallelism("
            r0.append(r1)
            int r2 = r2.f9088
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    @Override // p000.InterfaceC0845tr
    /* JADX INFO: renamed from: δ */
    public final void mo3401(long r1, p000.C0015ae r3) {
            r0 = this;
            tr r0 = r0.f9086
            r0.mo3401(r1, r3)
            return
    }

    @Override // kotlinx.coroutines.AbstractC0479
    /* JADX INFO: renamed from: ρ */
    public final void mo1950(p000.InterfaceC0880up r3, java.lang.Runnable r4) {
            r2 = this;
            gv0 r3 = r2.f9089
            r3.m2326(r4)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r3 = p000.qr0.f9085
            int r3 = r3.get(r2)
            int r4 = r2.f9088
            if (r3 >= r4) goto L3c
            java.lang.Object r3 = r2.f9090
            monitor-enter(r3)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r4 = p000.qr0.f9085     // Catch: java.lang.Throwable -> L39
            int r0 = r4.get(r2)     // Catch: java.lang.Throwable -> L39
            int r1 = r2.f9088     // Catch: java.lang.Throwable -> L39
            if (r0 < r1) goto L1f
            monitor-exit(r3)
            r3 = 0
            goto L24
        L1f:
            r4.incrementAndGet(r2)     // Catch: java.lang.Throwable -> L39
            monitor-exit(r3)
            r3 = 1
        L24:
            if (r3 == 0) goto L3c
            java.lang.Runnable r3 = r2.m4942()
            if (r3 != 0) goto L2d
            goto L3c
        L2d:
            ｓ r4 = new ｓ
            r0 = 4
            r4.<init>(r2, r0, r3)
            kotlinx.coroutines.α r3 = r2.f9087
            r3.mo1950(r2, r4)
            return
        L39:
            r2 = move-exception
            monitor-exit(r3)
            throw r2
        L3c:
            return
    }

    /* JADX INFO: renamed from: υ */
    public final java.lang.Runnable m4942() {
            r3 = this;
        L0:
            gv0 r0 = r3.f9089
            java.lang.Object r0 = r0.m2329()
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            if (r0 != 0) goto L25
            java.lang.Object r0 = r3.f9090
            monitor-enter(r0)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = p000.qr0.f9085     // Catch: java.lang.Throwable -> L22
            r1.decrementAndGet(r3)     // Catch: java.lang.Throwable -> L22
            gv0 r2 = r3.f9089     // Catch: java.lang.Throwable -> L22
            int r2 = r2.m2328()     // Catch: java.lang.Throwable -> L22
            if (r2 != 0) goto L1d
            monitor-exit(r0)
            r3 = 0
            return r3
        L1d:
            r1.incrementAndGet(r3)     // Catch: java.lang.Throwable -> L22
            monitor-exit(r0)
            goto L0
        L22:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
        L25:
            return r0
    }
}
