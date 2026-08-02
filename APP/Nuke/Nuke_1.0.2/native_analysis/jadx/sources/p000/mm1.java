package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class mm1 extends gf1 {

    /* JADX INFO: renamed from: f */
    public final em1 f6720f;

    public mm1(em1 em1Var) {
        em1Var.getClass();
        this.f6720f = em1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && mm1.class == obj.getClass() && t11.m5086l(this.f6720f, ((mm1) obj).f6720f);
    }

    public final int hashCode() {
        return this.f6720f.hashCode() - 31;
    }

    public final String toString() {
        return "InProgress(latestEvent=" + this.f6720f + ", direction=-1)";
    }
}
