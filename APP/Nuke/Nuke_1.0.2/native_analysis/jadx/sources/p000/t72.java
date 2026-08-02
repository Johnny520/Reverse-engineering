package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class t72 extends vj1 {

    /* JADX INFO: renamed from: i */
    public final r72[] f10593i;

    /* JADX INFO: renamed from: j */
    public int f10594j;

    static {
        new t72(0);
    }

    public t72(int i) {
        super(i != 0);
        this.f10593i = new r72[i];
        this.f10594j = 0;
    }

    /* JADX INFO: renamed from: e */
    public final r72 m5129e(int i) {
        try {
            return this.f10593i[i];
        } catch (ArrayIndexOutOfBoundsException unused) {
            C0676s.m4651j("bogus reg");
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof t72) {
            t72 t72Var = (t72) obj;
            r72[] r72VarArr = t72Var.f10593i;
            r72[] r72VarArr2 = this.f10593i;
            int length = r72VarArr2.length;
            if (length == r72VarArr.length && m5130f() == t72Var.m5130f()) {
                for (int i = 0; i < length; i++) {
                    r72 r72Var = r72VarArr2[i];
                    Object obj2 = r72VarArr[i];
                    if (r72Var == obj2 || (r72Var != null && r72Var.equals(obj2))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final int m5130f() {
        int i = this.f10594j;
        if (i >= 0) {
            return i;
        }
        int i2 = 0;
        for (r72 r72Var : this.f10593i) {
            if (r72Var != null) {
                i2++;
            }
        }
        this.f10594j = i2;
        return i2;
    }

    public final int hashCode() {
        r72[] r72VarArr = this.f10593i;
        int length = r72VarArr.length;
        int iHashCode = 0;
        for (int i = 0; i < length; i++) {
            r72 r72Var = r72VarArr[i];
            iHashCode = (iHashCode * 31) + (r72Var == null ? 0 : r72Var.hashCode());
        }
        return iHashCode;
    }

    public final String toString() {
        r72[] r72VarArr = this.f10593i;
        StringBuilder sb = new StringBuilder(r72VarArr.length * 25);
        sb.append('{');
        boolean z = false;
        for (r72 r72Var : r72VarArr) {
            if (r72Var != null) {
                if (z) {
                    sb.append(", ");
                } else {
                    z = true;
                }
                sb.append(r72Var);
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
