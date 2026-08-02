package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ur1 {
    public static final tu2 a = new tu2(new hn1(3));
    public static final my b = new my(new hn1(4));

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void a(lp1 lp1Var, boolean z, kw kwVar, px pxVar, int i) {
        lp1Var.getClass();
        go0 go0Var = (go0) pxVar;
        go0Var.X(36529864);
        int i2 = (go0Var.f(lp1Var) ? 4 : 2) | i | (go0Var.g(z) ? 32 : 16);
        if ((i & 384) == 0) {
            i2 |= go0Var.h(kwVar) ? 256 : 128;
        }
        if (go0Var.O(i2 & 1, (i2 & 147) != 146)) {
            go0Var.T();
            if ((i & 1) != 0 && !go0Var.y()) {
                go0Var.R();
            }
            go0Var.q();
            ci0.b(new f42[]{a.a(lp1Var), b.a(Boolean.valueOf(z))}, xe1.i0(-1412716024, new o0(kwVar), go0Var), go0Var, 48);
        } else {
            go0Var.R();
        }
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            b62VarR.d = new r0(lp1Var, z, kwVar, i, 2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void b(boolean z, long j, boolean z2, px pxVar, final int i) {
        go0 go0Var = (go0) pxVar;
        go0Var.X(-1649340678);
        int i2 = i | 146;
        byte b2 = 0;
        if (go0Var.O(i2 & 1, (i2 & 1171) != 1170)) {
            go0Var.T();
            int i3 = i & 1;
            my myVar = b;
            if (i3 == 0 || go0Var.y()) {
                z = op0.s(go0Var);
                j = po1.a;
                z2 = ((Boolean) go0Var.j(myVar)).booleanValue();
            } else {
                go0Var.R();
            }
            go0Var.q();
            ci0.b(new f42[]{a.a(z ? p40.q(j) : p40.M(j)), myVar.a(Boolean.valueOf(z2))}, xe1.i0(1172636602, new eg1(b2, 14), go0Var), go0Var, 48);
        } else {
            go0Var.R();
        }
        final boolean z3 = z;
        final long j2 = j;
        final boolean z4 = z2;
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            b62VarR.d = new mn0(z3, j2, z4, i) { // from class: tr1
                public final /* synthetic */ boolean h;
                public final /* synthetic */ long i;
                public final /* synthetic */ boolean j;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // defpackage.mn0
                public final Object g(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iN = pp0.N(3073);
                    ur1.b(this.h, this.i, this.j, (px) obj, iN);
                    return a83.a;
                }
            };
        }
    }
}
