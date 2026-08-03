package p000;

/* JADX INFO: renamed from: V9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0912V9 implements InterfaceC1416fj {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2840a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2414qe f2841b;

    public /* synthetic */ C0912V9(C2414qe c2414qe, int i) {
        this.f2840a = i;
        this.f2841b = c2414qe;
    }

    @Override // p000.InterfaceC1416fj
    /* JADX INFO: renamed from: g */
    public final Object mo90g(Object obj) {
        int i = this.f2840a;
        C0829TC c0829tc = C0829TC.f2620a;
        C2414qe c2414qe = this.f2841b;
        int iIntValue = ((Integer) obj).intValue();
        switch (i) {
            case 0:
                c2414qe.m4857b((iIntValue * 95) / 100);
                break;
            default:
                C1498hd c1498hd = AbstractC1499he.f5282a;
                AbstractC0585Nj.m1128G(AbstractC0671Pj.m1343a(AbstractC1106Zp.f3500a), new C2170l(c2414qe, iIntValue, null, 1), 3);
                break;
        }
        return c0829tc;
    }
}
