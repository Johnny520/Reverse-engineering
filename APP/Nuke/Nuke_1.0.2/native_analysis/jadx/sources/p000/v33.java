package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class v33 {

    /* JADX INFO: renamed from: a */
    public final Object f11674a;

    /* JADX INFO: renamed from: b */
    public final Object f11675b;

    public v33(Object obj, Object obj2) {
        this.f11674a = obj;
        this.f11675b = obj2;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m5620a(if0 if0Var, if0 if0Var2) {
        return if0Var.equals(this.f11674a) && if0Var2.equals(this.f11675b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof v33)) {
            return false;
        }
        v33 v33Var = (v33) obj;
        return t11.m5086l(this.f11674a, v33Var.f11674a) && t11.m5086l(this.f11675b, v33Var.f11675b);
    }

    public final int hashCode() {
        Object obj = this.f11674a;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.f11675b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }
}
