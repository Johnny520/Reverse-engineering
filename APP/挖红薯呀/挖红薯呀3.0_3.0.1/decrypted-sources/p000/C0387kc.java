package p000;

/* JADX INFO: renamed from: kc */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0387kc implements InterfaceC0904ww {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ long f3072d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ jn0 f3073e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ InterfaceC0941xw f3074f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0387kc(long j, jn0 jn0Var, InterfaceC0941xw interfaceC0941xw) {
        this.f3072d = j;
        this.f3073e = jn0Var;
        this.f3074f = interfaceC0941xw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0904ww
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC0356ji interfaceC0356ji = (InterfaceC0356ji) obj;
        int iIntValue = ((Number) obj2).intValue();
        int i = 0;
        C0616pi c0616pi = (C0616pi) interfaceC0356ji;
        if (c0616pi.m3082O(iIntValue & 1, (iIntValue & 3) != 2)) {
            r60.m3401c(this.f3072d, ((da1) c0616pi.m3112j(fa1.f1646a)).f1028m, AbstractC0398kl.m1937w(417635459, new C0350jc(i, this.f3073e, this.f3074f), c0616pi), c0616pi, 384);
        } else {
            c0616pi.m3085R();
        }
        return na1.f4229a;
    }
}
