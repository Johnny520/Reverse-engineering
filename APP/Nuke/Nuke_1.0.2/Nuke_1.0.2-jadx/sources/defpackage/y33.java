package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class y33 {
    public final yk1 a;
    public final y33 b;
    public final String c;
    public final nx1 d = op0.u(c());
    public final nx1 e = op0.u(new v33(c(), c()));
    public final lx1 f = new lx1(0);
    public final lx1 g = new lx1(Long.MIN_VALUE);
    public final nx1 h;
    public final ps2 i;
    public final ps2 j;
    public final nx1 k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public y33(yk1 yk1Var, y33 y33Var, String str) {
        this.a = yk1Var;
        this.b = y33Var;
        this.c = str;
        Boolean bool = Boolean.FALSE;
        this.h = op0.u(bool);
        this.i = new ps2();
        this.j = new ps2();
        this.k = op0.u(bool);
        op0.m(new s33(this, 1));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(Object obj, px pxVar, int i) {
        go0 go0Var = (go0) pxVar;
        go0Var.X(-1493585151);
        int i2 = 4;
        int i3 = (go0Var.f(obj) ? 4 : 2) | i | (go0Var.f(this) ? 32 : 16);
        int i4 = 0;
        if (!go0Var.O(i3 & 1, (i3 & 19) != 18)) {
            go0Var.R();
        } else if (g()) {
            go0Var.W(467722849);
            go0Var.p(false);
        } else {
            go0Var.W(466062241);
            k(obj);
            int i5 = i3 & 112;
            boolean z = i5 == 32;
            Object objL = go0Var.L();
            eb ebVar = nx.a;
            if (z || objL == ebVar) {
                objL = op0.m(new s33(this, i4));
                go0Var.f0(objL);
            }
            if (((Boolean) ((gu2) objL).getValue()).booleanValue()) {
                go0Var.W(466470356);
                Object objL2 = go0Var.L();
                if (objL2 == ebVar) {
                    objL2 = eu.C(go0Var);
                    go0Var.f0(objL2);
                }
                j20 j20Var = (j20) objL2;
                boolean zH = go0Var.h(j20Var) | (i5 == 32);
                Object objL3 = go0Var.L();
                if (zH || objL3 == ebVar) {
                    objL3 = new d62(i2, j20Var, this);
                    go0Var.f0(objL3);
                }
                eu.d(j20Var, this, (in0) objL3, go0Var);
                go0Var.p(false);
            } else {
                go0Var.W(467712929);
                go0Var.p(false);
            }
            go0Var.p(false);
        }
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            b62VarR.d = new af(i, 22, this, obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long b() {
        ps2 ps2Var = this.i;
        int size = ps2Var.size();
        long jMax = 0;
        for (int i = 0; i < size; i++) {
            jMax = Math.max(jMax, ((w33) ps2Var.get(i)).q.g());
        }
        ps2 ps2Var2 = this.j;
        int size2 = ps2Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            jMax = Math.max(jMax, ((y33) ps2Var2.get(i2)).b());
        }
        return jMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object c() {
        return this.a.b.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean d() {
        ps2 ps2Var = this.i;
        int size = ps2Var.size();
        for (int i = 0; i < size; i++) {
            ((w33) ps2Var.get(i)).getClass();
        }
        ps2 ps2Var2 = this.j;
        int size2 = ps2Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            if (((y33) ps2Var2.get(i2)).d()) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long e() {
        y33 y33Var = this.b;
        return y33Var != null ? y33Var.e() : this.f.g();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final v33 f() {
        return (v33) this.e.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean g() {
        return ((Boolean) this.k.getValue()).booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void h(long j, boolean z) {
        yk1 yk1Var = this.a;
        nx1 nx1Var = yk1Var.a;
        lx1 lx1Var = this.g;
        if (lx1Var.g() == Long.MIN_VALUE) {
            lx1Var.h(j);
            yk1Var.a.setValue(Boolean.TRUE);
        } else if (!((Boolean) nx1Var.getValue()).booleanValue()) {
            nx1Var.setValue(Boolean.TRUE);
        }
        this.h.setValue(Boolean.FALSE);
        ps2 ps2Var = this.i;
        int size = ps2Var.size();
        boolean z2 = true;
        for (int i = 0; i < size; i++) {
            w33 w33Var = (w33) ps2Var.get(i);
            nx1 nx1Var2 = w33Var.l;
            nx1 nx1Var3 = w33Var.l;
            if (!((Boolean) nx1Var2.getValue()).booleanValue()) {
                long jC = z ? w33Var.a().c() : j;
                w33Var.o.setValue(w33Var.a().b(jC));
                w33Var.p = w33Var.a().f(jC);
                if (w33Var.a().g(jC)) {
                    nx1Var3.setValue(Boolean.TRUE);
                }
            }
            if (!((Boolean) nx1Var3.getValue()).booleanValue()) {
                z2 = false;
            }
        }
        ps2 ps2Var2 = this.j;
        int size2 = ps2Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            y33 y33Var = (y33) ps2Var2.get(i2);
            if (!t11.l(y33Var.d.getValue(), y33Var.c())) {
                y33Var.h(j, z);
            }
            if (!t11.l(y33Var.d.getValue(), y33Var.c())) {
                z2 = false;
            }
        }
        if (z2) {
            i();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void i() {
        this.g.h(Long.MIN_VALUE);
        Object value = this.d.getValue();
        yk1 yk1Var = this.a;
        yk1Var.b.setValue(value);
        if (this.b == null) {
            this.f.h(0L);
        }
        yk1Var.a.setValue(Boolean.FALSE);
        ps2 ps2Var = this.j;
        int size = ps2Var.size();
        for (int i = 0; i < size; i++) {
            ((y33) ps2Var.get(i)).i();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void j(Object obj, Object obj2) {
        this.g.h(Long.MIN_VALUE);
        yk1 yk1Var = this.a;
        yk1Var.a.setValue(Boolean.FALSE);
        boolean zG = g();
        nx1 nx1Var = this.d;
        if (!zG || !t11.l(c(), obj) || !t11.l(nx1Var.getValue(), obj2)) {
            if (!t11.l(c(), obj)) {
                yk1Var.b.setValue(obj);
            }
            nx1Var.setValue(obj2);
            this.k.setValue(Boolean.TRUE);
            this.e.setValue(new v33(obj, obj2));
        }
        ps2 ps2Var = this.j;
        int size = ps2Var.size();
        for (int i = 0; i < size; i++) {
            y33 y33Var = (y33) ps2Var.get(i);
            y33Var.getClass();
            if (y33Var.g()) {
                y33Var.j(y33Var.c(), y33Var.d.getValue());
            }
        }
        ps2 ps2Var2 = this.i;
        int size2 = ps2Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((w33) ps2Var2.get(i2)).c();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void k(Object obj) {
        nx1 nx1Var = this.d;
        if (t11.l(nx1Var.getValue(), obj)) {
            return;
        }
        this.e.setValue(new v33(nx1Var.getValue(), obj));
        if (!t11.l(c(), nx1Var.getValue())) {
            this.a.b.setValue(nx1Var.getValue());
        }
        nx1Var.setValue(obj);
        if (this.g.g() == Long.MIN_VALUE) {
            this.h.setValue(Boolean.TRUE);
        }
        ps2 ps2Var = this.i;
        int size = ps2Var.size();
        for (int i = 0; i < size; i++) {
            ((w33) ps2Var.get(i)).m.h(-2.0f);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        ps2 ps2Var = this.i;
        int size = ps2Var.size();
        String str = "Transition animation values: ";
        for (int i = 0; i < size; i++) {
            str = str + ((w33) ps2Var.get(i)) + ", ";
        }
        return str;
    }
}
