package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class q73 extends e32 {

    /* JADX INFO: renamed from: c */
    public static final q73 f8814c = new q73(r73.f9421a);

    @Override // p000.AbstractC0409l2
    /* JADX INFO: renamed from: i */
    public final int mo572i(Object obj) {
        return ((o73) obj).f7575h.length;
    }

    @Override // p000.AbstractC0031au, p000.AbstractC0409l2
    /* JADX INFO: renamed from: k */
    public final void mo278k(InterfaceC0826vx interfaceC0826vx, int i, Object obj) {
        p73 p73Var = (p73) obj;
        p73Var.getClass();
        short sMo908v = interfaceC0826vx.mo4558e(this.f2302b, i).mo908v();
        p73Var.mo629b(p73Var.mo630d() + 1);
        short[] sArr = p73Var.f8016a;
        int i2 = p73Var.f8017b;
        p73Var.f8017b = i2 + 1;
        sArr[i2] = sMo908v;
    }

    @Override // p000.AbstractC0409l2
    /* JADX INFO: renamed from: l */
    public final Object mo573l(Object obj) {
        short[] sArr = ((o73) obj).f7575h;
        p73 p73Var = new p73();
        p73Var.f8016a = sArr;
        p73Var.f8017b = sArr.length;
        p73Var.mo629b(10);
        return p73Var;
    }

    @Override // p000.e32
    /* JADX INFO: renamed from: o */
    public final Object mo574o() {
        return new o73(new short[0]);
    }

    @Override // p000.e32
    /* JADX INFO: renamed from: p */
    public final void mo575p(InterfaceC0863wx interfaceC0863wx, Object obj, int i) {
        short[] sArr = ((o73) obj).f7575h;
        interfaceC0863wx.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            ((dv2) interfaceC0863wx).m1195t(this.f2302b, i2).mo1182g(sArr[i2]);
        }
    }
}
