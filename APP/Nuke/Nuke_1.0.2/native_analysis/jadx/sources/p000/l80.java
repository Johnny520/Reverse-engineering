package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class l80 implements ia1, tc2, lb3 {

    /* JADX INFO: renamed from: h */
    public final la1 f5979h = new la1(this, true);

    /* JADX INFO: renamed from: i */
    public final rc2 f5980i = new rc2(new sc2(this, new C0727ta(20, this)));

    /* JADX INFO: renamed from: j */
    public final kb3 f5981j = new kb3();

    /* JADX INFO: renamed from: k */
    public boolean f5982k;

    /* JADX INFO: renamed from: l */
    public boolean f5983l;

    /* JADX INFO: renamed from: a */
    public final void m2875a() {
        if (!this.f5982k || this.f5983l) {
            return;
        }
        z91 z91Var = z91.ON_PAUSE;
        la1 la1Var = this.f5979h;
        la1Var.m2892e(z91Var);
        la1Var.m2892e(z91.ON_STOP);
        la1Var.m2892e(z91.ON_DESTROY);
        this.f5981j.m2626a();
        this.f5983l = true;
    }

    @Override // p000.ia1
    public final ba1 getLifecycle() {
        return this.f5979h;
    }

    @Override // p000.tc2
    public final qc2 getSavedStateRegistry() {
        return this.f5980i.f9512b;
    }

    @Override // p000.lb3
    public final kb3 getViewModelStore() {
        return this.f5981j;
    }
}
