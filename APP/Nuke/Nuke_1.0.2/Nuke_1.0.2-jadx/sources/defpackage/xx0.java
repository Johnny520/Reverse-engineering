package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class xx0 {
    public static final xx0 g = new xx0(false, 0, true, 1, 1, kc1.j);
    public final boolean a;
    public final int b;
    public final boolean c;
    public final int d;
    public final int e;
    public final kc1 f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public xx0(boolean z, int i, boolean z2, int i2, int i3, kc1 kc1Var) {
        this.a = z;
        this.b = i;
        this.c = z2;
        this.d = i2;
        this.e = i3;
        this.f = kc1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xx0)) {
            return false;
        }
        xx0 xx0Var = (xx0) obj;
        return this.a == xx0Var.a && this.b == xx0Var.b && this.c == xx0Var.c && this.d == xx0Var.d && this.e == xx0Var.e && t11.l(this.f, xx0Var.f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f.h.hashCode() + vi0.d(this.e, vi0.d(this.d, hk1.d(vi0.d(this.b, Boolean.hashCode(this.a) * 31, 31), 31, this.c), 31), 961);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "ImeOptions(singleLine=" + this.a + ", capitalization=" + ((Object) l51.a(this.b)) + ", autoCorrect=" + this.c + ", keyboardType=" + ((Object) n51.a(this.d)) + ", imeAction=" + ((Object) wx0.a(this.e)) + ", platformImeOptions=null, hintLocales=" + this.f + ')';
    }
}
