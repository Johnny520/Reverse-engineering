package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class q70 {

    /* JADX INFO: renamed from: a */
    public final AbstractC0812vj f8807a;

    /* JADX INFO: renamed from: b */
    public final v70 f8808b;

    public q70(AbstractC0812vj abstractC0812vj, v70 v70Var) {
        abstractC0812vj.getClass();
        v70Var.getClass();
        this.f8807a = abstractC0812vj;
        this.f8808b = v70Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q70)) {
            return false;
        }
        q70 q70Var = (q70) obj;
        return t11.m5086l(this.f8807a, q70Var.f8807a) && t11.m5086l(this.f8808b, q70Var.f8808b);
    }

    public final int hashCode() {
        return this.f8808b.hashCode() + (this.f8807a.hashCode() * 31);
    }

    public final String toString() {
        return "DexAnalysisTask(hooker=" + this.f8807a + ", descriptor=" + this.f8808b + ")";
    }
}
