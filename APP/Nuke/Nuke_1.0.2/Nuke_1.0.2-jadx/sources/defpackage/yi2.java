package defpackage;

import java.io.File;
import java.time.Instant;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class yi2 implements dj2 {
    public final Instant a;
    public final xj2 b;
    public final File c;
    public final th2 d;
    public final si2 e;
    public final fj2 f;
    public final Throwable g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public yi2(Instant instant, xj2 xj2Var, File file, th2 th2Var, si2 si2Var, fj2 fj2Var, Throwable th) {
        xj2Var.getClass();
        th2Var.getClass();
        this.a = instant;
        this.b = xj2Var;
        this.c = file;
        this.d = th2Var;
        this.e = si2Var;
        this.f = fj2Var;
        this.g = th;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yi2)) {
            return false;
        }
        yi2 yi2Var = (yi2) obj;
        return this.a.equals(yi2Var.a) && this.b == yi2Var.b && this.c.equals(yi2Var.c) && t11.l(this.d, yi2Var.d) && this.e == yi2Var.e && this.f == yi2Var.f && this.g.equals(yi2Var.g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31;
        si2 si2Var = this.e;
        int iHashCode2 = (iHashCode + (si2Var == null ? 0 : si2Var.hashCode())) * 31;
        fj2 fj2Var = this.f;
        return this.g.hashCode() + ((iHashCode2 + (fj2Var != null ? fj2Var.hashCode() : 0)) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "Failed(timestamp=" + this.a + ", operation=" + this.b + ", directory=" + this.c + ", manifest=" + this.d + ", phase=" + this.e + ", reason=" + this.f + ", error=" + this.g + ")";
    }
}
