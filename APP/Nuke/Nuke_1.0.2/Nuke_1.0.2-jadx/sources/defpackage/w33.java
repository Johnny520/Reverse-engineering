package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class w33 implements gu2 {
    public final n43 h;
    public final nx1 i;
    public final nx1 j;
    public final nx1 k;
    public final nx1 l;
    public final jx1 m;
    public boolean n;
    public final nx1 o;
    public nd p;
    public final lx1 q;
    public boolean r;
    public final qt2 s;
    public final /* synthetic */ y33 t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public w33(y33 y33Var, Object obj, nd ndVar, n43 n43Var) {
        this.t = y33Var;
        this.h = n43Var;
        nx1 nx1VarU = op0.u(obj);
        this.i = nx1VarU;
        Object objJ = null;
        this.j = op0.u(up0.G(0.0f, 0.0f, null, 7));
        this.k = op0.u(new cy2(b(), n43Var, obj, nx1VarU.getValue(), ndVar));
        this.l = op0.u(Boolean.TRUE);
        this.m = new jx1(-1.0f);
        this.o = op0.u(obj);
        this.p = ndVar;
        this.q = new lx1(a().c());
        Float f = (Float) vb3.a.get(n43Var);
        if (f != null) {
            float fFloatValue = f.floatValue();
            nd ndVar2 = (nd) n43Var.a.j(obj);
            int iB = ndVar2.b();
            for (int i = 0; i < iB; i++) {
                ndVar2.e(fFloatValue, i);
            }
            objJ = this.h.b.j(ndVar2);
        }
        this.s = up0.G(0.0f, 0.0f, objJ, 3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final cy2 a() {
        return (cy2) this.k.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final fj0 b() {
        return (fj0) this.j.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void c() {
        if (this.m.g() == -1.0f) {
            this.r = true;
            boolean zL = t11.l(a().c, a().d);
            nx1 nx1Var = this.o;
            if (zL) {
                nx1Var.setValue(a().c);
            } else {
                nx1Var.setValue(a().b(0L));
                this.p = a().f(0L);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void e(Object obj, boolean z) {
        y33 y33Var = this.t;
        nx1 nx1Var = y33Var.h;
        nx1 nx1Var2 = this.i;
        boolean zL = t11.l(null, nx1Var2.getValue());
        lx1 lx1Var = this.q;
        nx1 nx1Var3 = this.k;
        n43 n43Var = this.h;
        if (zL) {
            nx1Var3.setValue(new cy2(this.s, n43Var, obj, obj, this.p.c()));
            this.n = true;
            lx1Var.h(a().c());
            return;
        }
        fj0 fj0VarB = (!z || this.r || (b() instanceof qt2)) ? b() : this.s;
        long jMax = 0;
        nx1Var3.setValue(new cy2(y33Var.e() <= 0 ? fj0VarB : new cu2(fj0VarB, y33Var.e()), n43Var, obj, nx1Var2.getValue(), this.p));
        lx1Var.h(a().c());
        this.n = false;
        nx1Var.setValue(Boolean.TRUE);
        if (y33Var.g()) {
            ps2 ps2Var = y33Var.i;
            int size = ps2Var.size();
            for (int i = 0; i < size; i++) {
                w33 w33Var = (w33) ps2Var.get(i);
                jMax = Math.max(jMax, w33Var.q.g());
                w33Var.c();
            }
            nx1Var.setValue(Boolean.FALSE);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void f(Object obj, Object obj2, fj0 fj0Var) {
        this.i.setValue(obj2);
        this.j.setValue(fj0Var);
        if (t11.l(a().d, obj) && t11.l(a().c, obj2)) {
            return;
        }
        e(obj, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.gu2
    public final Object getValue() {
        return this.o.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "current value: " + this.o.getValue() + ", target: " + this.i.getValue() + ", spec: " + b();
    }
}
