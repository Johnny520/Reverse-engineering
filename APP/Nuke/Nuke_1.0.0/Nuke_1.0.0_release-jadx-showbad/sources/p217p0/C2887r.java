package p217p0;

/* JADX INFO: renamed from: p0.r */
/* JADX INFO: loaded from: classes.dex */
public final class C2887r {

    /* JADX INFO: renamed from: a */
    public final double f9137a;

    /* JADX INFO: renamed from: b */
    public final double f9138b;

    /* JADX INFO: renamed from: c */
    public final double f9139c;

    /* JADX INFO: renamed from: d */
    public final double f9140d;

    /* JADX INFO: renamed from: e */
    public final double f9141e;

    /* JADX INFO: renamed from: f */
    public final double f9142f;

    /* JADX INFO: renamed from: g */
    public final double f9143g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2887r(double d5, double d6, double d7, double d8, double d9, double d10, double d11) {
        this.f9137a = d5;
        this.f9138b = d6;
        this.f9139c = d7;
        this.f9140d = d8;
        this.f9141e = d9;
        this.f9142f = d10;
        this.f9143g = d11;
        if (Double.isNaN(d6) || Double.isNaN(d7) || Double.isNaN(d8) || Double.isNaN(d9) || Double.isNaN(d10) || Double.isNaN(d11) || Double.isNaN(d5)) {
            throw new IllegalArgumentException("Parameters cannot be NaN");
        }
        if (d5 == -2.0d || d5 == -3.0d) {
            return;
        }
        if (d9 < 0.0d || d9 > 1.0d) {
            throw new IllegalArgumentException("Parameter d must be in the range [0..1], was " + d9);
        }
        if (d9 == 0.0d && (d6 == 0.0d || d5 == 0.0d)) {
            throw new IllegalArgumentException("Parameter a or g is zero, the transfer function is constant");
        }
        if (d9 >= 1.0d && d8 == 0.0d) {
            throw new IllegalArgumentException("Parameter c is zero, the transfer function is constant");
        }
        if ((d6 == 0.0d || d5 == 0.0d) && d8 == 0.0d) {
            throw new IllegalArgumentException("Parameter a or g is zero, and c is zero, the transfer function is constant");
        }
        if (d8 < 0.0d) {
            throw new IllegalArgumentException("The transfer function must be increasing");
        }
        if (d6 < 0.0d || d5 < 0.0d) {
            throw new IllegalArgumentException("The transfer function must be positive or increasing");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2887r)) {
            return false;
        }
        C2887r c2887r = (C2887r) obj;
        return Double.compare(this.f9137a, c2887r.f9137a) == 0 && Double.compare(this.f9138b, c2887r.f9138b) == 0 && Double.compare(this.f9139c, c2887r.f9139c) == 0 && Double.compare(this.f9140d, c2887r.f9140d) == 0 && Double.compare(this.f9141e, c2887r.f9141e) == 0 && Double.compare(this.f9142f, c2887r.f9142f) == 0 && Double.compare(this.f9143g, c2887r.f9143g) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Double.hashCode(this.f9143g) + ((Double.hashCode(this.f9142f) + ((Double.hashCode(this.f9141e) + ((Double.hashCode(this.f9140d) + ((Double.hashCode(this.f9139c) + ((Double.hashCode(this.f9138b) + (Double.hashCode(this.f9137a) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "TransferParameters(gamma=" + this.f9137a + ", a=" + this.f9138b + ", b=" + this.f9139c + ", c=" + this.f9140d + ", d=" + this.f9141e + ", e=" + this.f9142f + ", f=" + this.f9143g + ')';
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000f: CONSTRUCTOR (r16v0 double), (r18v0 double), (r20v0 double), (r22v0 double), (r24v0 double), (0.0d double), (0.0d double) A[MD:(double, double, double, double, double, double, double):void (m)] (LINE:33) call: p0.r.<init>(double, double, double, double, double, double, double):void type: THIS */
    public /* synthetic */ C2887r(double d5, double d6, double d7, double d8, double d9) {
        this(d5, d6, d7, d8, d9, 0.0d, 0.0d);
    }
}
