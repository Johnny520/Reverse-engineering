package p000;

/* JADX INFO: renamed from: qp */
/* JADX INFO: loaded from: classes.dex */
public final class C2425qp extends AbstractC2164ku {

    /* JADX INFO: renamed from: c */
    public static final C2425qp f8487c = new C2425qp(C2597up.f8972a);

    @Override // p000.AbstractC2522t
    /* JADX INFO: renamed from: c */
    public final int mo182c(Object obj) {
        return ((long[]) obj).length;
    }

    @Override // p000.AbstractC2410qa, p000.AbstractC2522t
    /* JADX INFO: renamed from: e */
    public final void mo183e(InterfaceC0919Va interfaceC0919Va, int i, Object obj) {
        C2331op c2331op = (C2331op) obj;
        long jMo1767A = interfaceC0919Va.mo1767A(this.f7545b, i);
        c2331op.mo40b(c2331op.mo41d() + 1);
        long[] jArr = c2331op.f8178a;
        int i2 = c2331op.f8179b;
        c2331op.f8179b = i2 + 1;
        jArr[i2] = jMo1767A;
    }

    @Override // p000.AbstractC2522t
    /* JADX INFO: renamed from: f */
    public final Object mo184f(Object obj) {
        long[] jArr = (long[]) obj;
        C2331op c2331op = new C2331op();
        c2331op.f8178a = jArr;
        c2331op.f8179b = jArr.length;
        c2331op.mo40b(10);
        return c2331op;
    }

    @Override // p000.AbstractC2164ku
    /* JADX INFO: renamed from: i */
    public final Object mo185i() {
        return new long[0];
    }
}
