package p000;

/* JADX INFO: renamed from: Fh */
/* JADX INFO: loaded from: classes.dex */
public final class C0239Fh extends AbstractC2164ku {

    /* JADX INFO: renamed from: c */
    public static final C0239Fh f794c = new C0239Fh(C0282Gh.f908a);

    @Override // p000.AbstractC2522t
    /* JADX INFO: renamed from: c */
    public final int mo182c(Object obj) {
        return ((float[]) obj).length;
    }

    @Override // p000.AbstractC2410qa, p000.AbstractC2522t
    /* JADX INFO: renamed from: e */
    public final void mo183e(InterfaceC0919Va interfaceC0919Va, int i, Object obj) {
        C0153Dh c0153Dh = (C0153Dh) obj;
        float fMo1773m = interfaceC0919Va.mo1773m(this.f7545b, i);
        c0153Dh.mo40b(c0153Dh.mo41d() + 1);
        float[] fArr = c0153Dh.f410a;
        int i2 = c0153Dh.f411b;
        c0153Dh.f411b = i2 + 1;
        fArr[i2] = fMo1773m;
    }

    @Override // p000.AbstractC2522t
    /* JADX INFO: renamed from: f */
    public final Object mo184f(Object obj) {
        float[] fArr = (float[]) obj;
        C0153Dh c0153Dh = new C0153Dh();
        c0153Dh.f410a = fArr;
        c0153Dh.f411b = fArr.length;
        c0153Dh.mo40b(10);
        return c0153Dh;
    }

    @Override // p000.AbstractC2164ku
    /* JADX INFO: renamed from: i */
    public final Object mo185i() {
        return new float[0];
    }
}
