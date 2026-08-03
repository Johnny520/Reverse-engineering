package p000;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: eo */
/* JADX INFO: loaded from: classes.dex */
public final class C1377eo extends AbstractC1217bc implements InterfaceC2413qd {

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f4911g = null;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InterfaceC2413qd f4912b;

    /* JADX INFO: renamed from: c */
    public final AbstractC1217bc f4913c;

    /* JADX INFO: renamed from: d */
    public final int f4914d;

    /* JADX INFO: renamed from: e */
    public final C1334dp f4915e;

    /* JADX INFO: renamed from: f */
    public final Object f4916f;
    private volatile /* synthetic */ int runningWorkers$volatile;

    static {
        f4911g = AtomicIntegerFieldUpdater.newUpdater(C1377eo.class, "runningWorkers$volatile");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1377eo(AbstractC1217bc r2, int r3) {
        if ((r2 instanceof InterfaceC2413qd) == false) goto L5;
        InterfaceC2413qd r0 = (InterfaceC2413qd) r2;
    L6:
        if (r0 != null) goto L8;
        r0 = AbstractC0707Qc.f2273a;
    L8:
        this.f4912b = r0;
        this.f4913c = r2;
        this.f4914d = r3;
        this.f4915e = new C1334dp();
        this.f4916f = new Object();
        return;
    L5:
        r0 = null;
        goto L6
    }

    @Override // p000.InterfaceC2413qd
    /* JADX INFO: renamed from: f */
    public final void mo2668f(long r2, C0523M6 r4) {
        this.f4912b.mo2668f(r2, r4);
    }

    @Override // p000.AbstractC1217bc
    /* JADX INFO: renamed from: t */
    public final void mo1781t(InterfaceC1137ac r3, Runnable r4) {
        this.f4915e.m2583a(r4);
        AtomicIntegerFieldUpdater r32 = f4911g;
        if (r32.get(this) >= this.f4914d) goto L23;
        Object r42 = this.f4916f;
        monitor-enter(r42);
    L20:
        th = move-exception;
        throw th;
    L7:
        if (r32.get(this) < this.f4914d) goto L10;
        monitor-exit(r42);
        return;
    L10:
        r32.incrementAndGet(this);     // Catch: Throwable -> L20
        monitor-exit(r42);
        Runnable r33 = m2669w();
        if (r33 == null) goto L28;
        RunnableC0044B0 r43 = new RunnableC0044B0(5, this, r33);     // Catch: Throwable -> L17
        AbstractC1406fG.m2713m0(this.f4913c, this, r43);     // Catch: Throwable -> L17
        return;
    L17:
        th = move-exception;
        f4911g.decrementAndGet(this);
        throw th;
    L28:
        return;
    }

    @Override // p000.AbstractC1217bc
    public final String toString() {
        StringBuilder r0 = new StringBuilder();
        r0.append(this.f4913c);
        r0.append(".limitedParallelism(");
        return AbstractC0213Ey.m408f(r0, this.f4914d, ')');
    }

    /* JADX INFO: renamed from: w */
    public final Runnable m2669w() {
    L2:
        Runnable r0 = (Runnable) this.f4915e.m2586d();
        if (r0 != null) goto L17;
        Object r02 = this.f4916f;
        monitor-enter(r02);
        AtomicIntegerFieldUpdater r1 = f4911g;     // Catch: Throwable -> L14
        r1.decrementAndGet(this);     // Catch: Throwable -> L14
        if (this.f4915e.m2585c() == 0) goto L8;
        r1.incrementAndGet(this);     // Catch: Throwable -> L14
        monitor-exit(r02);
        goto L2
    L8:
        monitor-exit(r02);
        return null;
    L14:
        th = move-exception;
        throw th;
    L17:
        return r0;
    }
}
