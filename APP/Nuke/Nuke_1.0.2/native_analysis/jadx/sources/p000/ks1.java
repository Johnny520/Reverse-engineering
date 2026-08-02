package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ks1 {

    /* JADX INFO: renamed from: a */
    public final int f5741a;

    /* JADX INFO: renamed from: b */
    public final Integer f5742b;

    public ks1(int i, Integer num) {
        this.f5741a = i;
        this.f5742b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ks1)) {
            return false;
        }
        ks1 ks1Var = (ks1) obj;
        return this.f5741a == ks1Var.f5741a && t11.m5086l(this.f5742b, ks1Var.f5742b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f5741a) * 31;
        Integer num = this.f5742b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "ObjectLocation(group=" + this.f5741a + ", dataOffset=" + this.f5742b + ')';
    }
}
