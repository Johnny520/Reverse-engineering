package p000;

/* JADX INFO: renamed from: iC */
/* JADX INFO: loaded from: classes.dex */
public final class C1534iC extends AbstractC2164ku {

    /* JADX INFO: renamed from: c */
    public static final C1534iC f5417c = new C1534iC(C2091jC.f7362a);

    @Override // p000.AbstractC2522t
    /* JADX INFO: renamed from: c */
    public final int mo182c(Object obj) {
        return ((C1446gC) obj).f5055a.length;
    }

    @Override // p000.AbstractC2410qa, p000.AbstractC2522t
    /* JADX INFO: renamed from: e */
    public final void mo183e(InterfaceC0919Va interfaceC0919Va, int i, Object obj) {
        C1490hC c1490hC = (C1490hC) obj;
        int iMo846p = interfaceC0919Va.mo1768b(this.f7545b, i).mo846p();
        c1490hC.mo40b(c1490hC.mo41d() + 1);
        int[] iArr = c1490hC.f5261a;
        int i2 = c1490hC.f5262b;
        c1490hC.f5262b = i2 + 1;
        iArr[i2] = iMo846p;
    }

    @Override // p000.AbstractC2522t
    /* JADX INFO: renamed from: f */
    public final Object mo184f(Object obj) {
        int[] iArr = ((C1446gC) obj).f5055a;
        C1490hC c1490hC = new C1490hC();
        c1490hC.f5261a = iArr;
        c1490hC.f5262b = iArr.length;
        c1490hC.mo40b(10);
        return c1490hC;
    }

    @Override // p000.AbstractC2164ku
    /* JADX INFO: renamed from: i */
    public final Object mo185i() {
        return new C1446gC(new int[0]);
    }
}
