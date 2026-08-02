package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ra0 extends e32 {

    /* JADX INFO: renamed from: c */
    public static final ra0 f9484c = new ra0(ta0.f10653a);

    @Override // p000.AbstractC0409l2
    /* JADX INFO: renamed from: i */
    public final int mo572i(Object obj) {
        double[] dArr = (double[]) obj;
        dArr.getClass();
        return dArr.length;
    }

    @Override // p000.AbstractC0031au, p000.AbstractC0409l2
    /* JADX INFO: renamed from: k */
    public final void mo278k(InterfaceC0826vx interfaceC0826vx, int i, Object obj) {
        qa0 qa0Var = (qa0) obj;
        qa0Var.getClass();
        double dMo4560k = interfaceC0826vx.mo4560k(this.f2302b, i);
        qa0Var.mo629b(qa0Var.mo630d() + 1);
        double[] dArr = qa0Var.f8851a;
        int i2 = qa0Var.f8852b;
        qa0Var.f8852b = i2 + 1;
        dArr[i2] = dMo4560k;
    }

    @Override // p000.AbstractC0409l2
    /* JADX INFO: renamed from: l */
    public final Object mo573l(Object obj) {
        double[] dArr = (double[]) obj;
        dArr.getClass();
        qa0 qa0Var = new qa0();
        qa0Var.f8851a = dArr;
        qa0Var.f8852b = dArr.length;
        qa0Var.mo629b(10);
        return qa0Var;
    }

    @Override // p000.e32
    /* JADX INFO: renamed from: o */
    public final Object mo574o() {
        return new double[0];
    }

    @Override // p000.e32
    /* JADX INFO: renamed from: p */
    public final void mo575p(InterfaceC0863wx interfaceC0863wx, Object obj, int i) {
        double[] dArr = (double[]) obj;
        interfaceC0863wx.getClass();
        dArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            double d = dArr[i2];
            dv2 dv2Var = (dv2) interfaceC0863wx;
            d32 d32Var = this.f2302b;
            d32Var.getClass();
            dv2Var.m1194s(d32Var, i2);
            dv2Var.mo1181f(d);
        }
    }
}
