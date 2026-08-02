package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class xb2 implements t00, l20 {
    public static final AtomicReferenceFieldUpdater i = AtomicReferenceFieldUpdater.newUpdater(xb2.class, Object.class, "result");
    public final t00 h;
    private volatile Object result;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public xb2(t00 t00Var) {
        k20 k20Var = k20.h;
        this.h = t00Var;
        this.result = k20Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.l20
    public final l20 d() {
        t00 t00Var = this.h;
        if (t00Var instanceof l20) {
            return (l20) t00Var;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.t00
    public final a20 f() {
        return this.h.f();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.t00
    public final void h(Object obj) {
        while (true) {
            Object obj2 = this.result;
            k20 k20Var = k20.i;
            if (obj2 == k20Var) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = i;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, k20Var, obj)) {
                    if (atomicReferenceFieldUpdater.get(this) != k20Var) {
                        break;
                    }
                }
                return;
            }
            k20 k20Var2 = k20.h;
            if (obj2 != k20Var2) {
                s.l("Already resumed");
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = i;
            k20 k20Var3 = k20.j;
            while (!atomicReferenceFieldUpdater2.compareAndSet(this, k20Var2, k20Var3)) {
                if (atomicReferenceFieldUpdater2.get(this) != k20Var2) {
                    break;
                }
            }
            this.h.h(obj);
            return;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "SafeContinuation for " + this.h;
    }
}
