package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class m91 extends th1 implements InterfaceC0257gy, dq0 {

    /* JADX INFO: renamed from: v */
    public C0416l9 f6521v;

    /* JADX INFO: renamed from: w */
    public t91 f6522w;

    /* JADX INFO: renamed from: x */
    public b03 f6523x;

    /* JADX INFO: renamed from: y */
    public final nx1 f6524y = op0.m3598u(null);

    public m91(C0416l9 c0416l9, t91 t91Var, b03 b03Var) {
        this.f6521v = c0416l9;
        this.f6522w = t91Var;
        this.f6523x = b03Var;
    }

    @Override // p000.th1
    /* JADX INFO: renamed from: E0 */
    public final void mo212E0() {
        C0416l9 c0416l9 = this.f6521v;
        if (c0416l9.f5986a != null) {
            nz0.m3458c("Expected textInputModifierNode to be null");
        }
        c0416l9.f5986a = this;
    }

    @Override // p000.th1
    /* JADX INFO: renamed from: F0 */
    public final void mo213F0() {
        this.f6521v.m2886k(this);
    }

    @Override // p000.dq0
    /* JADX INFO: renamed from: w */
    public final void mo1069w(zn1 zn1Var) {
        this.f6524y.setValue(zn1Var);
    }
}
