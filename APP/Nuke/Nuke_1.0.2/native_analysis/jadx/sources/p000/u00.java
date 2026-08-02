package p000;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class u00 extends AbstractC0658rj {

    /* JADX INFO: renamed from: i */
    public final a20 f11029i;

    /* JADX INFO: renamed from: j */
    public transient t00 f11030j;

    public u00(t00 t00Var) {
        this(t00Var, t00Var != null ? t00Var.mo2508f() : null);
    }

    @Override // p000.t00
    /* JADX INFO: renamed from: f */
    public a20 mo2508f() {
        a20 a20Var = this.f11029i;
        a20Var.getClass();
        return a20Var;
    }

    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: s */
    public void mo4496s() {
        t00 t00Var = this.f11030j;
        if (t00Var != null && t00Var != this) {
            y10 y10VarMo15o = mo2508f().mo15o(gd3.f3438p);
            y10VarMo15o.getClass();
            k90 k90Var = (k90) t00Var;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = k90.f5403o;
            while (atomicReferenceFieldUpdater.get(k90Var) == p40.f7969e) {
            }
            Object obj = atomicReferenceFieldUpdater.get(k90Var);
            C0469mp c0469mp = obj instanceof C0469mp ? (C0469mp) obj : null;
            if (c0469mp != null) {
                c0469mp.m3147q();
            }
        }
        this.f11030j = C0518nv.f7341i;
    }

    public u00(t00 t00Var, a20 a20Var) {
        super(t00Var);
        this.f11029i = a20Var;
    }
}
