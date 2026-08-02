package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class qu1 extends iv1 {

    /* JADX INFO: renamed from: d */
    public static final qu1 f9171d;

    /* JADX INFO: renamed from: e */
    public static final qu1 f9172e;

    /* JADX INFO: renamed from: f */
    public static final qu1 f9173f;

    /* JADX INFO: renamed from: g */
    public static final qu1 f9174g;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f9175c;

    static {
        int i = 1;
        f9171d = new qu1(i, 2, 0);
        int i2 = 1;
        f9172e = new qu1(i2, i2, 1);
        f9173f = new qu1(i, 2, 2);
        int i3 = 1;
        f9174g = new qu1(i3, i3, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qu1(int i, int i2, int i3) {
        super(i, i2);
        this.f9175c = i3;
    }

    @Override // p000.iv1
    /* JADX INFO: renamed from: a */
    public final void mo296a(bo0 bo0Var, InterfaceC0654rf interfaceC0654rf, tr2 tr2Var, z72 z72Var, jv1 jv1Var) {
        switch (this.f9175c) {
            case 0:
                Object objMo6a = ((xm0) bo0Var.m579d(0)).mo6a();
                ao0 ao0Var = (ao0) bo0Var.m579d(1);
                int iM578c = bo0Var.m578c(0);
                ao0Var.getClass();
                tr2Var.m5409U(tr2Var.m5412c(ao0Var), objMo6a);
                interfaceC0654rf.mo2460g(iM578c, objMo6a);
                interfaceC0654rf.mo2457b(objMo6a);
                break;
            case 1:
                ao0 ao0Var2 = (ao0) bo0Var.m579d(0);
                int iM578c2 = bo0Var.m578c(0);
                interfaceC0654rf.mo2465o();
                ao0Var2.getClass();
                interfaceC0654rf.mo2456a(iM578c2, tr2Var.m5392D(tr2Var.m5412c(ao0Var2)));
                break;
            case 2:
                Object objM579d = bo0Var.m579d(0);
                ao0 ao0Var3 = (ao0) bo0Var.m579d(1);
                int iM578c3 = bo0Var.m578c(0);
                if (objM579d instanceof lo0) {
                    lo0 lo0Var = (lo0) objM579d;
                    z72Var.f13772e.m6423b(lo0Var);
                    z72Var.f13771d.m4882a(lo0Var);
                }
                Object objM5399K = tr2Var.m5399K(tr2Var.m5412c(ao0Var3), iM578c3, objM579d);
                if (objM5399K instanceof lo0) {
                    z72Var.m6394e((lo0) objM5399K);
                } else if (objM5399K instanceof b62) {
                    ((b62) objM5399K).m443c();
                }
                break;
            default:
                Object objM579d2 = bo0Var.m579d(0);
                int iM578c4 = bo0Var.m578c(0);
                if (objM579d2 instanceof lo0) {
                    lo0 lo0Var2 = (lo0) objM579d2;
                    z72Var.f13772e.m6423b(lo0Var2);
                    z72Var.f13771d.m4882a(lo0Var2);
                }
                Object objM5399K2 = tr2Var.m5399K(tr2Var.f10932t, iM578c4, objM579d2);
                if (objM5399K2 instanceof lo0) {
                    z72Var.m6394e((lo0) objM5399K2);
                } else if (objM5399K2 instanceof b62) {
                    ((b62) objM5399K2).m443c();
                }
                break;
        }
    }

    @Override // p000.iv1
    /* JADX INFO: renamed from: b */
    public ao0 mo2408b(bo0 bo0Var) {
        switch (this.f9175c) {
            case 0:
                return (ao0) bo0Var.m579d(1);
            case 1:
                return (ao0) bo0Var.m579d(0);
            default:
                return super.mo2408b(bo0Var);
        }
    }
}
