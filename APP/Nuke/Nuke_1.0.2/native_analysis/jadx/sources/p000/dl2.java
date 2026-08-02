package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class dl2 {

    /* JADX INFO: renamed from: a */
    public final boolean f2107a;

    /* JADX INFO: renamed from: b */
    public final boolean f2108b;

    /* JADX INFO: renamed from: c */
    public final boolean f2109c;

    public dl2(boolean z, boolean z2, boolean z3) {
        this.f2107a = z;
        this.f2108b = z2;
        this.f2109c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dl2)) {
            return false;
        }
        dl2 dl2Var = (dl2) obj;
        return this.f2107a == dl2Var.f2107a && this.f2108b == dl2Var.f2108b && this.f2109c == dl2Var.f2109c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f2109c) + hk1.m2205d(Boolean.hashCode(this.f2107a) * 31, 31, this.f2108b);
    }

    public final String toString() {
        return "ScriptWriteOptions(overwrite=" + this.f2107a + ", atomic=" + this.f2108b + ", createParents=" + this.f2109c + ")";
    }
}
