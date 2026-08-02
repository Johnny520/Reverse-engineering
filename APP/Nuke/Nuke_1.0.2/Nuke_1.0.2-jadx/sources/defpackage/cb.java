package defpackage;

import me.dartcv.nuke.R;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cb implements nn0 {
    public final /* synthetic */ int h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ Object j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ cb(int i, Object obj, boolean z) {
        this.h = i;
        this.j = obj;
        this.i = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.nn0
    public final Object e(Object obj, Object obj2, Object obj3) {
        int i = this.h;
        a83 a83Var = a83.a;
        eb ebVar = nx.a;
        final boolean z = this.i;
        Object obj4 = this.j;
        switch (i) {
            case 0:
                final xm0 xm0Var = (xm0) obj4;
                uh1 uh1Var = (uh1) obj;
                ((Integer) obj3).getClass();
                go0 go0Var = (go0) ((px) obj2);
                go0Var.W(-196777734);
                final long j = ((g13) go0Var.j(h13.a)).a;
                boolean zE = go0Var.e(j) | go0Var.f(xm0Var) | go0Var.g(z);
                Object objL = go0Var.L();
                if (zE || objL == ebVar) {
                    objL = new in0() { // from class: db
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        @Override // defpackage.in0
                        public final Object j(Object obj5) {
                            qo qoVar = (qo) obj5;
                            return qoVar.a(new wa(xm0Var, z, rp0.X(qoVar, Float.intBitsToFloat((int) (qoVar.h.d() >> 32)) / 2.0f), new cl(j, 5)));
                        }
                    };
                    go0Var.f0(objL);
                }
                uh1 uh1VarT = qp0.t(uh1Var, (in0) objL);
                go0Var.p(false);
                return uh1VarT;
            case 1:
                xk1 xk1Var = (xk1) obj4;
                px pxVar = (px) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((bv) obj).getClass();
                go0 go0Var2 = (go0) pxVar;
                if (go0Var2.O(iIntValue & 1, (iIntValue & 17) != 16)) {
                    rh1 rh1Var = rh1.a;
                    uh1 uh1VarG = fg1.G(rh1Var, 0.0f, 0.0f, 0.0f, 8.0f, 7);
                    String strP = rg3.P(R.string.chat_avatar_rotator_duration_label, go0Var2);
                    tu2 tu2Var = ur1.a;
                    long j2 = ((lp1) go0Var2.j(tu2Var)).f;
                    long jD = rg3.D(13);
                    long jD2 = rg3.D(18);
                    im0 im0Var = im0.k;
                    eu.a(strP, uh1VarG, new m13(j2, jD, im0Var, 0L, 0, jD2, null, null, 16646136), 0, false, 0, 0, go0Var2, 48, 1016);
                    String str = (String) xk1Var.getValue();
                    boolean zF = go0Var2.f(xk1Var);
                    Object objL2 = go0Var2.L();
                    if (zF || objL2 == ebVar) {
                        objL2 = new pr(xk1Var, 8);
                        go0Var2.f0(objL2);
                    }
                    tp0.b(str, (in0) objL2, null, rg3.P(R.string.chat_avatar_rotator_duration_hint, go0Var2), null, null, false, 0, 0, false, false, null, new m51(3, 123), null, go0Var2, 0, 384, 12276);
                    if (pv2.s0((String) xk1Var.getValue()) || z) {
                        go0Var2.W(-551790700);
                        go0Var2.p(false);
                    } else {
                        go0Var2.W(-552186942);
                        eu.a(rg3.P(R.string.chat_avatar_rotator_duration_invalid, go0Var2), fg1.G(rh1Var, 0.0f, 8.0f, 0.0f, 0.0f, 13), new m13(((lp1) go0Var2.j(tu2Var)).g, rg3.D(12), im0Var, 0L, 0, rg3.D(17), null, null, 16646136), 0, false, 0, 0, go0Var2, 48, 1016);
                        go0Var2.p(false);
                    }
                } else {
                    go0Var2.R();
                }
                return a83Var;
            case 2:
                in0 in0Var = (in0) obj4;
                px pxVar2 = (px) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((o71) obj).getClass();
                go0 go0Var3 = (go0) pxVar2;
                if (go0Var3.O(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    eu.n(null, rg3.P(R.string.home_settings_safety_section, go0Var3), xe1.i0(-1479506876, new sr(in0Var, z), go0Var3), go0Var3, 384, 1);
                } else {
                    go0Var3.R();
                }
                return a83Var;
            default:
                tz2 tz2Var = (tz2) obj4;
                nx1 nx1Var = tz2Var.f;
                ((Integer) obj3).getClass();
                go0 go0Var4 = (go0) ((px) obj2);
                go0Var4.W(-2137546592);
                boolean z2 = ((qv1) nx1Var.getValue()) == qv1.h || !(go0Var4.j(ly.n) == d61.i);
                boolean zF2 = go0Var4.f(tz2Var);
                Object objL3 = go0Var4.L();
                if (zF2 || objL3 == ebVar) {
                    objL3 = new xq2(7, tz2Var);
                    go0Var4.f0(objL3);
                }
                xk1 xk1VarX = op0.x((in0) objL3, go0Var4);
                Object objL4 = go0Var4.L();
                if (objL4 == ebVar) {
                    e60 e60Var = new e60(new pr(xk1VarX, 22));
                    go0Var4.f0(e60Var);
                    objL4 = e60Var;
                }
                bm2 bm2Var = (bm2) objL4;
                boolean zF3 = go0Var4.f(bm2Var) | go0Var4.f(tz2Var);
                Object objL5 = go0Var4.L();
                if (zF3 || objL5 == ebVar) {
                    objL5 = new sz2(bm2Var, tz2Var);
                    go0Var4.f0(objL5);
                }
                uh1 uh1VarB = ul2.b((sz2) objL5, (qv1) nx1Var.getValue(), z && tz2Var.b.g() != 0.0f, z2);
                go0Var4.p(false);
                return uh1VarB;
        }
    }
}
