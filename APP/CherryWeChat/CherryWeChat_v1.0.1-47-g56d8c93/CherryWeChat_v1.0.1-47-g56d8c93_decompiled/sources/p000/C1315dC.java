package p000;

/* JADX INFO: renamed from: dC */
/* JADX INFO: loaded from: classes.dex */
public final class C1315dC extends AbstractC2164ku {

    /* JADX INFO: renamed from: c */
    public static final C1315dC f4774c = new C1315dC(C1358eC.f4859a);

    @Override // p000.AbstractC2522t
    /* JADX INFO: renamed from: c */
    public final int mo182c(Object obj) {
        return ((C1210bC) obj).f4141a.length;
    }

    @Override // p000.AbstractC2410qa, p000.AbstractC2522t
    /* JADX INFO: renamed from: e */
    public final void mo183e(InterfaceC0919Va interfaceC0919Va, int i, Object obj) {
        C1253cC c1253cC = (C1253cC) obj;
        byte bMo847t = interfaceC0919Va.mo1768b(this.f7545b, i).mo847t();
        c1253cC.mo40b(c1253cC.mo41d() + 1);
        byte[] bArr = c1253cC.f4253a;
        int i2 = c1253cC.f4254b;
        c1253cC.f4254b = i2 + 1;
        bArr[i2] = bMo847t;
    }

    @Override // p000.AbstractC2522t
    /* JADX INFO: renamed from: f */
    public final Object mo184f(Object obj) {
        byte[] bArr = ((C1210bC) obj).f4141a;
        C1253cC c1253cC = new C1253cC();
        c1253cC.f4253a = bArr;
        c1253cC.f4254b = bArr.length;
        c1253cC.mo40b(10);
        return c1253cC;
    }

    @Override // p000.AbstractC2164ku
    /* JADX INFO: renamed from: i */
    public final Object mo185i() {
        return new C1210bC(new byte[0]);
    }
}
