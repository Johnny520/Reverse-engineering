package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class t72 extends vj1 {
    public final r72[] i;
    public int j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        new t72(0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public t72(int i) {
        super(i != 0);
        this.i = new r72[i];
        this.j = 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final r72 e(int i) {
        try {
            return this.i[i];
        } catch (ArrayIndexOutOfBoundsException unused) {
            s.j("bogus reg");
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj instanceof t72) {
            t72 t72Var = (t72) obj;
            r72[] r72VarArr = t72Var.i;
            r72[] r72VarArr2 = this.i;
            int length = r72VarArr2.length;
            if (length == r72VarArr.length && f() == t72Var.f()) {
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int f() {
        int i = this.j;
        if (i >= 0) {
            return i;
        }
        int i2 = 0;
        for (r72 r72Var : this.i) {
            if (r72Var != null) {
                i2++;
            }
        }
        this.j = i2;
        return i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        r72[] r72VarArr = this.i;
        int length = r72VarArr.length;
        int iHashCode = 0;
        for (int i = 0; i < length; i++) {
            r72 r72Var = r72VarArr[i];
            iHashCode = (iHashCode * 31) + (r72Var == null ? 0 : r72Var.hashCode());
        }
        return iHashCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        r72[] r72VarArr = this.i;
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
