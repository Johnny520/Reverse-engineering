package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class jl1 implements lp, gc3 {
    public final mp h;
    public final /* synthetic */ kl1 i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public jl1(kl1 kl1Var, mp mpVar) {
        this.i = kl1Var;
        this.h = mpVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.lp
    public final void C(Object obj) throws j90 {
        this.h.C(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.gc3
    public final void a(lm2 lm2Var, int i) {
        this.h.a(lm2Var, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.t00
    public final a20 f() {
        return this.h.l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.t00
    public final void h(Object obj) {
        this.h.h(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.lp
    public final void i(Object obj, nn0 nn0Var) throws j90 {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = kl1.h;
        kl1 kl1Var = this.i;
        atomicReferenceFieldUpdater.set(kl1Var, null);
        v vVar = new v(17, kl1Var, this);
        mp mpVar = this.h;
        mpVar.E((a83) obj, mpVar.j, new wt0(2, vVar));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.lp
    public final hh1 l(Object obj, nn0 nn0Var) {
        kl1 kl1Var = this.i;
        wt0 wt0Var = new wt0(kl1Var, this);
        hh1 hh1VarH = this.h.H((a83) obj, wt0Var);
        if (hh1VarH != null) {
            kl1.h.set(kl1Var, null);
        }
        return hh1VarH;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.lp
    public final boolean n(Throwable th) {
        return this.h.n(th);
    }
}
