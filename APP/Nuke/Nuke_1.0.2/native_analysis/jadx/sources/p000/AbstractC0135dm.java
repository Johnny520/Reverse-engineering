package p000;

/* JADX INFO: renamed from: dm */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0135dm {

    /* JADX INFO: renamed from: a */
    public static final rk1 f2110a = m1059c(true);

    /* JADX INFO: renamed from: b */
    public static final rk1 f2111b = m1059c(false);

    /* JADX INFO: renamed from: c */
    public static final C0378k8 f2112c = C0378k8.f5382d;

    /* JADX INFO: renamed from: a */
    public static final void m1057a(uh1 uh1Var, InterfaceC0596px interfaceC0596px, int i) {
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(-211209833);
        int i2 = (go0Var.m1980f(uh1Var) ? 4 : 2) | i;
        int i3 = 0;
        if (go0Var.m1958O(i2 & 1, (i2 & 3) != 2)) {
            int iHashCode = Long.hashCode(go0Var.f3614T);
            uh1 uh1VarM5285M = AbstractC0738tl.m5285M(go0Var, uh1Var);
            yy1 yy1VarM1990l = go0Var.m1990l();
            InterfaceC0293hx.f4166c.getClass();
            C0367jy c0367jy = C0256gx.f3727b;
            go0Var.m1969Z();
            if (go0Var.f3613S) {
                go0Var.m1989k(c0367jy);
            } else {
                go0Var.m1987i0();
            }
            yf3.m6268c(go0Var, C0256gx.f3730e, f2112c);
            yf3.m6268c(go0Var, C0256gx.f3729d, yy1VarM1990l);
            yf3.m6267b(go0Var, C0256gx.f3732g);
            yf3.m6268c(go0Var, C0256gx.f3728c, uh1VarM5285M);
            yf3.m6268c(go0Var, C0256gx.f3731f, Integer.valueOf(iHashCode));
            go0Var.m1994p(true);
        } else {
            go0Var.m1961R();
        }
        b62 b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            b62VarM1996r.f616d = new C0096cm(uh1Var, i, i3);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m1058b(rz1 rz1Var, sz1 sz1Var, if1 if1Var, d61 d61Var, int i, int i2, InterfaceC0644r5 interfaceC0644r5) {
        C0659rk c0659rk;
        Object objMo2342i = if1Var.mo2342i();
        C0060bm c0060bm = objMo2342i instanceof C0060bm ? (C0060bm) objMo2342i : null;
        rz1.m4640h(rz1Var, sz1Var, ((c0060bm == null || (c0659rk = c0060bm.f935v) == null) ? interfaceC0644r5 : c0659rk).mo3571a((((long) sz1Var.f10438h) << 32) | (((long) sz1Var.f10439i) & 4294967295L), (((long) i) << 32) | (((long) i2) & 4294967295L), d61Var));
    }

    /* JADX INFO: renamed from: c */
    public static final rk1 m1059c(boolean z) {
        rk1 rk1Var = new rk1(9);
        C0659rk c0659rk = C0700sn.f10222j;
        rk1Var.m4511m(c0659rk, new C0245gm(c0659rk, z));
        C0659rk c0659rk2 = C0700sn.f10223k;
        rk1Var.m4511m(c0659rk2, new C0245gm(c0659rk2, z));
        C0659rk c0659rk3 = C0700sn.f10224l;
        rk1Var.m4511m(c0659rk3, new C0245gm(c0659rk3, z));
        C0659rk c0659rk4 = C0700sn.f10225m;
        rk1Var.m4511m(c0659rk4, new C0245gm(c0659rk4, z));
        C0659rk c0659rk5 = C0700sn.f10226n;
        rk1Var.m4511m(c0659rk5, new C0245gm(c0659rk5, z));
        C0659rk c0659rk6 = C0700sn.f10227o;
        rk1Var.m4511m(c0659rk6, new C0245gm(c0659rk6, z));
        C0659rk c0659rk7 = C0700sn.f10228p;
        rk1Var.m4511m(c0659rk7, new C0245gm(c0659rk7, z));
        C0659rk c0659rk8 = C0700sn.f10229q;
        rk1Var.m4511m(c0659rk8, new C0245gm(c0659rk8, z));
        C0659rk c0659rk9 = C0700sn.f10230r;
        rk1Var.m4511m(c0659rk9, new C0245gm(c0659rk9, z));
        return rk1Var;
    }

    /* JADX INFO: renamed from: d */
    public static final nf1 m1060d(InterfaceC0644r5 interfaceC0644r5, boolean z) {
        nf1 nf1Var = (nf1) (z ? f2110a : f2111b).m4505g(interfaceC0644r5);
        return nf1Var == null ? new C0245gm(interfaceC0644r5, z) : nf1Var;
    }
}
