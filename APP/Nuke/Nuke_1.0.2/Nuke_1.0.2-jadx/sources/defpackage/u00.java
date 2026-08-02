package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class u00 extends rj {
    public final a20 i;
    public transient t00 j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public u00(t00 t00Var) {
        this(t00Var, t00Var != null ? t00Var.f() : null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.t00
    public a20 f() {
        a20 a20Var = this.i;
        a20Var.getClass();
        return a20Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rj
    public void s() {
        t00 t00Var = this.j;
        if (t00Var != null && t00Var != this) {
            y10 y10VarO = f().o(gd3.p);
            y10VarO.getClass();
            k90 k90Var = (k90) t00Var;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = k90.o;
            while (atomicReferenceFieldUpdater.get(k90Var) == p40.e) {
            }
            Object obj = atomicReferenceFieldUpdater.get(k90Var);
            mp mpVar = obj instanceof mp ? (mp) obj : null;
            if (mpVar != null) {
                mpVar.q();
            }
        }
        this.j = nv.i;
    }

    public u00(t00 t00Var, a20 a20Var) {
        super(t00Var);
        this.i = a20Var;
    }
}
