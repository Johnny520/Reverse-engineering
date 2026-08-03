package p000;

/* JADX INFO: renamed from: sC */
/* JADX INFO: loaded from: classes.dex */
public final class C2492sC extends AbstractC2164ku {

    /* JADX INFO: renamed from: c */
    public static final C2492sC f8755c = new C2492sC(C2535tC.f8840a);

    @Override // p000.AbstractC2522t
    /* JADX INFO: renamed from: c */
    public final int mo182c(Object obj) {
        return ((C2406qC) obj).f8440a.length;
    }

    @Override // p000.AbstractC2410qa, p000.AbstractC2522t
    /* JADX INFO: renamed from: e */
    public final void mo183e(InterfaceC0919Va interfaceC0919Va, int i, Object obj) {
        C2449rC c2449rC = (C2449rC) obj;
        short sMo849x = interfaceC0919Va.mo1768b(this.f7545b, i).mo849x();
        c2449rC.mo40b(c2449rC.mo41d() + 1);
        short[] sArr = c2449rC.f8576a;
        int i2 = c2449rC.f8577b;
        c2449rC.f8577b = i2 + 1;
        sArr[i2] = sMo849x;
    }

    @Override // p000.AbstractC2522t
    /* JADX INFO: renamed from: f */
    public final Object mo184f(Object obj) {
        short[] sArr = ((C2406qC) obj).f8440a;
        C2449rC c2449rC = new C2449rC();
        c2449rC.f8576a = sArr;
        c2449rC.f8577b = sArr.length;
        c2449rC.mo40b(10);
        return c2449rC;
    }

    @Override // p000.AbstractC2164ku
    /* JADX INFO: renamed from: i */
    public final Object mo185i() {
        return new C2406qC(new short[0]);
    }
}
