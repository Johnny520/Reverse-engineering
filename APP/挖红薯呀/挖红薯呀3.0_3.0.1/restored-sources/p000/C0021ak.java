package p000;

/* JADX INFO: renamed from: ak */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0021ak extends m51 implements InterfaceC0904ww {

    /* JADX INFO: renamed from: h */
    public int f179h;

    /* JADX INFO: renamed from: i */
    public /* synthetic */ Object f180i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ va1 f181j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ C0095ck f182k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ InterfaceC0386kb f183l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ long f184m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ c40 f185n;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0021ak(va1 va1Var, C0095ck c0095ck, InterfaceC0386kb interfaceC0386kb, long j, c40 c40Var, InterfaceC0322ik interfaceC0322ik) {
        super(2, interfaceC0322ik);
        this.f181j = va1Var;
        this.f182k = c0095ck;
        this.f183l = interfaceC0386kb;
        this.f184m = j;
        this.f185n = c40Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0955y9
    /* JADX INFO: renamed from: g */
    public final InterfaceC0322ik mo15g(Object obj, InterfaceC0322ik interfaceC0322ik) {
        C0021ak c0021ak = new C0021ak(this.f181j, this.f182k, this.f183l, this.f184m, this.f185n, interfaceC0322ik);
        c0021ak.f180i = obj;
        return c0021ak;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0904ww
    public final Object invoke(Object obj, Object obj2) {
        return ((C0021ak) mo15g((jz0) obj, (InterfaceC0322ik) obj2)).mo16m(na1.f4229a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0955y9
    /* JADX INFO: renamed from: m */
    public final Object mo16m(Object obj) {
        int i = this.f179h;
        if (i == 0) {
            w60.m4891M(obj);
            jz0 jz0Var = (jz0) this.f180i;
            long j = this.f184m;
            C0095ck c0095ck = this.f182k;
            InterfaceC0386kb interfaceC0386kb = this.f183l;
            float fM545w0 = C0095ck.m545w0(c0095ck, interfaceC0386kb, j);
            va1 va1Var = this.f181j;
            va1Var.f6631e = fM545w0;
            C1006zj c1006zj = new C1006zj(c0095ck, va1Var, this.f185n, jz0Var);
            C0607p9 c0607p9 = new C0607p9(c0095ck, va1Var, interfaceC0386kb, 3);
            this.f179h = 1;
            Object objM4439a = va1Var.m4439a(c1006zj, c0607p9, this);
            EnumC1007zk enumC1007zk = EnumC1007zk.f7916d;
            if (objM4439a == enumC1007zk) {
                return enumC1007zk;
            }
        } else {
            if (i != 1) {
                C0921xc.m5134o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            w60.m4891M(obj);
        }
        return na1.f4229a;
    }
}
