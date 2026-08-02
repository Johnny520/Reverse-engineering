package p000;

/* JADX INFO: renamed from: i2 */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0299i2 extends tw2 implements mn0 {

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ int f4227l;

    /* JADX INFO: renamed from: m */
    public int f4228m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ C0399kt f4229n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ z22 f4230o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0299i2(C0399kt c0399kt, z22 z22Var, t00 t00Var, int i) {
        super(2, t00Var);
        this.f4227l = i;
        this.f4229n = c0399kt;
        this.f4230o = z22Var;
    }

    @Override // p000.mn0
    /* JADX INFO: renamed from: g */
    public final Object mo12g(Object obj, Object obj2) {
        int i = this.f4227l;
        a83 a83Var = a83.f116a;
        j20 j20Var = (j20) obj;
        t00 t00Var = (t00) obj2;
        switch (i) {
        }
        return ((C0299i2) mo13p(t00Var, j20Var)).mo7r(a83Var);
    }

    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: p */
    public final t00 mo13p(t00 t00Var, Object obj) {
        int i = this.f4227l;
        z22 z22Var = this.f4230o;
        C0399kt c0399kt = this.f4229n;
        switch (i) {
            case 0:
                return new C0299i2(c0399kt, z22Var, t00Var, 0);
            case 1:
                return new C0299i2(c0399kt, z22Var, t00Var, 1);
            case 2:
                return new C0299i2(c0399kt, z22Var, t00Var, 2);
            default:
                return new C0299i2(c0399kt, z22Var, t00Var, 3);
        }
    }

    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: r */
    public final Object mo7r(Object obj) {
        int i = this.f4227l;
        a83 a83Var = a83.f116a;
        z22 z22Var = this.f4230o;
        C0399kt c0399kt = this.f4229n;
        k20 k20Var = k20.f5323h;
        switch (i) {
            case 0:
                int i2 = this.f4228m;
                if (i2 == 0) {
                    fg1.m1627T(obj);
                    bk1 bk1Var = c0399kt.f5761x;
                    if (bk1Var != null) {
                        y22 y22Var = new y22(z22Var);
                        this.f4228m = 1;
                        if (bk1Var.m554a(y22Var, this) == k20Var) {
                        }
                    }
                } else if (i2 != 1) {
                    C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                } else {
                    fg1.m1627T(obj);
                }
                break;
            case 1:
                int i3 = this.f4228m;
                if (i3 == 0) {
                    fg1.m1627T(obj);
                    bk1 bk1Var2 = c0399kt.f5761x;
                    if (bk1Var2 != null) {
                        y22 y22Var2 = new y22(z22Var);
                        this.f4228m = 1;
                        if (bk1Var2.m554a(y22Var2, this) == k20Var) {
                        }
                    }
                } else if (i3 != 1) {
                    C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                } else {
                    fg1.m1627T(obj);
                }
                break;
            case 2:
                int i4 = this.f4228m;
                if (i4 == 0) {
                    fg1.m1627T(obj);
                    bk1 bk1Var3 = c0399kt.f5761x;
                    if (bk1Var3 != null) {
                        this.f4228m = 1;
                        if (bk1Var3.m554a(z22Var, this) == k20Var) {
                        }
                    }
                } else if (i4 != 1) {
                    C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                } else {
                    fg1.m1627T(obj);
                }
                break;
            default:
                int i5 = this.f4228m;
                if (i5 == 0) {
                    fg1.m1627T(obj);
                    bk1 bk1Var4 = c0399kt.f5761x;
                    if (bk1Var4 != null) {
                        a32 a32Var = new a32(z22Var);
                        this.f4228m = 1;
                        if (bk1Var4.m554a(a32Var, this) == k20Var) {
                        }
                    }
                } else if (i5 != 1) {
                    C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                } else {
                    fg1.m1627T(obj);
                }
                break;
        }
        return k20Var;
    }
}
