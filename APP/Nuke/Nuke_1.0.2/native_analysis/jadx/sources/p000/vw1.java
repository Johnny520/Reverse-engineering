package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class vw1 implements InterfaceC0539od {

    /* JADX INFO: renamed from: a */
    public final int f12198a;

    /* JADX INFO: renamed from: b */
    public final int f12199b;

    /* JADX INFO: renamed from: c */
    public final long f12200c;

    /* JADX INFO: renamed from: d */
    public final n03 f12201d;

    /* JADX INFO: renamed from: e */
    public final k02 f12202e;

    /* JADX INFO: renamed from: f */
    public final ya1 f12203f;

    /* JADX INFO: renamed from: g */
    public final int f12204g;

    /* JADX INFO: renamed from: h */
    public final int f12205h;

    /* JADX INFO: renamed from: i */
    public final d13 f12206i;

    public vw1(int i, int i2, long j, n03 n03Var, k02 k02Var, ya1 ya1Var, int i3, int i4, d13 d13Var) {
        this.f12198a = i;
        this.f12199b = i2;
        this.f12200c = j;
        this.f12201d = n03Var;
        this.f12202e = k02Var;
        this.f12203f = ya1Var;
        this.f12204g = i3;
        this.f12205h = i4;
        this.f12206i = d13Var;
        if (p13.m3673a(j, p13.f7928c) || p13.m3675c(j) >= 0.0f) {
            return;
        }
        lz0.m2989b("lineHeight can't be negative (" + p13.m3675c(j) + ')');
    }

    /* JADX INFO: renamed from: a */
    public final vw1 m5803a(vw1 vw1Var) {
        return vw1Var == null ? this : ww1.m6017a(this, vw1Var.f12198a, vw1Var.f12199b, vw1Var.f12200c, vw1Var.f12201d, vw1Var.f12202e, vw1Var.f12203f, vw1Var.f12204g, vw1Var.f12205h, vw1Var.f12206i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vw1)) {
            return false;
        }
        vw1 vw1Var = (vw1) obj;
        return this.f12198a == vw1Var.f12198a && this.f12199b == vw1Var.f12199b && p13.m3673a(this.f12200c, vw1Var.f12200c) && t11.m5086l(this.f12201d, vw1Var.f12201d) && t11.m5086l(this.f12202e, vw1Var.f12202e) && t11.m5086l(this.f12203f, vw1Var.f12203f) && this.f12204g == vw1Var.f12204g && this.f12205h == vw1Var.f12205h && t11.m5086l(this.f12206i, vw1Var.f12206i);
    }

    public final int hashCode() {
        int iM5685d = vi0.m5685d(this.f12199b, Integer.hashCode(this.f12198a) * 31, 31);
        q13[] q13VarArr = p13.f7927b;
        int iM2204c = hk1.m2204c(iM5685d, 31, this.f12200c);
        n03 n03Var = this.f12201d;
        int iHashCode = (iM2204c + (n03Var != null ? n03Var.hashCode() : 0)) * 31;
        k02 k02Var = this.f12202e;
        int iHashCode2 = (iHashCode + (k02Var != null ? k02Var.hashCode() : 0)) * 31;
        ya1 ya1Var = this.f12203f;
        int iM5685d2 = vi0.m5685d(this.f12205h, vi0.m5685d(this.f12204g, (iHashCode2 + (ya1Var != null ? ya1Var.hashCode() : 0)) * 31, 31), 31);
        d13 d13Var = this.f12206i;
        return iM5685d2 + (d13Var != null ? d13Var.hashCode() : 0);
    }

    public final String toString() {
        return "ParagraphStyle(textAlign=" + ((Object) ky2.m2761a(this.f12198a)) + ", textDirection=" + ((Object) jz2.m2597a(this.f12199b)) + ", lineHeight=" + ((Object) p13.m3676d(this.f12200c)) + ", textIndent=" + this.f12201d + ", platformStyle=" + this.f12202e + ", lineHeightStyle=" + this.f12203f + ", lineBreak=" + ((Object) ta1.m5149a(this.f12204g)) + ", hyphens=" + ((Object) bx0.m598a(this.f12205h)) + ", textMotion=" + this.f12206i + ')';
    }
}
