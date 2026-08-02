package defpackage;

import java.io.File;
import java.time.Instant;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class cj2 implements dj2 {
    public final Instant a;
    public final xj2 b;
    public final File c;
    public final th2 d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public cj2(Instant instant, xj2 xj2Var, File file, th2 th2Var) {
        xj2Var.getClass();
        this.a = instant;
        this.b = xj2Var;
        this.c = file;
        this.d = th2Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cj2)) {
            return false;
        }
        cj2 cj2Var = (cj2) obj;
        return this.a.equals(cj2Var.a) && this.b == cj2Var.b && this.c.equals(cj2Var.c) && this.d.equals(cj2Var.d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "Stopping(timestamp=" + this.a + ", operation=" + this.b + ", directory=" + this.c + ", manifest=" + this.d + ")";
    }
}
