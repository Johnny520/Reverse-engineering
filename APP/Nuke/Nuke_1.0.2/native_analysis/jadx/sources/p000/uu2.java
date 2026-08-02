package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class uu2 implements m93 {

    /* JADX INFO: renamed from: a */
    public final Object f11507a;

    public uu2(Object obj) {
        this.f11507a = obj;
    }

    @Override // p000.m93
    /* JADX INFO: renamed from: a */
    public final Object mo1597a(yy1 yy1Var) {
        return this.f11507a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uu2) && t11.m5086l(this.f11507a, ((uu2) obj).f11507a);
    }

    public final int hashCode() {
        Object obj = this.f11507a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "StaticValueHolder(value=" + this.f11507a + ')';
    }
}
