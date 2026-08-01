package p000;

/* JADX INFO: renamed from: l2 */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0416l2 implements InterfaceC0904ww {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ InterfaceC0904ww f3313d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ InterfaceC0904ww f3314e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ x01 f3315f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ long f3316g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ long f3317h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ long f3318i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ long f3319j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ InterfaceC0904ww f3320k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ C0474mh f3321l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0416l2(InterfaceC0904ww interfaceC0904ww, InterfaceC0904ww interfaceC0904ww2, x01 x01Var, long j, long j2, long j3, long j4, InterfaceC0904ww interfaceC0904ww3, C0474mh c0474mh) {
        this.f3313d = interfaceC0904ww;
        this.f3314e = interfaceC0904ww2;
        this.f3315f = x01Var;
        this.f3316g = j;
        this.f3317h = j2;
        this.f3318i = j3;
        this.f3319j = j4;
        this.f3320k = interfaceC0904ww3;
        this.f3321l = c0474mh;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0904ww
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC0356ji interfaceC0356ji = (InterfaceC0356ji) obj;
        int iIntValue = ((Number) obj2).intValue();
        int i = 1;
        C0616pi c0616pi = (C0616pi) interfaceC0356ji;
        if (c0616pi.m3082O(iIntValue & 1, (iIntValue & 3) != 2)) {
            AbstractC0457m2.m2425a(AbstractC0398kl.m1937w(1367541877, new C0377k2(this.f3320k, this.f3321l, i), c0616pi), null, this.f3313d, this.f3314e, this.f3315f, this.f3316g, AbstractC0510nf.m2698d(s91.f5700b, c0616pi), this.f3317h, this.f3318i, this.f3319j, c0616pi, 6);
        } else {
            c0616pi.m3085R();
        }
        return na1.f4229a;
    }
}
