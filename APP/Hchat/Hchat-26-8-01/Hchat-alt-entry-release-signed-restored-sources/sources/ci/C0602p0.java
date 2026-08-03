package ci;

import p259r9.AbstractC3754e0;

/* JADX INFO: renamed from: ci.p0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0602p0 {

    /* JADX INFO: renamed from: a */
    public C0604q0 f1899a;

    /* JADX INFO: renamed from: b */
    public double f1900b;

    /* JADX INFO: renamed from: c */
    public double f1901c;

    /* JADX INFO: renamed from: d */
    public double f1902d;

    /* JADX INFO: renamed from: e */
    public double f1903e;

    /* JADX INFO: renamed from: f */
    public double f1904f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m1626a(float f3, float f10) {
        double d10 = f3;
        this.f1901c = d10;
        this.f1903e = d10;
        this.f1902d = 0.0f;
        double d11 = f10;
        this.f1900b = d11;
        this.f1904f = d11;
        this.f1899a = new C0604q0(((double) Math.abs(f10)) > 5000.0d ? 0.55f : 0.4f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final boolean m1627b(float f3) {
        C0604q0 c0604q0 = this.f1899a;
        if (c0604q0 == null) {
            return false;
        }
        float fM7907q = AbstractC3754e0.m7907q(f3, 0.001f, 0.016f);
        double d10 = this.f1900b;
        double d11 = this.f1901c;
        double d12 = this.f1902d;
        double d13 = fM7907q;
        double d14 = (d10 * (1.0d - (c0604q0.f1907a * d13))) + ((d12 - d11) * c0604q0.f1908b * d13);
        this.f1900b = d14;
        double d15 = (d13 * d14) + d11;
        this.f1901c = d15;
        double d16 = this.f1903e;
        if ((d16 >= d12 || d15 <= d12) && ((d16 <= d12 || d15 >= d12) && ((d16 != d12 || Math.signum(this.f1904f) == Math.signum(this.f1901c)) && Math.abs(this.f1901c - this.f1902d) >= 1.0d))) {
            return false;
        }
        this.f1901c = this.f1902d;
        this.f1900b = 0.0d;
        return true;
    }
}
