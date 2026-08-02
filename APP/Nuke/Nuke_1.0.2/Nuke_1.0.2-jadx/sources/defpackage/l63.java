package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class l63 {
    public final mx2 a;
    public final im0 b;
    public final int c;
    public final int d;
    public final Object e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public l63(mx2 mx2Var, im0 im0Var, int i, int i2, Object obj) {
        this.a = mx2Var;
        this.b = im0Var;
        this.c = i;
        this.d = i2;
        this.e = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l63)) {
            return false;
        }
        l63 l63Var = (l63) obj;
        return t11.l(this.a, l63Var.a) && t11.l(this.b, l63Var.b) && this.c == l63Var.c && this.d == l63Var.d && t11.l(this.e, l63Var.e);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        mx2 mx2Var = this.a;
        int iD = vi0.d(this.d, vi0.d(this.c, (((mx2Var == null ? 0 : mx2Var.hashCode()) * 31) + this.b.h) * 31, 31), 31);
        Object obj = this.e;
        return iD + (obj != null ? obj.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("TypefaceRequest(fontFamily=");
        sb.append(this.a);
        sb.append(", fontWeight=");
        sb.append(this.b);
        sb.append(", fontStyle=");
        String str = "Invalid";
        int i = this.c;
        sb.append((Object) (i == 0 ? "Normal" : i == 1 ? "Italic" : "Invalid"));
        sb.append(", fontSynthesis=");
        int i2 = this.d;
        if (i2 == 0) {
            str = "None";
        } else if (i2 == 1) {
            str = "Weight";
        } else if (i2 == 2) {
            str = "Style";
        } else if (i2 == 65535) {
            str = "All";
        }
        sb.append((Object) str);
        sb.append(", resourceLoaderCacheKey=");
        sb.append(this.e);
        sb.append(')');
        return sb.toString();
    }
}
