package p000;

/* JADX INFO: renamed from: Cl */
/* JADX INFO: loaded from: classes.dex */
public final class C0114Cl extends AbstractC2164ku {

    /* JADX INFO: renamed from: c */
    public static final C0114Cl f274c = new C0114Cl(C0329Hl.f1129a);

    @Override // p000.AbstractC2522t
    /* JADX INFO: renamed from: c */
    public final int mo182c(Object obj) {
        return ((int[]) obj).length;
    }

    @Override // p000.AbstractC2410qa, p000.AbstractC2522t
    /* JADX INFO: renamed from: e */
    public final void mo183e(InterfaceC0919Va interfaceC0919Va, int i, Object obj) {
        C0028Al c0028Al = (C0028Al) obj;
        int iMo1780w = interfaceC0919Va.mo1780w(this.f7545b, i);
        c0028Al.mo40b(c0028Al.mo41d() + 1);
        int[] iArr = c0028Al.f61a;
        int i2 = c0028Al.f62b;
        c0028Al.f62b = i2 + 1;
        iArr[i2] = iMo1780w;
    }

    @Override // p000.AbstractC2522t
    /* JADX INFO: renamed from: f */
    public final Object mo184f(Object obj) {
        int[] iArr = (int[]) obj;
        C0028Al c0028Al = new C0028Al();
        c0028Al.f61a = iArr;
        c0028Al.f62b = iArr.length;
        c0028Al.mo40b(10);
        return c0028Al;
    }

    @Override // p000.AbstractC2164ku
    /* JADX INFO: renamed from: i */
    public final Object mo185i() {
        return new int[0];
    }
}
