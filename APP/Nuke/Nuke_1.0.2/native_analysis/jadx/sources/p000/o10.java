package p000;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class o10 implements nf1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ t91 f7411a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ in0 f7412b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ k03 f7413c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ us1 f7414d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ e70 f7415e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f7416f;

    public o10(t91 t91Var, in0 in0Var, k03 k03Var, us1 us1Var, e70 e70Var, int i) {
        this.f7411a = t91Var;
        this.f7412b = in0Var;
        this.f7413c = k03Var;
        this.f7414d = us1Var;
        this.f7415e = e70Var;
        this.f7416f = i;
    }

    @Override // p000.nf1
    /* JADX INFO: renamed from: d */
    public final int mo284d(m11 m11Var, List list, int i) {
        t91 t91Var = this.f7411a;
        t91Var.f10622a.m2425a(m11Var.getLayoutDirection());
        C0093cj c0093cj = t91Var.f10622a.f4856j;
        if (c0093cj != null) {
            return qp0.m4257l(c0093cj.mo828c());
        }
        C0676s.m4653l("layoutIntrinsics must be called first");
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01fb  */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2, types: [c61] */
    /* JADX WARN: Type inference failed for: r14v6 */
    @Override // p000.nf1
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final of1 mo287g(pf1 pf1Var, List list, long j) {
        long j2;
        y03 y03Var;
        d61 d61Var;
        of1 of1Var;
        y03 y03Var2;
        int i;
        o10 o10Var;
        t91 t91Var = this.f7411a;
        vr2 vr2VarM5275B = AbstractC0738tl.m5275B();
        in0 in0VarMo77e = vr2VarM5275B != null ? vr2VarM5275B.mo77e() : null;
        vr2 vr2VarM5283K = AbstractC0738tl.m5283K(vr2VarM5275B);
        try {
            z03 z03VarM5146d = t91Var.m5146d();
            y03 y03Var3 = z03VarM5146d != null ? z03VarM5146d.f13697a : null;
            iz2 iz2Var = t91Var.f10622a;
            d61 layoutDirection = pf1Var.getLayoutDirection();
            int i2 = iz2Var.f4852f;
            boolean z = iz2Var.f4851e;
            int i3 = iz2Var.f4849c;
            if (y03Var3 != null) {
                lj1 lj1Var = y03Var3.f13267b;
                x03 x03Var = y03Var3.f13266a;
                C0690sd c0690sd = iz2Var.f4847a;
                m13 m13Var = iz2Var.f4848b;
                List list2 = iz2Var.f4855i;
                of1Var = null;
                e70 e70Var = iz2Var.f4853g;
                xl0 xl0Var = iz2Var.f4854h;
                y03 y03Var4 = y03Var3;
                if (lj1Var.f6146a.mo827b()) {
                    j2 = j;
                    d61Var = layoutDirection;
                } else {
                    C0690sd c0690sd2 = x03Var.f12754a;
                    long j3 = x03Var.f12763j;
                    if (t11.m5086l(c0690sd2, c0690sd) && x03Var.f12755b.m3026c(m13Var) && t11.m5086l(x03Var.f12756c, list2) && x03Var.f12757d == i3 && x03Var.f12758e == z && x03Var.f12759f == i2 && t11.m5086l(x03Var.f12760g, e70Var)) {
                        d61Var = layoutDirection;
                        if (x03Var.f12761h == d61Var && t11.m5086l(x03Var.f12762i, xl0Var) && C0221fz.m1765j(j) == C0221fz.m1765j(j3) && ((!z && i2 != 2) || (C0221fz.m1763h(j) == C0221fz.m1763h(j3) && C0221fz.m1762g(j) == C0221fz.m1762g(j3)))) {
                            y03Var = y03Var4;
                            y03Var2 = new y03(new x03(x03Var.f12754a, iz2Var.f4848b, x03Var.f12756c, x03Var.f12757d, x03Var.f12758e, x03Var.f12759f, x03Var.f12760g, x03Var.f12761h, x03Var.f12762i, j), lj1Var, AbstractC0258gz.m2030d(j, (((long) qp0.m4257l(lj1Var.f6150e)) & 4294967295L) | (((long) qp0.m4257l(lj1Var.f6149d)) << 32)));
                            long j4 = y03Var2.f13268c;
                            Integer numValueOf = Integer.valueOf((int) (j4 >> 32));
                            Integer numValueOf2 = Integer.valueOf((int) (j4 & 4294967295L));
                            int iIntValue = numValueOf.intValue();
                            int iIntValue2 = numValueOf2.intValue();
                            if (t11.m5086l(y03Var, y03Var2)) {
                                t91Var.f10630i.setValue(new z03(y03Var2, z03VarM5146d != null ? z03VarM5146d.f13699c : of1Var));
                                i = 0;
                                t91Var.f10637p = false;
                                o10Var = this;
                                o10Var.f7412b.mo5j(y03Var2);
                                gf1.m1857E(t91Var, o10Var.f7413c, o10Var.f7414d);
                            } else {
                                i = 0;
                                o10Var = this;
                            }
                            t91Var.f10628g.setValue(new za0(o10Var.f7415e.mo700u0(o10Var.f7416f != 1 ? qp0.m4257l(y03Var2.f13267b.m2915b(i)) : i)));
                            return pf1Var.mo696j0(iIntValue, iIntValue2, we1.m5876q0(new ow1(AbstractC0761u5.f11107a, Integer.valueOf(Math.round(y03Var2.f13269d))), new ow1(AbstractC0761u5.f11108b, Integer.valueOf(Math.round(y03Var2.f13270e)))), new C0829w(24));
                        }
                        j2 = j;
                    } else {
                        j2 = j;
                        y03Var = y03Var4;
                        d61Var = layoutDirection;
                    }
                }
                y03Var = y03Var4;
            } else {
                j2 = j;
                y03Var = y03Var3;
                d61Var = layoutDirection;
                of1Var = null;
            }
            iz2Var.m2425a(d61Var);
            int iM1765j = C0221fz.m1765j(j2);
            int iM1763h = ((z || i2 == 2) && C0221fz.m1759d(j2)) ? C0221fz.m1763h(j2) : Integer.MAX_VALUE;
            int i4 = (z || i2 != 2) ? i3 : 1;
            if (iM1765j != iM1763h) {
                C0093cj c0093cj = iz2Var.f4856j;
                if (c0093cj == null) {
                    C0676s.m4653l("layoutIntrinsics must be called first");
                    return of1Var;
                }
                iM1763h = ci0.m779D(qp0.m4257l(c0093cj.mo828c()), iM1765j, iM1763h);
            }
            C0093cj c0093cj2 = iz2Var.f4856j;
            if (c0093cj2 == null) {
                C0676s.m4653l("layoutIntrinsics must be called first");
                return of1Var;
            }
            lj1 lj1Var2 = new lj1(c0093cj2, rp0.m4543d0(0, iM1763h, 0, C0221fz.m1762g(j2)), i4, iz2Var.f4852f);
            y03Var2 = new y03(new x03(iz2Var.f4847a, iz2Var.f4848b, iz2Var.f4855i, iz2Var.f4849c, iz2Var.f4851e, iz2Var.f4852f, iz2Var.f4853g, d61Var, iz2Var.f4854h, j2), lj1Var2, AbstractC0258gz.m2030d(j2, (((long) qp0.m4257l(lj1Var2.f6149d)) << 32) | (((long) qp0.m4257l(lj1Var2.f6150e)) & 4294967295L)));
            long j42 = y03Var2.f13268c;
            Integer numValueOf3 = Integer.valueOf((int) (j42 >> 32));
            Integer numValueOf22 = Integer.valueOf((int) (j42 & 4294967295L));
            int iIntValue3 = numValueOf3.intValue();
            int iIntValue22 = numValueOf22.intValue();
            if (t11.m5086l(y03Var, y03Var2)) {
            }
            t91Var.f10628g.setValue(new za0(o10Var.f7415e.mo700u0(o10Var.f7416f != 1 ? qp0.m4257l(y03Var2.f13267b.m2915b(i)) : i)));
            return pf1Var.mo696j0(iIntValue3, iIntValue22, we1.m5876q0(new ow1(AbstractC0761u5.f11107a, Integer.valueOf(Math.round(y03Var2.f13269d))), new ow1(AbstractC0761u5.f11108b, Integer.valueOf(Math.round(y03Var2.f13270e)))), new C0829w(24));
        } finally {
            AbstractC0738tl.m5292U(vr2VarM5275B, vr2VarM5283K, in0VarMo77e);
        }
    }
}
