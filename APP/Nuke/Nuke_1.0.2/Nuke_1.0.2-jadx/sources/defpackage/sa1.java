package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class sa1 extends c20 implements r60 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater o = AtomicIntegerFieldUpdater.newUpdater(sa1.class, "runningWorkers$volatile");
    public final /* synthetic */ r60 j;
    public final c20 k;
    public final int l;
    public final pc1 m;
    public final Object n;
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: c20 */
    /* JADX WARN: Multi-variable type inference failed */
    public sa1(c20 c20Var, int i) {
        r60 r60Var = c20Var instanceof r60 ? (r60) c20Var : null;
        this.j = r60Var == null ? l50.a : r60Var;
        this.k = c20Var;
        this.l = i;
        this.m = new pc1();
        this.n = new Object();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.c20
    public final void D(a20 a20Var, Runnable runnable) {
        boolean z;
        Runnable runnableG;
        this.m.a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = o;
        if (atomicIntegerFieldUpdater.get(this) < this.l) {
            synchronized (this.n) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = o;
                if (atomicIntegerFieldUpdater2.get(this) >= this.l) {
                    z = false;
                } else {
                    atomicIntegerFieldUpdater2.incrementAndGet(this);
                    z = true;
                }
            }
            if (!z || (runnableG = G()) == null) {
                return;
            }
            try {
                p40.R(this.k, this, new yp0(this, runnableG, 2));
            } catch (Throwable th) {
                atomicIntegerFieldUpdater.decrementAndGet(this);
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Runnable G() {
        while (true) {
            Runnable runnable = (Runnable) this.m.d();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.n) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = o;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.m.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.r60
    public final ca0 g(long j, q23 q23Var, a20 a20Var) {
        return this.j.g(j, q23Var, a20Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.r60
    public final void h(long j, mp mpVar) {
        this.j.h(j, mpVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.c20
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.k);
        sb.append(".limitedParallelism(");
        return vi0.m(sb, this.l, ')');
    }
}
