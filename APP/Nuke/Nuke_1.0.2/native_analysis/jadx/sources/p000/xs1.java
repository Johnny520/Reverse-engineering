package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class xs1 extends f21 implements Comparable {

    /* JADX INFO: renamed from: h */
    public final int f13158h;

    /* JADX INFO: renamed from: i */
    public int f13159i;

    /* JADX INFO: renamed from: j */
    public eh1 f13160j;

    /* JADX INFO: renamed from: k */
    public int f13161k;

    public xs1(int i, int i2) {
        if (i <= 0 || ((i - 1) & i) != 0) {
            C0676s.m4651j("invalid alignment");
            throw null;
        }
        if (i2 < -1) {
            C0676s.m4651j("writeSize < -1");
            throw null;
        }
        this.f13158h = i;
        this.f13159i = i2;
        this.f13160j = null;
        this.f13161k = -1;
    }

    @Override // p000.f21
    /* JADX INFO: renamed from: c */
    public final int mo70c() {
        int i = this.f13159i;
        if (i >= 0) {
            return i;
        }
        c80.m676t("writeSize is unknown");
        return 0;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        xs1 xs1Var = (xs1) obj;
        if (this == xs1Var) {
            return 0;
        }
        g21 g21VarMo69b = mo69b();
        g21 g21VarMo69b2 = xs1Var.mo69b();
        return g21VarMo69b != g21VarMo69b2 ? g21VarMo69b.compareTo(g21VarMo69b2) : mo1531e(xs1Var);
    }

    @Override // p000.f21
    /* JADX INFO: renamed from: d */
    public final void mo71d(z70 z70Var, C0929yn c0929yn) {
        c0929yn.m6290a(this.f13158h);
        try {
            if (this.f13159i < 0) {
                throw new UnsupportedOperationException("writeSize is unknown");
            }
            int iM6177f = m6177f();
            if (c0929yn.f13526c == iM6177f) {
                mo1532k(z70Var, c0929yn);
                return;
            }
            throw new sg0(null, "expected cursor " + iM6177f + "; actual value: " + c0929yn.f13526c);
        } catch (RuntimeException e) {
            throw sg0.m4862a(e, "...while writing " + this);
        }
    }

    /* JADX INFO: renamed from: e */
    public int mo1531e(xs1 xs1Var) {
        throw new UnsupportedOperationException("unsupported");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        xs1 xs1Var = (xs1) obj;
        return mo69b() == xs1Var.mo69b() && mo1531e(xs1Var) == 0;
    }

    /* JADX INFO: renamed from: f */
    public final int m6177f() {
        int i = this.f13161k;
        if (i < 0) {
            c80.m667j("offset not yet known");
            return 0;
        }
        eh1 eh1Var = this.f13160j;
        if (i < 0) {
            eh1Var.getClass();
            C0676s.m4651j("relative < 0");
            return 0;
        }
        int i2 = eh1Var.f5110d;
        if (i2 >= 0) {
            return i2 + i;
        }
        c80.m667j("fileOffset not yet set");
        return 0;
    }

    /* JADX INFO: renamed from: g */
    public final String m6178g() {
        return "[" + Integer.toHexString(m6177f()) + ']';
    }

    /* JADX INFO: renamed from: h */
    public final int m6179h(eh1 eh1Var, int i) {
        if (i < 0) {
            C0676s.m4651j("offset < 0");
            return 0;
        }
        if (this.f13160j != null) {
            c80.m667j("already written");
            return 0;
        }
        int i2 = this.f13158h - 1;
        int i3 = (i + i2) & (~i2);
        this.f13160j = eh1Var;
        this.f13161k = i3;
        mo4438i(eh1Var, i3);
        return i3;
    }

    /* JADX INFO: renamed from: j */
    public final void m6180j(int i) {
        if (i < 0) {
            C0676s.m4651j("writeSize < 0");
        } else if (this.f13159i < 0) {
            this.f13159i = i;
        } else {
            c80.m676t("writeSize already set");
        }
    }

    /* JADX INFO: renamed from: k */
    public abstract void mo1532k(z70 z70Var, C0929yn c0929yn);

    /* JADX INFO: renamed from: i */
    public void mo4438i(eh1 eh1Var, int i) {
    }
}
