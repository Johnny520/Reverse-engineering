package p000;

import java.io.Serializable;

/* JADX INFO: renamed from: sd */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0722sd implements InterfaceC0331iu {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f5743d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Serializable f5744e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f5745f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Object f5746g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f5747h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0722sd(Serializable serializable, Object obj, Object obj2, Object obj3, int i) {
        this.f5743d = i;
        this.f5744e = serializable;
        this.f5745f = obj;
        this.f5746g = obj2;
        this.f5747h = obj3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a8  */
    @Override // p000.InterfaceC0331iu
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo827f(Object obj, InterfaceC0322ik interfaceC0322ik) {
        C0685rd c0685rd;
        int i = this.f5743d;
        na1 na1Var = na1.f4229a;
        int i2 = 1;
        Serializable serializable = this.f5744e;
        int i3 = 0;
        switch (i) {
            case 0:
                if (interfaceC0322ik instanceof C0685rd) {
                    c0685rd = (C0685rd) interfaceC0322ik;
                    int i4 = c0685rd.f5361k;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        c0685rd.f5361k = i4 - Integer.MIN_VALUE;
                    } else {
                        c0685rd = new C0685rd(this, interfaceC0322ik);
                    }
                }
                Object obj2 = c0685rd.f5359i;
                int i5 = c0685rd.f5361k;
                if (i5 == 0) {
                    w60.m4891M(obj2);
                    c40 c40Var = (c40) ((zt0) serializable).f7995d;
                    if (c40Var != null) {
                        c40Var.mo478a(new C0052be("Child of the scoped flow was cancelled", i3));
                        c0685rd.f5357g = this;
                        c0685rd.f5358h = obj;
                        c0685rd.f5361k = 1;
                        Object objMo483v = c40Var.mo483v(c0685rd);
                        EnumC1007zk enumC1007zk = EnumC1007zk.f7916d;
                        if (objMo483v == enumC1007zk) {
                        }
                    }
                } else if (i5 != 1) {
                    C0921xc.m5134o("call to 'resume' before 'invoke' with coroutine");
                } else {
                    obj = c0685rd.f5358h;
                    this = c0685rd.f5357g;
                    w60.m4891M(obj2);
                }
                ((zt0) this.f5744e).f7995d = AbstractC0307i4.m1547w((InterfaceC0966yk) this.f5745f, null, new C0648qd((C0760td) this.f5746g, (InterfaceC0331iu) this.f5747h, obj, null), 1);
                break;
            default:
                f30 f30Var = (f30) obj;
                xt0 xt0Var = (xt0) this.f5746g;
                xt0 xt0Var2 = (xt0) this.f5745f;
                xt0 xt0Var3 = (xt0) serializable;
                if (f30Var instanceof js0) {
                    xt0Var3.f7423d++;
                } else if ((f30Var instanceof ks0) || (f30Var instanceof is0)) {
                    xt0Var3.f7423d--;
                } else if (f30Var instanceof C0264gz) {
                    xt0Var2.f7423d++;
                } else if (f30Var instanceof C0301hz) {
                    xt0Var2.f7423d--;
                } else if (f30Var instanceof C0702ru) {
                    xt0Var.f7423d++;
                } else if (f30Var instanceof C0739su) {
                    xt0Var.f7423d--;
                }
                boolean z = xt0Var3.f7423d > 0;
                boolean z2 = xt0Var2.f7423d > 0;
                boolean z3 = xt0Var.f7423d > 0;
                C0656ql c0656ql = (C0656ql) this.f5747h;
                if (c0656ql.f5196s != z) {
                    c0656ql.f5196s = z;
                    i3 = 1;
                }
                if (c0656ql.f5197t != z2) {
                    c0656ql.f5197t = z2;
                    i3 = 1;
                }
                if (c0656ql.f5198u != z3) {
                    c0656ql.f5198u = z3;
                } else {
                    i2 = i3;
                }
                if (i2 != 0) {
                    AbstractC0398kl.m1932r(c0656ql);
                }
                break;
        }
        return na1Var;
    }
}
