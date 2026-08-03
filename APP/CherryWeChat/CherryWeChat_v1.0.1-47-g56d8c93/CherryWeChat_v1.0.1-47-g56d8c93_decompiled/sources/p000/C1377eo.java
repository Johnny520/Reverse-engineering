package p000;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: eo */
/* JADX INFO: loaded from: classes.dex */
public final class C1377eo extends AbstractC1217bc implements InterfaceC2413qd {

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f4911g = AtomicIntegerFieldUpdater.newUpdater(C1377eo.class, "runningWorkers$volatile");

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

    /* JADX WARN: Multi-variable type inference failed */
    public C1377eo(AbstractC1217bc abstractC1217bc, int i) {
        InterfaceC2413qd interfaceC2413qd = abstractC1217bc instanceof InterfaceC2413qd ? (InterfaceC2413qd) abstractC1217bc : null;
        this.f4912b = interfaceC2413qd == null ? AbstractC0707Qc.f2273a : interfaceC2413qd;
        this.f4913c = abstractC1217bc;
        this.f4914d = i;
        this.f4915e = new C1334dp();
        this.f4916f = new Object();
    }

    @Override // p000.InterfaceC2413qd
    /* JADX INFO: renamed from: f */
    public final void mo2668f(long j, C0523M6 c0523m6) {
        this.f4912b.mo2668f(j, c0523m6);
    }

    @Override // p000.AbstractC1217bc
    /* JADX INFO: renamed from: t */
    public final void mo1781t(InterfaceC1137ac interfaceC1137ac, Runnable runnable) {
        this.f4915e.m2583a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f4911g;
        if (atomicIntegerFieldUpdater.get(this) < this.f4914d) {
            synchronized (this.f4916f) {
                if (atomicIntegerFieldUpdater.get(this) >= this.f4914d) {
                    return;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
                Runnable runnableM2669w = m2669w();
                if (runnableM2669w == null) {
                    return;
                }
                try {
                    AbstractC1406fG.m2713m0(this.f4913c, this, new RunnableC0044B0(5, this, runnableM2669w));
                } catch (Throwable th) {
                    f4911g.decrementAndGet(this);
                    throw th;
                }
            }
        }
    }

    @Override // p000.AbstractC1217bc
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f4913c);
        sb.append(".limitedParallelism(");
        return AbstractC0213Ey.m408f(sb, this.f4914d, ')');
    }

    /* JADX INFO: renamed from: w */
    public final Runnable m2669w() {
        while (true) {
            Runnable runnable = (Runnable) this.f4915e.m2586d();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.f4916f) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f4911g;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.f4915e.m2585c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }
}
