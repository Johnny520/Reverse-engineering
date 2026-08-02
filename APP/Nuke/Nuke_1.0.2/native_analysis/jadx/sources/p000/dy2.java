package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class dy2 extends ij0 {

    /* JADX INFO: renamed from: e */
    public final C0898xt f2263e;

    public dy2(oa0 oa0Var, kt2 kt2Var, s72 s72Var, C0898xt c0898xt) {
        super(oa0Var, kt2Var, s72Var);
        if (c0898xt != null) {
            this.f2263e = c0898xt;
        } else {
            um2.m5516f("target == null");
            throw null;
        }
    }

    @Override // p000.a40
    /* JADX INFO: renamed from: a */
    public final String mo57a() {
        C0898xt c0898xt = this.f2263e;
        return c0898xt == null ? "????" : c0898xt.m62f();
    }

    @Override // p000.a40
    /* JADX INFO: renamed from: i */
    public final a40 mo64i(oa0 oa0Var) {
        return new dy2(oa0Var, this.f47c, this.f48d, this.f2263e);
    }

    @Override // p000.a40
    /* JADX INFO: renamed from: k */
    public final a40 mo66k(s72 s72Var) {
        return new dy2(this.f46b, this.f47c, s72Var, this.f2263e);
    }

    /* JADX INFO: renamed from: m */
    public final int m1207m() {
        return this.f2263e.m61e() - m61e();
    }

    /* JADX INFO: renamed from: n */
    public final boolean m1208n() {
        return this.f45a >= 0 && this.f2263e.f45a >= 0;
    }

    /* JADX INFO: renamed from: o */
    public final dy2 m1209o(C0898xt c0898xt) {
        oa0 oa0Var;
        oa0 oa0Var2 = this.f46b;
        switch (oa0Var2.f7598a) {
            case 50:
                oa0Var = pa0.f8111Q;
                break;
            case 51:
                oa0Var = pa0.f8108P;
                break;
            case 52:
                oa0Var = pa0.f8117S;
                break;
            case 53:
                oa0Var = pa0.f8114R;
                break;
            case 54:
                oa0Var = pa0.f8123U;
                break;
            case 55:
                oa0Var = pa0.f8120T;
                break;
            case 56:
                oa0Var = pa0.f8129W;
                break;
            case 57:
                oa0Var = pa0.f8126V;
                break;
            case 58:
                oa0Var = pa0.f8135Y;
                break;
            case 59:
                oa0Var = pa0.f8132X;
                break;
            case 60:
                oa0Var = pa0.f8142a0;
                break;
            case 61:
                oa0Var = pa0.f8138Z;
                break;
            default:
                C0676s.m4648g("bogus opcode: ", oa0Var2);
                return null;
        }
        return new dy2(oa0Var, this.f47c, this.f48d, c0898xt);
    }
}
