package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class zy0 implements hd {
    public final bd0 a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public zy0(bd0 bd0Var) {
        this.a = bd0Var;
        if (bd0Var instanceof m43) {
            if (((m43) bd0Var).a != 0) {
                return;
            }
        } else if (!(bd0Var instanceof q51) || ((q51) bd0Var).a.a != 0) {
            return;
        }
        s.j("Animation to be infinitely repeated cannot have a 0-duration");
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.hd
    public final x93 a(n43 n43Var) {
        return new wd1(this.a.a(n43Var));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        return (obj instanceof zy0) && ((zy0) obj).a.equals(this.a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Long.hashCode(0L) + ((g82.h.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
