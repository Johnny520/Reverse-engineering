package p000;

/* JADX INFO: renamed from: xh */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0886xh extends tw2 implements mn0 {

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ int f13029l;

    /* JADX INFO: renamed from: m */
    public xk1 f13030m;

    /* JADX INFO: renamed from: n */
    public int f13031n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ xk1 f13032o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0886xh(xk1 xk1Var, t00 t00Var, int i) {
        super(2, t00Var);
        this.f13029l = i;
        this.f13032o = xk1Var;
    }

    @Override // p000.mn0
    /* JADX INFO: renamed from: g */
    public final Object mo12g(Object obj, Object obj2) {
        int i = this.f13029l;
        a83 a83Var = a83.f116a;
        j20 j20Var = (j20) obj;
        t00 t00Var = (t00) obj2;
        switch (i) {
        }
        return ((C0886xh) mo13p(t00Var, j20Var)).mo7r(a83Var);
    }

    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: p */
    public final t00 mo13p(t00 t00Var, Object obj) {
        switch (this.f13029l) {
            case 0:
                return new C0886xh(this.f13032o, t00Var, 0);
            default:
                return new C0886xh(this.f13032o, t00Var, 1);
        }
    }

    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: r */
    public final Object mo7r(Object obj) throws Throwable {
        int i = this.f13029l;
        a83 a83Var = a83.f116a;
        k20 k20Var = k20.f5323h;
        xk1 xk1Var = this.f13032o;
        int i2 = 2;
        t00 t00Var = null;
        switch (i) {
            case 0:
                int i3 = this.f13031n;
                if (i3 == 0) {
                    fg1.m1627T(obj);
                    xk1Var.setValue(v62.f11797a);
                    c60 c60Var = o90.f7590a;
                    t50 t50Var = t50.f10560j;
                    C0688sb c0688sb = new C0688sb(i2, t00Var, i2);
                    this.f13030m = xk1Var;
                    this.f13031n = 1;
                    obj = AbstractC0570p7.m3762R(t50Var, c0688sb, this);
                    if (obj == k20Var) {
                    }
                } else if (i3 != 1) {
                    C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                } else {
                    xk1Var = this.f13030m;
                    fg1.m1627T(obj);
                }
                xk1Var.setValue((w62) obj);
                break;
            default:
                int i4 = this.f13031n;
                if (i4 == 0) {
                    fg1.m1627T(obj);
                    xk1Var.setValue(j33.f4888a);
                    c60 c60Var2 = o90.f7590a;
                    t50 t50Var2 = t50.f10560j;
                    C0688sb c0688sb2 = new C0688sb(i2, t00Var, 3);
                    this.f13030m = xk1Var;
                    this.f13031n = 1;
                    obj = AbstractC0570p7.m3762R(t50Var2, c0688sb2, this);
                    if (obj == k20Var) {
                    }
                } else if (i4 != 1) {
                    C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                } else {
                    xk1Var = this.f13030m;
                    fg1.m1627T(obj);
                }
                xk1Var.setValue((k33) obj);
                break;
        }
        return a83Var;
    }
}
