package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class l80 extends m51 implements InterfaceC0904ww {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f3384h;

    /* JADX INFO: renamed from: i */
    public int f3385i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f3386j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f3387k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l80(Object obj, int i, InterfaceC0322ik interfaceC0322ik, int i2) {
        super(2, interfaceC0322ik);
        this.f3384h = i2;
        this.f3387k = obj;
        this.f3386j = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0955y9
    /* JADX INFO: renamed from: g */
    public final InterfaceC0322ik mo15g(Object obj, InterfaceC0322ik interfaceC0322ik) {
        int i = this.f3384h;
        int i2 = this.f3386j;
        Object obj2 = this.f3387k;
        switch (i) {
            case 0:
                return new l80((m80) obj2, i2, interfaceC0322ik, 0);
            default:
                return new l80((C0399km) obj2, i2, interfaceC0322ik, 1);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0904ww
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f3384h;
        na1 na1Var = na1.f4229a;
        switch (i) {
            case 0:
                return ((l80) mo15g((InterfaceC0966yk) obj, (InterfaceC0322ik) obj2)).mo16m(na1Var);
            default:
                return ((l80) mo15g((ny0) obj, (InterfaceC0322ik) obj2)).mo16m(na1Var);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0955y9
    /* JADX INFO: renamed from: m */
    public final Object mo16m(Object obj) {
        int i = this.f3384h;
        na1 na1Var = na1.f4229a;
        int i2 = this.f3386j;
        EnumC1007zk enumC1007zk = EnumC1007zk.f7916d;
        Object obj2 = this.f3387k;
        switch (i) {
            case 0:
                int i3 = this.f3385i;
                if (i3 == 0) {
                    w60.m4891M(obj);
                    f80 f80Var = ((m80) obj2).f3860s;
                    this.f3385i = 1;
                    return f80Var.mo1052d(i2, this) == enumC1007zk ? enumC1007zk : na1Var;
                }
                if (i3 == 1) {
                    w60.m4891M(obj);
                    return na1Var;
                }
                C0921xc.m5134o("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                C0399km c0399km = (C0399km) obj2;
                int i4 = this.f3385i;
                if (i4 == 0) {
                    w60.m4891M(obj);
                    this.f3385i = 1;
                    if (c0399km.m2035i(this) == enumC1007zk) {
                        return enumC1007zk;
                    }
                } else {
                    if (i4 != 1) {
                        C0921xc.m5134o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w60.m4891M(obj);
                }
                c0399km.m2044u(c0399km.m2036k(i2), 0.0f, true);
                return na1Var;
        }
    }
}
