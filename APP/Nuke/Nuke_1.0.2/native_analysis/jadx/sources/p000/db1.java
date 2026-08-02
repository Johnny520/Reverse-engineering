package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class db1 extends fb1 {

    /* JADX INFO: renamed from: a */
    public final String f1954a;

    /* JADX INFO: renamed from: b */
    public final b13 f1955b;

    public db1(String str, b13 b13Var) {
        this.f1954a = str;
        this.f1955b = b13Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof db1)) {
            return false;
        }
        db1 db1Var = (db1) obj;
        return this.f1954a.equals(db1Var.f1954a) && t11.m5086l(this.f1955b, db1Var.f1955b);
    }

    public final int hashCode() {
        int iHashCode = this.f1954a.hashCode() * 31;
        b13 b13Var = this.f1955b;
        return (iHashCode + (b13Var != null ? b13Var.hashCode() : 0)) * 31;
    }

    public final String toString() {
        return hk1.m2210i(new StringBuilder("LinkAnnotation.Clickable(tag="), this.f1954a, ')');
    }
}
