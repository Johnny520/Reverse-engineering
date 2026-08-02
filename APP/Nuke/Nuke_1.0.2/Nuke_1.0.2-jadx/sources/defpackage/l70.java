package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l70 implements in0 {
    public final /* synthetic */ int h;
    public final /* synthetic */ int i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ l70(sz1[] sz1VarArr, ob2 ob2Var, int i, int[] iArr) {
        this.h = 2;
        this.j = sz1VarArr;
        this.k = ob2Var;
        this.i = i;
        this.l = iArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.in0
    public final Object j(Object obj) {
        int i = this.h;
        int i2 = 0;
        a83 a83Var = a83.a;
        Object obj2 = this.l;
        int i3 = this.i;
        Object obj3 = this.k;
        Object obj4 = this.j;
        switch (i) {
            case 0:
                e11 e11Var = (e11) obj3;
                gk1 gk1Var = (gk1) obj2;
                if (obj == ((n70) obj4)) {
                    s.l("A derived state calculation cannot read itself");
                } else if (obj instanceof pu2) {
                    int i4 = e11Var.a - i3;
                    int iD = gk1Var.d(obj);
                    gk1Var.g(Math.min(i4, iD >= 0 ? gk1Var.c[iD] : Integer.MAX_VALUE), obj);
                }
                break;
            case 1:
                hu0 hu0Var = (hu0) obj4;
                pf1 pf1Var = (pf1) obj3;
                sz1 sz1Var = (sz1) obj2;
                rz1 rz1Var = (rz1) obj;
                int i5 = hu0Var.b;
                tz2 tz2Var = hu0Var.a;
                q33 q33Var = hu0Var.c;
                z03 z03Var = (z03) hu0Var.d.a();
                tz2Var.a(qv1.i, tp0.f(rz1Var, i5, q33Var, z03Var != null ? z03Var.a : null, pf1Var.getLayoutDirection() == d61.i, sz1Var.h), i3, sz1Var.h);
                rz1.i(rz1Var, sz1Var, Math.round(-tz2Var.a.g()), 0);
                break;
            default:
                sz1[] sz1VarArr = (sz1[]) obj4;
                ob2 ob2Var = (ob2) obj3;
                int[] iArr = (int[]) obj2;
                rz1 rz1Var2 = (rz1) obj;
                int length = sz1VarArr.length;
                int i6 = 0;
                while (i2 < length) {
                    sz1 sz1Var2 = sz1VarArr[i2];
                    int i7 = i6 + 1;
                    sz1Var2.getClass();
                    Object objI = sz1Var2.i();
                    mb2 mb2Var = objI instanceof mb2 ? (mb2) objI : null;
                    t20 t20Var = mb2Var != null ? mb2Var.c : null;
                    rz1.g(rz1Var2, sz1Var2, iArr[i6], t20Var != null ? t20Var.a.a(sz1Var2.i, i3, d61.h) : Math.round((1.0f + ob2Var.b.a) * ((i3 - sz1Var2.i) / 2.0f)));
                    i2++;
                    i6 = i7;
                }
                break;
        }
        return a83Var;
    }

    public /* synthetic */ l70(Object obj, Object obj2, Object obj3, int i, int i2) {
        this.h = i2;
        this.j = obj;
        this.k = obj2;
        this.l = obj3;
        this.i = i;
    }
}
