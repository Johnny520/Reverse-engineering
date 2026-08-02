package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class t01 extends e32 {

    /* JADX INFO: renamed from: c */
    public static final t01 f10462c = new t01(f11.f2733a);

    @Override // p000.AbstractC0409l2
    /* JADX INFO: renamed from: i */
    public final int mo572i(Object obj) {
        int[] iArr = (int[]) obj;
        iArr.getClass();
        return iArr.length;
    }

    @Override // p000.AbstractC0031au, p000.AbstractC0409l2
    /* JADX INFO: renamed from: k */
    public final void mo278k(InterfaceC0826vx interfaceC0826vx, int i, Object obj) {
        s01 s01Var = (s01) obj;
        s01Var.getClass();
        int iMo4566u = interfaceC0826vx.mo4566u(this.f2302b, i);
        s01Var.mo629b(s01Var.mo630d() + 1);
        int[] iArr = s01Var.f9851a;
        int i2 = s01Var.f9852b;
        s01Var.f9852b = i2 + 1;
        iArr[i2] = iMo4566u;
    }

    @Override // p000.AbstractC0409l2
    /* JADX INFO: renamed from: l */
    public final Object mo573l(Object obj) {
        int[] iArr = (int[]) obj;
        iArr.getClass();
        s01 s01Var = new s01();
        s01Var.f9851a = iArr;
        s01Var.f9852b = iArr.length;
        s01Var.mo629b(10);
        return s01Var;
    }

    @Override // p000.e32
    /* JADX INFO: renamed from: o */
    public final Object mo574o() {
        return new int[0];
    }

    @Override // p000.e32
    /* JADX INFO: renamed from: p */
    public final void mo575p(InterfaceC0863wx interfaceC0863wx, Object obj, int i) {
        int[] iArr = (int[]) obj;
        interfaceC0863wx.getClass();
        iArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            ((dv2) interfaceC0863wx).m1196u(i2, iArr[i2], this.f2302b);
        }
    }
}
