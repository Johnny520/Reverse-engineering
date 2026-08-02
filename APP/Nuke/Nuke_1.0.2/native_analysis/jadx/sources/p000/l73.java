package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class l73 extends e32 {

    /* JADX INFO: renamed from: c */
    public static final l73 f5975c = new l73(m73.f6503a);

    @Override // p000.AbstractC0409l2
    /* JADX INFO: renamed from: i */
    public final int mo572i(Object obj) {
        return ((j73) obj).f4909h.length;
    }

    @Override // p000.AbstractC0031au, p000.AbstractC0409l2
    /* JADX INFO: renamed from: k */
    public final void mo278k(InterfaceC0826vx interfaceC0826vx, int i, Object obj) {
        k73 k73Var = (k73) obj;
        k73Var.getClass();
        long jMo897d = interfaceC0826vx.mo4558e(this.f2302b, i).mo897d();
        k73Var.mo629b(k73Var.mo630d() + 1);
        long[] jArr = k73Var.f5378a;
        int i2 = k73Var.f5379b;
        k73Var.f5379b = i2 + 1;
        jArr[i2] = jMo897d;
    }

    @Override // p000.AbstractC0409l2
    /* JADX INFO: renamed from: l */
    public final Object mo573l(Object obj) {
        long[] jArr = ((j73) obj).f4909h;
        k73 k73Var = new k73();
        k73Var.f5378a = jArr;
        k73Var.f5379b = jArr.length;
        k73Var.mo629b(10);
        return k73Var;
    }

    @Override // p000.e32
    /* JADX INFO: renamed from: o */
    public final Object mo574o() {
        return new j73(new long[0]);
    }

    @Override // p000.e32
    /* JADX INFO: renamed from: p */
    public final void mo575p(InterfaceC0863wx interfaceC0863wx, Object obj, int i) {
        long[] jArr = ((j73) obj).f4909h;
        interfaceC0863wx.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            ((dv2) interfaceC0863wx).m1195t(this.f2302b, i2).mo1189n(jArr[i2]);
        }
    }
}
