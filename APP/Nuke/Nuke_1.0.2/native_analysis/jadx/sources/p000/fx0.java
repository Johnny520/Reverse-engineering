package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class fx0 {

    /* JADX INFO: renamed from: a */
    public static final uh1 f3161a = AbstractC0731te.m5211g0(rh1.f9587a, AbstractC0731te.f10697i);

    /* JADX INFO: renamed from: a */
    public static final void m1724a(sx0 sx0Var, uh1 uh1Var, long j, InterfaceC0596px interfaceC0596px, int i) {
        int i2;
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(-126890956);
        if ((i & 6) == 0) {
            i2 = (go0Var.m1980f(sx0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= go0Var.m1980f(null) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= go0Var.m1980f(uh1Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= go0Var.m1978e(j) ? 2048 : 1024;
        }
        if (go0Var.m1958O(i2 & 1, (i2 & 1171) != 1170)) {
            go0Var.m1963T();
            if ((i & 1) != 0 && !go0Var.m2003y()) {
                go0Var.m1961R();
            }
            go0Var.m1995q();
            m1725b(v93.m5657c(sx0Var, go0Var), uh1Var, j, go0Var, (i2 & 112) | 8 | (i2 & 896) | (i2 & 7168));
        } else {
            go0Var.m1961R();
        }
        b62 b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            b62VarM1996r.f616d = new et0((Object) sx0Var, uh1Var, j, i, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x00e3  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1725b(lw1 lw1Var, uh1 uh1Var, long j, InterfaceC0596px interfaceC0596px, int i) {
        int i2;
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(-2142239481);
        if ((i & 6) == 0) {
            i2 = (go0Var.m1984h(lw1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= go0Var.m1980f(null) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= go0Var.m1980f(uh1Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= go0Var.m1978e(j) ? 2048 : 1024;
        }
        boolean z = true;
        if (go0Var.m1958O(i2 & 1, (i2 & 1171) != 1170)) {
            go0Var.m1963T();
            if ((i & 1) != 0 && !go0Var.m2003y()) {
                go0Var.m1961R();
            }
            go0Var.m1995q();
            if ((((i2 & 7168) ^ 3072) <= 2048 || !go0Var.m1978e(j)) && (i2 & 3072) != 2048) {
                z = false;
            }
            Object objM1956L = go0Var.m1956L();
            if (z || objM1956L == C0520nx.f7360a) {
                C0095cl c0095cl = C0363ju.m2566c(j, C0363ju.f5217g) ? null : new C0095cl(j, 5);
                go0Var.m1981f0(c0095cl);
                objM1956L = c0095cl;
            }
            C0095cl c0095cl2 = (C0095cl) objM1956L;
            go0Var.m1966W(-536832197);
            go0Var.m1994p(false);
            boolean zM2019a = gr2.m2019a(lw1Var.mo2977d(), 9205357640488583168L);
            rh1 rh1Var = rh1.f9587a;
            if (!zM2019a) {
                long jMo2977d = lw1Var.mo2977d();
                uh1 uh1Var2 = (Float.isInfinite(Float.intBitsToFloat((int) (jMo2977d >> 32))) && Float.isInfinite(Float.intBitsToFloat((int) (jMo2977d & 4294967295L)))) ? f3161a : rh1Var;
                AbstractC0135dm.m1057a(xe1.m6108Z(uh1Var.mo4491c(uh1Var2), lw1Var, c0095cl2).mo4491c(rh1Var), go0Var, 0);
            }
        } else {
            go0Var.m1961R();
        }
        b62 b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            b62VarM1996r.f616d = new et0(lw1Var, uh1Var, j, i, 2);
        }
    }
}
