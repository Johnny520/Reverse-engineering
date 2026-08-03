package p000;

/* JADX INFO: renamed from: qp */
/* JADX INFO: loaded from: classes.dex */
public final class C2425qp extends AbstractC2164ku {

    /* JADX INFO: renamed from: c */
    public static final C2425qp f8487c = null;

    static {
        f8487c = new C2425qp(C2597up.f8972a);
    }

    @Override // p000.AbstractC2522t
    /* JADX INFO: renamed from: c */
    public final int mo182c(Object r1) {
        return ((long[]) r1).length;
    }

    @Override // p000.AbstractC2410qa, p000.AbstractC2522t
    /* JADX INFO: renamed from: e */
    public final void mo183e(InterfaceC0919Va r4, int r5, Object r6) {
        C2331op r62 = (C2331op) r6;
        long r42 = r4.mo1767A(this.f7545b, r5);
        AbstractC2072iu.m4241c(r62);
        long[] r0 = r62.f8178a;
        int r1 = r62.f8179b;
        r62.f8179b = r1 + 1;
        r0[r1] = r42;
    }

    @Override // p000.AbstractC2522t
    /* JADX INFO: renamed from: f */
    public final Object mo184f(Object r2) {
        long[] r22 = (long[]) r2;
        C2331op r0 = new C2331op();
        r0.f8178a = r22;
        r0.f8179b = r22.length;
        r0.mo40b(10);
        return r0;
    }

    @Override // p000.AbstractC2164ku
    /* JADX INFO: renamed from: i */
    public final Object mo185i() {
        return new long[0];
    }
}
