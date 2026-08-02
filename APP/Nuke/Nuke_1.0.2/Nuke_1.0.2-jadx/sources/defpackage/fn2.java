package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class fn2 {
    public final rr0 a;
    public final long b;
    public final en2 c;
    public final boolean d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public fn2(rr0 rr0Var, long j, en2 en2Var, boolean z) {
        this.a = rr0Var;
        this.b = j;
        this.c = en2Var;
        this.d = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fn2)) {
            return false;
        }
        fn2 fn2Var = (fn2) obj;
        return this.a == fn2Var.a && rs1.b(this.b, fn2Var.b) && this.c == fn2Var.c && this.d == fn2Var.d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + hk1.c(this.a.hashCode() * 31, 31, this.b)) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "SelectionHandleInfo(handle=" + this.a + ", position=" + ((Object) rs1.g(this.b)) + ", anchor=" + this.c + ", visible=" + this.d + ')';
    }
}
