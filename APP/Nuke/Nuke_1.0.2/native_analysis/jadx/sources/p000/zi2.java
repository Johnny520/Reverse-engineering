package p000;

import java.io.File;
import java.time.Instant;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class zi2 implements dj2 {

    /* JADX INFO: renamed from: a */
    public final Instant f13920a;

    /* JADX INFO: renamed from: b */
    public final xj2 f13921b;

    /* JADX INFO: renamed from: c */
    public final File f13922c;

    /* JADX INFO: renamed from: d */
    public final th2 f13923d;

    /* JADX INFO: renamed from: e */
    public final String f13924e;

    public zi2(Instant instant, xj2 xj2Var, File file, th2 th2Var, String str) {
        xj2Var.getClass();
        str.getClass();
        this.f13920a = instant;
        this.f13921b = xj2Var;
        this.f13922c = file;
        this.f13923d = th2Var;
        this.f13924e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zi2)) {
            return false;
        }
        zi2 zi2Var = (zi2) obj;
        return this.f13920a.equals(zi2Var.f13920a) && this.f13921b == zi2Var.f13921b && this.f13922c.equals(zi2Var.f13922c) && this.f13923d.equals(zi2Var.f13923d) && t11.m5086l(this.f13924e, zi2Var.f13924e);
    }

    public final int hashCode() {
        return this.f13924e.hashCode() + ((this.f13923d.hashCode() + ((this.f13922c.hashCode() + ((this.f13921b.hashCode() + (this.f13920a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Running(timestamp=");
        sb.append(this.f13920a);
        sb.append(", operation=");
        sb.append(this.f13921b);
        sb.append(", directory=");
        sb.append(this.f13922c);
        sb.append(", manifest=");
        sb.append(this.f13923d);
        sb.append(", quickJsVersion=");
        return hk1.m2211j(sb, this.f13924e, ")");
    }
}
