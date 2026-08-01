package p000;

/* JADX INFO: renamed from: fc */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0204fc extends m51 implements InterfaceC0904ww {

    /* JADX INFO: renamed from: h */
    public int f1665h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C0045b7 f1666i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ float f1667j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ boolean f1668k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ C0241gc f1669l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ f30 f1670m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0204fc(C0045b7 c0045b7, float f, boolean z, C0241gc c0241gc, f30 f30Var, InterfaceC0322ik interfaceC0322ik) {
        super(2, interfaceC0322ik);
        this.f1666i = c0045b7;
        this.f1667j = f;
        this.f1668k = z;
        this.f1669l = c0241gc;
        this.f1670m = f30Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0955y9
    /* JADX INFO: renamed from: g */
    public final InterfaceC0322ik mo15g(Object obj, InterfaceC0322ik interfaceC0322ik) {
        return new C0204fc(this.f1666i, this.f1667j, this.f1668k, this.f1669l, this.f1670m, interfaceC0322ik);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0904ww
    public final Object invoke(Object obj, Object obj2) {
        return ((C0204fc) mo15g((InterfaceC0966yk) obj, (InterfaceC0322ik) obj2)).mo16m(na1.f4229a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00d7 A[RETURN] */
    @Override // p000.AbstractC0955y9
    /* JADX INFO: renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo16m(Object obj) {
        Object objM324e;
        int i = this.f1665h;
        na1 na1Var = na1.f4229a;
        p91 p91Var = null;
        if (i == 0) {
            w60.m4891M(obj);
            C0045b7 c0045b7 = this.f1666i;
            float f = ((C0520np) c0045b7.f434e.getValue()).f4301d;
            float f2 = this.f1667j;
            if (!C0520np.m2732b(f, f2)) {
                boolean z = this.f1668k;
                EnumC1007zk enumC1007zk = EnumC1007zk.f7916d;
                if (z) {
                    float f3 = ((C0520np) c0045b7.f434e.getValue()).f4301d;
                    f30 js0Var = C0520np.m2732b(f3, 0.0f) ? new js0(0L) : C0520np.m2732b(f3, this.f1669l.f1921a) ? new C0264gz() : C0520np.m2732b(f3, 0.0f) ? new C0702ru() : null;
                    this.f1665h = 2;
                    p91 p91Var2 = AbstractC0484mr.f4024b;
                    p91 p91Var3 = AbstractC0484mr.f4023a;
                    f30 f30Var = this.f1670m;
                    if (f30Var != null) {
                        if ((f30Var instanceof js0) || (f30Var instanceof C0440lq) || (f30Var instanceof C0264gz) || (f30Var instanceof C0702ru)) {
                            p91Var = p91Var3;
                        }
                    } else if (js0Var != null) {
                        if (!(js0Var instanceof js0) && !(js0Var instanceof C0440lq)) {
                            if (js0Var instanceof C0264gz) {
                                p91Var = AbstractC0484mr.f4025c;
                            } else if (js0Var instanceof C0702ru) {
                            }
                        }
                        p91Var = p91Var2;
                    }
                    if (p91Var == null ? (objM324e = c0045b7.m324e(new C0520np(f2), this)) != enumC1007zk : (objM324e = C0045b7.m322c(c0045b7, new C0520np(f2), p91Var, null, this, 12)) != enumC1007zk) {
                        objM324e = na1Var;
                    }
                    if (objM324e == enumC1007zk) {
                    }
                } else {
                    C0520np c0520np = new C0520np(f2);
                    this.f1665h = 1;
                    if (c0045b7.m324e(c0520np, this) == enumC1007zk) {
                        return enumC1007zk;
                    }
                }
            }
        } else {
            if (i != 1 && i != 2) {
                C0921xc.m5134o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            w60.m4891M(obj);
        }
        return na1Var;
    }
}
