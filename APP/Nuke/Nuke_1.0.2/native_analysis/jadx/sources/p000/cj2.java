package p000;

import java.io.File;
import java.time.Instant;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class cj2 implements dj2 {

    /* JADX INFO: renamed from: a */
    public final Instant f1587a;

    /* JADX INFO: renamed from: b */
    public final xj2 f1588b;

    /* JADX INFO: renamed from: c */
    public final File f1589c;

    /* JADX INFO: renamed from: d */
    public final th2 f1590d;

    public cj2(Instant instant, xj2 xj2Var, File file, th2 th2Var) {
        xj2Var.getClass();
        this.f1587a = instant;
        this.f1588b = xj2Var;
        this.f1589c = file;
        this.f1590d = th2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cj2)) {
            return false;
        }
        cj2 cj2Var = (cj2) obj;
        return this.f1587a.equals(cj2Var.f1587a) && this.f1588b == cj2Var.f1588b && this.f1589c.equals(cj2Var.f1589c) && this.f1590d.equals(cj2Var.f1590d);
    }

    public final int hashCode() {
        return this.f1590d.hashCode() + ((this.f1589c.hashCode() + ((this.f1588b.hashCode() + (this.f1587a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Stopping(timestamp=" + this.f1587a + ", operation=" + this.f1588b + ", directory=" + this.f1589c + ", manifest=" + this.f1590d + ")";
    }
}
