package p276t1;

import p024b9.AbstractC1043k;
import p376zd.C9987e;

/* JADX INFO: renamed from: t1.g0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C8036g0 {

    /* JADX INFO: renamed from: a */
    public final double f26782a;

    /* JADX INFO: renamed from: b */
    public final double f26783b;

    /* JADX INFO: renamed from: c */
    public final double f26784c;

    /* JADX INFO: renamed from: d */
    public final double f26785d;

    /* JADX INFO: renamed from: e */
    public final double f26786e;

    /* JADX INFO: renamed from: f */
    public final double f26787f;

    /* JADX INFO: renamed from: g */
    public final double f26788g;

    public C8036g0(double d10, double d11, double d12, double d13, double d14, double d15, double d16) {
        this.f26782a = d10;
        this.f26783b = d11;
        this.f26784c = d12;
        this.f26785d = d13;
        this.f26786e = d14;
        this.f26787f = d15;
        this.f26788g = d16;
        if (Double.isNaN(d11) || Double.isNaN(d12) || Double.isNaN(d13) || Double.isNaN(d14) || Double.isNaN(d15) || Double.isNaN(d16) || Double.isNaN(d10)) {
            C9987e.m38645a("Parameters cannot be NaN");
            throw null;
        }
        if (AbstractC8038h0.m30929b(d10)) {
            return;
        }
        if (d14 < 0.0d || d14 > 1.0d) {
            throw new IllegalArgumentException("Parameter d must be in the range [0..1], was " + d14);
        }
        if (d14 == 0.0d && (d11 == 0.0d || d10 == 0.0d)) {
            C9987e.m38645a("Parameter a or g is zero, the transfer function is constant");
            throw null;
        }
        if (d14 >= 1.0d && d13 == 0.0d) {
            C9987e.m38645a("Parameter c is zero, the transfer function is constant");
            throw null;
        }
        if ((d11 == 0.0d || d10 == 0.0d) && d13 == 0.0d) {
            C9987e.m38645a("Parameter a or g is zero, and c is zero, the transfer function is constant");
            throw null;
        }
        if (d13 < 0.0d) {
            C9987e.m38645a("The transfer function must be increasing");
            throw null;
        }
        if (d11 < 0.0d || d10 < 0.0d) {
            C9987e.m38645a("The transfer function must be positive or increasing");
            throw null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final double m30919a() {
        return this.f26783b;
    }

    /* JADX INFO: renamed from: b */
    public final double m30920b() {
        return this.f26784c;
    }

    /* JADX INFO: renamed from: c */
    public final double m30921c() {
        return this.f26785d;
    }

    /* JADX INFO: renamed from: d */
    public final double m30922d() {
        return this.f26786e;
    }

    /* JADX INFO: renamed from: e */
    public final double m30923e() {
        return this.f26787f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8036g0)) {
            return false;
        }
        C8036g0 c8036g0 = (C8036g0) obj;
        return Double.compare(this.f26782a, c8036g0.f26782a) == 0 && Double.compare(this.f26783b, c8036g0.f26783b) == 0 && Double.compare(this.f26784c, c8036g0.f26784c) == 0 && Double.compare(this.f26785d, c8036g0.f26785d) == 0 && Double.compare(this.f26786e, c8036g0.f26786e) == 0 && Double.compare(this.f26787f, c8036g0.f26787f) == 0 && Double.compare(this.f26788g, c8036g0.f26788g) == 0;
    }

    /* JADX INFO: renamed from: f */
    public final double m30924f() {
        return this.f26788g;
    }

    /* JADX INFO: renamed from: g */
    public final double m30925g() {
        return this.f26782a;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m30926h() {
        return this.f26782a == -3.0d;
    }

    public int hashCode() {
        return (((((((((((Double.hashCode(this.f26782a) * 31) + Double.hashCode(this.f26783b)) * 31) + Double.hashCode(this.f26784c)) * 31) + Double.hashCode(this.f26785d)) * 31) + Double.hashCode(this.f26786e)) * 31) + Double.hashCode(this.f26787f)) * 31) + Double.hashCode(this.f26788g);
    }

    /* JADX INFO: renamed from: i */
    public final boolean m30927i() {
        return this.f26782a == -2.0d;
    }

    public String toString() {
        return "TransferParameters(gamma=" + this.f26782a + ", a=" + this.f26783b + ", b=" + this.f26784c + ", c=" + this.f26785d + ", d=" + this.f26786e + ", e=" + this.f26787f + ", f=" + this.f26788g + ')';
    }

    public /* synthetic */ C8036g0(double d10, double d11, double d12, double d13, double d14, double d15, double d16, int i10, AbstractC1043k abstractC1043k) {
        this(d10, d11, d12, d13, d14, (i10 & 32) != 0 ? 0.0d : d15, (i10 & 64) != 0 ? 0.0d : d16);
    }
}
