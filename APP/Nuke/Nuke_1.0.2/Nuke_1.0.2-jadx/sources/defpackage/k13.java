package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class k13 {
    public final String a;
    public String b;
    public boolean c = false;
    public uw1 d = null;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public k13(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k13)) {
            return false;
        }
        k13 k13Var = (k13) obj;
        return t11.l(this.a, k13Var.a) && t11.l(this.b, k13Var.b) && this.c == k13Var.c && t11.l(this.d, k13Var.d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iD = hk1.d(hk1.f(this.b, this.a.hashCode() * 31, 31), 31, this.c);
        uw1 uw1Var = this.d;
        return iD + (uw1Var == null ? 0 : uw1Var.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "TextSubstitution(layoutCache=" + this.d + ", isShowingSubstitution=" + this.c + ')';
    }
}
