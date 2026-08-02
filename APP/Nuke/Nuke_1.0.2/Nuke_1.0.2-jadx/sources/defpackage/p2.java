package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class p2 extends r21 implements t00, j20 {
    public final a20 j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public p2(a20 a20Var, boolean z) {
        super(z);
        Q((k21) a20Var.o(sn.K));
        this.j = a20Var.k(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.r21
    public final String F() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.r21
    public final void P(pv pvVar) {
        se.M(this.j, pvVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.r21
    public final void Y(Object obj) {
        if (!(obj instanceof ov)) {
            h0(obj);
        } else {
            ov ovVar = (ov) obj;
            g0(ovVar.a, ov.b.get(ovVar) == 1);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.t00
    public final a20 f() {
        return this.j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.j20
    public final a20 g() {
        return this.j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.t00
    public final void h(Object obj) {
        Throwable thA = y92.a(obj);
        if (thA != null) {
            obj = new ov(thA, false);
        }
        Object objU = U(obj);
        if (objU == eu.f) {
            return;
        }
        y(objU);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void i0(m20 m20Var, p2 p2Var, mn0 mn0Var) {
        Object objG;
        int iOrdinal = m20Var.ordinal();
        a83 a83Var = a83.a;
        if (iOrdinal == 0) {
            try {
                p40.Q(gf1.z(gf1.p(p2Var, this, mn0Var)), a83Var);
                return;
            } finally {
                th = th;
                if (th instanceof j90) {
                    th = ((j90) th).h;
                }
                h(fg1.s(th));
            }
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                mn0Var.getClass();
                gf1.z(gf1.p(p2Var, this, mn0Var)).h(a83Var);
                return;
            }
            if (iOrdinal != 3) {
                c80.s();
                return;
            }
            try {
                a20 a20Var = this.j;
                Object objV = fg1.V(a20Var, null);
                try {
                    if (mn0Var instanceof rj) {
                        xe1.f(2, mn0Var);
                        objG = mn0Var.g(p2Var, this);
                    } else {
                        objG = gf1.d0(mn0Var, p2Var, this);
                    }
                    fg1.M(a20Var, objV);
                    if (objG != k20.h) {
                        h(objG);
                    }
                } catch (Throwable th) {
                    fg1.M(a20Var, objV);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    public void h0(Object obj) {
    }

    public void g0(Throwable th, boolean z) {
    }
}
