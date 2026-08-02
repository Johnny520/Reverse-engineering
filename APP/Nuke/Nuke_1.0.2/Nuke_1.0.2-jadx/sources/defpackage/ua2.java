package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ua2 implements my0 {
    public final boolean a;
    public final long b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ua2(long j, boolean z) {
        this.a = z;
        this.b = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.my0
    public final t60 a(bk1 bk1Var) {
        return new x60(bk1Var, this.a, new hh1(7, this));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ua2)) {
            return false;
        }
        ua2 ua2Var = (ua2) obj;
        if (this.a == ua2Var.a && za0.b(Float.NaN, Float.NaN)) {
            return ju.c(this.b, ua2Var.b);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iC = vi0.c(Float.NaN, Boolean.hashCode(this.a) * 31, 961);
        int i = ju.h;
        return Long.hashCode(this.b) + iC;
    }
}
