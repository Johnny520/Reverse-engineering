package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class eb1 extends fb1 {

    /* JADX INFO: renamed from: a */
    public final String f2379a;

    /* JADX INFO: renamed from: b */
    public final b13 f2380b;

    public eb1(String str, b13 b13Var) {
        this.f2379a = str;
        this.f2380b = b13Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eb1)) {
            return false;
        }
        eb1 eb1Var = (eb1) obj;
        return this.f2379a.equals(eb1Var.f2379a) && t11.m5086l(this.f2380b, eb1Var.f2380b);
    }

    public final int hashCode() {
        int iHashCode = this.f2379a.hashCode() * 31;
        b13 b13Var = this.f2380b;
        return (iHashCode + (b13Var != null ? b13Var.hashCode() : 0)) * 31;
    }

    public final String toString() {
        return hk1.m2210i(new StringBuilder("LinkAnnotation.Url(url="), this.f2379a, ')');
    }
}
