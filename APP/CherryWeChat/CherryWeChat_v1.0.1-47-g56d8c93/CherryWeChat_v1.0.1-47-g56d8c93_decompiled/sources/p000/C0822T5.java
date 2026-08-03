package p000;

/* JADX INFO: renamed from: T5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0822T5 extends AbstractC2164ku {

    /* JADX INFO: renamed from: c */
    public static final C0822T5 f2594c = new C0822T5(C0865U5.f2734a);

    @Override // p000.AbstractC2522t
    /* JADX INFO: renamed from: c */
    public final int mo182c(Object obj) {
        return ((boolean[]) obj).length;
    }

    @Override // p000.AbstractC2410qa, p000.AbstractC2522t
    /* JADX INFO: renamed from: e */
    public final void mo183e(InterfaceC0919Va interfaceC0919Va, int i, Object obj) {
        C0736R5 c0736r5 = (C0736R5) obj;
        boolean zMo1778s = interfaceC0919Va.mo1778s(this.f7545b, i);
        c0736r5.mo40b(c0736r5.mo41d() + 1);
        boolean[] zArr = c0736r5.f2348a;
        int i2 = c0736r5.f2349b;
        c0736r5.f2349b = i2 + 1;
        zArr[i2] = zMo1778s;
    }

    @Override // p000.AbstractC2522t
    /* JADX INFO: renamed from: f */
    public final Object mo184f(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        C0736R5 c0736r5 = new C0736R5();
        c0736r5.f2348a = zArr;
        c0736r5.f2349b = zArr.length;
        c0736r5.mo40b(10);
        return c0736r5;
    }

    @Override // p000.AbstractC2164ku
    /* JADX INFO: renamed from: i */
    public final Object mo185i() {
        return new boolean[0];
    }
}
