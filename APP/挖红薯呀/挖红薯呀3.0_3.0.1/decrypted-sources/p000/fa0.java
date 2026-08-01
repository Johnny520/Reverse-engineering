package p000;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class fa0 extends AbstractC0692rk implements InterfaceC0657qm {

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f1640k = AtomicIntegerFieldUpdater.newUpdater(fa0.class, "runningWorkers$volatile");

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ InterfaceC0657qm f1641f;

    /* JADX INFO: renamed from: g */
    public final AbstractC0692rk f1642g;

    /* JADX INFO: renamed from: h */
    public final int f1643h;

    /* JADX INFO: renamed from: i */
    public final ib0 f1644i;

    /* JADX INFO: renamed from: j */
    public final Object f1645j;
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: rk */
    /* JADX WARN: Multi-variable type inference failed */
    public fa0(AbstractC0692rk abstractC0692rk, int i) {
        InterfaceC0657qm interfaceC0657qm = abstractC0692rk instanceof InterfaceC0657qm ? (InterfaceC0657qm) abstractC0692rk : null;
        this.f1641f = interfaceC0657qm == null ? AbstractC0768tl.f6011a : interfaceC0657qm;
        this.f1642g = abstractC0692rk;
        this.f1643h = i;
        this.f1644i = new ib0();
        this.f1645j = new Object();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0657qm
    /* JADX INFO: renamed from: c */
    public final InterfaceC0622po mo1073c(long j, k81 k81Var, InterfaceC0618pk interfaceC0618pk) {
        return this.f1641f.mo1073c(j, k81Var, interfaceC0618pk);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0657qm
    /* JADX INFO: renamed from: d */
    public final void mo1074d(long j, C0884wc c0884wc) {
        this.f1641f.mo1074d(j, c0884wc);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0692rk
    /* JADX INFO: renamed from: e */
    public final void mo358e(InterfaceC0618pk interfaceC0618pk, Runnable runnable) {
        boolean z;
        Runnable runnableM1075j;
        this.f1644i.m1572a(runnable);
        if (f1640k.get(this) < this.f1643h) {
            synchronized (this.f1645j) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f1640k;
                if (atomicIntegerFieldUpdater.get(this) >= this.f1643h) {
                    z = false;
                } else {
                    atomicIntegerFieldUpdater.incrementAndGet(this);
                    z = true;
                }
            }
            if (!z || (runnableM1075j = m1075j()) == null) {
                return;
            }
            this.f1642g.mo358e(this, new RunnableC0263gy(this, runnableM1075j));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public final Runnable m1075j() {
        while (true) {
            Runnable runnable = (Runnable) this.f1644i.m1575d();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.f1645j) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f1640k;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.f1644i.m1574c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0692rk
    public final String toString() {
        return this.f1642g + ".limitedParallelism(" + this.f1643h + ')';
    }
}
