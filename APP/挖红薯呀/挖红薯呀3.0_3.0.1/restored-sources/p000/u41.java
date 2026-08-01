package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class u41 extends c50 implements InterfaceC0904ww {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ x41 f6130d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ pe0 f6131e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ InterfaceC0904ww f6132f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f6133g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u41(x41 x41Var, pe0 pe0Var, InterfaceC0904ww interfaceC0904ww, int i) {
        super(2);
        this.f6130d = x41Var;
        this.f6131e = pe0Var;
        this.f6132f = interfaceC0904ww;
        this.f6133g = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0904ww
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iM1649A = j50.m1649A(this.f6133g | 1);
        AbstractC0307i4.m1531g(this.f6130d, this.f6131e, this.f6132f, (InterfaceC0356ji) obj, iM1649A);
        return na1.f4229a;
    }
}
