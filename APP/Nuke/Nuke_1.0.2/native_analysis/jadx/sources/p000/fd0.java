package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class fd0 implements m93 {

    /* JADX INFO: renamed from: a */
    public final nx1 f2909a;

    public fd0(nx1 nx1Var) {
        this.f2909a = nx1Var;
    }

    @Override // p000.m93
    /* JADX INFO: renamed from: a */
    public final Object mo1597a(yy1 yy1Var) {
        return this.f2909a.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fd0) && this.f2909a == ((fd0) obj).f2909a;
    }

    public final int hashCode() {
        return this.f2909a.hashCode();
    }

    public final String toString() {
        return "DynamicValueHolder(state=" + this.f2909a + ')';
    }
}
