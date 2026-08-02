package p000;

import java.io.File;
import java.time.Instant;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class yi2 implements dj2 {

    /* JADX INFO: renamed from: a */
    public final Instant f13480a;

    /* JADX INFO: renamed from: b */
    public final xj2 f13481b;

    /* JADX INFO: renamed from: c */
    public final File f13482c;

    /* JADX INFO: renamed from: d */
    public final th2 f13483d;

    /* JADX INFO: renamed from: e */
    public final si2 f13484e;

    /* JADX INFO: renamed from: f */
    public final fj2 f13485f;

    /* JADX INFO: renamed from: g */
    public final Throwable f13486g;

    public yi2(Instant instant, xj2 xj2Var, File file, th2 th2Var, si2 si2Var, fj2 fj2Var, Throwable th) {
        xj2Var.getClass();
        th2Var.getClass();
        this.f13480a = instant;
        this.f13481b = xj2Var;
        this.f13482c = file;
        this.f13483d = th2Var;
        this.f13484e = si2Var;
        this.f13485f = fj2Var;
        this.f13486g = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yi2)) {
            return false;
        }
        yi2 yi2Var = (yi2) obj;
        return this.f13480a.equals(yi2Var.f13480a) && this.f13481b == yi2Var.f13481b && this.f13482c.equals(yi2Var.f13482c) && t11.m5086l(this.f13483d, yi2Var.f13483d) && this.f13484e == yi2Var.f13484e && this.f13485f == yi2Var.f13485f && this.f13486g.equals(yi2Var.f13486g);
    }

    public final int hashCode() {
        int iHashCode = (this.f13483d.hashCode() + ((this.f13482c.hashCode() + ((this.f13481b.hashCode() + (this.f13480a.hashCode() * 31)) * 31)) * 31)) * 31;
        si2 si2Var = this.f13484e;
        int iHashCode2 = (iHashCode + (si2Var == null ? 0 : si2Var.hashCode())) * 31;
        fj2 fj2Var = this.f13485f;
        return this.f13486g.hashCode() + ((iHashCode2 + (fj2Var != null ? fj2Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "Failed(timestamp=" + this.f13480a + ", operation=" + this.f13481b + ", directory=" + this.f13482c + ", manifest=" + this.f13483d + ", phase=" + this.f13484e + ", reason=" + this.f13485f + ", error=" + this.f13486g + ")";
    }
}
