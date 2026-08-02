package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class l80 implements ia1, tc2, lb3 {
    public final la1 h = new la1(this, true);
    public final rc2 i = new rc2(new sc2(this, new ta(20, this)));
    public final kb3 j = new kb3();
    public boolean k;
    public boolean l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a() {
        if (!this.k || this.l) {
            return;
        }
        z91 z91Var = z91.ON_PAUSE;
        la1 la1Var = this.h;
        la1Var.e(z91Var);
        la1Var.e(z91.ON_STOP);
        la1Var.e(z91.ON_DESTROY);
        this.j.a();
        this.l = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.ia1
    public final ba1 getLifecycle() {
        return this.h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.tc2
    public final qc2 getSavedStateRegistry() {
        return this.i.b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.lb3
    public final kb3 getViewModelStore() {
        return this.j;
    }
}
