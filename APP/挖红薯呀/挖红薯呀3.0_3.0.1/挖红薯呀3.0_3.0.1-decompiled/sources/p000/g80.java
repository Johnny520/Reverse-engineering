package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class g80 implements f80 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0399km f1886a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f1887b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public g80(C0399km c0399km, boolean z) {
        this.f1886a = c0399km;
        this.f1887b = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.f80
    /* JADX INFO: renamed from: a */
    public final int mo1049a() {
        C0399km c0399km = this.f1886a;
        return (int) (c0399km.m2038m().f7941e == um0.f6264d ? c0399km.m2038m().m5599g() & 4294967295L : c0399km.m2038m().m5599g() >> 32);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.f80
    /* JADX INFO: renamed from: b */
    public final float mo1050b() {
        return j50.m1661k(this.f1886a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.f80
    /* JADX INFO: renamed from: c */
    public final C0923xe mo1051c() {
        boolean z = this.f1887b;
        C0399km c0399km = this.f1886a;
        return z ? new C0923xe(c0399km.mo1941n(), 1) : new C0923xe(1, c0399km.mo1941n());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.f80
    /* JADX INFO: renamed from: d */
    public final Object mo1052d(int i, l80 l80Var) {
        C0399km c0399km = this.f1886a;
        Object objMo503d = c0399km.mo503d(vh0.f6718d, new l80(c0399km, i, null, 1), l80Var);
        na1 na1Var = na1.f4229a;
        EnumC1007zk enumC1007zk = EnumC1007zk.f7916d;
        if (objMo503d != enumC1007zk) {
            objMo503d = na1Var;
        }
        return objMo503d == enumC1007zk ? objMo503d : na1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.f80
    /* JADX INFO: renamed from: e */
    public final int mo1053e() {
        C0399km c0399km = this.f1886a;
        return (-c0399km.m2038m().f7942f) + c0399km.m2038m().f7940d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.f80
    /* JADX INFO: renamed from: f */
    public final float mo1054f() {
        C0399km c0399km = this.f1886a;
        return oo0.m2938a(c0399km.m2038m(), c0399km.mo1941n());
    }
}
