package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class h61 extends m51 implements InterfaceC0904ww {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f2151h;

    /* JADX INFO: renamed from: i */
    public int f2152i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ C0054bg f2153j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ hs0 f2154k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ nr0 f2155l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h61(C0054bg c0054bg, hs0 hs0Var, nr0 nr0Var, InterfaceC0322ik interfaceC0322ik, int i) {
        super(2, interfaceC0322ik);
        this.f2151h = i;
        this.f2153j = c0054bg;
        this.f2154k = hs0Var;
        this.f2155l = nr0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0955y9
    /* JADX INFO: renamed from: g */
    public final InterfaceC0322ik mo15g(Object obj, InterfaceC0322ik interfaceC0322ik) {
        switch (this.f2151h) {
            case 0:
                return new h61(this.f2153j, this.f2154k, this.f2155l, interfaceC0322ik, 0);
            default:
                return new h61(this.f2153j, this.f2154k, this.f2155l, interfaceC0322ik, 1);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0904ww
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f2151h;
        na1 na1Var = na1.f4229a;
        InterfaceC0966yk interfaceC0966yk = (InterfaceC0966yk) obj;
        InterfaceC0322ik interfaceC0322ik = (InterfaceC0322ik) obj2;
        switch (i) {
        }
        return ((h61) mo15g(interfaceC0966yk, interfaceC0322ik)).mo16m(na1Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0955y9
    /* JADX INFO: renamed from: m */
    public final Object mo16m(Object obj) {
        int i = this.f2151h;
        nr0 nr0Var = this.f2155l;
        hs0 hs0Var = this.f2154k;
        C0054bg c0054bg = this.f2153j;
        EnumC1007zk enumC1007zk = EnumC1007zk.f7916d;
        na1 na1Var = na1.f4229a;
        switch (i) {
            case 0:
                int i2 = this.f2152i;
                if (i2 == 0) {
                    w60.m4891M(obj);
                    long j = nr0Var.f4307c;
                    this.f2152i = 1;
                    C0054bg c0054bg2 = new C0054bg(c0054bg.f509k, this);
                    c0054bg2.f507i = hs0Var;
                    c0054bg2.f508j = j;
                    if (c0054bg2.mo16m(na1Var) == enumC1007zk) {
                    }
                } else if (i2 != 1) {
                    C0921xc.m5134o("call to 'resume' before 'invoke' with coroutine");
                } else {
                    w60.m4891M(obj);
                }
                break;
            default:
                int i3 = this.f2152i;
                if (i3 == 0) {
                    w60.m4891M(obj);
                    long j2 = nr0Var.f4307c;
                    this.f2152i = 1;
                    C0054bg c0054bg3 = new C0054bg(c0054bg.f509k, this);
                    c0054bg3.f507i = hs0Var;
                    c0054bg3.f508j = j2;
                    if (c0054bg3.mo16m(na1Var) == enumC1007zk) {
                    }
                } else if (i3 != 1) {
                    C0921xc.m5134o("call to 'resume' before 'invoke' with coroutine");
                } else {
                    w60.m4891M(obj);
                }
                break;
        }
        return na1Var;
    }
}
