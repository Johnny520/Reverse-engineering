package p000;

/* JADX INFO: renamed from: kl */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0391kl extends e32 {

    /* JADX INFO: renamed from: c */
    public static final C0391kl f5625c = new C0391kl(C0428ll.f6184a);

    @Override // p000.AbstractC0409l2
    /* JADX INFO: renamed from: i */
    public final int mo572i(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        zArr.getClass();
        return zArr.length;
    }

    @Override // p000.AbstractC0031au, p000.AbstractC0409l2
    /* JADX INFO: renamed from: k */
    public final void mo278k(InterfaceC0826vx interfaceC0826vx, int i, Object obj) {
        C0354jl c0354jl = (C0354jl) obj;
        c0354jl.getClass();
        boolean zMo4565q = interfaceC0826vx.mo4565q(this.f2302b, i);
        c0354jl.mo629b(c0354jl.mo630d() + 1);
        boolean[] zArr = c0354jl.f5093a;
        int i2 = c0354jl.f5094b;
        c0354jl.f5094b = i2 + 1;
        zArr[i2] = zMo4565q;
    }

    @Override // p000.AbstractC0409l2
    /* JADX INFO: renamed from: l */
    public final Object mo573l(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        zArr.getClass();
        C0354jl c0354jl = new C0354jl();
        c0354jl.f5093a = zArr;
        c0354jl.f5094b = zArr.length;
        c0354jl.mo629b(10);
        return c0354jl;
    }

    @Override // p000.e32
    /* JADX INFO: renamed from: o */
    public final Object mo574o() {
        return new boolean[0];
    }

    @Override // p000.e32
    /* JADX INFO: renamed from: p */
    public final void mo575p(InterfaceC0863wx interfaceC0863wx, Object obj, int i) {
        boolean[] zArr = (boolean[]) obj;
        interfaceC0863wx.getClass();
        zArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            ((dv2) interfaceC0863wx).m1193r(this.f2302b, i2, zArr[i2]);
        }
    }
}
