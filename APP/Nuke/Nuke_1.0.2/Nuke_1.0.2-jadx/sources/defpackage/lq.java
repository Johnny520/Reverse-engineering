package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class lq implements ak0 {
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ lq(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.h = i;
        this.i = obj;
        this.j = obj2;
        this.k = obj3;
        this.l = obj4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ce  */
    @Override // defpackage.ak0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m(Object obj, t00 t00Var) {
        kq kqVar;
        int i = this.h;
        int i2 = 1;
        int i3 = 0;
        a83 a83Var = a83.a;
        Object obj2 = this.l;
        Object obj3 = this.i;
        Object obj4 = this.j;
        Object obj5 = this.k;
        switch (i) {
            case 0:
                o72 o72Var = (o72) obj3;
                if (t00Var instanceof kq) {
                    kqVar = (kq) t00Var;
                    int i4 = kqVar.n;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        kqVar.n = i4 - Integer.MIN_VALUE;
                    } else {
                        kqVar = new kq(this, t00Var);
                    }
                }
                Object obj6 = kqVar.l;
                int i5 = kqVar.n;
                if (i5 == 0) {
                    fg1.T(obj6);
                    k21 k21Var = (k21) o72Var.i;
                    if (k21Var != null) {
                        k21Var.c(new ks("Child of the scoped flow was cancelled", i3));
                        kqVar.k = obj;
                        kqVar.n = 1;
                        Object objA = k21Var.A(kqVar);
                        k20 k20Var = k20.h;
                        if (objA == k20Var) {
                        }
                    }
                } else if (i5 != 1) {
                    s.l("call to 'resume' before 'invoke' with coroutine");
                } else {
                    obj = kqVar.k;
                    fg1.T(obj6);
                }
                o72Var.i = p7.A((j20) obj4, null, new jq((mq) obj5, (ak0) obj2, obj, null), 1);
                break;
            case 1:
                b03 b03Var = (b03) obj5;
                t91 t91Var = (t91) obj3;
                if (((Boolean) obj).booleanValue() && t91Var.b()) {
                    gf1.T((o03) obj4, t91Var, b03Var.n(), (xx0) obj2, b03Var.b);
                } else {
                    gf1.s(t91Var);
                }
                break;
            default:
                j11 j11Var = (j11) obj;
                a72 a72Var = (a72) obj5;
                a72 a72Var2 = (a72) obj4;
                a72 a72Var3 = (a72) obj3;
                if (j11Var instanceof z22) {
                    a72Var3.h++;
                } else if ((j11Var instanceof a32) || (j11Var instanceof y22)) {
                    a72Var3.h--;
                } else if (j11Var instanceof xu0) {
                    a72Var2.h++;
                } else if (j11Var instanceof yu0) {
                    a72Var2.h--;
                } else if (j11Var instanceof tk0) {
                    a72Var.h++;
                } else if (j11Var instanceof uk0) {
                    a72Var.h--;
                }
                boolean z = a72Var3.h > 0;
                boolean z2 = a72Var2.h > 0;
                boolean z3 = a72Var.h > 0;
                i50 i50Var = (i50) obj2;
                if (i50Var.w != z) {
                    i50Var.w = z;
                    i3 = 1;
                }
                if (i50Var.x != z2) {
                    i50Var.x = z2;
                    i3 = 1;
                }
                if (i50Var.y != z3) {
                    i50Var.y = z3;
                } else {
                    i2 = i3;
                }
                if (i2 != 0) {
                    ci0.M(i50Var);
                }
                break;
        }
        return a83Var;
    }
}
