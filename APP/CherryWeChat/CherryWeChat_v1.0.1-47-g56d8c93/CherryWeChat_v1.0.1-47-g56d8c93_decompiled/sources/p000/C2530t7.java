package p000;

/* JADX INFO: renamed from: t7 */
/* JADX INFO: loaded from: classes.dex */
public final class C2530t7 extends AbstractC2164ku {

    /* JADX INFO: renamed from: c */
    public static final C2530t7 f8829c = new C2530t7(C2616v7.f9071a);

    @Override // p000.AbstractC2522t
    /* JADX INFO: renamed from: c */
    public final int mo182c(Object obj) {
        return ((char[]) obj).length;
    }

    @Override // p000.AbstractC2410qa, p000.AbstractC2522t
    /* JADX INFO: renamed from: e */
    public final void mo183e(InterfaceC0919Va interfaceC0919Va, int i, Object obj) {
        C2487s7 c2487s7 = (C2487s7) obj;
        char cMo1772l = interfaceC0919Va.mo1772l(this.f7545b, i);
        c2487s7.mo40b(c2487s7.mo41d() + 1);
        char[] cArr = c2487s7.f8747a;
        int i2 = c2487s7.f8748b;
        c2487s7.f8748b = i2 + 1;
        cArr[i2] = cMo1772l;
    }

    @Override // p000.AbstractC2522t
    /* JADX INFO: renamed from: f */
    public final Object mo184f(Object obj) {
        char[] cArr = (char[]) obj;
        C2487s7 c2487s7 = new C2487s7();
        c2487s7.f8747a = cArr;
        c2487s7.f8748b = cArr.length;
        c2487s7.mo40b(10);
        return c2487s7;
    }

    @Override // p000.AbstractC2164ku
    /* JADX INFO: renamed from: i */
    public final Object mo185i() {
        return new char[0];
    }
}
