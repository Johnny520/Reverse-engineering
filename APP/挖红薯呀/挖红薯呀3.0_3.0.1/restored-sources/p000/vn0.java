package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class vn0 extends m51 implements InterfaceC0904ww {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f6751h;

    /* JADX INFO: renamed from: i */
    public int f6752i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ C0399km f6753j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vn0(C0399km c0399km, InterfaceC0322ik interfaceC0322ik, int i) {
        super(2, interfaceC0322ik);
        this.f6751h = i;
        this.f6753j = c0399km;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0955y9
    /* JADX INFO: renamed from: g */
    public final InterfaceC0322ik mo15g(Object obj, InterfaceC0322ik interfaceC0322ik) {
        int i = this.f6751h;
        C0399km c0399km = this.f6753j;
        switch (i) {
            case 0:
                return new vn0(c0399km, interfaceC0322ik, 0);
            case 1:
                return new vn0(c0399km, interfaceC0322ik, 1);
            default:
                return new vn0(c0399km, interfaceC0322ik, 2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0904ww
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f6751h;
        na1 na1Var = na1.f4229a;
        InterfaceC0966yk interfaceC0966yk = (InterfaceC0966yk) obj;
        InterfaceC0322ik interfaceC0322ik = (InterfaceC0322ik) obj2;
        switch (i) {
        }
        return ((vn0) mo15g(interfaceC0966yk, interfaceC0322ik)).mo16m(na1Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0955y9
    /* JADX INFO: renamed from: m */
    public final Object mo16m(Object obj) {
        Object objM2033f;
        Object objM2033f2;
        int i = this.f6751h;
        C0399km c0399km = this.f6753j;
        EnumC1007zk enumC1007zk = EnumC1007zk.f7916d;
        na1 na1Var = na1.f4229a;
        InterfaceC0322ik interfaceC0322ik = null;
        int i2 = 1;
        switch (i) {
            case 0:
                int i3 = this.f6752i;
                if (i3 != 0) {
                    if (i3 != 1) {
                        C0921xc.m5134o("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        w60.m4891M(obj);
                    }
                    break;
                } else {
                    w60.m4891M(obj);
                    co0 co0Var = c0399km.f3543d;
                    this.f6752i = 1;
                    no0 no0Var = oo0.f4599a;
                    if (co0Var.f866b.m720g() - 1 < 0 || (objM2033f = c0399km.m2033f(co0Var.f866b.m720g() - 1, s91.m4028O(0.0f, 0.0f, null, 7), this)) != enumC1007zk) {
                        objM2033f = na1Var;
                    }
                    if (objM2033f == enumC1007zk) {
                    }
                }
                break;
            case 1:
                int i4 = this.f6752i;
                if (i4 != 0) {
                    if (i4 != 1) {
                        C0921xc.m5134o("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        w60.m4891M(obj);
                    }
                    break;
                } else {
                    w60.m4891M(obj);
                    co0 co0Var2 = c0399km.f3543d;
                    this.f6752i = 1;
                    no0 no0Var2 = oo0.f4599a;
                    if (co0Var2.f866b.m720g() + 1 >= c0399km.mo1941n() || (objM2033f2 = c0399km.m2033f(co0Var2.f866b.m720g() + 1, s91.m4028O(0.0f, 0.0f, null, 7), this)) != enumC1007zk) {
                        objM2033f2 = na1Var;
                    }
                    if (objM2033f2 == enumC1007zk) {
                    }
                }
                break;
            default:
                int i5 = this.f6752i;
                if (i5 != 0) {
                    if (i5 != 1) {
                        C0921xc.m5134o("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        w60.m4891M(obj);
                    }
                    break;
                } else {
                    w60.m4891M(obj);
                    this.f6752i = 1;
                    Object objM2032t = lo0.m2032t(c0399km, vh0.f6718d, new C0500n6(2, interfaceC0322ik, i2), this);
                    if (objM2032t != enumC1007zk) {
                        objM2032t = na1Var;
                    }
                    if (objM2032t == enumC1007zk) {
                    }
                }
                break;
        }
        return na1Var;
    }
}
