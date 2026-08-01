package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class iz0 extends m51 implements InterfaceC0904ww {

    /* JADX INFO: renamed from: h */
    public lz0 f2636h;

    /* JADX INFO: renamed from: i */
    public yt0 f2637i;

    /* JADX INFO: renamed from: j */
    public long f2638j;

    /* JADX INFO: renamed from: k */
    public int f2639k;

    /* JADX INFO: renamed from: l */
    public /* synthetic */ Object f2640l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ lz0 f2641m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ yt0 f2642n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ long f2643o;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iz0(lz0 lz0Var, yt0 yt0Var, long j, InterfaceC0322ik interfaceC0322ik) {
        super(2, interfaceC0322ik);
        this.f2641m = lz0Var;
        this.f2642n = yt0Var;
        this.f2643o = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0955y9
    /* JADX INFO: renamed from: g */
    public final InterfaceC0322ik mo15g(Object obj, InterfaceC0322ik interfaceC0322ik) {
        iz0 iz0Var = new iz0(this.f2641m, this.f2642n, this.f2643o, interfaceC0322ik);
        iz0Var.f2640l = obj;
        return iz0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0904ww
    public final Object invoke(Object obj, Object obj2) {
        return ((iz0) mo15g((jz0) obj, (InterfaceC0322ik) obj2)).mo16m(na1.f4229a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0955y9
    /* JADX INFO: renamed from: m */
    public final Object mo16m(Object obj) {
        lz0 lz0Var;
        yt0 yt0Var;
        lz0 lz0Var2;
        long j;
        int i = this.f2639k;
        um0 um0Var = um0.f6265e;
        if (i == 0) {
            w60.m4891M(obj);
            jz0 jz0Var = (jz0) this.f2640l;
            lz0Var = this.f2641m;
            hz0 hz0Var = new hz0(lz0Var, jz0Var);
            InterfaceC0975yt interfaceC0975yt = lz0Var.f3623c;
            yt0 yt0Var2 = this.f2642n;
            long j2 = yt0Var2.f7691d;
            um0 um0Var2 = lz0Var.f3624d;
            long j3 = this.f2643o;
            float fM2093d = lz0Var.m2093d(um0Var2 == um0Var ? rb1.m3436b(j3) : rb1.m3437c(j3));
            this.f2640l = lz0Var;
            this.f2636h = lz0Var;
            this.f2637i = yt0Var2;
            this.f2638j = j2;
            this.f2639k = 1;
            obj = interfaceC0975yt.mo998a(hz0Var, fM2093d, this);
            EnumC1007zk enumC1007zk = EnumC1007zk.f7916d;
            if (obj == enumC1007zk) {
                return enumC1007zk;
            }
            yt0Var = yt0Var2;
            lz0Var2 = lz0Var;
            j = j2;
        } else {
            if (i != 1) {
                C0921xc.m5134o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = this.f2638j;
            yt0Var = this.f2637i;
            lz0Var = this.f2636h;
            lz0Var2 = (lz0) this.f2640l;
            w60.m4891M(obj);
        }
        float fM2093d2 = lz0Var2.m2093d(((Number) obj).floatValue());
        yt0Var.f7691d = lz0Var.f3624d == um0Var ? rb1.m3435a(j, fM2093d2, 0.0f, 2) : rb1.m3435a(j, 0.0f, fM2093d2, 1);
        return na1.f4229a;
    }
}
