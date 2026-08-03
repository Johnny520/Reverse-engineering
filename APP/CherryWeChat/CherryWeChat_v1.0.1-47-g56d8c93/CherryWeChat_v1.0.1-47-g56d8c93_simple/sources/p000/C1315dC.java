package p000;

/* JADX INFO: renamed from: dC */
/* JADX INFO: loaded from: classes.dex */
public final class C1315dC extends AbstractC2164ku {

    /* JADX INFO: renamed from: c */
    public static final C1315dC f4774c = null;

    static {
        f4774c = new C1315dC(C1358eC.f4859a);
    }

    @Override // p000.AbstractC2522t
    /* JADX INFO: renamed from: c */
    public final int mo182c(Object r1) {
        return ((C1210bC) r1).f4141a.length;
    }

    @Override // p000.AbstractC2410qa, p000.AbstractC2522t
    /* JADX INFO: renamed from: e */
    public final void mo183e(InterfaceC0919Va r3, int r4, Object r5) {
        C1253cC r52 = (C1253cC) r5;
        byte r32 = r3.mo1768b(this.f7545b, r4).mo847t();
        AbstractC2072iu.m4241c(r52);
        byte[] r42 = r52.f4253a;
        int r0 = r52.f4254b;
        r52.f4254b = r0 + 1;
        r42[r0] = r32;
    }

    @Override // p000.AbstractC2522t
    /* JADX INFO: renamed from: f */
    public final Object mo184f(Object r2) {
        byte[] r22 = ((C1210bC) r2).f4141a;
        C1253cC r0 = new C1253cC();
        r0.f4253a = r22;
        r0.f4254b = r22.length;
        r0.mo40b(10);
        return r0;
    }

    @Override // p000.AbstractC2164ku
    /* JADX INFO: renamed from: i */
    public final Object mo185i() {
        return new C1210bC(new byte[0]);
    }
}
