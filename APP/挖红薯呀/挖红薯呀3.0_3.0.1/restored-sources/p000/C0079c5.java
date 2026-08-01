package p000;

/* JADX INFO: renamed from: c5 */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0079c5 extends c50 implements InterfaceC0904ww {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ pe0 f692d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ InterfaceC0904ww f693e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f694f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0079c5(pe0 pe0Var, InterfaceC0904ww interfaceC0904ww, int i) {
        super(2);
        this.f692d = pe0Var;
        this.f693e = interfaceC0904ww;
        this.f694f = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0904ww
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iM1649A = j50.m1649A(this.f694f | 1);
        AbstractC0307i4.m1532h(this.f692d, this.f693e, (InterfaceC0356ji) obj, iM1649A);
        return na1.f4229a;
    }
}
