package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class l33 {

    /* JADX INFO: renamed from: a */
    public final double f5907a;

    /* JADX INFO: renamed from: b */
    public final double f5908b;

    /* JADX INFO: renamed from: c */
    public final double f5909c;

    /* JADX INFO: renamed from: d */
    public final double f5910d;

    /* JADX INFO: renamed from: e */
    public final double f5911e;

    /* JADX INFO: renamed from: f */
    public final double f5912f;

    /* JADX INFO: renamed from: g */
    public final double f5913g;

    public l33(double d, double d2, double d3, double d4, double d5, double d6, double d7) {
        this.f5907a = d;
        this.f5908b = d2;
        this.f5909c = d3;
        this.f5910d = d4;
        this.f5911e = d5;
        this.f5912f = d6;
        this.f5913g = d7;
        if (Double.isNaN(d2) || Double.isNaN(d3) || Double.isNaN(d4) || Double.isNaN(d5) || Double.isNaN(d6) || Double.isNaN(d7) || Double.isNaN(d)) {
            C0676s.m4651j("Parameters cannot be NaN");
            throw null;
        }
        if (d == -2.0d || d == -3.0d) {
            return;
        }
        if (d5 < 0.0d || d5 > 1.0d) {
            throw new IllegalArgumentException("Parameter d must be in the range [0..1], was " + d5);
        }
        if (d5 == 0.0d && (d2 == 0.0d || d == 0.0d)) {
            C0676s.m4651j("Parameter a or g is zero, the transfer function is constant");
            throw null;
        }
        if (d5 >= 1.0d && d4 == 0.0d) {
            C0676s.m4651j("Parameter c is zero, the transfer function is constant");
            throw null;
        }
        if ((d2 == 0.0d || d == 0.0d) && d4 == 0.0d) {
            C0676s.m4651j("Parameter a or g is zero, and c is zero, the transfer function is constant");
            throw null;
        }
        if (d4 < 0.0d) {
            C0676s.m4651j("The transfer function must be increasing");
            throw null;
        }
        if (d2 < 0.0d || d < 0.0d) {
            C0676s.m4651j("The transfer function must be positive or increasing");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l33)) {
            return false;
        }
        l33 l33Var = (l33) obj;
        return Double.compare(this.f5907a, l33Var.f5907a) == 0 && Double.compare(this.f5908b, l33Var.f5908b) == 0 && Double.compare(this.f5909c, l33Var.f5909c) == 0 && Double.compare(this.f5910d, l33Var.f5910d) == 0 && Double.compare(this.f5911e, l33Var.f5911e) == 0 && Double.compare(this.f5912f, l33Var.f5912f) == 0 && Double.compare(this.f5913g, l33Var.f5913g) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f5913g) + ((Double.hashCode(this.f5912f) + ((Double.hashCode(this.f5911e) + ((Double.hashCode(this.f5910d) + ((Double.hashCode(this.f5909c) + ((Double.hashCode(this.f5908b) + (Double.hashCode(this.f5907a) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "TransferParameters(gamma=" + this.f5907a + ", a=" + this.f5908b + ", b=" + this.f5909c + ", c=" + this.f5910d + ", d=" + this.f5911e + ", e=" + this.f5912f + ", f=" + this.f5913g + ')';
    }

    public /* synthetic */ l33(double d, double d2, double d3, double d4, double d5) {
        this(d, d2, d3, d4, d5, 0.0d, 0.0d);
    }
}
