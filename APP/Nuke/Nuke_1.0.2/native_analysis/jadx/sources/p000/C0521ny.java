package p000;

/* JADX INFO: renamed from: ny */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0521ny implements m93 {

    /* JADX INFO: renamed from: a */
    public final in0 f7365a;

    public C0521ny(in0 in0Var) {
        this.f7365a = in0Var;
    }

    @Override // p000.m93
    /* JADX INFO: renamed from: a */
    public final Object mo1597a(yy1 yy1Var) {
        return this.f7365a.mo5j(yy1Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0521ny) && this.f7365a.equals(((C0521ny) obj).f7365a);
    }

    public final int hashCode() {
        return this.f7365a.hashCode();
    }

    public final String toString() {
        return "ComputedValueHolder(compute=" + this.f7365a + ')';
    }
}
