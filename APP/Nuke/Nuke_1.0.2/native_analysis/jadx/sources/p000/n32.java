package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class n32 implements xk1, j20 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ xk1 f6980h;

    /* JADX INFO: renamed from: i */
    public final a20 f6981i;

    public n32(xk1 xk1Var, a20 a20Var) {
        this.f6980h = xk1Var;
        this.f6981i = a20Var;
    }

    @Override // p000.j20
    /* JADX INFO: renamed from: g */
    public final a20 mo705g() {
        return this.f6981i;
    }

    @Override // p000.gu2
    public final Object getValue() {
        return this.f6980h.getValue();
    }

    @Override // p000.xk1
    public final void setValue(Object obj) {
        this.f6980h.setValue(obj);
    }
}
