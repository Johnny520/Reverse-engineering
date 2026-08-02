package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class qq2 extends e32 {

    /* JADX INFO: renamed from: c */
    public static final qq2 f9105c = new qq2(rq2.f9709a);

    @Override // p000.AbstractC0409l2
    /* JADX INFO: renamed from: i */
    public final int mo572i(Object obj) {
        short[] sArr = (short[]) obj;
        sArr.getClass();
        return sArr.length;
    }

    @Override // p000.AbstractC0031au, p000.AbstractC0409l2
    /* JADX INFO: renamed from: k */
    public final void mo278k(InterfaceC0826vx interfaceC0826vx, int i, Object obj) {
        pq2 pq2Var = (pq2) obj;
        pq2Var.getClass();
        short sMo4564p = interfaceC0826vx.mo4564p(this.f2302b, i);
        pq2Var.mo629b(pq2Var.mo630d() + 1);
        short[] sArr = pq2Var.f8483a;
        int i2 = pq2Var.f8484b;
        pq2Var.f8484b = i2 + 1;
        sArr[i2] = sMo4564p;
    }

    @Override // p000.AbstractC0409l2
    /* JADX INFO: renamed from: l */
    public final Object mo573l(Object obj) {
        short[] sArr = (short[]) obj;
        sArr.getClass();
        pq2 pq2Var = new pq2();
        pq2Var.f8483a = sArr;
        pq2Var.f8484b = sArr.length;
        pq2Var.mo629b(10);
        return pq2Var;
    }

    @Override // p000.e32
    /* JADX INFO: renamed from: o */
    public final Object mo574o() {
        return new short[0];
    }

    @Override // p000.e32
    /* JADX INFO: renamed from: p */
    public final void mo575p(InterfaceC0863wx interfaceC0863wx, Object obj, int i) {
        short[] sArr = (short[]) obj;
        interfaceC0863wx.getClass();
        sArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            short s = sArr[i2];
            dv2 dv2Var = (dv2) interfaceC0863wx;
            d32 d32Var = this.f2302b;
            d32Var.getClass();
            dv2Var.m1194s(d32Var, i2);
            dv2Var.mo1182g(s);
        }
    }
}
