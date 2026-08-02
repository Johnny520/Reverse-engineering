package p000;

/* JADX INFO: renamed from: e8 */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0157e8 {

    /* JADX INFO: renamed from: a */
    public static final float f2340a = (25.0f * 2.0f) / 2.4142137f;

    /* JADX INFO: renamed from: a */
    public static final void m1289a(final ws1 ws1Var, final uh1 uh1Var, long j, InterfaceC0596px interfaceC0596px, final int i) {
        int i2;
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(1776202187);
        int i3 = (go0Var.m1980f(ws1Var) ? 4 : 2) | i | (go0Var.m1980f(uh1Var) ? 32 : 16) | 128;
        if (go0Var.m1958O(i3 & 1, (i3 & 147) != 146)) {
            go0Var.m1963T();
            if ((i & 1) == 0 || go0Var.m2003y()) {
                i2 = i3 & (-897);
                j = 9205357640488583168L;
            } else {
                go0Var.m1961R();
                i2 = i3 & (-897);
            }
            go0Var.m1995q();
            int i4 = i2 & 14;
            boolean z = i4 == 4;
            Object objM1956L = go0Var.m1956L();
            if (z || objM1956L == C0520nx.f7360a) {
                objM1956L = new C0792v(4, ws1Var);
                go0Var.m1981f0(objM1956L);
            }
            rp0.m4521G(ws1Var, C0700sn.f10223k, xe1.m6126i0(-1653527038, new C0952z7(j, nn2.m3321a(uh1Var, false, (in0) objM1956L)), go0Var), go0Var, i4 | 432);
        } else {
            go0Var.m1961R();
        }
        final long j2 = j;
        b62 b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            b62VarM1996r.f616d = new mn0(uh1Var, j2, i) { // from class: a8

                /* JADX INFO: renamed from: i */
                public final /* synthetic */ uh1 f110i;

                /* JADX INFO: renamed from: j */
                public final /* synthetic */ long f111j;

                @Override // p000.mn0
                /* JADX INFO: renamed from: g */
                public final Object mo12g(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM3902N = pp0.m3902N(1);
                    AbstractC0157e8.m1289a(this.f109h, this.f110i, this.f111j, (InterfaceC0596px) obj, iM3902N);
                    return a83.f116a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m1290b(uh1 uh1Var, InterfaceC0596px interfaceC0596px, int i, int i2) {
        int i3;
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(694251107);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else {
            i3 = (go0Var.m1980f(uh1Var) ? 4 : 2) | i;
        }
        int i5 = 0;
        if (go0Var.m1958O(i3 & 1, (i3 & 3) != 2)) {
            if (i4 != 0) {
                uh1Var = rh1.f9587a;
            }
            rp0.m4529O(go0Var, qp0.m4265t(AbstractC0731te.m5213h0(uh1Var, f2340a, 25.0f), new C0082c8(((g13) go0Var.m1988j(h13.f3782a)).f3251a, i5)));
        } else {
            go0Var.m1961R();
        }
        b62 b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            b62VarM1996r.f616d = new C0046b8(uh1Var, i, i2);
        }
    }
}
