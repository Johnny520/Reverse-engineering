package p000;

import java.io.File;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ij2 {

    /* JADX INFO: renamed from: a */
    public final File f4657a;

    /* JADX INFO: renamed from: b */
    public final u22 f4658b;

    public ij2(File file, u22 u22Var) {
        u22Var.getClass();
        this.f4657a = file;
        this.f4658b = u22Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ij2)) {
            return false;
        }
        ij2 ij2Var = (ij2) obj;
        return this.f4657a.equals(ij2Var.f4657a) && t11.m5086l(this.f4658b, ij2Var.f4658b);
    }

    public final int hashCode() {
        return this.f4658b.hashCode() + (this.f4657a.hashCode() * 31);
    }

    public final String toString() {
        return "VerifiedScript(directory=" + this.f4657a + ", prepared=" + this.f4658b + ")";
    }
}
