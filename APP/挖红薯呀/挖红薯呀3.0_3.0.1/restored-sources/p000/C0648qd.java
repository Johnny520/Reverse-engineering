package p000;

/* JADX INFO: renamed from: qd */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0648qd extends m51 implements InterfaceC0904ww {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f5120h = 1;

    /* JADX INFO: renamed from: i */
    public int f5121i;

    /* JADX INFO: renamed from: j */
    public /* synthetic */ Object f5122j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ C0760td f5123k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ InterfaceC0331iu f5124l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0648qd(C0760td c0760td, InterfaceC0331iu interfaceC0331iu, Object obj, InterfaceC0322ik interfaceC0322ik) {
        super(2, interfaceC0322ik);
        this.f5123k = c0760td;
        this.f5124l = interfaceC0331iu;
        this.f5122j = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0955y9
    /* JADX INFO: renamed from: g */
    public final InterfaceC0322ik mo15g(Object obj, InterfaceC0322ik interfaceC0322ik) {
        int i = this.f5120h;
        InterfaceC0331iu interfaceC0331iu = this.f5124l;
        C0760td c0760td = this.f5123k;
        switch (i) {
            case 0:
                return new C0648qd(c0760td, interfaceC0331iu, this.f5122j, interfaceC0322ik);
            default:
                C0648qd c0648qd = new C0648qd(c0760td, interfaceC0331iu, interfaceC0322ik);
                c0648qd.f5122j = obj;
                return c0648qd;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0904ww
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f5120h;
        na1 na1Var = na1.f4229a;
        InterfaceC0966yk interfaceC0966yk = (InterfaceC0966yk) obj;
        InterfaceC0322ik interfaceC0322ik = (InterfaceC0322ik) obj2;
        switch (i) {
        }
        return ((C0648qd) mo15g(interfaceC0966yk, interfaceC0322ik)).mo16m(na1Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0955y9
    /* JADX INFO: renamed from: m */
    public final Object mo16m(Object obj) {
        int i = this.f5120h;
        na1 na1Var = na1.f4229a;
        EnumC1007zk enumC1007zk = EnumC1007zk.f7916d;
        switch (i) {
            case 0:
                int i2 = this.f5121i;
                if (i2 == 0) {
                    w60.m4891M(obj);
                    InterfaceC0941xw interfaceC0941xw = this.f5123k.f5986h;
                    Object obj2 = this.f5122j;
                    this.f5121i = 1;
                    if (interfaceC0941xw.mo353a(this.f5124l, obj2, this) == enumC1007zk) {
                    }
                } else if (i2 != 1) {
                    C0921xc.m5134o("call to 'resume' before 'invoke' with coroutine");
                } else {
                    w60.m4891M(obj);
                }
                break;
            default:
                int i3 = this.f5121i;
                if (i3 == 0) {
                    w60.m4891M(obj);
                    InterfaceC0966yk interfaceC0966yk = (InterfaceC0966yk) this.f5122j;
                    zt0 zt0Var = new zt0();
                    C0760td c0760td = this.f5123k;
                    InterfaceC0296hu interfaceC0296hu = c0760td.f4520g;
                    C0722sd c0722sd = new C0722sd(zt0Var, interfaceC0966yk, c0760td, this.f5124l, 0);
                    this.f5121i = 1;
                    if (interfaceC0296hu.mo609b(c0722sd, this) == enumC1007zk) {
                    }
                } else if (i3 != 1) {
                    C0921xc.m5134o("call to 'resume' before 'invoke' with coroutine");
                } else {
                    w60.m4891M(obj);
                }
                break;
        }
        return enumC1007zk;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0648qd(C0760td c0760td, InterfaceC0331iu interfaceC0331iu, InterfaceC0322ik interfaceC0322ik) {
        super(2, interfaceC0322ik);
        this.f5123k = c0760td;
        this.f5124l = interfaceC0331iu;
    }
}
