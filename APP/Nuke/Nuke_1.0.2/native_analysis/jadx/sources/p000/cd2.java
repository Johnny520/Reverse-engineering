package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class cd2 {

    /* JADX INFO: renamed from: a */
    public final long f1489a;

    /* JADX INFO: renamed from: b */
    public final m43 f1490b;

    public cd2(long j, m43 m43Var) {
        this.f1489a = j;
        this.f1490b = m43Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cd2)) {
            return false;
        }
        cd2 cd2Var = (cd2) obj;
        return Float.compare(0.96f, 0.96f) == 0 && m33.m3029a(this.f1489a, cd2Var.f1489a) && this.f1490b.equals(cd2Var.f1490b);
    }

    public final int hashCode() {
        int iHashCode = Float.hashCode(0.96f) * 31;
        int i = m33.f6465c;
        return this.f1490b.hashCode() + hk1.m2204c(iHashCode, 31, this.f1489a);
    }

    public final String toString() {
        return "Scale(scale=0.96, transformOrigin=" + ((Object) m33.m3030b(this.f1489a)) + ", animationSpec=" + this.f1490b + ')';
    }
}
