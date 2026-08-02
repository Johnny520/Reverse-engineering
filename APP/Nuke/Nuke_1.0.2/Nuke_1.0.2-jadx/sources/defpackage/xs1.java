package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class xs1 extends f21 implements Comparable {
    public final int h;
    public int i;
    public eh1 j;
    public int k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public xs1(int i, int i2) {
        if (i <= 0 || ((i - 1) & i) != 0) {
            s.j("invalid alignment");
            throw null;
        }
        if (i2 < -1) {
            s.j("writeSize < -1");
            throw null;
        }
        this.h = i;
        this.i = i2;
        this.j = null;
        this.k = -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.f21
    public final int c() {
        int i = this.i;
        if (i >= 0) {
            return i;
        }
        c80.t("writeSize is unknown");
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        xs1 xs1Var = (xs1) obj;
        if (this == xs1Var) {
            return 0;
        }
        g21 g21VarB = b();
        g21 g21VarB2 = xs1Var.b();
        return g21VarB != g21VarB2 ? g21VarB.compareTo(g21VarB2) : e(xs1Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.f21
    public final void d(z70 z70Var, yn ynVar) {
        ynVar.a(this.h);
        try {
            if (this.i < 0) {
                throw new UnsupportedOperationException("writeSize is unknown");
            }
            int iF = f();
            if (ynVar.c == iF) {
                k(z70Var, ynVar);
                return;
            }
            throw new sg0(null, "expected cursor " + iF + "; actual value: " + ynVar.c);
        } catch (RuntimeException e) {
            throw sg0.a(e, "...while writing " + this);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int e(xs1 xs1Var) {
        throw new UnsupportedOperationException("unsupported");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        xs1 xs1Var = (xs1) obj;
        return b() == xs1Var.b() && e(xs1Var) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int f() {
        int i = this.k;
        if (i < 0) {
            c80.j("offset not yet known");
            return 0;
        }
        eh1 eh1Var = this.j;
        if (i < 0) {
            eh1Var.getClass();
            s.j("relative < 0");
            return 0;
        }
        int i2 = eh1Var.d;
        if (i2 >= 0) {
            return i2 + i;
        }
        c80.j("fileOffset not yet set");
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String g() {
        return "[" + Integer.toHexString(f()) + ']';
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int h(eh1 eh1Var, int i) {
        if (i < 0) {
            s.j("offset < 0");
            return 0;
        }
        if (this.j != null) {
            c80.j("already written");
            return 0;
        }
        int i2 = this.h - 1;
        int i3 = (i + i2) & (~i2);
        this.j = eh1Var;
        this.k = i3;
        i(eh1Var, i3);
        return i3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void j(int i) {
        if (i < 0) {
            s.j("writeSize < 0");
        } else if (this.i < 0) {
            this.i = i;
        } else {
            c80.t("writeSize already set");
        }
    }

    public abstract void k(z70 z70Var, yn ynVar);

    public void i(eh1 eh1Var, int i) {
    }
}
