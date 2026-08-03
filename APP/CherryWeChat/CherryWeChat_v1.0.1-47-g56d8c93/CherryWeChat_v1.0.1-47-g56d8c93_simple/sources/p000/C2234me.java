package p000;

/* JADX INFO: renamed from: me */
/* JADX INFO: loaded from: classes.dex */
public final class C2234me extends AbstractC2164ku {

    /* JADX INFO: renamed from: c */
    public static final C2234me f7876c = null;

    static {
        f7876c = new C2234me(C2277ne.f8014a);
    }

    @Override // p000.AbstractC2522t
    /* JADX INFO: renamed from: c */
    public final int mo182c(Object r1) {
        return ((double[]) r1).length;
    }

    @Override // p000.AbstractC2410qa, p000.AbstractC2522t
    /* JADX INFO: renamed from: e */
    public final void mo183e(InterfaceC0919Va r4, int r5, Object r6) {
        C2144ke r62 = (C2144ke) r6;
        double r42 = r4.mo1771k(this.f7545b, r5);
        AbstractC2072iu.m4241c(r62);
        double[] r0 = r62.f7499a;
        int r1 = r62.f7500b;
        r62.f7500b = r1 + 1;
        r0[r1] = r42;
    }

    @Override // p000.AbstractC2522t
    /* JADX INFO: renamed from: f */
    public final Object mo184f(Object r2) {
        double[] r22 = (double[]) r2;
        C2144ke r0 = new C2144ke();
        r0.f7499a = r22;
        r0.f7500b = r22.length;
        r0.mo40b(10);
        return r0;
    }

    @Override // p000.AbstractC2164ku
    /* JADX INFO: renamed from: i */
    public final Object mo185i() {
        return new double[0];
    }
}
