package p000;

import java.io.File;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class z80 {

    /* JADX INFO: renamed from: a */
    public final File f13782a;

    /* JADX INFO: renamed from: b */
    public final th2 f13783b;

    public z80(File file, th2 th2Var) {
        th2Var.getClass();
        this.f13782a = file;
        this.f13783b = th2Var;
    }

    /* JADX INFO: renamed from: a */
    public final th2 m6400a() {
        return this.f13783b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z80)) {
            return false;
        }
        z80 z80Var = (z80) obj;
        return this.f13782a.equals(z80Var.f13782a) && t11.m5086l(this.f13783b, z80Var.f13783b);
    }

    public final int hashCode() {
        return this.f13783b.hashCode() + (this.f13782a.hashCode() * 31);
    }

    public final String toString() {
        return "DiscoveredScript(directory=" + this.f13782a + ", manifest=" + this.f13783b + ")";
    }
}
