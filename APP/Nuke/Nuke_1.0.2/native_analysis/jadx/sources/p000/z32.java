package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class z32 extends AbstractC0063bp implements v41 {

    /* JADX INFO: renamed from: n */
    public final boolean f13711n;

    public z32(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, (i & 1) == 1);
        this.f13711n = false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof z32) {
            z32 z32Var = (z32) obj;
            return m582f().equals(z32Var.m582f()) && this.f965k.equals(z32Var.f965k) && this.f966l.equals(z32Var.f966l) && t11.m5086l(this.f963i, z32Var.f963i);
        }
        if (obj instanceof v41) {
            return obj.equals(m6382h());
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public final p41 m6382h() {
        if (this.f13711n) {
            return this;
        }
        p41 p41Var = this.f962h;
        if (p41Var != null) {
            return p41Var;
        }
        p41 p41VarMo581d = mo581d();
        this.f962h = p41VarMo581d;
        return p41VarMo581d;
    }

    public final int hashCode() {
        return this.f966l.hashCode() + hk1.m2207f(this.f965k, m582f().hashCode() * 31, 31);
    }

    public final String toString() {
        p41 p41VarM6382h = m6382h();
        return p41VarM6382h != this ? p41VarM6382h.toString() : hk1.m2211j(new StringBuilder("property "), this.f965k, " (Kotlin reflection is not available)");
    }
}
