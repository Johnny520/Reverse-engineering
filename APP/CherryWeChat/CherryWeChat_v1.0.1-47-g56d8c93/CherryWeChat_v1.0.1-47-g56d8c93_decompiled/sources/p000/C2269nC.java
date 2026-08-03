package p000;

/* JADX INFO: renamed from: nC */
/* JADX INFO: loaded from: classes.dex */
public final class C2269nC extends AbstractC2164ku {

    /* JADX INFO: renamed from: c */
    public static final C2269nC f7989c = new C2269nC(C2312oC.f8154a);

    @Override // p000.AbstractC2522t
    /* JADX INFO: renamed from: c */
    public final int mo182c(Object obj) {
        return ((C2183lC) obj).f7613a.length;
    }

    @Override // p000.AbstractC2410qa, p000.AbstractC2522t
    /* JADX INFO: renamed from: e */
    public final void mo183e(InterfaceC0919Va interfaceC0919Va, int i, Object obj) {
        C2226mC c2226mC = (C2226mC) obj;
        long jMo841a = interfaceC0919Va.mo1768b(this.f7545b, i).mo841a();
        c2226mC.mo40b(c2226mC.mo41d() + 1);
        long[] jArr = c2226mC.f7744a;
        int i2 = c2226mC.f7745b;
        c2226mC.f7745b = i2 + 1;
        jArr[i2] = jMo841a;
    }

    @Override // p000.AbstractC2522t
    /* JADX INFO: renamed from: f */
    public final Object mo184f(Object obj) {
        long[] jArr = ((C2183lC) obj).f7613a;
        C2226mC c2226mC = new C2226mC();
        c2226mC.f7744a = jArr;
        c2226mC.f7745b = jArr.length;
        c2226mC.mo40b(10);
        return c2226mC;
    }

    @Override // p000.AbstractC2164ku
    /* JADX INFO: renamed from: i */
    public final Object mo185i() {
        return new C2183lC(new long[0]);
    }
}
