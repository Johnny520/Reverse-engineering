package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class d11 {

    /* JADX INFO: renamed from: e */
    public static final d11 f1806e = new d11(0, 0, 0, 0);

    /* JADX INFO: renamed from: a */
    public final int f1807a;

    /* JADX INFO: renamed from: b */
    public final int f1808b;

    /* JADX INFO: renamed from: c */
    public final int f1809c;

    /* JADX INFO: renamed from: d */
    public final int f1810d;

    public d11(int i, int i2, int i3, int i4) {
        this.f1807a = i;
        this.f1808b = i2;
        this.f1809c = i3;
        this.f1810d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d11)) {
            return false;
        }
        d11 d11Var = (d11) obj;
        return this.f1807a == d11Var.f1807a && this.f1808b == d11Var.f1808b && this.f1809c == d11Var.f1809c && this.f1810d == d11Var.f1810d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f1810d) + vi0.m5685d(this.f1809c, vi0.m5685d(this.f1808b, Integer.hashCode(this.f1807a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IntRect.fromLTRB(");
        sb.append(this.f1807a);
        sb.append(", ");
        sb.append(this.f1808b);
        sb.append(", ");
        sb.append(this.f1809c);
        sb.append(", ");
        return vi0.m5694m(sb, this.f1810d, ')');
    }
}
