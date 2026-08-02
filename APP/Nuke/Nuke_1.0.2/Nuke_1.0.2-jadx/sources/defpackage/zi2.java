package defpackage;

import java.io.File;
import java.time.Instant;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class zi2 implements dj2 {
    public final Instant a;
    public final xj2 b;
    public final File c;
    public final th2 d;
    public final String e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public zi2(Instant instant, xj2 xj2Var, File file, th2 th2Var, String str) {
        xj2Var.getClass();
        str.getClass();
        this.a = instant;
        this.b = xj2Var;
        this.c = file;
        this.d = th2Var;
        this.e = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zi2)) {
            return false;
        }
        zi2 zi2Var = (zi2) obj;
        return this.a.equals(zi2Var.a) && this.b == zi2Var.b && this.c.equals(zi2Var.c) && this.d.equals(zi2Var.d) && t11.l(this.e, zi2Var.e);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("Running(timestamp=");
        sb.append(this.a);
        sb.append(", operation=");
        sb.append(this.b);
        sb.append(", directory=");
        sb.append(this.c);
        sb.append(", manifest=");
        sb.append(this.d);
        sb.append(", quickJsVersion=");
        return hk1.j(sb, this.e, ")");
    }
}
