package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class v90 {

    /* JADX INFO: renamed from: a */
    public final int f11846a;

    /* JADX INFO: renamed from: b */
    public final int f11847b;

    /* JADX INFO: renamed from: c */
    public final int f11848c;

    /* JADX INFO: renamed from: d */
    public final int f11849d;

    public v90(int i, int i2, int i3, int i4) {
        this.f11846a = i;
        this.f11847b = i2;
        this.f11848c = i3;
        this.f11849d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v90)) {
            return false;
        }
        v90 v90Var = (v90) obj;
        return this.f11846a == v90Var.f11846a && this.f11847b == v90Var.f11847b && this.f11848c == v90Var.f11848c && this.f11849d == v90Var.f11849d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f11849d) + vi0.m5685d(this.f11848c, vi0.m5685d(this.f11847b, Integer.hashCode(this.f11846a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbM2212k = hk1.m2212k("PaddingState(left=", this.f11846a, this.f11847b, ", top=", ", right=");
        sbM2212k.append(this.f11848c);
        sbM2212k.append(", bottom=");
        sbM2212k.append(this.f11849d);
        sbM2212k.append(")");
        return sbM2212k.toString();
    }
}
