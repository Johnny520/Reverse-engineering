package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class g01 {

    /* JADX INFO: renamed from: a */
    public final int f3218a;

    /* JADX INFO: renamed from: b */
    public final int f3219b;

    /* JADX INFO: renamed from: c */
    public final int f3220c;

    /* JADX INFO: renamed from: d */
    public final int f3221d;

    public g01(int i, int i2, int i3, int i4) {
        this.f3218a = i;
        this.f3219b = i2;
        this.f3220c = i3;
        this.f3221d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g01)) {
            return false;
        }
        g01 g01Var = (g01) obj;
        return this.f3218a == g01Var.f3218a && this.f3219b == g01Var.f3219b && this.f3220c == g01Var.f3220c && this.f3221d == g01Var.f3221d;
    }

    public final int hashCode() {
        return (((((this.f3218a * 31) + this.f3219b) * 31) + this.f3220c) * 31) + this.f3221d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InsetsValues(left=");
        sb.append(this.f3218a);
        sb.append(", top=");
        sb.append(this.f3219b);
        sb.append(", right=");
        sb.append(this.f3220c);
        sb.append(", bottom=");
        return vi0.m5694m(sb, this.f3221d, ')');
    }
}
