package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class o10 implements nf1 {
    public final /* synthetic */ t91 a;
    public final /* synthetic */ in0 b;
    public final /* synthetic */ k03 c;
    public final /* synthetic */ us1 d;
    public final /* synthetic */ e70 e;
    public final /* synthetic */ int f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public o10(t91 t91Var, in0 in0Var, k03 k03Var, us1 us1Var, e70 e70Var, int i) {
        this.a = t91Var;
        this.b = in0Var;
        this.c = k03Var;
        this.d = us1Var;
        this.e = e70Var;
        this.f = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.nf1
    public final int d(m11 m11Var, List list, int i) {
        t91 t91Var = this.a;
        t91Var.a.a(m11Var.getLayoutDirection());
        cj cjVar = t91Var.a.j;
        if (cjVar != null) {
            return qp0.l(cjVar.c());
        }
        s.l("layoutIntrinsics must be called first");
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01fb  */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2, types: [c61] */
    /* JADX WARN: Type inference failed for: r14v6 */
    @Override // defpackage.nf1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final of1 g(pf1 pf1Var, List list, long j) {
        long j2;
        y03 y03Var;
        d61 d61Var;
        of1 of1Var;
        y03 y03Var2;
        int i;
        o10 o10Var;
        t91 t91Var = this.a;
        vr2 vr2VarB = tl.B();
        in0 in0VarE = vr2VarB != null ? vr2VarB.e() : null;
        vr2 vr2VarK = tl.K(vr2VarB);
        try {
            z03 z03VarD = t91Var.d();
            y03 y03Var3 = z03VarD != null ? z03VarD.a : null;
            iz2 iz2Var = t91Var.a;
            d61 layoutDirection = pf1Var.getLayoutDirection();
            int i2 = iz2Var.f;
            boolean z = iz2Var.e;
            int i3 = iz2Var.c;
            if (y03Var3 != null) {
                lj1 lj1Var = y03Var3.b;
                x03 x03Var = y03Var3.a;
                sd sdVar = iz2Var.a;
                m13 m13Var = iz2Var.b;
                List list2 = iz2Var.i;
                of1Var = null;
                e70 e70Var = iz2Var.g;
                xl0 xl0Var = iz2Var.h;
                y03 y03Var4 = y03Var3;
                if (lj1Var.a.b()) {
                    j2 = j;
                    d61Var = layoutDirection;
                } else {
                    sd sdVar2 = x03Var.a;
                    long j3 = x03Var.j;
                    if (t11.l(sdVar2, sdVar) && x03Var.b.c(m13Var) && t11.l(x03Var.c, list2) && x03Var.d == i3 && x03Var.e == z && x03Var.f == i2 && t11.l(x03Var.g, e70Var)) {
                        d61Var = layoutDirection;
                        if (x03Var.h == d61Var && t11.l(x03Var.i, xl0Var) && fz.j(j) == fz.j(j3) && ((!z && i2 != 2) || (fz.h(j) == fz.h(j3) && fz.g(j) == fz.g(j3)))) {
                            y03Var = y03Var4;
                            y03Var2 = new y03(new x03(x03Var.a, iz2Var.b, x03Var.c, x03Var.d, x03Var.e, x03Var.f, x03Var.g, x03Var.h, x03Var.i, j), lj1Var, gz.d(j, (((long) qp0.l(lj1Var.e)) & 4294967295L) | (((long) qp0.l(lj1Var.d)) << 32)));
                            long j4 = y03Var2.c;
                            Integer numValueOf = Integer.valueOf((int) (j4 >> 32));
                            Integer numValueOf2 = Integer.valueOf((int) (j4 & 4294967295L));
                            int iIntValue = numValueOf.intValue();
                            int iIntValue2 = numValueOf2.intValue();
                            if (t11.l(y03Var, y03Var2)) {
                                t91Var.i.setValue(new z03(y03Var2, z03VarD != null ? z03VarD.c : of1Var));
                                i = 0;
                                t91Var.p = false;
                                o10Var = this;
                                o10Var.b.j(y03Var2);
                                gf1.E(t91Var, o10Var.c, o10Var.d);
                            } else {
                                i = 0;
                                o10Var = this;
                            }
                            t91Var.g.setValue(new za0(o10Var.e.u0(o10Var.f != 1 ? qp0.l(y03Var2.b.b(i)) : i)));
                            return pf1Var.j0(iIntValue, iIntValue2, we1.q0(new ow1(u5.a, Integer.valueOf(Math.round(y03Var2.d))), new ow1(u5.b, Integer.valueOf(Math.round(y03Var2.e)))), new w(24));
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
            iz2Var.a(d61Var);
            int iJ = fz.j(j2);
            int iH = ((z || i2 == 2) && fz.d(j2)) ? fz.h(j2) : Integer.MAX_VALUE;
            int i4 = (z || i2 != 2) ? i3 : 1;
            if (iJ != iH) {
                cj cjVar = iz2Var.j;
                if (cjVar == null) {
                    s.l("layoutIntrinsics must be called first");
                    return of1Var;
                }
                iH = ci0.D(qp0.l(cjVar.c()), iJ, iH);
            }
            cj cjVar2 = iz2Var.j;
            if (cjVar2 == null) {
                s.l("layoutIntrinsics must be called first");
                return of1Var;
            }
            lj1 lj1Var2 = new lj1(cjVar2, rp0.d0(0, iH, 0, fz.g(j2)), i4, iz2Var.f);
            y03Var2 = new y03(new x03(iz2Var.a, iz2Var.b, iz2Var.i, iz2Var.c, iz2Var.e, iz2Var.f, iz2Var.g, d61Var, iz2Var.h, j2), lj1Var2, gz.d(j2, (((long) qp0.l(lj1Var2.d)) << 32) | (((long) qp0.l(lj1Var2.e)) & 4294967295L)));
            long j42 = y03Var2.c;
            Integer numValueOf3 = Integer.valueOf((int) (j42 >> 32));
            Integer numValueOf22 = Integer.valueOf((int) (j42 & 4294967295L));
            int iIntValue3 = numValueOf3.intValue();
            int iIntValue22 = numValueOf22.intValue();
            if (t11.l(y03Var, y03Var2)) {
            }
            t91Var.g.setValue(new za0(o10Var.e.u0(o10Var.f != 1 ? qp0.l(y03Var2.b.b(i)) : i)));
            return pf1Var.j0(iIntValue3, iIntValue22, we1.q0(new ow1(u5.a, Integer.valueOf(Math.round(y03Var2.d))), new ow1(u5.b, Integer.valueOf(Math.round(y03Var2.e)))), new w(24));
        } finally {
            tl.U(vr2VarB, vr2VarK, in0VarE);
        }
    }
}
