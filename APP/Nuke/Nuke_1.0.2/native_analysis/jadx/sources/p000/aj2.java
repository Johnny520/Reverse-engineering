package p000;

import java.io.File;
import java.time.Instant;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class aj2 implements dj2 {

    /* JADX INFO: renamed from: a */
    public final Instant f228a;

    /* JADX INFO: renamed from: b */
    public final xj2 f229b;

    /* JADX INFO: renamed from: c */
    public final File f230c;

    /* JADX INFO: renamed from: d */
    public final th2 f231d;

    public aj2(Instant instant, xj2 xj2Var, File file, th2 th2Var) {
        xj2Var.getClass();
        th2Var.getClass();
        this.f228a = instant;
        this.f229b = xj2Var;
        this.f230c = file;
        this.f231d = th2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aj2)) {
            return false;
        }
        aj2 aj2Var = (aj2) obj;
        return this.f228a.equals(aj2Var.f228a) && this.f229b == aj2Var.f229b && this.f230c.equals(aj2Var.f230c) && t11.m5086l(this.f231d, aj2Var.f231d);
    }

    public final int hashCode() {
        return this.f231d.hashCode() + ((this.f230c.hashCode() + ((this.f229b.hashCode() + (this.f228a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Starting(timestamp=" + this.f228a + ", operation=" + this.f229b + ", directory=" + this.f230c + ", manifest=" + this.f231d + ")";
    }
}
