package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class yb1 {
    public final wt a;
    public final a63 b;
    public int c = -1;
    public r72 d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public yb1(wt wtVar, a63 a63Var) {
        this.a = wtVar;
        this.b = a63Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final r72 a() {
        if (this.d == null) {
            this.a.f();
            if (this.d == null) {
                throw new AssertionError();
            }
        }
        return this.d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "v" + this.c + "(" + this.b + ")";
    }
}
