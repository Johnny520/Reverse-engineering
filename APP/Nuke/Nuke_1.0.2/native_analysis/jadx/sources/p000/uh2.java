package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class uh2 {

    /* JADX INFO: renamed from: a */
    public final th2 f11315a;

    /* JADX INFO: renamed from: b */
    public final int f11316b;

    public uh2(th2 th2Var, int i) {
        this.f11315a = th2Var;
        this.f11316b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uh2)) {
            return false;
        }
        uh2 uh2Var = (uh2) obj;
        return this.f11315a.equals(uh2Var.f11315a) && this.f11316b == uh2Var.f11316b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f11316b) + (this.f11315a.hashCode() * 31);
    }

    public final String toString() {
        return "ScriptManifestDocument(manifest=" + this.f11315a + ", byteCount=" + this.f11316b + ")";
    }
}
