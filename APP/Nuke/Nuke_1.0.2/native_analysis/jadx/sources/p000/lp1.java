package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class lp1 {

    /* JADX INFO: renamed from: a */
    public final boolean f6233a;

    /* JADX INFO: renamed from: b */
    public final long f6234b;

    /* JADX INFO: renamed from: c */
    public final long f6235c;

    /* JADX INFO: renamed from: d */
    public final long f6236d;

    /* JADX INFO: renamed from: e */
    public final long f6237e;

    /* JADX INFO: renamed from: f */
    public final long f6238f;

    /* JADX INFO: renamed from: g */
    public final long f6239g;

    public lp1(boolean z, long j, long j2, long j3, long j4, long j5, long j6) {
        this.f6233a = z;
        this.f6234b = j;
        this.f6235c = j2;
        this.f6236d = j3;
        this.f6237e = j4;
        this.f6238f = j5;
        this.f6239g = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lp1)) {
            return false;
        }
        lp1 lp1Var = (lp1) obj;
        return this.f6233a == lp1Var.f6233a && C0363ju.m2566c(this.f6234b, lp1Var.f6234b) && C0363ju.m2566c(this.f6235c, lp1Var.f6235c) && C0363ju.m2566c(this.f6236d, lp1Var.f6236d) && C0363ju.m2566c(this.f6237e, lp1Var.f6237e) && C0363ju.m2566c(this.f6238f, lp1Var.f6238f) && C0363ju.m2566c(this.f6239g, lp1Var.f6239g);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f6233a) * 31;
        int i = C0363ju.f5218h;
        return Long.hashCode(this.f6239g) + hk1.m2204c(hk1.m2204c(hk1.m2204c(hk1.m2204c(hk1.m2204c(iHashCode, 31, this.f6234b), 31, this.f6235c), 31, this.f6236d), 31, this.f6237e), 31, this.f6238f);
    }

    public final String toString() {
        String strM2572i = C0363ju.m2572i(this.f6234b);
        String strM2572i2 = C0363ju.m2572i(this.f6235c);
        String strM2572i3 = C0363ju.m2572i(this.f6236d);
        String strM2572i4 = C0363ju.m2572i(this.f6237e);
        String strM2572i5 = C0363ju.m2572i(this.f6238f);
        String strM2572i6 = C0363ju.m2572i(this.f6239g);
        StringBuilder sb = new StringBuilder("NukeColors(isLight=");
        sb.append(this.f6233a);
        sb.append(", background=");
        sb.append(strM2572i);
        sb.append(", surface=");
        hk1.m2216o(sb, strM2572i2, ", border=", strM2572i3, ", textPrimary=");
        hk1.m2216o(sb, strM2572i4, ", textSecondary=", strM2572i5, ", accent=");
        return hk1.m2211j(sb, strM2572i6, ")");
    }
}
