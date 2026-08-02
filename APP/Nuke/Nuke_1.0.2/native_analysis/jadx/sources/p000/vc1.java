package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class vc1 extends e32 {

    /* JADX INFO: renamed from: c */
    public static final vc1 f11900c = new vc1(ed1.f2399a);

    @Override // p000.AbstractC0409l2
    /* JADX INFO: renamed from: i */
    public final int mo572i(Object obj) {
        long[] jArr = (long[]) obj;
        jArr.getClass();
        return jArr.length;
    }

    @Override // p000.AbstractC0031au, p000.AbstractC0409l2
    /* JADX INFO: renamed from: k */
    public final void mo278k(InterfaceC0826vx interfaceC0826vx, int i, Object obj) {
        uc1 uc1Var = (uc1) obj;
        uc1Var.getClass();
        long jMo4568z = interfaceC0826vx.mo4568z(this.f2302b, i);
        uc1Var.mo629b(uc1Var.mo630d() + 1);
        long[] jArr = uc1Var.f11228a;
        int i2 = uc1Var.f11229b;
        uc1Var.f11229b = i2 + 1;
        jArr[i2] = jMo4568z;
    }

    @Override // p000.AbstractC0409l2
    /* JADX INFO: renamed from: l */
    public final Object mo573l(Object obj) {
        long[] jArr = (long[]) obj;
        jArr.getClass();
        uc1 uc1Var = new uc1();
        uc1Var.f11228a = jArr;
        uc1Var.f11229b = jArr.length;
        uc1Var.mo629b(10);
        return uc1Var;
    }

    @Override // p000.e32
    /* JADX INFO: renamed from: o */
    public final Object mo574o() {
        return new long[0];
    }

    @Override // p000.e32
    /* JADX INFO: renamed from: p */
    public final void mo575p(InterfaceC0863wx interfaceC0863wx, Object obj, int i) {
        long[] jArr = (long[]) obj;
        interfaceC0863wx.getClass();
        jArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            ((dv2) interfaceC0863wx).m1197v(this.f2302b, i2, jArr[i2]);
        }
    }
}
