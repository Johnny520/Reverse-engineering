package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class s81 {

    /* JADX INFO: renamed from: a */
    public final double f5683a;

    /* JADX INFO: renamed from: b */
    public final double f5684b;

    /* JADX INFO: renamed from: c */
    public final double f5685c;

    /* JADX INFO: renamed from: d */
    public final double f5686d;

    /* JADX INFO: renamed from: e */
    public final double f5687e;

    /* JADX INFO: renamed from: f */
    public final double f5688f;

    /* JADX INFO: renamed from: g */
    public final double f5689g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public s81(double d, double d2, double d3, double d4, double d5, double d6, double d7) {
        this.f5683a = d;
        this.f5684b = d2;
        this.f5685c = d3;
        this.f5686d = d4;
        this.f5687e = d5;
        this.f5688f = d6;
        this.f5689g = d7;
        if (Double.isNaN(d2) || Double.isNaN(d3) || Double.isNaN(d4) || Double.isNaN(d5) || Double.isNaN(d6) || Double.isNaN(d7) || Double.isNaN(d)) {
            C0921xc.m5131l("Parameters cannot be NaN");
            throw null;
        }
        if (d == -2.0d || d == -3.0d) {
            return;
        }
        if (d5 < 0.0d || d5 > 1.0d) {
            throw new IllegalArgumentException("Parameter d must be in the range [0..1], was " + d5);
        }
        if (d5 == 0.0d && (d2 == 0.0d || d == 0.0d)) {
            C0921xc.m5131l("Parameter a or g is zero, the transfer function is constant");
            throw null;
        }
        if (d5 >= 1.0d && d4 == 0.0d) {
            C0921xc.m5131l("Parameter c is zero, the transfer function is constant");
            throw null;
        }
        if ((d2 == 0.0d || d == 0.0d) && d4 == 0.0d) {
            C0921xc.m5131l("Parameter a or g is zero, and c is zero, the transfer function is constant");
            throw null;
        }
        if (d4 < 0.0d) {
            C0921xc.m5131l("The transfer function must be increasing");
            throw null;
        }
        if (d2 < 0.0d || d < 0.0d) {
            C0921xc.m5131l("The transfer function must be positive or increasing");
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s81)) {
            return false;
        }
        s81 s81Var = (s81) obj;
        return Double.compare(this.f5683a, s81Var.f5683a) == 0 && Double.compare(this.f5684b, s81Var.f5684b) == 0 && Double.compare(this.f5685c, s81Var.f5685c) == 0 && Double.compare(this.f5686d, s81Var.f5686d) == 0 && Double.compare(this.f5687e, s81Var.f5687e) == 0 && Double.compare(this.f5688f, s81Var.f5688f) == 0 && Double.compare(this.f5689g, s81Var.f5689g) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Double.hashCode(this.f5689g) + ((Double.hashCode(this.f5688f) + ((Double.hashCode(this.f5687e) + ((Double.hashCode(this.f5686d) + ((Double.hashCode(this.f5685c) + ((Double.hashCode(this.f5684b) + (Double.hashCode(this.f5683a) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "TransferParameters(gamma=" + this.f5683a + ", a=" + this.f5684b + ", b=" + this.f5685c + ", c=" + this.f5686d + ", d=" + this.f5687e + ", e=" + this.f5688f + ", f=" + this.f5689g + ')';
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000f: CONSTRUCTOR (r16v0 double), (r18v0 double), (r20v0 double), (r22v0 double), (r24v0 double), (0.0d double), (0.0d double) A[MD:(double, double, double, double, double, double, double):void (m)] (LINE:192) call: s81.<init>(double, double, double, double, double, double, double):void type: THIS */
    public /* synthetic */ s81(double d, double d2, double d3, double d4, double d5) {
        this(d, d2, d3, d4, d5, 0.0d, 0.0d);
    }
}
