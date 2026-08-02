package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class uq1 {

    /* JADX INFO: renamed from: a */
    public final th2 f11441a;

    /* JADX INFO: renamed from: b */
    public final lf2 f11442b;

    /* JADX INFO: renamed from: c */
    public final rf2 f11443c;

    public uq1(th2 th2Var, lf2 lf2Var, rf2 rf2Var) {
        th2Var.getClass();
        this.f11441a = th2Var;
        this.f11442b = lf2Var;
        this.f11443c = rf2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uq1)) {
            return false;
        }
        uq1 uq1Var = (uq1) obj;
        return t11.m5086l(this.f11441a, uq1Var.f11441a) && this.f11442b.equals(uq1Var.f11442b) && this.f11443c.equals(uq1Var.f11443c);
    }

    public final int hashCode() {
        return this.f11443c.hashCode() + ((this.f11442b.hashCode() + (this.f11441a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "NukeScriptSettings(manifest=" + this.f11441a + ", schema=" + this.f11442b + ", snapshot=" + this.f11443c + ")";
    }
}
