package p000;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public class pc1 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f8255a = AtomicReferenceFieldUpdater.newUpdater(pc1.class, Object.class, "_cur$volatile");
    private volatile /* synthetic */ Object _cur$volatile = new rc1(8, false);

    /* JADX INFO: renamed from: a */
    public final boolean m3847a(Runnable runnable) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8255a;
            rc1 rc1Var = (rc1) atomicReferenceFieldUpdater.get(this);
            int iM4428a = rc1Var.m4428a(runnable);
            if (iM4428a == 0) {
                return true;
            }
            if (iM4428a == 1) {
                rc1 rc1VarM4430c = rc1Var.m4430c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, rc1Var, rc1VarM4430c) && atomicReferenceFieldUpdater.get(this) == rc1Var) {
                }
            } else if (iM4428a == 2) {
                return false;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m3848b() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8255a;
            rc1 rc1Var = (rc1) atomicReferenceFieldUpdater.get(this);
            if (rc1Var.m4429b()) {
                return;
            }
            rc1 rc1VarM4430c = rc1Var.m4430c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, rc1Var, rc1VarM4430c) && atomicReferenceFieldUpdater.get(this) == rc1Var) {
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final int m3849c() {
        rc1 rc1Var = (rc1) f8255a.get(this);
        rc1Var.getClass();
        long j = rc1.f9505f.get(rc1Var);
        return 1073741823 & (((int) ((j & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j)));
    }

    /* JADX INFO: renamed from: d */
    public final Object m3850d() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8255a;
            rc1 rc1Var = (rc1) atomicReferenceFieldUpdater.get(this);
            Object objM4431d = rc1Var.m4431d();
            if (objM4431d != rc1.f9506g) {
                return objM4431d;
            }
            rc1 rc1VarM4430c = rc1Var.m4430c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, rc1Var, rc1VarM4430c) && atomicReferenceFieldUpdater.get(this) == rc1Var) {
            }
        }
    }
}
