package p000;

import me.dartcv.nuke.R;

/* JADX INFO: renamed from: cb */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0085cb implements nn0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f1293h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ boolean f1294i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f1295j;

    public /* synthetic */ C0085cb(int i, Object obj, boolean z) {
        this.f1293h = i;
        this.f1295j = obj;
        this.f1294i = z;
    }

    @Override // p000.nn0
    /* JADX INFO: renamed from: e */
    public final Object mo489e(Object obj, Object obj2, Object obj3) {
        int i = this.f1293h;
        a83 a83Var = a83.f116a;
        C0160eb c0160eb = C0520nx.f7360a;
        final boolean z = this.f1294i;
        Object obj4 = this.f1295j;
        switch (i) {
            case 0:
                final xm0 xm0Var = (xm0) obj4;
                uh1 uh1Var = (uh1) obj;
                ((Integer) obj3).getClass();
                go0 go0Var = (go0) ((InterfaceC0596px) obj2);
                go0Var.m1966W(-196777734);
                final long j = ((g13) go0Var.m1988j(h13.f3782a)).f3251a;
                boolean zM1978e = go0Var.m1978e(j) | go0Var.m1980f(xm0Var) | go0Var.m1982g(z);
                Object objM1956L = go0Var.m1956L();
                if (zM1978e || objM1956L == c0160eb) {
                    objM1956L = new in0() { // from class: db
                        @Override // p000.in0
                        /* JADX INFO: renamed from: j */
                        public final Object mo5j(Object obj5) {
                            C0626qo c0626qo = (C0626qo) obj5;
                            return c0626qo.m4218a(new C0840wa(xm0Var, z, rp0.m4538X(c0626qo, Float.intBitsToFloat((int) (c0626qo.f9053h.mo1842d() >> 32)) / 2.0f), new C0095cl(j, 5)));
                        }
                    };
                    go0Var.m1981f0(objM1956L);
                }
                uh1 uh1VarM4265t = qp0.m4265t(uh1Var, (in0) objM1956L);
                go0Var.m1994p(false);
                return uh1VarM4265t;
            case 1:
                xk1 xk1Var = (xk1) obj4;
                InterfaceC0596px interfaceC0596px = (InterfaceC0596px) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((C0069bv) obj).getClass();
                go0 go0Var2 = (go0) interfaceC0596px;
                if (go0Var2.m1958O(iIntValue & 1, (iIntValue & 17) != 16)) {
                    rh1 rh1Var = rh1.f9587a;
                    uh1 uh1VarM1615G = fg1.m1615G(rh1Var, 0.0f, 0.0f, 0.0f, 8.0f, 7);
                    String strM4462P = rg3.m4462P(R.string.chat_avatar_rotator_duration_label, go0Var2);
                    tu2 tu2Var = ur1.f11452a;
                    long j2 = ((lp1) go0Var2.m1988j(tu2Var)).f6238f;
                    long jM4450D = rg3.m4450D(13);
                    long jM4450D2 = rg3.m4450D(18);
                    im0 im0Var = im0.f4681k;
                    AbstractC0179eu.m1446a(strM4462P, uh1VarM1615G, new m13(j2, jM4450D, im0Var, 0L, 0, jM4450D2, null, null, 16646136), 0, false, 0, 0, go0Var2, 48, 1016);
                    String str = (String) xk1Var.getValue();
                    boolean zM1980f = go0Var2.m1980f(xk1Var);
                    Object objM1956L2 = go0Var2.m1956L();
                    if (zM1980f || objM1956L2 == c0160eb) {
                        objM1956L2 = new C0590pr(xk1Var, 8);
                        go0Var2.m1981f0(objM1956L2);
                    }
                    tp0.m5357b(str, (in0) objM1956L2, null, rg3.m4462P(R.string.chat_avatar_rotator_duration_hint, go0Var2), null, null, false, 0, 0, false, false, null, new m51(3, 123), null, go0Var2, 0, 384, 12276);
                    if (pv2.m4006s0((String) xk1Var.getValue()) || z) {
                        go0Var2.m1966W(-551790700);
                        go0Var2.m1994p(false);
                    } else {
                        go0Var2.m1966W(-552186942);
                        AbstractC0179eu.m1446a(rg3.m4462P(R.string.chat_avatar_rotator_duration_invalid, go0Var2), fg1.m1615G(rh1Var, 0.0f, 8.0f, 0.0f, 0.0f, 13), new m13(((lp1) go0Var2.m1988j(tu2Var)).f6239g, rg3.m4450D(12), im0Var, 0L, 0, rg3.m4450D(17), null, null, 16646136), 0, false, 0, 0, go0Var2, 48, 1016);
                        go0Var2.m1994p(false);
                    }
                } else {
                    go0Var2.m1961R();
                }
                return a83Var;
            case 2:
                in0 in0Var = (in0) obj4;
                InterfaceC0596px interfaceC0596px2 = (InterfaceC0596px) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((o71) obj).getClass();
                go0 go0Var3 = (go0) interfaceC0596px2;
                if (go0Var3.m1958O(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    AbstractC0179eu.m1464n(null, rg3.m4462P(R.string.home_settings_safety_section, go0Var3), xe1.m6126i0(-1479506876, new C0704sr(in0Var, z), go0Var3), go0Var3, 384, 1);
                } else {
                    go0Var3.m1961R();
                }
                return a83Var;
            default:
                tz2 tz2Var = (tz2) obj4;
                nx1 nx1Var = tz2Var.f11018f;
                ((Integer) obj3).getClass();
                go0 go0Var4 = (go0) ((InterfaceC0596px) obj2);
                go0Var4.m1966W(-2137546592);
                boolean z2 = ((qv1) nx1Var.getValue()) == qv1.f9205h || !(go0Var4.m1988j(AbstractC0441ly.f6388n) == d61.f1886i);
                boolean zM1980f2 = go0Var4.m1980f(tz2Var);
                Object objM1956L3 = go0Var4.m1956L();
                if (zM1980f2 || objM1956L3 == c0160eb) {
                    objM1956L3 = new xq2(7, tz2Var);
                    go0Var4.m1981f0(objM1956L3);
                }
                xk1 xk1VarM3601x = op0.m3601x((in0) objM1956L3, go0Var4);
                Object objM1956L4 = go0Var4.m1956L();
                if (objM1956L4 == c0160eb) {
                    e60 e60Var = new e60(new C0590pr(xk1VarM3601x, 22));
                    go0Var4.m1981f0(e60Var);
                    objM1956L4 = e60Var;
                }
                bm2 bm2Var = (bm2) objM1956L4;
                boolean zM1980f3 = go0Var4.m1980f(bm2Var) | go0Var4.m1980f(tz2Var);
                Object objM1956L5 = go0Var4.m1956L();
                if (zM1980f3 || objM1956L5 == c0160eb) {
                    objM1956L5 = new sz2(bm2Var, tz2Var);
                    go0Var4.m1981f0(objM1956L5);
                }
                uh1 uh1VarM5512b = ul2.m5512b((sz2) objM1956L5, (qv1) nx1Var.getValue(), z && tz2Var.f11014b.m2591g() != 0.0f, z2);
                go0Var4.m1994p(false);
                return uh1VarM5512b;
        }
    }
}
