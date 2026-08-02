package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class tk2 {
    public final String a;
    public final boolean b;
    public final Throwable c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public tk2(String str, boolean z, Throwable th) {
        str.getClass();
        this.a = str;
        this.b = z;
        this.c = th;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tk2)) {
            return false;
        }
        tk2 tk2Var = (tk2) obj;
        return t11.l(this.a, tk2Var.a) && this.b == tk2Var.b && t11.l(this.c, tk2Var.c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iD = hk1.d(this.a.hashCode() * 31, 31, this.b);
        Throwable th = this.c;
        return iD + (th == null ? 0 : th.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "ScriptStopResult(scriptId=" + this.a + ", stopped=" + this.b + ", failure=" + this.c + ")";
    }
}
