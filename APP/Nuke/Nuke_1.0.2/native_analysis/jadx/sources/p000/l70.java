package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l70 implements in0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f5966h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f5967i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f5968j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f5969k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Object f5970l;

    public /* synthetic */ l70(sz1[] sz1VarArr, ob2 ob2Var, int i, int[] iArr) {
        this.f5966h = 2;
        this.f5968j = sz1VarArr;
        this.f5969k = ob2Var;
        this.f5967i = i;
        this.f5970l = iArr;
    }

    @Override // p000.in0
    /* JADX INFO: renamed from: j */
    public final Object mo5j(Object obj) {
        int i = this.f5966h;
        int i2 = 0;
        a83 a83Var = a83.f116a;
        Object obj2 = this.f5970l;
        int i3 = this.f5967i;
        Object obj3 = this.f5969k;
        Object obj4 = this.f5968j;
        switch (i) {
            case 0:
                e11 e11Var = (e11) obj3;
                gk1 gk1Var = (gk1) obj2;
                if (obj == ((n70) obj4)) {
                    C0676s.m4653l("A derived state calculation cannot read itself");
                } else if (obj instanceof pu2) {
                    int i4 = e11Var.f2293a - i3;
                    int iM1933d = gk1Var.m1933d(obj);
                    gk1Var.m1936g(Math.min(i4, iM1933d >= 0 ? gk1Var.f3554c[iM1933d] : Integer.MAX_VALUE), obj);
                }
                break;
            case 1:
                hu0 hu0Var = (hu0) obj4;
                pf1 pf1Var = (pf1) obj3;
                sz1 sz1Var = (sz1) obj2;
                rz1 rz1Var = (rz1) obj;
                int i5 = hu0Var.f4138b;
                tz2 tz2Var = hu0Var.f4137a;
                q33 q33Var = hu0Var.f4139c;
                z03 z03Var = (z03) hu0Var.f4140d.mo6a();
                tz2Var.m5449a(qv1.f9206i, tp0.m5361f(rz1Var, i5, q33Var, z03Var != null ? z03Var.f13697a : null, pf1Var.getLayoutDirection() == d61.f1886i, sz1Var.f10438h), i3, sz1Var.f10438h);
                rz1.m4641i(rz1Var, sz1Var, Math.round(-tz2Var.f11013a.m2591g()), 0);
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
                    Object objMo2342i = sz1Var2.mo2342i();
                    mb2 mb2Var = objMo2342i instanceof mb2 ? (mb2) objMo2342i : null;
                    t20 t20Var = mb2Var != null ? mb2Var.f6553c : null;
                    rz1.m4639g(rz1Var2, sz1Var2, iArr[i6], t20Var != null ? t20Var.f10505a.m3868a(sz1Var2.f10439i, i3, d61.f1885h) : Math.round((1.0f + ob2Var.f7615b.f9011a) * ((i3 - sz1Var2.f10439i) / 2.0f)));
                    i2++;
                    i6 = i7;
                }
                break;
        }
        return a83Var;
    }

    public /* synthetic */ l70(Object obj, Object obj2, Object obj3, int i, int i2) {
        this.f5966h = i2;
        this.f5968j = obj;
        this.f5969k = obj2;
        this.f5970l = obj3;
        this.f5967i = i;
    }
}
