package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class t10 extends yh1 {

    /* JADX INFO: renamed from: a */
    public final q33 f10469a;

    /* JADX INFO: renamed from: b */
    public final k03 f10470b;

    /* JADX INFO: renamed from: c */
    public final t91 f10471c;

    /* JADX INFO: renamed from: d */
    public final boolean f10472d;

    /* JADX INFO: renamed from: e */
    public final boolean f10473e;

    /* JADX INFO: renamed from: f */
    public final boolean f10474f;

    /* JADX INFO: renamed from: g */
    public final us1 f10475g;

    /* JADX INFO: renamed from: h */
    public final b03 f10476h;

    /* JADX INFO: renamed from: i */
    public final xx0 f10477i;

    /* JADX INFO: renamed from: j */
    public final gl0 f10478j;

    public t10(q33 q33Var, k03 k03Var, t91 t91Var, boolean z, boolean z2, boolean z3, us1 us1Var, b03 b03Var, xx0 xx0Var, gl0 gl0Var) {
        this.f10469a = q33Var;
        this.f10470b = k03Var;
        this.f10471c = t91Var;
        this.f10472d = z;
        this.f10473e = z2;
        this.f10474f = z3;
        this.f10475g = us1Var;
        this.f10476h = b03Var;
        this.f10477i = xx0Var;
        this.f10478j = gl0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof t10) {
            t10 t10Var = (t10) obj;
            if (this.f10469a.equals(t10Var.f10469a) && this.f10470b.equals(t10Var.f10470b) && this.f10471c == t10Var.f10471c && this.f10472d == t10Var.f10472d && this.f10473e == t10Var.f10473e && this.f10474f == t10Var.f10474f && this.f10475g.equals(t10Var.f10475g) && this.f10476h == t10Var.f10476h && t11.m5086l(this.f10477i, t10Var.f10477i) && t11.m5086l(this.f10478j, t10Var.f10478j)) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.yh1
    /* JADX INFO: renamed from: f */
    public final th1 mo199f() {
        w10 w10Var = new w10();
        w10Var.f12267x = this.f10469a;
        w10Var.f12268y = this.f10470b;
        w10Var.f12269z = this.f10471c;
        w10Var.f12260A = this.f10472d;
        w10Var.f12261B = this.f10473e;
        w10Var.f12262C = this.f10474f;
        w10Var.f12263D = this.f10475g;
        b03 b03Var = this.f10476h;
        w10Var.f12264E = b03Var;
        w10Var.f12265F = this.f10477i;
        w10Var.f12266G = this.f10478j;
        b03Var.f486g = new u10(w10Var, 4);
        return w10Var;
    }

    @Override // p000.yh1
    /* JADX INFO: renamed from: g */
    public final void mo200g(th1 th1Var) {
        w10 w10Var = (w10) th1Var;
        boolean z = w10Var.f12261B;
        int i = 0;
        boolean z2 = z && !w10Var.f12260A;
        boolean z3 = w10Var.f12262C;
        xx0 xx0Var = w10Var.f12265F;
        b03 b03Var = w10Var.f12264E;
        boolean z4 = this.f10472d;
        boolean z5 = this.f10473e;
        boolean z6 = z5 && !z4;
        w10Var.f12267x = this.f10469a;
        k03 k03Var = this.f10470b;
        w10Var.f12268y = k03Var;
        w10Var.f12269z = this.f10471c;
        w10Var.f12260A = z4;
        w10Var.f12261B = z5;
        w10Var.f12263D = this.f10475g;
        b03 b03Var2 = this.f10476h;
        w10Var.f12264E = b03Var2;
        xx0 xx0Var2 = this.f10477i;
        w10Var.f12265F = xx0Var2;
        w10Var.f12266G = this.f10478j;
        if (z5 != z || z6 != z2 || !t11.m5086l(xx0Var2, xx0Var) || this.f10474f != z3 || !f13.m1494c(k03Var.f5297b)) {
            qp0.m4223E(w10Var);
        }
        if (b03Var2 != b03Var) {
            b03Var2.f486g = new u10(w10Var, i);
        }
    }

    public final int hashCode() {
        return this.f10478j.hashCode() + ((this.f10477i.hashCode() + ((this.f10476h.hashCode() + ((this.f10475g.hashCode() + hk1.m2205d(hk1.m2205d(hk1.m2205d((this.f10471c.hashCode() + ((this.f10470b.hashCode() + (this.f10469a.hashCode() * 31)) * 31)) * 31, 31, this.f10472d), 31, this.f10473e), 31, this.f10474f)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "CoreTextFieldSemanticsModifier(transformedText=" + this.f10469a + ", value=" + this.f10470b + ", state=" + this.f10471c + ", readOnly=" + this.f10472d + ", enabled=" + this.f10473e + ", isPassword=" + this.f10474f + ", offsetMapping=" + this.f10475g + ", manager=" + this.f10476h + ", imeOptions=" + this.f10477i + ", focusRequester=" + this.f10478j + ')';
    }
}
