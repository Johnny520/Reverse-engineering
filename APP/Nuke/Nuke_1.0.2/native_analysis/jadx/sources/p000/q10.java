package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class q10 extends tw2 implements mn0 {

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ int f8683l;

    /* JADX INFO: renamed from: m */
    public int f8684m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ s12 f8685n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ kz2 f8686o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q10(s12 s12Var, kz2 kz2Var, t00 t00Var, int i) {
        super(2, t00Var);
        this.f8683l = i;
        this.f8685n = s12Var;
        this.f8686o = kz2Var;
    }

    @Override // p000.mn0
    /* JADX INFO: renamed from: g */
    public final Object mo12g(Object obj, Object obj2) {
        int i = this.f8683l;
        a83 a83Var = a83.f116a;
        j20 j20Var = (j20) obj;
        t00 t00Var = (t00) obj2;
        switch (i) {
        }
        return ((q10) mo13p(t00Var, j20Var)).mo7r(a83Var);
    }

    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: p */
    public final t00 mo13p(t00 t00Var, Object obj) {
        switch (this.f8683l) {
            case 0:
                return new q10(this.f8685n, this.f8686o, t00Var, 0);
            case 1:
                return new q10(this.f8685n, this.f8686o, t00Var, 1);
            default:
                return new q10(this.f8685n, this.f8686o, t00Var, 2);
        }
    }

    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: r */
    public final Object mo7r(Object obj) {
        int i = this.f8683l;
        kz2 kz2Var = this.f8686o;
        s12 s12Var = this.f8685n;
        k20 k20Var = k20.f5323h;
        a83 a83Var = a83.f116a;
        switch (i) {
            case 0:
                int i2 = this.f8684m;
                if (i2 != 0) {
                    if (i2 != 1) {
                        C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        fg1.m1627T(obj);
                    }
                    break;
                } else {
                    fg1.m1627T(obj);
                    this.f8684m = 1;
                    Object objM5238u = AbstractC0731te.m5238u(new C0756u0(s12Var, kz2Var, null), this);
                    if (objM5238u != k20Var) {
                        objM5238u = a83Var;
                    }
                    if (objM5238u == k20Var) {
                    }
                }
                break;
            case 1:
                int i3 = this.f8684m;
                if (i3 != 0) {
                    if (i3 != 1) {
                        C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        fg1.m1627T(obj);
                    }
                    break;
                } else {
                    fg1.m1627T(obj);
                    this.f8684m = 1;
                    Object objM4958p = sp0.m4958p(s12Var, new lm0(kz2Var, null, 1), this);
                    if (objM4958p != k20Var) {
                        objM4958p = a83Var;
                    }
                    if (objM4958p == k20Var) {
                    }
                }
                break;
            default:
                int i4 = this.f8684m;
                if (i4 != 0) {
                    if (i4 != 1) {
                        C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        fg1.m1627T(obj);
                    }
                    break;
                } else {
                    fg1.m1627T(obj);
                    this.f8684m = 1;
                    cd1 cd1Var = new cd1(kz2Var, 0);
                    dd1 dd1Var = new dd1(kz2Var, 0);
                    dd1 dd1Var2 = new dd1(kz2Var, 1);
                    C0686s9 c0686s9 = new C0686s9(11, kz2Var);
                    float f = yb0.f13389a;
                    Object objM4958p2 = sp0.m4958p(s12Var, new vb0(new C0146dy(10), new wt0(4, cd1Var), c0686s9, dd1Var2, new C0792v(8, dd1Var), null), this);
                    if (objM4958p2 != k20Var) {
                        objM4958p2 = a83Var;
                    }
                    if (objM4958p2 != k20Var) {
                        objM4958p2 = a83Var;
                    }
                    if (objM4958p2 != k20Var) {
                        objM4958p2 = a83Var;
                    }
                    if (objM4958p2 == k20Var) {
                    }
                }
                break;
        }
        return a83Var;
    }
}
