package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ur1 {

    /* JADX INFO: renamed from: a */
    public static final tu2 f11452a = new tu2(new hn1(3));

    /* JADX INFO: renamed from: b */
    public static final C0478my f11453b = new C0478my(new hn1(4));

    /* JADX INFO: renamed from: a */
    public static final void m5571a(lp1 lp1Var, boolean z, C0402kw c0402kw, InterfaceC0596px interfaceC0596px, int i) {
        lp1Var.getClass();
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(36529864);
        int i2 = (go0Var.m1980f(lp1Var) ? 4 : 2) | i | (go0Var.m1982g(z) ? 32 : 16);
        if ((i & 384) == 0) {
            i2 |= go0Var.m1984h(c0402kw) ? 256 : 128;
        }
        if (go0Var.m1958O(i2 & 1, (i2 & 147) != 146)) {
            go0Var.m1963T();
            if ((i & 1) != 0 && !go0Var.m2003y()) {
                go0Var.m1961R();
            }
            go0Var.m1995q();
            ci0.m801b(new f42[]{f11452a.mo1251a(lp1Var), f11453b.mo1251a(Boolean.valueOf(z))}, xe1.m6126i0(-1412716024, new C0524o0(c0402kw), go0Var), go0Var, 48);
        } else {
            go0Var.m1961R();
        }
        b62 b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            b62VarM1996r.f616d = new C0639r0(lp1Var, z, c0402kw, i, 2);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m5572b(boolean z, long j, boolean z2, InterfaceC0596px interfaceC0596px, final int i) {
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(-1649340678);
        int i2 = i | 146;
        byte b = 0;
        if (go0Var.m1958O(i2 & 1, (i2 & 1171) != 1170)) {
            go0Var.m1963T();
            int i3 = i & 1;
            C0478my c0478my = f11453b;
            if (i3 == 0 || go0Var.m2003y()) {
                z = op0.m3596s(go0Var);
                j = po1.f8422a;
                z2 = ((Boolean) go0Var.m1988j(c0478my)).booleanValue();
            } else {
                go0Var.m1961R();
            }
            go0Var.m1995q();
            ci0.m801b(new f42[]{f11452a.mo1251a(z ? p40.m3734q(j) : p40.m3703M(j)), c0478my.mo1251a(Boolean.valueOf(z2))}, xe1.m6126i0(1172636602, new eg1(b, 14), go0Var), go0Var, 48);
        } else {
            go0Var.m1961R();
        }
        final boolean z3 = z;
        final long j2 = j;
        final boolean z4 = z2;
        b62 b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            b62VarM1996r.f616d = new mn0(z3, j2, z4, i) { // from class: tr1

                /* JADX INFO: renamed from: h */
                public final /* synthetic */ boolean f10910h;

                /* JADX INFO: renamed from: i */
                public final /* synthetic */ long f10911i;

                /* JADX INFO: renamed from: j */
                public final /* synthetic */ boolean f10912j;

                @Override // p000.mn0
                /* JADX INFO: renamed from: g */
                public final Object mo12g(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM3902N = pp0.m3902N(3073);
                    ur1.m5572b(this.f10910h, this.f10911i, this.f10912j, (InterfaceC0596px) obj, iM3902N);
                    return a83.f116a;
                }
            };
        }
    }
}
