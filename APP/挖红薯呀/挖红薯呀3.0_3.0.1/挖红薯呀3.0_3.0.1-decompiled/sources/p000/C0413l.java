package p000;

/* JADX INFO: renamed from: l */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0413l extends m51 implements InterfaceC0904ww {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f3293h;

    /* JADX INFO: renamed from: i */
    public int f3294i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ AbstractC0493n f3295j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ js0 f3296k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0413l(AbstractC0493n abstractC0493n, js0 js0Var, InterfaceC0322ik interfaceC0322ik, int i) {
        super(2, interfaceC0322ik);
        this.f3293h = i;
        this.f3295j = abstractC0493n;
        this.f3296k = js0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0955y9
    /* JADX INFO: renamed from: g */
    public final InterfaceC0322ik mo15g(Object obj, InterfaceC0322ik interfaceC0322ik) {
        int i = this.f3293h;
        js0 js0Var = this.f3296k;
        AbstractC0493n abstractC0493n = this.f3295j;
        switch (i) {
            case 0:
                return new C0413l(abstractC0493n, js0Var, interfaceC0322ik, 0);
            case 1:
                return new C0413l(abstractC0493n, js0Var, interfaceC0322ik, 1);
            case 2:
                return new C0413l(abstractC0493n, js0Var, interfaceC0322ik, 2);
            default:
                return new C0413l(abstractC0493n, js0Var, interfaceC0322ik, 3);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0904ww
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f3293h;
        na1 na1Var = na1.f4229a;
        InterfaceC0966yk interfaceC0966yk = (InterfaceC0966yk) obj;
        InterfaceC0322ik interfaceC0322ik = (InterfaceC0322ik) obj2;
        switch (i) {
        }
        return ((C0413l) mo15g(interfaceC0966yk, interfaceC0322ik)).mo16m(na1Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0955y9
    /* JADX INFO: renamed from: m */
    public final Object mo16m(Object obj) {
        int i = this.f3293h;
        na1 na1Var = na1.f4229a;
        js0 js0Var = this.f3296k;
        AbstractC0493n abstractC0493n = this.f3295j;
        EnumC1007zk enumC1007zk = EnumC1007zk.f7916d;
        switch (i) {
            case 0:
                int i2 = this.f3294i;
                if (i2 == 0) {
                    w60.m4891M(obj);
                    xg0 xg0Var = abstractC0493n.f4104t;
                    if (xg0Var != null) {
                        is0 is0Var = new is0(js0Var);
                        this.f3294i = 1;
                        if (xg0Var.m5135b(is0Var, this) == enumC1007zk) {
                        }
                    }
                } else if (i2 != 1) {
                    C0921xc.m5134o("call to 'resume' before 'invoke' with coroutine");
                } else {
                    w60.m4891M(obj);
                }
                break;
            case 1:
                int i3 = this.f3294i;
                if (i3 == 0) {
                    w60.m4891M(obj);
                    xg0 xg0Var2 = abstractC0493n.f4104t;
                    if (xg0Var2 != null) {
                        is0 is0Var2 = new is0(js0Var);
                        this.f3294i = 1;
                        if (xg0Var2.m5135b(is0Var2, this) == enumC1007zk) {
                        }
                    }
                } else if (i3 != 1) {
                    C0921xc.m5134o("call to 'resume' before 'invoke' with coroutine");
                } else {
                    w60.m4891M(obj);
                }
                break;
            case 2:
                int i4 = this.f3294i;
                if (i4 == 0) {
                    w60.m4891M(obj);
                    xg0 xg0Var3 = abstractC0493n.f4104t;
                    if (xg0Var3 != null) {
                        this.f3294i = 1;
                        if (xg0Var3.m5135b(js0Var, this) == enumC1007zk) {
                        }
                    }
                } else if (i4 != 1) {
                    C0921xc.m5134o("call to 'resume' before 'invoke' with coroutine");
                } else {
                    w60.m4891M(obj);
                }
                break;
            default:
                int i5 = this.f3294i;
                if (i5 == 0) {
                    w60.m4891M(obj);
                    xg0 xg0Var4 = abstractC0493n.f4104t;
                    if (xg0Var4 != null) {
                        ks0 ks0Var = new ks0(js0Var);
                        this.f3294i = 1;
                        if (xg0Var4.m5135b(ks0Var, this) == enumC1007zk) {
                        }
                    }
                } else if (i5 != 1) {
                    C0921xc.m5134o("call to 'resume' before 'invoke' with coroutine");
                } else {
                    w60.m4891M(obj);
                }
                break;
        }
        return enumC1007zk;
    }
}
