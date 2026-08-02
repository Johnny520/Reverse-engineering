package p000;

/* JADX INFO: renamed from: lq */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0433lq implements ak0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f6242h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f6243i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f6244j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f6245k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Object f6246l;

    public /* synthetic */ C0433lq(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f6242h = i;
        this.f6243i = obj;
        this.f6244j = obj2;
        this.f6245k = obj3;
        this.f6246l = obj4;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x00ce  */
    @Override // p000.ak0
    /* JADX INFO: renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo181m(Object obj, t00 t00Var) {
        C0396kq c0396kq;
        int i = this.f6242h;
        int i2 = 1;
        int i3 = 0;
        a83 a83Var = a83.f116a;
        Object obj2 = this.f6246l;
        Object obj3 = this.f6243i;
        Object obj4 = this.f6244j;
        Object obj5 = this.f6245k;
        switch (i) {
            case 0:
                o72 o72Var = (o72) obj3;
                if (t00Var instanceof C0396kq) {
                    c0396kq = (C0396kq) t00Var;
                    int i4 = c0396kq.f5707n;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        c0396kq.f5707n = i4 - Integer.MIN_VALUE;
                    } else {
                        c0396kq = new C0396kq(this, t00Var);
                    }
                }
                Object obj6 = c0396kq.f5705l;
                int i5 = c0396kq.f5707n;
                if (i5 == 0) {
                    fg1.m1627T(obj6);
                    k21 k21Var = (k21) o72Var.f7574i;
                    if (k21Var != null) {
                        k21Var.mo1704c(new C0398ks("Child of the scoped flow was cancelled", i3));
                        c0396kq.f5704k = obj;
                        c0396kq.f5707n = 1;
                        Object objMo1701A = k21Var.mo1701A(c0396kq);
                        k20 k20Var = k20.f5323h;
                        if (objMo1701A == k20Var) {
                        }
                    }
                } else if (i5 != 1) {
                    C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                } else {
                    obj = c0396kq.f5704k;
                    fg1.m1627T(obj6);
                }
                o72Var.f7574i = AbstractC0570p7.m3745A((j20) obj4, null, new C0359jq((C0470mq) obj5, (ak0) obj2, obj, null), 1);
                break;
            case 1:
                b03 b03Var = (b03) obj5;
                t91 t91Var = (t91) obj3;
                if (((Boolean) obj).booleanValue() && t91Var.m5144b()) {
                    gf1.m1872T((o03) obj4, t91Var, b03Var.m350n(), (xx0) obj2, b03Var.f481b);
                } else {
                    gf1.m1901s(t91Var);
                }
                break;
            default:
                j11 j11Var = (j11) obj;
                a72 a72Var = (a72) obj5;
                a72 a72Var2 = (a72) obj4;
                a72 a72Var3 = (a72) obj3;
                if (j11Var instanceof z22) {
                    a72Var3.f108h++;
                } else if ((j11Var instanceof a32) || (j11Var instanceof y22)) {
                    a72Var3.f108h--;
                } else if (j11Var instanceof xu0) {
                    a72Var2.f108h++;
                } else if (j11Var instanceof yu0) {
                    a72Var2.f108h--;
                } else if (j11Var instanceof tk0) {
                    a72Var.f108h++;
                } else if (j11Var instanceof uk0) {
                    a72Var.f108h--;
                }
                boolean z = a72Var3.f108h > 0;
                boolean z2 = a72Var2.f108h > 0;
                boolean z3 = a72Var.f108h > 0;
                i50 i50Var = (i50) obj2;
                if (i50Var.f4278w != z) {
                    i50Var.f4278w = z;
                    i3 = 1;
                }
                if (i50Var.f4279x != z2) {
                    i50Var.f4279x = z2;
                    i3 = 1;
                }
                if (i50Var.f4280y != z3) {
                    i50Var.f4280y = z3;
                } else {
                    i2 = i3;
                }
                if (i2 != 0) {
                    ci0.m788M(i50Var);
                }
                break;
        }
        return a83Var;
    }
}
