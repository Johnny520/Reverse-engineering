package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class bz0 extends m51 implements InterfaceC0904ww {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f612h;

    /* JADX INFO: renamed from: i */
    public int f613i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f614j;

    /* JADX INFO: renamed from: k */
    public /* synthetic */ long f615k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bz0(long j, r51 r51Var, InterfaceC0322ik interfaceC0322ik) {
        super(2, interfaceC0322ik);
        this.f612h = 3;
        this.f615k = j;
        this.f614j = r51Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0955y9
    /* JADX INFO: renamed from: g */
    public final InterfaceC0322ik mo15g(Object obj, InterfaceC0322ik interfaceC0322ik) {
        int i = this.f612h;
        Object obj2 = this.f614j;
        switch (i) {
            case 0:
                return new bz0((dz0) obj2, this.f615k, interfaceC0322ik, 0);
            case 1:
                return new bz0((dz0) obj2, this.f615k, interfaceC0322ik, 1);
            case 2:
                bz0 bz0Var = new bz0((dz0) obj2, interfaceC0322ik);
                bz0Var.f615k = ((ok0) obj).f4590a;
                return bz0Var;
            default:
                return new bz0(this.f615k, (r51) obj2, interfaceC0322ik);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0904ww
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f612h;
        na1 na1Var = na1.f4229a;
        switch (i) {
            case 0:
                return ((bz0) mo15g((InterfaceC0966yk) obj, (InterfaceC0322ik) obj2)).mo16m(na1Var);
            case 1:
                return ((bz0) mo15g((InterfaceC0966yk) obj, (InterfaceC0322ik) obj2)).mo16m(na1Var);
            case 2:
                long j = ((ok0) obj).f4590a;
                bz0 bz0Var = new bz0((dz0) this.f614j, (InterfaceC0322ik) obj2);
                bz0Var.f615k = j;
                return bz0Var.mo16m(na1Var);
            default:
                return ((bz0) mo15g((InterfaceC0966yk) obj, (InterfaceC0322ik) obj2)).mo16m(na1Var);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
    
        if (p000.s91.m4056u(8, r14) == r4) goto L16;
     */
    @Override // p000.AbstractC0955y9
    /* JADX INFO: renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo16m(Object obj) {
        int i = this.f612h;
        na1 na1Var = na1.f4229a;
        Object obj2 = this.f614j;
        EnumC1007zk enumC1007zk = EnumC1007zk.f7916d;
        switch (i) {
            case 0:
                int i2 = this.f613i;
                if (i2 != 0) {
                    if (i2 == 1) {
                        w60.m4891M(obj);
                        return na1Var;
                    }
                    C0921xc.m5134o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                w60.m4891M(obj);
                lz0 lz0Var = ((dz0) obj2).f1231Q;
                az0 az0Var = new az0(this.f615k, null);
                this.f613i = 1;
                return lz0Var.m2095f(vh0.f6719e, az0Var, this) == enumC1007zk ? enumC1007zk : na1Var;
            case 1:
                int i3 = this.f613i;
                if (i3 != 0) {
                    if (i3 == 1) {
                        w60.m4891M(obj);
                        return na1Var;
                    }
                    C0921xc.m5134o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                w60.m4891M(obj);
                lz0 lz0Var2 = ((dz0) obj2).f1231Q;
                long j = this.f615k;
                this.f613i = 1;
                return lz0Var2.m2091b(j, true, this) == enumC1007zk ? enumC1007zk : na1Var;
            case 2:
                int i4 = this.f613i;
                if (i4 != 0) {
                    if (i4 == 1) {
                        w60.m4891M(obj);
                        return obj;
                    }
                    C0921xc.m5134o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                w60.m4891M(obj);
                long j2 = this.f615k;
                lz0 lz0Var3 = ((dz0) obj2).f1231Q;
                this.f613i = 1;
                Object objM5064a = wy0.m5064a(lz0Var3, j2, this);
                return objM5064a == enumC1007zk ? enumC1007zk : objM5064a;
            default:
                long j3 = this.f615k;
                int i5 = this.f613i;
                if (i5 == 0) {
                    w60.m4891M(obj);
                    this.f613i = 1;
                    if (s91.m4056u(j3 - 8, this) != enumC1007zk) {
                    }
                    return enumC1007zk;
                }
                if (i5 != 1) {
                    if (i5 != 2) {
                        C0921xc.m5134o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w60.m4891M(obj);
                    C0884wc c0884wc = ((r51) obj2).f5299f;
                    if (c0884wc == null) {
                        return na1Var;
                    }
                    c0884wc.mo541i(new bv0(new kr0(j3)));
                    return na1Var;
                }
                w60.m4891M(obj);
                this.f613i = 2;
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bz0(dz0 dz0Var, long j, InterfaceC0322ik interfaceC0322ik, int i) {
        super(2, interfaceC0322ik);
        this.f612h = i;
        this.f614j = dz0Var;
        this.f615k = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bz0(dz0 dz0Var, InterfaceC0322ik interfaceC0322ik) {
        super(2, interfaceC0322ik);
        this.f612h = 2;
        this.f614j = dz0Var;
    }
}
