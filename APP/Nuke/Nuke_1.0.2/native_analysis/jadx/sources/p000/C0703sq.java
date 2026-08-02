package p000;

/* JADX INFO: renamed from: sq */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0703sq extends e32 {

    /* JADX INFO: renamed from: c */
    public static final C0703sq f10283c = new C0703sq(C0819vq.f12122a);

    @Override // p000.AbstractC0409l2
    /* JADX INFO: renamed from: i */
    public final int mo572i(Object obj) {
        char[] cArr = (char[]) obj;
        cArr.getClass();
        return cArr.length;
    }

    @Override // p000.AbstractC0031au, p000.AbstractC0409l2
    /* JADX INFO: renamed from: k */
    public final void mo278k(InterfaceC0826vx interfaceC0826vx, int i, Object obj) {
        C0628qq c0628qq = (C0628qq) obj;
        c0628qq.getClass();
        char cMo4561l = interfaceC0826vx.mo4561l(this.f2302b, i);
        c0628qq.mo629b(c0628qq.mo630d() + 1);
        char[] cArr = c0628qq.f9085a;
        int i2 = c0628qq.f9086b;
        c0628qq.f9086b = i2 + 1;
        cArr[i2] = cMo4561l;
    }

    @Override // p000.AbstractC0409l2
    /* JADX INFO: renamed from: l */
    public final Object mo573l(Object obj) {
        char[] cArr = (char[]) obj;
        cArr.getClass();
        C0628qq c0628qq = new C0628qq();
        c0628qq.f9085a = cArr;
        c0628qq.f9086b = cArr.length;
        c0628qq.mo629b(10);
        return c0628qq;
    }

    @Override // p000.e32
    /* JADX INFO: renamed from: o */
    public final Object mo574o() {
        return new char[0];
    }

    @Override // p000.e32
    /* JADX INFO: renamed from: p */
    public final void mo575p(InterfaceC0863wx interfaceC0863wx, Object obj, int i) {
        char[] cArr = (char[]) obj;
        interfaceC0863wx.getClass();
        cArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            char c = cArr[i2];
            dv2 dv2Var = (dv2) interfaceC0863wx;
            d32 d32Var = this.f2302b;
            d32Var.getClass();
            dv2Var.m1194s(d32Var, i2);
            dv2Var.mo1190o(c);
        }
    }
}
