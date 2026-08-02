package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class uj0 extends e32 {

    /* JADX INFO: renamed from: c */
    public static final uj0 f11324c = new uj0(vj0.f11988a);

    @Override // p000.AbstractC0409l2
    /* JADX INFO: renamed from: i */
    public final int mo572i(Object obj) {
        float[] fArr = (float[]) obj;
        fArr.getClass();
        return fArr.length;
    }

    @Override // p000.AbstractC0031au, p000.AbstractC0409l2
    /* JADX INFO: renamed from: k */
    public final void mo278k(InterfaceC0826vx interfaceC0826vx, int i, Object obj) {
        tj0 tj0Var = (tj0) obj;
        tj0Var.getClass();
        float fMo4559i = interfaceC0826vx.mo4559i(this.f2302b, i);
        tj0Var.mo629b(tj0Var.mo630d() + 1);
        float[] fArr = tj0Var.f10792a;
        int i2 = tj0Var.f10793b;
        tj0Var.f10793b = i2 + 1;
        fArr[i2] = fMo4559i;
    }

    @Override // p000.AbstractC0409l2
    /* JADX INFO: renamed from: l */
    public final Object mo573l(Object obj) {
        float[] fArr = (float[]) obj;
        fArr.getClass();
        tj0 tj0Var = new tj0();
        tj0Var.f10792a = fArr;
        tj0Var.f10793b = fArr.length;
        tj0Var.mo629b(10);
        return tj0Var;
    }

    @Override // p000.e32
    /* JADX INFO: renamed from: o */
    public final Object mo574o() {
        return new float[0];
    }

    @Override // p000.e32
    /* JADX INFO: renamed from: p */
    public final void mo575p(InterfaceC0863wx interfaceC0863wx, Object obj, int i) {
        float[] fArr = (float[]) obj;
        interfaceC0863wx.getClass();
        fArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            float f = fArr[i2];
            dv2 dv2Var = (dv2) interfaceC0863wx;
            d32 d32Var = this.f2302b;
            d32Var.getClass();
            dv2Var.m1194s(d32Var, i2);
            dv2Var.mo1188m(f);
        }
    }
}
