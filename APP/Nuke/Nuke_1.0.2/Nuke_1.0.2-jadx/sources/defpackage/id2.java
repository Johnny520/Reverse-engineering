package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class id2 {
    public final String a;
    public final String b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public id2(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof id2)) {
            return false;
        }
        id2 id2Var = (id2) obj;
        return this.a.equals(id2Var.a) && t11.l(this.b, id2Var.b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iF = hk1.f(this.a, 1224923546, 31);
        String str = this.b;
        return iF + (str == null ? 0 : str.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return vi0.k("ScriptAccountRef(platform=wechat, id=", this.a, ", name=", this.b, ")");
    }
}
