package p000;

/* JADX INFO: renamed from: bg */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0054bg extends m51 implements InterfaceC0941xw {

    /* JADX INFO: renamed from: h */
    public int f506h;

    /* JADX INFO: renamed from: i */
    public /* synthetic */ hs0 f507i;

    /* JADX INFO: renamed from: j */
    public /* synthetic */ long f508j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ C0128dg f509k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0054bg(C0128dg c0128dg, InterfaceC0322ik interfaceC0322ik) {
        super(3, interfaceC0322ik);
        this.f509k = c0128dg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0941xw
    /* JADX INFO: renamed from: a */
    public final Object mo353a(Object obj, Object obj2, Object obj3) {
        long j = ((ok0) obj2).f4590a;
        C0054bg c0054bg = new C0054bg(this.f509k, (InterfaceC0322ik) obj3);
        c0054bg.f507i = (hs0) obj;
        c0054bg.f508j = j;
        return c0054bg.mo16m(na1.f4229a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0955y9
    /* JADX INFO: renamed from: m */
    public final Object mo16m(Object obj) {
        Object objM3013w;
        int i = this.f506h;
        na1 na1Var = na1.f4229a;
        if (i == 0) {
            w60.m4891M(obj);
            hs0 hs0Var = this.f507i;
            long j = this.f508j;
            C0128dg c0128dg = this.f509k;
            if (c0128dg.f4108x) {
                this.f506h = 1;
                xg0 xg0Var = c0128dg.f4104t;
                EnumC1007zk enumC1007zk = EnumC1007zk.f7916d;
                if (xg0Var == null || (objM3013w = p30.m3013w(new C0265h(hs0Var, j, xg0Var, c0128dg, null), this)) != enumC1007zk) {
                    objM3013w = na1Var;
                }
                if (objM3013w == enumC1007zk) {
                    return enumC1007zk;
                }
            }
        } else {
            if (i != 1) {
                C0921xc.m5134o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            w60.m4891M(obj);
        }
        return na1Var;
    }
}
