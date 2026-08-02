package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public class pc1 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(pc1.class, Object.class, "_cur$volatile");
    private volatile /* synthetic */ Object _cur$volatile = new rc1(8, false);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean a(Runnable runnable) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
            rc1 rc1Var = (rc1) atomicReferenceFieldUpdater.get(this);
            int iA = rc1Var.a(runnable);
            if (iA == 0) {
                return true;
            }
            if (iA == 1) {
                rc1 rc1VarC = rc1Var.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, rc1Var, rc1VarC) && atomicReferenceFieldUpdater.get(this) == rc1Var) {
                }
            } else if (iA == 2) {
                return false;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
            rc1 rc1Var = (rc1) atomicReferenceFieldUpdater.get(this);
            if (rc1Var.b()) {
                return;
            }
            rc1 rc1VarC = rc1Var.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, rc1Var, rc1VarC) && atomicReferenceFieldUpdater.get(this) == rc1Var) {
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int c() {
        rc1 rc1Var = (rc1) a.get(this);
        rc1Var.getClass();
        long j = rc1.f.get(rc1Var);
        return 1073741823 & (((int) ((j & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object d() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
            rc1 rc1Var = (rc1) atomicReferenceFieldUpdater.get(this);
            Object objD = rc1Var.d();
            if (objD != rc1.g) {
                return objD;
            }
            rc1 rc1VarC = rc1Var.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, rc1Var, rc1VarC) && atomicReferenceFieldUpdater.get(this) == rc1Var) {
            }
        }
    }
}
