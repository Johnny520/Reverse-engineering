package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class io0 extends m51 implements InterfaceC0904ww {

    /* JADX INFO: renamed from: h */
    public int f2593h;

    /* JADX INFO: renamed from: i */
    public /* synthetic */ Object f2594i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ lo0 f2595j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ int f2596k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ float f2597l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ InterfaceC0830v7 f2598m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public io0(lo0 lo0Var, int i, float f, InterfaceC0830v7 interfaceC0830v7, InterfaceC0322ik interfaceC0322ik) {
        super(2, interfaceC0322ik);
        this.f2595j = lo0Var;
        this.f2596k = i;
        this.f2597l = f;
        this.f2598m = interfaceC0830v7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0955y9
    /* JADX INFO: renamed from: g */
    public final InterfaceC0322ik mo15g(Object obj, InterfaceC0322ik interfaceC0322ik) {
        io0 io0Var = new io0(this.f2595j, this.f2596k, this.f2597l, this.f2598m, interfaceC0322ik);
        io0Var.f2594i = obj;
        return io0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0904ww
    public final Object invoke(Object obj, Object obj2) {
        return ((io0) mo15g((ny0) obj, (InterfaceC0322ik) obj2)).mo16m(na1.f4229a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0955y9
    /* JADX INFO: renamed from: m */
    public final Object mo16m(Object obj) {
        int i = this.f2593h;
        na1 na1Var = na1.f4229a;
        if (i != 0) {
            if (i == 1) {
                w60.m4891M(obj);
                return na1Var;
            }
            C0921xc.m5134o("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        w60.m4891M(obj);
        ny0 ny0Var = (ny0) this.f2594i;
        lo0 lo0Var = this.f2595j;
        C0479mm c0479mm = new C0479mm(ny0Var, lo0Var);
        this.f2593h = 1;
        no0 no0Var = oo0.f4599a;
        int i2 = this.f2596k;
        lo0Var.f3558s.m721h(lo0Var.m2036k(new Integer(i2).intValue()));
        boolean z = i2 > lo0Var.f3544e;
        int i3 = (((ae0) AbstractC0960ye.m5246P(lo0Var.m2038m().f7937a)).f133a - lo0Var.f3544e) + 1;
        if (((z && i2 > ((ae0) AbstractC0960ye.m5246P(lo0Var.m2038m().f7937a)).f133a) || (!z && i2 < lo0Var.f3544e)) && Math.abs(i2 - lo0Var.f3544e) >= 3) {
            int i4 = lo0Var.f3544e;
            if (z) {
                int i5 = i2 - i3;
                if (i5 >= i4) {
                    i4 = i5;
                }
            } else {
                int i6 = i3 + i2;
                if (i6 <= i4) {
                    i4 = i6;
                }
            }
            lo0Var.m2044u(i4, 0.0f / lo0Var.m2040p(), true);
        }
        Object objM5436f = z60.m5436f(((int) (w60.m4908o(j50.m1661k(lo0Var) + ((long) rd0.m3458Q(((lo0Var.m2040p() * (i2 - lo0Var.f3543d.f866b.m720g())) - (lo0Var.m2037l() * lo0Var.m2040p())) + 0.0f)), lo0Var.f3547h, lo0Var.f3546g) - j50.m1661k(lo0Var))) + this.f2597l, this.f2598m, new C0168ed(10, new wt0(), c0479mm), this, 4);
        EnumC1007zk enumC1007zk = EnumC1007zk.f7916d;
        if (objM5436f != enumC1007zk) {
            objM5436f = na1Var;
        }
        return objM5436f == enumC1007zk ? enumC1007zk : na1Var;
    }
}
