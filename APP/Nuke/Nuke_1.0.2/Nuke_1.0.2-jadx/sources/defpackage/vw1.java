package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class vw1 implements od {
    public final int a;
    public final int b;
    public final long c;
    public final n03 d;
    public final k02 e;
    public final ya1 f;
    public final int g;
    public final int h;
    public final d13 i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public vw1(int i, int i2, long j, n03 n03Var, k02 k02Var, ya1 ya1Var, int i3, int i4, d13 d13Var) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = n03Var;
        this.e = k02Var;
        this.f = ya1Var;
        this.g = i3;
        this.h = i4;
        this.i = d13Var;
        if (p13.a(j, p13.c) || p13.c(j) >= 0.0f) {
            return;
        }
        lz0.b("lineHeight can't be negative (" + p13.c(j) + ')');
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final vw1 a(vw1 vw1Var) {
        return vw1Var == null ? this : ww1.a(this, vw1Var.a, vw1Var.b, vw1Var.c, vw1Var.d, vw1Var.e, vw1Var.f, vw1Var.g, vw1Var.h, vw1Var.i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vw1)) {
            return false;
        }
        vw1 vw1Var = (vw1) obj;
        return this.a == vw1Var.a && this.b == vw1Var.b && p13.a(this.c, vw1Var.c) && t11.l(this.d, vw1Var.d) && t11.l(this.e, vw1Var.e) && t11.l(this.f, vw1Var.f) && this.g == vw1Var.g && this.h == vw1Var.h && t11.l(this.i, vw1Var.i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iD = vi0.d(this.b, Integer.hashCode(this.a) * 31, 31);
        q13[] q13VarArr = p13.b;
        int iC = hk1.c(iD, 31, this.c);
        n03 n03Var = this.d;
        int iHashCode = (iC + (n03Var != null ? n03Var.hashCode() : 0)) * 31;
        k02 k02Var = this.e;
        int iHashCode2 = (iHashCode + (k02Var != null ? k02Var.hashCode() : 0)) * 31;
        ya1 ya1Var = this.f;
        int iD2 = vi0.d(this.h, vi0.d(this.g, (iHashCode2 + (ya1Var != null ? ya1Var.hashCode() : 0)) * 31, 31), 31);
        d13 d13Var = this.i;
        return iD2 + (d13Var != null ? d13Var.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "ParagraphStyle(textAlign=" + ((Object) ky2.a(this.a)) + ", textDirection=" + ((Object) jz2.a(this.b)) + ", lineHeight=" + ((Object) p13.d(this.c)) + ", textIndent=" + this.d + ", platformStyle=" + this.e + ", lineHeightStyle=" + this.f + ", lineBreak=" + ((Object) ta1.a(this.g)) + ", hyphens=" + ((Object) bx0.a(this.h)) + ", textMotion=" + this.i + ')';
    }
}
