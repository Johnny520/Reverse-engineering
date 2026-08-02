package p000;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class sa1 extends c20 implements r60 {

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f10007o = AtomicIntegerFieldUpdater.newUpdater(sa1.class, "runningWorkers$volatile");

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ r60 f10008j;

    /* JADX INFO: renamed from: k */
    public final c20 f10009k;

    /* JADX INFO: renamed from: l */
    public final int f10010l;

    /* JADX INFO: renamed from: m */
    public final pc1 f10011m;

    /* JADX INFO: renamed from: n */
    public final Object f10012n;
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* JADX WARN: Multi-variable type inference failed */
    public sa1(c20 c20Var, int i) {
        r60 r60Var = c20Var instanceof r60 ? (r60) c20Var : null;
        this.f10008j = r60Var == null ? l50.f5937a : r60Var;
        this.f10009k = c20Var;
        this.f10010l = i;
        this.f10011m = new pc1();
        this.f10012n = new Object();
    }

    @Override // p000.c20
    /* JADX INFO: renamed from: D */
    public final void mo612D(a20 a20Var, Runnable runnable) {
        boolean z;
        Runnable runnableM4779G;
        this.f10011m.m3847a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f10007o;
        if (atomicIntegerFieldUpdater.get(this) < this.f10010l) {
            synchronized (this.f10012n) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = f10007o;
                if (atomicIntegerFieldUpdater2.get(this) >= this.f10010l) {
                    z = false;
                } else {
                    atomicIntegerFieldUpdater2.incrementAndGet(this);
                    z = true;
                }
            }
            if (!z || (runnableM4779G = m4779G()) == null) {
                return;
            }
            try {
                p40.m3707R(this.f10009k, this, new yp0(this, runnableM4779G, 2));
            } catch (Throwable th) {
                atomicIntegerFieldUpdater.decrementAndGet(this);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: G */
    public final Runnable m4779G() {
        while (true) {
            Runnable runnable = (Runnable) this.f10011m.m3850d();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.f10012n) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f10007o;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.f10011m.m3849c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    @Override // p000.r60
    /* JADX INFO: renamed from: g */
    public final ca0 mo2605g(long j, q23 q23Var, a20 a20Var) {
        return this.f10008j.mo2605g(j, q23Var, a20Var);
    }

    @Override // p000.r60
    /* JADX INFO: renamed from: h */
    public final void mo4185h(long j, C0469mp c0469mp) {
        this.f10008j.mo4185h(j, c0469mp);
    }

    @Override // p000.c20
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f10009k);
        sb.append(".limitedParallelism(");
        return vi0.m5694m(sb, this.f10010l, ')');
    }
}
