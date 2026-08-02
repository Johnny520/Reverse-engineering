package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class p71 {

    /* JADX INFO: renamed from: a */
    public final int f8011a;

    /* JADX INFO: renamed from: b */
    public final int f8012b;

    public p71(int i, int i2) {
        this.f8011a = i;
        this.f8012b = i2;
        if (!(i >= 0)) {
            nz0.m3456a("negative start index");
        }
        if (i2 >= i) {
            return;
        }
        nz0.m3456a("end index greater than start");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p71)) {
            return false;
        }
        p71 p71Var = (p71) obj;
        return this.f8011a == p71Var.f8011a && this.f8012b == p71Var.f8012b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f8012b) + (Integer.hashCode(this.f8011a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Interval(start=");
        sb.append(this.f8011a);
        sb.append(", end=");
        return vi0.m5694m(sb, this.f8012b, ')');
    }
}
