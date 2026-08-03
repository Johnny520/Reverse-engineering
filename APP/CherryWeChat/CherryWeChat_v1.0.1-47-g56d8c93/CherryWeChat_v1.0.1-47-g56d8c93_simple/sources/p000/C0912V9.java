package p000;

/* JADX INFO: renamed from: V9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0912V9 implements InterfaceC1416fj {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2840a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2414qe f2841b;

    public /* synthetic */ C0912V9(C2414qe r1, int r2) {
        this.f2840a = r2;
        this.f2841b = r1;
    }

    @Override // p000.InterfaceC1416fj
    /* JADX INFO: renamed from: g */
    public final Object mo90g(Object r7) {
        int r0 = this.f2840a;
        C0829TC r1 = C0829TC.f2620a;
        C2414qe r2 = this.f2841b;
        int r72 = ((Integer) r7).intValue();
        switch(r0) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        C1498hd r02 = AbstractC1499he.f5282a;
        AbstractC0585Nj.m1128G(AbstractC0671Pj.m1343a(AbstractC1106Zp.f3500a), new C2170l(r2, r72, null, 1), 3);
        return r1;
    L6:
        r2.m4857b((r72 * 95) / 100);
        return r1;
    }
}
