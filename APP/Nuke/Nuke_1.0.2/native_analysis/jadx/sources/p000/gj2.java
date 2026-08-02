package p000;

import java.io.File;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class gj2 {

    /* JADX INFO: renamed from: a */
    public final File f3543a;

    /* JADX INFO: renamed from: b */
    public final f52 f3544b;

    public gj2(File file, f52 f52Var) {
        f52Var.getClass();
        this.f3543a = file;
        this.f3544b = f52Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gj2)) {
            return false;
        }
        gj2 gj2Var = (gj2) obj;
        return this.f3543a.equals(gj2Var.f3543a) && t11.m5086l(this.f3544b, gj2Var.f3544b);
    }

    public final int hashCode() {
        return this.f3544b.hashCode() + (this.f3543a.hashCode() * 31);
    }

    public final String toString() {
        return "ManagedSession(directory=" + this.f3543a + ", session=" + this.f3544b + ")";
    }
}
