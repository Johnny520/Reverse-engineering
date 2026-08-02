package p000;

/* JADX INFO: renamed from: g2 */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0225g2 extends tw2 implements mn0 {

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ int f3253l;

    /* JADX INFO: renamed from: m */
    public int f3254m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ bk1 f3255n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ z22 f3256o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0225g2(z22 z22Var, bk1 bk1Var, t00 t00Var) {
        super(2, t00Var);
        this.f3253l = 0;
        this.f3256o = z22Var;
        this.f3255n = bk1Var;
    }

    @Override // p000.mn0
    /* JADX INFO: renamed from: g */
    public final Object mo12g(Object obj, Object obj2) {
        int i = this.f3253l;
        a83 a83Var = a83.f116a;
        j20 j20Var = (j20) obj;
        t00 t00Var = (t00) obj2;
        switch (i) {
        }
        return ((C0225g2) mo13p(t00Var, j20Var)).mo7r(a83Var);
    }

    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: p */
    public final t00 mo13p(t00 t00Var, Object obj) {
        int i = this.f3253l;
        z22 z22Var = this.f3256o;
        bk1 bk1Var = this.f3255n;
        switch (i) {
            case 0:
                return new C0225g2(z22Var, bk1Var, t00Var);
            case 1:
                return new C0225g2(bk1Var, z22Var, t00Var, 1);
            default:
                return new C0225g2(bk1Var, z22Var, t00Var, 2);
        }
    }

    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: r */
    public final Object mo7r(Object obj) {
        int i = this.f3253l;
        a83 a83Var = a83.f116a;
        z22 z22Var = this.f3256o;
        bk1 bk1Var = this.f3255n;
        k20 k20Var = k20.f5323h;
        switch (i) {
            case 0:
                int i2 = this.f3254m;
                if (i2 == 0) {
                    fg1.m1627T(obj);
                    a32 a32Var = new a32(z22Var);
                    this.f3254m = 1;
                    if (bk1Var.m554a(a32Var, this) == k20Var) {
                    }
                } else if (i2 != 1) {
                    C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                } else {
                    fg1.m1627T(obj);
                }
                break;
            case 1:
                int i3 = this.f3254m;
                if (i3 == 0) {
                    fg1.m1627T(obj);
                    this.f3254m = 1;
                    if (bk1Var.m554a(z22Var, this) == k20Var) {
                    }
                } else if (i3 != 1) {
                    C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                } else {
                    fg1.m1627T(obj);
                }
                break;
            default:
                int i4 = this.f3254m;
                if (i4 == 0) {
                    fg1.m1627T(obj);
                    this.f3254m = 1;
                    if (bk1Var.m554a(z22Var, this) == k20Var) {
                    }
                } else if (i4 != 1) {
                    C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                } else {
                    fg1.m1627T(obj);
                }
                break;
        }
        return k20Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0225g2(bk1 bk1Var, z22 z22Var, t00 t00Var, int i) {
        super(2, t00Var);
        this.f3253l = i;
        this.f3255n = bk1Var;
        this.f3256o = z22Var;
    }
}
