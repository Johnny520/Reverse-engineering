package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class g73 extends e32 {

    /* JADX INFO: renamed from: c */
    public static final g73 f3343c = new g73(h73.f3885a);

    @Override // p000.AbstractC0409l2
    /* JADX INFO: renamed from: i */
    public final int mo572i(Object obj) {
        return ((e73) obj).f2339h.length;
    }

    @Override // p000.AbstractC0031au, p000.AbstractC0409l2
    /* JADX INFO: renamed from: k */
    public final void mo278k(InterfaceC0826vx interfaceC0826vx, int i, Object obj) {
        f73 f73Var = (f73) obj;
        f73Var.getClass();
        int iMo902o = interfaceC0826vx.mo4558e(this.f2302b, i).mo902o();
        f73Var.mo629b(f73Var.mo630d() + 1);
        int[] iArr = f73Var.f2842a;
        int i2 = f73Var.f2843b;
        f73Var.f2843b = i2 + 1;
        iArr[i2] = iMo902o;
    }

    @Override // p000.AbstractC0409l2
    /* JADX INFO: renamed from: l */
    public final Object mo573l(Object obj) {
        int[] iArr = ((e73) obj).f2339h;
        f73 f73Var = new f73();
        f73Var.f2842a = iArr;
        f73Var.f2843b = iArr.length;
        f73Var.mo629b(10);
        return f73Var;
    }

    @Override // p000.e32
    /* JADX INFO: renamed from: o */
    public final Object mo574o() {
        return new e73(new int[0]);
    }

    @Override // p000.e32
    /* JADX INFO: renamed from: p */
    public final void mo575p(InterfaceC0863wx interfaceC0863wx, Object obj, int i) {
        int[] iArr = ((e73) obj).f2339h;
        interfaceC0863wx.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            ((dv2) interfaceC0863wx).m1195t(this.f2302b, i2).mo1187l(iArr[i2]);
        }
    }
}
