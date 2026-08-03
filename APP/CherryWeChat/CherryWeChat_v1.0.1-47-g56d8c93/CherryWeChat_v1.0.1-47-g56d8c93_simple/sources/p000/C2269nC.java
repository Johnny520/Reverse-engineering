package p000;

/* JADX INFO: renamed from: nC */
/* JADX INFO: loaded from: classes.dex */
public final class C2269nC extends AbstractC2164ku {

    /* JADX INFO: renamed from: c */
    public static final C2269nC f7989c = null;

    static {
        f7989c = new C2269nC(C2312oC.f8154a);
    }

    @Override // p000.AbstractC2522t
    /* JADX INFO: renamed from: c */
    public final int mo182c(Object r1) {
        return ((C2183lC) r1).f7613a.length;
    }

    @Override // p000.AbstractC2410qa, p000.AbstractC2522t
    /* JADX INFO: renamed from: e */
    public final void mo183e(InterfaceC0919Va r4, int r5, Object r6) {
        C2226mC r62 = (C2226mC) r6;
        long r42 = r4.mo1768b(this.f7545b, r5).mo841a();
        AbstractC2072iu.m4241c(r62);
        long[] r0 = r62.f7744a;
        int r1 = r62.f7745b;
        r62.f7745b = r1 + 1;
        r0[r1] = r42;
    }

    @Override // p000.AbstractC2522t
    /* JADX INFO: renamed from: f */
    public final Object mo184f(Object r2) {
        long[] r22 = ((C2183lC) r2).f7613a;
        C2226mC r0 = new C2226mC();
        r0.f7744a = r22;
        r0.f7745b = r22.length;
        r0.mo40b(10);
        return r0;
    }

    @Override // p000.AbstractC2164ku
    /* JADX INFO: renamed from: i */
    public final Object mo185i() {
        return new C2183lC(new long[0]);
    }
}
