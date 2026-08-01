package p000;

/* JADX INFO: renamed from: nd */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0508nd extends m51 implements InterfaceC0904ww {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f4240h;

    /* JADX INFO: renamed from: i */
    public int f4241i;

    /* JADX INFO: renamed from: j */
    public /* synthetic */ Object f4242j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ AbstractC0547od f4243k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0508nd(AbstractC0547od abstractC0547od, InterfaceC0322ik interfaceC0322ik, int i) {
        super(2, interfaceC0322ik);
        this.f4240h = i;
        this.f4243k = abstractC0547od;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0955y9
    /* JADX INFO: renamed from: g */
    public final InterfaceC0322ik mo15g(Object obj, InterfaceC0322ik interfaceC0322ik) {
        int i = this.f4240h;
        AbstractC0547od abstractC0547od = this.f4243k;
        switch (i) {
            case 0:
                C0508nd c0508nd = new C0508nd(abstractC0547od, interfaceC0322ik, 0);
                c0508nd.f4242j = obj;
                return c0508nd;
            default:
                C0508nd c0508nd2 = new C0508nd(abstractC0547od, interfaceC0322ik, 1);
                c0508nd2.f4242j = obj;
                return c0508nd2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0904ww
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f4240h;
        na1 na1Var = na1.f4229a;
        switch (i) {
            case 0:
                return ((C0508nd) mo15g((qs0) obj, (InterfaceC0322ik) obj2)).mo16m(na1Var);
            default:
                return ((C0508nd) mo15g((InterfaceC0331iu) obj, (InterfaceC0322ik) obj2)).mo16m(na1Var);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0955y9
    /* JADX INFO: renamed from: m */
    public final Object mo16m(Object obj) {
        int i = this.f4240h;
        na1 na1Var = na1.f4229a;
        AbstractC0547od abstractC0547od = this.f4243k;
        EnumC1007zk enumC1007zk = EnumC1007zk.f7916d;
        switch (i) {
            case 0:
                int i2 = this.f4241i;
                if (i2 == 0) {
                    w60.m4891M(obj);
                    qs0 qs0Var = (qs0) this.f4242j;
                    this.f4241i = 1;
                    Object objMo2876e = abstractC0547od.mo2876e(new o01(qs0Var), this);
                    if (objMo2876e != enumC1007zk) {
                        objMo2876e = na1Var;
                    }
                    if (objMo2876e == enumC1007zk) {
                    }
                } else if (i2 != 1) {
                    C0921xc.m5134o("call to 'resume' before 'invoke' with coroutine");
                } else {
                    w60.m4891M(obj);
                }
                break;
            default:
                int i3 = this.f4241i;
                if (i3 == 0) {
                    w60.m4891M(obj);
                    InterfaceC0331iu interfaceC0331iu = (InterfaceC0331iu) this.f4242j;
                    this.f4241i = 1;
                    if (abstractC0547od.mo2876e(interfaceC0331iu, this) == enumC1007zk) {
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
}
