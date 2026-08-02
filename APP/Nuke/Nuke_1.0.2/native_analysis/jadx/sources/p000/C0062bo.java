package p000;

/* JADX INFO: renamed from: bo */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0062bo extends e32 {

    /* JADX INFO: renamed from: c */
    public static final C0062bo f955c = new C0062bo(C0468mo.f6733a);

    @Override // p000.AbstractC0409l2
    /* JADX INFO: renamed from: i */
    public final int mo572i(Object obj) {
        byte[] bArr = (byte[]) obj;
        bArr.getClass();
        return bArr.length;
    }

    @Override // p000.AbstractC0031au, p000.AbstractC0409l2
    /* JADX INFO: renamed from: k */
    public final void mo278k(InterfaceC0826vx interfaceC0826vx, int i, Object obj) {
        C0968zn c0968zn = (C0968zn) obj;
        c0968zn.getClass();
        byte bMo4562m = interfaceC0826vx.mo4562m(this.f2302b, i);
        c0968zn.mo629b(c0968zn.mo630d() + 1);
        byte[] bArr = c0968zn.f13959a;
        int i2 = c0968zn.f13960b;
        c0968zn.f13960b = i2 + 1;
        bArr[i2] = bMo4562m;
    }

    @Override // p000.AbstractC0409l2
    /* JADX INFO: renamed from: l */
    public final Object mo573l(Object obj) {
        byte[] bArr = (byte[]) obj;
        bArr.getClass();
        C0968zn c0968zn = new C0968zn();
        c0968zn.f13959a = bArr;
        c0968zn.f13960b = bArr.length;
        c0968zn.mo629b(10);
        return c0968zn;
    }

    @Override // p000.e32
    /* JADX INFO: renamed from: o */
    public final Object mo574o() {
        return new byte[0];
    }

    @Override // p000.e32
    /* JADX INFO: renamed from: p */
    public final void mo575p(InterfaceC0863wx interfaceC0863wx, Object obj, int i) {
        byte[] bArr = (byte[]) obj;
        interfaceC0863wx.getClass();
        bArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            byte b = bArr[i2];
            dv2 dv2Var = (dv2) interfaceC0863wx;
            d32 d32Var = this.f2302b;
            d32Var.getClass();
            dv2Var.m1194s(d32Var, i2);
            dv2Var.mo1184i(b);
        }
    }
}
