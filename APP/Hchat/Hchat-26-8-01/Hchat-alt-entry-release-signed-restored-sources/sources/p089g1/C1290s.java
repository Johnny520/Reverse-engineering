package p089g1;

import p136j8.C2104o;

/* JADX INFO: renamed from: g1.s */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1290s {

    /* JADX INFO: renamed from: a */
    public final double f4302a;

    /* JADX INFO: renamed from: b */
    public final double f4303b;

    /* JADX INFO: renamed from: c */
    public final double f4304c;

    /* JADX INFO: renamed from: d */
    public final double f4305d;

    /* JADX INFO: renamed from: e */
    public final double f4306e;

    /* JADX INFO: renamed from: f */
    public final double f4307f;

    /* JADX INFO: renamed from: g */
    public final double f4308g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1290s(double d10, double d11, double d12, double d13, double d14, double d15, double d16) {
        this.f4302a = d10;
        this.f4303b = d11;
        this.f4304c = d12;
        this.f4305d = d13;
        this.f4306e = d14;
        this.f4307f = d15;
        this.f4308g = d16;
        if (Double.isNaN(d11) || Double.isNaN(d12) || Double.isNaN(d13) || Double.isNaN(d14) || Double.isNaN(d15) || Double.isNaN(d16) || Double.isNaN(d10)) {
            C2104o.m5294t("Parameters cannot be NaN");
            throw null;
        }
        if (d10 == -2.0d || d10 == -3.0d) {
            return;
        }
        if (d14 < 0.0d || d14 > 1.0d) {
            throw new IllegalArgumentException("Parameter d must be in the range [0..1], was " + d14);
        }
        if (d14 == 0.0d && (d11 == 0.0d || d10 == 0.0d)) {
            C2104o.m5294t("Parameter a or g is zero, the transfer function is constant");
            throw null;
        }
        if (d14 >= 1.0d && d13 == 0.0d) {
            C2104o.m5294t("Parameter c is zero, the transfer function is constant");
            throw null;
        }
        if ((d11 == 0.0d || d10 == 0.0d) && d13 == 0.0d) {
            C2104o.m5294t("Parameter a or g is zero, and c is zero, the transfer function is constant");
            throw null;
        }
        if (d13 < 0.0d) {
            C2104o.m5294t("The transfer function must be increasing");
            throw null;
        }
        if (d11 < 0.0d || d10 < 0.0d) {
            C2104o.m5294t("The transfer function must be positive or increasing");
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1290s)) {
            return false;
        }
        C1290s c1290s = (C1290s) obj;
        return Double.compare(this.f4302a, c1290s.f4302a) == 0 && Double.compare(this.f4303b, c1290s.f4303b) == 0 && Double.compare(this.f4304c, c1290s.f4304c) == 0 && Double.compare(this.f4305d, c1290s.f4305d) == 0 && Double.compare(this.f4306e, c1290s.f4306e) == 0 && Double.compare(this.f4307f, c1290s.f4307f) == 0 && Double.compare(this.f4308g, c1290s.f4308g) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Double.hashCode(this.f4308g) + ((Double.hashCode(this.f4307f) + ((Double.hashCode(this.f4306e) + ((Double.hashCode(this.f4305d) + ((Double.hashCode(this.f4304c) + ((Double.hashCode(this.f4303b) + (Double.hashCode(this.f4302a) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "TransferParameters(gamma=" + this.f4302a + ", a=" + this.f4303b + ", b=" + this.f4304c + ", c=" + this.f4305d + ", d=" + this.f4306e + ", e=" + this.f4307f + ", f=" + this.f4308g + ')';
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000f: CONSTRUCTOR (r16v0 double), (r18v0 double), (r20v0 double), (r22v0 double), (r24v0 double), (0.0d double), (0.0d double) A[MD:(double, double, double, double, double, double, double):void (m)] (LINE:197) call: g1.s.<init>(double, double, double, double, double, double, double):void type: THIS */
    public /* synthetic */ C1290s(double d10, double d11, double d12, double d13, double d14) {
        this(d10, d11, d12, d13, d14, 0.0d, 0.0d);
    }
}
