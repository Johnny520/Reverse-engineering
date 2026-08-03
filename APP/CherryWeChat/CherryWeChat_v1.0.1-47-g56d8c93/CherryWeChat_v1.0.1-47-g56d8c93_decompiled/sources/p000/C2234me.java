package p000;

/* JADX INFO: renamed from: me */
/* JADX INFO: loaded from: classes.dex */
public final class C2234me extends AbstractC2164ku {

    /* JADX INFO: renamed from: c */
    public static final C2234me f7876c = new C2234me(C2277ne.f8014a);

    @Override // p000.AbstractC2522t
    /* JADX INFO: renamed from: c */
    public final int mo182c(Object obj) {
        return ((double[]) obj).length;
    }

    @Override // p000.AbstractC2410qa, p000.AbstractC2522t
    /* JADX INFO: renamed from: e */
    public final void mo183e(InterfaceC0919Va interfaceC0919Va, int i, Object obj) {
        C2144ke c2144ke = (C2144ke) obj;
        double dMo1771k = interfaceC0919Va.mo1771k(this.f7545b, i);
        c2144ke.mo40b(c2144ke.mo41d() + 1);
        double[] dArr = c2144ke.f7499a;
        int i2 = c2144ke.f7500b;
        c2144ke.f7500b = i2 + 1;
        dArr[i2] = dMo1771k;
    }

    @Override // p000.AbstractC2522t
    /* JADX INFO: renamed from: f */
    public final Object mo184f(Object obj) {
        double[] dArr = (double[]) obj;
        C2144ke c2144ke = new C2144ke();
        c2144ke.f7499a = dArr;
        c2144ke.f7500b = dArr.length;
        c2144ke.mo40b(10);
        return c2144ke;
    }

    @Override // p000.AbstractC2164ku
    /* JADX INFO: renamed from: i */
    public final Object mo185i() {
        return new double[0];
    }
}
