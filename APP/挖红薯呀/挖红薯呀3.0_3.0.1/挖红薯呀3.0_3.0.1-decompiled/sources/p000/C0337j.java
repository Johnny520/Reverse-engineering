package p000;

/* JADX INFO: renamed from: j */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0337j extends m51 implements InterfaceC0904ww {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f2644h = 0;

    /* JADX INFO: renamed from: i */
    public int f2645i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ xg0 f2646j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ js0 f2647k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0337j(xg0 xg0Var, js0 js0Var, InterfaceC0322ik interfaceC0322ik) {
        super(2, interfaceC0322ik);
        this.f2646j = xg0Var;
        this.f2647k = js0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0955y9
    /* JADX INFO: renamed from: g */
    public final InterfaceC0322ik mo15g(Object obj, InterfaceC0322ik interfaceC0322ik) {
        int i = this.f2644h;
        js0 js0Var = this.f2647k;
        xg0 xg0Var = this.f2646j;
        switch (i) {
            case 0:
                return new C0337j(js0Var, xg0Var, interfaceC0322ik);
            default:
                return new C0337j(xg0Var, js0Var, interfaceC0322ik);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0904ww
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f2644h;
        na1 na1Var = na1.f4229a;
        InterfaceC0966yk interfaceC0966yk = (InterfaceC0966yk) obj;
        InterfaceC0322ik interfaceC0322ik = (InterfaceC0322ik) obj2;
        switch (i) {
        }
        return ((C0337j) mo15g(interfaceC0966yk, interfaceC0322ik)).mo16m(na1Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0955y9
    /* JADX INFO: renamed from: m */
    public final Object mo16m(Object obj) {
        int i = this.f2644h;
        na1 na1Var = na1.f4229a;
        js0 js0Var = this.f2647k;
        xg0 xg0Var = this.f2646j;
        EnumC1007zk enumC1007zk = EnumC1007zk.f7916d;
        switch (i) {
            case 0:
                int i2 = this.f2645i;
                if (i2 == 0) {
                    w60.m4891M(obj);
                    ks0 ks0Var = new ks0(js0Var);
                    this.f2645i = 1;
                    if (xg0Var.m5135b(ks0Var, this) == enumC1007zk) {
                    }
                } else if (i2 != 1) {
                    C0921xc.m5134o("call to 'resume' before 'invoke' with coroutine");
                } else {
                    w60.m4891M(obj);
                }
                break;
            default:
                int i3 = this.f2645i;
                if (i3 == 0) {
                    w60.m4891M(obj);
                    this.f2645i = 1;
                    if (xg0Var.m5135b(js0Var, this) == enumC1007zk) {
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
    public C0337j(js0 js0Var, xg0 xg0Var, InterfaceC0322ik interfaceC0322ik) {
        super(2, interfaceC0322ik);
        this.f2647k = js0Var;
        this.f2646j = xg0Var;
    }
}
