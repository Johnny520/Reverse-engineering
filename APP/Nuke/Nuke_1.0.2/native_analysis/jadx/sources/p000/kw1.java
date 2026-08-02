package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class kw1 extends th1 implements j61 {

    /* JADX INFO: renamed from: v */
    public jw1 f5839v;

    @Override // p000.j61
    /* JADX INFO: renamed from: e */
    public final of1 mo1363e(pf1 pf1Var, if1 if1Var, long j) {
        jw1 jw1Var = this.f5839v;
        d61 layoutDirection = pf1Var.getLayoutDirection();
        d61 d61Var = d61.f1885h;
        float f = layoutDirection == d61Var ? jw1Var.f5244a : jw1Var.f5246c;
        jw1 jw1Var2 = this.f5839v;
        float f2 = jw1Var2.f5245b;
        float f3 = pf1Var.getLayoutDirection() == d61Var ? jw1Var2.f5246c : jw1Var2.f5244a;
        float f4 = this.f5839v.f5247d;
        if (!((za0.m6403a(f, 0.0f) >= 0) & (za0.m6403a(f2, 0.0f) >= 0) & (za0.m6403a(f3, 0.0f) >= 0) & (za0.m6403a(f4, 0.0f) >= 0))) {
            iz0.m2423a("Padding must be non-negative");
        }
        int iMo692T = pf1Var.mo692T(f);
        int iMo692T2 = pf1Var.mo692T(f3) + iMo692T;
        int iMo692T3 = pf1Var.mo692T(f2);
        int iMo692T4 = pf1Var.mo692T(f4) + iMo692T3;
        sz1 sz1VarMo2340e = if1Var.mo2340e(AbstractC0258gz.m2035i(-iMo692T2, -iMo692T4, j));
        return pf1Var.mo696j0(AbstractC0258gz.m2033g(j, sz1VarMo2340e.f10438h + iMo692T2), AbstractC0258gz.m2032f(j, sz1VarMo2340e.f10439i + iMo692T4), ce0.f1492h, new e01(iMo692T, iMo692T3, 1, sz1VarMo2340e));
    }
}
