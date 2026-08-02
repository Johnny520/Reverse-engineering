package p000;

import java.io.File;
import java.time.Instant;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class bj2 implements dj2 {

    /* JADX INFO: renamed from: a */
    public final Instant f899a;

    /* JADX INFO: renamed from: b */
    public final xj2 f900b;

    /* JADX INFO: renamed from: c */
    public final File f901c;

    /* JADX INFO: renamed from: d */
    public final th2 f902d;

    public bj2(Instant instant, xj2 xj2Var, File file, th2 th2Var) {
        xj2Var.getClass();
        th2Var.getClass();
        this.f899a = instant;
        this.f900b = xj2Var;
        this.f901c = file;
        this.f902d = th2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bj2)) {
            return false;
        }
        bj2 bj2Var = (bj2) obj;
        return this.f899a.equals(bj2Var.f899a) && this.f900b == bj2Var.f900b && this.f901c.equals(bj2Var.f901c) && t11.m5086l(this.f902d, bj2Var.f902d);
    }

    public final int hashCode() {
        return this.f902d.hashCode() + ((this.f901c.hashCode() + ((this.f900b.hashCode() + (this.f899a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Stopped(timestamp=" + this.f899a + ", operation=" + this.f900b + ", directory=" + this.f901c + ", manifest=" + this.f902d + ")";
    }
}
